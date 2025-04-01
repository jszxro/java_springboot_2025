# java_springboot_2025
2025년 Java 개발자 과정 SpringBoot repository

## 1일차(04/01)

### Web 개요
- 구성 3단계
    - 브라우저(클라이언트/프론트엔드): 사용자 **요청**을 하고, 결과를 돌려받는 파트
    - 서버: 사용자의 요청 -> DB에서 데이터를 가져와 처리 즉, 사용자에게 **응답**하는 파트
    - 데이터베이스: 가장 중요한 데이터가 저장되어 있는 파트

- **Web 개념**
    - Request(요청)에 대한 Response(응답)

### Spring Boot 개요
- Java: 컴퓨터 세상 모든 곳에서 사용될 수 있는 언어가 되고자 개발됨
- Java Web 개발
    1. CGI(Common GateWay Interface): HTTP 프로토골에서 정적인 데이터만 전달할 수 있는 Web 기술
    2. Servlet: CGI를 개선한 Java Web 기술, 동적 Web을 개발할 수 있음
        - HTML 코드를 전부 다 Java에서 작성해야 함
    3. EJB(Enterprise Java Bean): 서블릿으로 대형 프로젝트를 개발할 수 있는 Java Web 기술
        - 복잡함
    4. JSP(Java Server Pages): 웹페이지코드(HTML)에 자바 소스를 포함시켜서 개발할 수 있는 Java Web 기술
        - 확장자가 .jsp / 스파게티 코드
    5. Spring: Java Web 개발 전성기
        - 설정이 복잡
    6. Spring Boot: Spring의 단점을 최소화하고 설정을 간결화

- Spring Boot
    - Spring 기술을 그대로 사용(마이그레이션이 간단단)
    - JPA 기술을 사용하면 ERD나 DB 설계를 하지 않고도 손쉽게 DB를 생성, DB연동도 쉬움
    - Tomcat Webserver가 내장(설치 필요없음)
    - 서포트하는 기능 다수 존재(개발을 쉽게 도와줌)
    - Test용 JUnit, 로그용 Log4J2 모두 포함(설치 필요없음)
    - 프론트엔드를 다양하게 지원. JSP, **Thymeleaf**, Mustache 등
    - MVC로 영역을 분리 각 부분별로 따로 개발

- MVC
    - View는 JSP포함, Thymeleaf, Mustach, HTML 등등
    <img src="./image/SB001.png" width = "700">

### Spring Boot 개발환경 설정
- 필요 요소
    - Java, 개발 tool, DataBase

- Java
    - Java Runtime과 JDK(Java Developer Kit)존재
        - Oracle외에도 OpenJDK가 산재
            -  https://jdk.java.net/
            -  https://adoptium.net/
            -  https://www.azul.com/downloads/?package=jdk#zulu
    - Java 17버전 이상 설치, jdk-17.0.13_windows-x64_bin.msi 다운로드

    - 시스템 정보(sysdm.cpl)에서 PATH 설정
        - JAVA_HOME 새로 만들기 -> 본인 경로로
        - path에 %JAVA_HOME%\bin 추가, 맨 위로
    - powershell
        - java --version 확인

- Visual Studio Code 확장 설치
    - Java 검색
        - Extension Pack for Java

### Java 기본 실행
- VS Code에서 명령 팔레트 실행(Ctrl + Shift + P)
    - Java create

## 2일차
## 3일차
## 4일차
## 5일차