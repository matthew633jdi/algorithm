package programmers.w2;

import java.util.*;
import java.util.stream.Stream;

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        BestAlbum bestAlbum = new BestAlbum();
        int[] result = bestAlbum.solution(genres, plays);
        System.out.println(Arrays.toString(result));

    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Genre> genreMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String name = genres[i];
            genreMap.computeIfAbsent(name, Genre::new).addSong(new Song(i, plays[i]));
        }

        return genreMap.values().stream()
                .sorted((g1, g2) -> g2.totalPlays - g1.totalPlays)
                .flatMap(Genre::getBestTwoSongIds)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    record Song(int id, int play) implements Comparable<Song> {

        @Override
        public int compareTo(Song other) {
            if (this.play == other.play) {
                return Integer.compare(this.id, other.id);
            }

            return Integer.compare(other.play, this.play);
        }
    }

    static class Genre {
        private final String name;
        int totalPlays = 0;
        List<Song> songs = new ArrayList<>();

        public Genre(String name) {
            this.name = name;
        }

        public void addSong(Song song) {
            songs.add(song);
            totalPlays += song.play;
        }

        public Stream<Integer> getBestTwoSongIds() {
            return songs.stream().sorted().limit(2).map(Song::id);
        }
    }
}
