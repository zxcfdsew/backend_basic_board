# backend_basic_board
기본적인 스프링 활용능력 게시판

해당 프로젝트를 클론하셔서 본인 컴퓨터에 다운로드 받으신 후, 해당 프로젝트를 진행하시면 됩니다.
그리고 본인 깃헙 계정에 해당 프로젝트를 업로드 하시면 됩니다.


## 1. 프로젝트 개요
- 프로젝트 명 : backend_basic_board

q. 프로젝트 목적
- 스프링 프레임워크를 활용한 게시판 구현
- 스프링 프레임워크의 기본적인 기능들을 활용하여 게시판을 구현

기본적으로 구현해봐야 하는 것은 다음과 같습니다.
- 게시글 작성
- 게시글 수정
- 게시글 삭제
- 게시글 조회
- 게시글 목록 조회

## 2. 개발 환경
- IDE : IntelliJ IDEA
- Language : Java
- Framework : Spring
- DB : H2

## 3. 프로젝트 구조
```
domain 하위의 web 하위에 있는 board 패키지 내부에 게시판과 관련된 기능들을 구현
```

## 4. 주의사항

스프링 부트 3.x.x 버전이며, 자바 17 버전을 사용하였습니다.
스프링 시큐리티설정이 되어있고, global 하위에 webConfig가 있습니다.
해당 webConfig 에서 시큐리티 설정을 하시면 됩니다.

구현을 하실 때 docs 나 chatGpt 를 사용하는 것은 마음대로 하셔도 되나,
검색하신 내용, 참고하신 내용을 꼭 주석으로 남겨주시기 바랍니다.

무조건 되야한다는 것은 아니며 학생분들의 논리적인 구현을 중요하게 생각합니다.
mybatis가 편하신 분들은 mybatis를 사용하셔도 되고, jpa를 사용하셔도 됩니다.

기본적인 설정들은 jpa로 되어있으며, mybatis로 변경하시려면 application.yml 에서 설정을 변경하시면 됩니다.

구현하여야 하는 것들은 주석으로 남겨두었습니다.

디비를 확인 하는 방법은 localhost:8080/h2-console 로 접속하시면 됩니다.
swegger 는 localhost:8080/swagger-ui/index.html 로 접속하시면 됩니다.