**파이널 프로젝트 기획안**

**2021년 12월 02일**

**과정명: 온·오프 연계 AI활용 지능형 서비스 개발**

| **팀 명**                                                    | **2조**                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **팀 원**                                                    | ***김용국(팀장), 배연철, 김형준, 강현규,  최혁진**           |
| **프로젝트 타이틀**                                          | 따닥따닥     (http://49.50.160.48:8080/hospital/mainPage)    |
| **프로젝트 주제**  **및 내용**  해결하고자 하는 문제  최종 산출물의 청사진 | 프로젝트 주제  1.     쉽고  빠르게 주변 병원과 병원 주변의 약국들을 알려주자  2.     병원  관계자들이나 사용자들이 휴원정보를 등록하면 이를 반영하여 병원,약국들을 알려주자       프로젝트 목적  1.  사용자 입력  기준에 따른 병원 출력  2.   병원근처에  있는 약국도 동시에 출력  3.     휴원정보를 반영하여 사용자들의 헛걸음 감소     프로젝트 구현 기능 개요 (상세 기능은 아래에 별도로 명시)  1.    회원관리  2.    과,  위치, 이용시간, 휴원정보 기준으로 병원 출력   3.    병원/약국  상제정보 및 리뷰 게시판  4.    휴원  정보 등록 게시판  5.   FAQ 봇챗 |
| **팀원간 역할**  **분담 및 일정**                            | **김용국 : BE(Controller, Service,  DB), sub FE(ajax)**     **배연철 : BE(Service, DAO, ORM), sub  FE(JavaScript)**     **김형준 : FE(JSP, CSS, JS), sub  BE(Service) , 발표**     **강현규 : BE(Controller, service, VO), sub  FE(CSS)**     **최혁진 : FE(JSP, CSS, JS), sub  BE(Service), 발표** |
| **프로젝트 수행 방향**  수행 방법/도구                       | 프로젝트 개발 환경   Spring MVC, JSP, JavaScript, CSS, jQuery,  MySQL, Naver Cloud Platform(API), ORM(myBatis), Open api parsing |
| **프로젝트 범위**  **(상세 구현 기능)**                      | 회원관리(회원가입,로그인,id/pwd 찾기)   과, 위치, 이용시간, 휴원정보 기준으로 병원 출력    병원/약국 상제정보 및 리뷰 게시판   휴원 정보 등록 게시판(등록,수정,삭제)   FAQ 챗봇(기능에대한 답변, tts, stt 지원) |
| **데이터베이스 설계**                                        | 회원정보(id, pwd, 전화번호, 이름, 이메일, 생년월일, 닉네임,  사는지역)   휴원게시판(제목, 병원이름, 주소, 글쓴이, 내용, 병원코드)    챗봇(질문, 응답) [chatbot 질문응답](https://docs.google.com/spreadsheets/d/1lSTb6Tx3ogBpDMiFvlFUsceInUbM22gKQGL9CGlOjpk/edit#gid=0)                blog_db                          member                                    ID,        PWD, PHONE, NAME, EMAIL, BIRTH, NICKNAME, DISTRICT                                             closed                                     TITLE, HOSP_NAME, HP_ID, WRITER,        CONTENT                                             chat_bot                                    QUESTION,        ANSWER |
| **UI 설계**  **(홈페이지 계층 구조도)**                      | ![img](file:///C:/Users/YG/AppData/Local/Packages/oice_16_974fa576_32c1d314_145f/AC/Temp/msohtmlclip1/01/clip_image002.jpg) |
| **프로젝트 관리 방안**                                       | 버전 형상 관리 시스템에 대한 이해가 미흡하여,  본 프로젝트는 개별 환경에서 작업 후 조장님께서 통합하는 방식으로 진행하였습니다. |
| **상세 일정**                                                | [일정관리](https://docs.google.com/spreadsheets/d/1ewYuHdOH4YeXEMkd9Rgqz4bdX2qfz8RaaqtH8P-j4Gc/edit#gid=0)   https://docs.google.com/spreadsheets/d/1ewYuHdOH4YeXEMkd9Rgqz4bdX2qfz8RaaqtH8P-j4Gc/edit#gid=0 |
| **기대 효과**                                                | 휴원병원을 반영한 내원 편의성 증대          사용자 이용 시간만 설정하면 병원마다 다른 운영 시간과 상관없이       원하는 정보만 얻을 수 있다.                   챗봇, tts, stt 지원으로 몸이 불편하신분도 사용가능          단순한 치료목적을 넘은 자기관리 개념도약 |

 

 