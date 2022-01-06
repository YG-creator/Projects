[TOC]

[1. 회원관리](#1. 회원관리)

[5. 기타](#5. 기타)

# 1. 회원관리

## 1-1  회원가입

* 중복확인(ID, 닉네임, 이메일) 

* 비밀번호일치 확인 

* 모두 기입 안하고 회원가입 누를 시 -> alert

* 모두 기입 하고 회원가입 누를 시-> DB에 insert -> 로그인 페이지로 이동

* 위에 로고를 누르면 메인 페이지로 이동 

 <img src="md-images/clip_image002-16414495948361.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<br>

## 1-2 로그인

* 로그인 페이지

![img](md-images/clip_image004.png)   <br><br>    



* 로그인 성공 시 alert 후 메인 페이지로 이동

<img src="md-images/clip_image006.png" align="left">  <br><br><br><br><br><br>

<img src="md-images/clip_image025.png" align="left">   <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 로그인 실패 시 alert

<img src="md-images/clip_image008.png" align="left"> <br><br><br><br><br><br><br>

 

## 1-3 아이디 찾기

* 아이디 찾기 페이지

<img src="md-images/clip_image009.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 정보 일치 시 아이디 출력
* 로그인 페이지 링크

<img src="md-images/clip_image013.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br>

 

* 정보 불일치 시 alert

<img src="md-images/clip_image011.png" align="left"> <br><br><br><br><br><br>



## 1-4 **비밀번호 찾기**

* 비밀번호 찾기 페이지

![텍스트이(가) 표시된 사진  자동 생성된 설명](md-images/clip_image015.png)<br><br> 



* 정보 일치 시 아이디 출력
* 로그인 페이지 링크

![텍스트이(가) 표시된 사진  자동 생성된 설명](md-images/clip_image019.png)<br><br>

 

* 정보 불일치 시 alert

  <img src="md-images/clip_image017.png" align="left"> <br><br><br><br><br><br>



## 1-5 회원정보 수정

* 메인페이지 우측 상단 메인페이지를 누르면 회원정보 수정 페이지로 이동

<img src="md-images/clip_image025.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<img src="md-images/clip_image021.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 수정 성공 시 alert 후 메인 페이지로 이동

![img](md-images/clip_image023.png) <br><br> 

<img src="md-images/clip_image025.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

 

# **2.**  **병원찾기**

* 메인페이지에 위치

<img src="md-images/clip_image025.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

 

## **2-1 입력(현재위치, 과, 이용시간)**

* 다 입력을 해야 작동함

<img src="md-images/clip_image026.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br>



* 하나라도 입력을 안할 시 alert

<img src="md-images/image-20220106135231704.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br>



* 현위치 입력

<img src="md-images/clip_image027.png" align="left"> <br><br><br><br>



* 과 선택(자주 사용하는 의원을 설정하고 나머지 과들은 기타, 과에 상관없이 찾고 싶으면 상관없음)

<img src="md-images/clip_image028.png" align="left"> <br><br><br><br><br><br><br><br><br>



* 이용 시간

<img src="md-images/clip_image029.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br>

 

## **2-2 병원리스트 출력 및 맵 마커 표시**

* 입력 조건에 맞는 병원이 없을 시 alert

<img src="md-images/clip_image035.png" align="left"> <br><br><br><br><br><br><br>

 



* 입력 조건에 맞는 병원을 최대 10개 까지 출력(거리순) 
* 맵에 병원, 현재위치 마커 표시
* 병원 상세정보 페이지 링크
* 병원 근처 약국 표시 버튼

<img src="md-images/clip_image037.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 병원 근처 약국 표시 버튼 눌렀을 시 해당병원 기준으로 약국 3개가 출력(거리순)
* 맵에 약국을 마커 표시
* 약국 상세정보 링크

 <img src="md-images/clip_image039.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

























## **2-3 병원 상세정보**

* 병원리스트에서 상세 정보 클릭하면 해당 병원 상세정보 페이지로 이동
* 병원 정보, 진료 정보, 병원 리뷰로 구성
* 리뷰작성 버튼(리뷰작성 페이지로 이동)
* 뒤로가기 버튼(메인페이지로 이동)



* 병원 정보(위치, 과)

<img src="md-images/clip_image041.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 진료 정보(진료 시간)

<img src="md-images/clip_image043.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 해당 병원 리뷰 목록 출력

<img src="md-images/clip_image045.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 리뷰작성 페이지
* 제목, 내용 작성
* 자동으로 병원 이름, 주소, 작성자 작성됨 수정 불가
* 등록 버튼
* 취소 버튼(병원 상세정보 페이지로 이동)

<img src="md-images/clip_image047.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 병원 리뷰 등록 시 alert

<img src="md-images/clip_image049.png" align="left">

* alert 후 병원 리뷰 페이지로 이동

 <img src="md-images/clip_image051.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>





















 

* 약국 상세페이지도 병원 상세 정보 페이지와 동일

<img src="md-images/clip_image053.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<img src="md-images/clip_image055.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<img src="md-images/clip_image057.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<img src="md-images/clip_image059.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<img src="md-images/clip_image061.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

 

# **3.**  **휴원 정보 등록**

* 메인페이지 휴원정보 등록 버튼에 링크

<img src="md-images/clip_image062.png" align="left"> <br><br><br><br><br>



* 로그인 안되있을 시 alert 후 로근인 페이지로 이동

<img src="md-images/clip_image064.png" align="left"> <br><br><br><br><br>

<img src="md-images/clip_image004.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 로그인 됐을 시 내가 쓴 휴원 정보 페이지로 이동
* 내가 작성한 휴원정보 목록 출력
* 수정
* 삭제
* 휴원정보 등록 페이지 링크 버튼

<img src="md-images/clip_image066.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br>

 

* 휴원 정보 등록 페이지
* 병원이름, 도로명 주소 직접 입력
* 작성자 자동 입력됨, 수정 불가

<img src="md-images/clip_image068.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<img src="md-images/clip_image071.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 등록에 성공시 alert 후 내가쓴 휴원정보 페이지로 이동

<img src="md-images/clip_image070.png" align="left"> <br><br><br><br><br>

<img src="md-images/clip_image066.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br>



 

* 휴원이 반영전
* 휴원정복 등록 전 ‘1. 한사랑김수련산부인과의원’ 이 출력이 됨

<img src="md-images/clip_image073.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* '한사랑김수련산부인과의원’ 휴원정보 등록

<img src="md-images/clip_image075.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 휴원정보 등록 후 ‘1. 한사랑김수련산부인과의원’ 이 출력이 안됨

<img src="md-images/clip_image077.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

 

# 4. 챗봇

* 메인페이지 왼쪽아래 FAQ 챗봇 버튼 누를 시 챗봇 페이지로 이동
* TTS(Text to Speech), STT(Speech To Text) 지원

 ![img](md-images/clip_image078.png) <br><br>



* 챗봇 페이지로 이동하면 챗봇이 문자, 음성으로 인사말을 출력
* 기능에 대한 질문 응답

<img src="md-images/clip_image079.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>





* 등록된 질문 시
* 문자, 음성으로 응답 출력

<img src="md-images/clip_image081.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



* 없는 질문 시
* 문자, 음성으로 응답 출력

<img src="md-images/clip_image083.png" align="left"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>





# 5. 기타

* 로고를 누르면 메인 페이지로 이동

<img src="md-images/clip_image084.png" align="left">

 