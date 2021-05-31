---
title: "배운 것 정리 - Day 1"
date: 2021-05-31 22:40:28 -0400
categories: Java
---
프로그래밍이란, 컴퓨터에게 '프로그래밍언어'를 통해 일을 시키는 것이다.
'프로그래밍언어'는 명령어의 집합이다.

사람이 이해하기 쉬운 명령어로 작성된 파일을 컴퓨터가 일할 수 있도록 컴파일러가 'compile'한다.

Java의 특징
 - C,C++과 달리 메모리를 직접 사용하지 않아 안정성이 높음
 - 모호함 제거
 - 플랫폼 독립 ( JVM이란 가상머신 위에서 돌아가기 때문. 다만 JVM은 OS별로 존재 ) --> WORA( Write Once Run Anywhere )
 - 성능 이슈 ( 최근 기술의 발전 및 JVM 기술 향상으로 옛 말인듯 )

Object-oriented programming(OOP) 
 - 객체 간 관계와 협력에 초점을 맞춰 프로그래밍함.
 - 유지보수 향상
 - 확장성 향상
 - 간결함
 - 신뢰성 
 - 코드 관리 용이

OOP 특징
 - 캡슐화 : 실제 구현부는 숨기고 인터페이스를 통해 데이터에 접근하도록 함
 - 상속 : 부모클래스의 속성과 기능을 물려 받아 코드 중복을 제거함
 - 추상화 : 인터페이스르 통해 클래스 간 공통적인 부분(필드, 메서드) 제공함
 - 다형성 : 클래스나 메서드를 다양한 방법으로 동작하도록 함, 인터페이스는 유사하나 구현부가 다른 것도 여기 포함됨(오버라이딩), 파라미터와 구현부 제외 동일함(오버로딩)

OOP 설계 - SOLID 원칙
 - S : Single Responsibility Principle, 하나의 클래스는 하나의 책임을 가진다.
 - O : Open/Closed Principle, extension에 열려 있으나, 변경에는 닫혀 있어야 한다.
 - L : Liskov's Substitution Principle, 객체는 프로그램의 정확성을 깨지 않으며 subtype instance화가 가능해야 한다.
 - I : Interface Segregation Principle, 특정 클라이언트를 위한 인터페이스 하나가 범용 인터페이스보다 낫다.
 - D : Dependency Inversion Principle, 추상화에 의존하라

최근 이클립스 설치 시  JRE가 포함되어 설치됨. 별도 설치 안해도 동작함.
