package programmers.w2;

import java.util.*;

public class OpenChat {
    public static void main(String[] args) {
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        OpenChat openChat = new OpenChat();
        String[] result = openChat.solution1(record);
        System.out.println(Arrays.toString(result));
    }

    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        HashMap<String, String> accountMap = new HashMap<>();
        for (String r : record) {
            String[] split = r.split(" ");
            if (split.length != 3) continue;

            String uid = split[1];
            String nickname = split[2];
            accountMap.put(uid, nickname);
        }

        for (String r: record) {
            String[] split = r.split(" ");
            String op = split[0];
            String uid = split[1];

            switch (op) {
                case "Enter" -> list.add(accountMap.get(uid) + "님이 들어왔습니다.");
                case "Leave" -> list.add(accountMap.get(uid) + "님이 나갔습니다.");
            }
        }

        return list.toArray(new String[list.size()]);
    }

    public String[] solution1(String[] record) {
        Map<String, String> idToNickname = new HashMap<>();
        List<String[]> parsedRecords = new ArrayList<>();

        for (String log : record) {
            String[] parts = log.split(" ");
            String commandTypep = parts[0];
            String uid = parts[1];

            if (parts.length == 3) {
                idToNickname.put(uid, parts[2]);
            }

            parsedRecords.add(parts);
        }

        List<String> result = new ArrayList<>();

        for (String[] parts : parsedRecords) {
            Command command = Command.valueOf(parts[0]);
            String uid = parts[1];

            if (command == Command.Change) continue;

            String currentNickname = idToNickname.get(uid);
            result.add(command.format(currentNickname));
        }

        return result.toArray(new String[0]);
    }

    private enum Command {
        Enter("님이 들어왔습니다."),
        Leave("님이 나갔습니다."),
        Change(null);

        private final String message;

        Command(String message) {
            this.message = message;
        }

        public String format(String nickname) {
            return nickname + this.message;
        }
    }
}
