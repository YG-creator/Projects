# 제목 : 와인 관리 DB 구축



# 기능 설명

## 입력기능

밭, 포도농장, 양조장, 와인종류 테이블, 와인등급테이블 등록을 구현했습니다.

## 포도농장 관리

포도농장 목록 출력, 포도농장별 통계정보 요약 출력, 포도농장 상제정보 출력, 포도농장 정보 수정, 밭 상세정보 출력, 밭 정보 수정, 밭 생산, 밭 생산내역 수정을 구현했습니다.

새로운 포도밭 구매 기능은 완전히 구현하지는 못했습니다. 새로운 포도밭 구매 기능에서는 money가 0일 때 새로운 포도밭을 사지 못하는 상황을 구현하지 못했습니다.

## 와이너리 관리

와이너리 목록 출력, 와이너리별 통계정보 요약 출력, 와이너리 상세 정보 출력(생산 목록, 판매 목록, 와이너리 정보 수정, 와인 생산 정보 추가, 생산내역과 판매내역 수정 기능을 구현했습니다. 

와인 재고량, 생산량 판매량 출력 기능, 포도 구매 기능, 와인 판매 정보 추가 기능은 완전히 구현하지는 못했습니다. 와인 재고량, 생산량 판매량 출력 기능 구현에서는 생산내역 및 판매내역 수정 시 재고량도 수정되는 것을 구현하지 못했고, 포도 구매 기능에서는 돈이 0일 때 포도를 구매하지 못하는 상황을 구현을 못했으며, 와인 재고량이 0일 때 와인 판매 정보 추가가 불가능한 상황을 구현하지 못했습니다.

 

# Database Schema

```sql
CREATE TABLE `field` (

 `field_ID` varchar(45) NOT NULL,

 `location` varchar(45) NOT NULL,

 `area` int NOT NULL,

 `variety` varchar(45) NOT NULL,

 `vineyard_ID` varchar(45) NOT NULL DEFAULT 'empty',

 PRIMARY KEY (`field_ID`),

 KEY `field_ibfk_1` (`vineyard_ID`),

 CONSTRAINT `field_ibfk_1` FOREIGN KEY (`vineyard_ID`) REFERENCES `vineyard` (`vineyard_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `grapeproduction` (

 `GP_ID` varchar(45) NOT NULL,

 `year` varchar(45) NOT NULL,

 `amount` int NOT NULL,

 `field_ID` varchar(45) NOT NULL,

 PRIMARY KEY (`GP_ID`),

 KEY `field_ID` (`field_ID`),

 CONSTRAINT `grapeproduction_ibfk_1` FOREIGN KEY (`field_ID`) REFERENCES `field` (`field_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `grapetrade` (

 `GT_ID` varchar(45) NOT NULL,

 `year` int NOT NULL,

 `variety` varchar(45) NOT NULL,

 `amount` int NOT NULL,

 `vineyard_ID` varchar(45) NOT NULL,

 `winery_ID` varchar(45) NOT NULL,

 PRIMARY KEY (`GT_ID`),

 KEY `vineyard_ID` (`vineyard_ID`),

 KEY `winery_ID` (`winery_ID`),

 CONSTRAINT `grapetrade_ibfk_1` FOREIGN KEY (`vineyard_ID`) REFERENCES `vineyard` (`vineyard_ID`),

 CONSTRAINT `grapetrade_ibfk_2` FOREIGN KEY (`winery_ID`) REFERENCES `winery` (`winery_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `vineyard` (

 `vineyard_ID` varchar(45) NOT NULL,

 `owner` varchar(45) DEFAULT NULL,

 `address` varchar(45) DEFAULT NULL,

 `tel_number` varchar(45) DEFAULT NULL,

 `inv_white` int NOT NULL,

 `inv_red` int NOT NULL,

 `money` int NOT NULL,

 PRIMARY KEY (`vineyard_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `winecategory` (

 `category_ID` varchar(45) NOT NULL,

 `title` varchar(45) NOT NULL,

 `standardPrice` int NOT NULL,

 PRIMARY KEY (`category_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `winegrade` (

 `grade_ID` varchar(45) NOT NULL,

 `title` varchar(45) NOT NULL,

 `ratio` float NOT NULL,

 PRIMARY KEY (`grade_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `wineinventory` (

 `WI_ID` int NOT NULL AUTO_INCREMENT,

 `category_ID` varchar(45) NOT NULL,

 `amount` int NOT NULL,

 `winery_ID` varchar(45) NOT NULL,

 PRIMARY KEY (`WI_ID`),

 KEY `winery_ID` (`winery_ID`),

 CONSTRAINT `wineinventory_ibfk_1` FOREIGN KEY (`winery_ID`) REFERENCES `winery` (`winery_ID`)

) AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `wineproduction` (

 `WP_ID` varchar(45) NOT NULL,

 `category_ID` varchar(45) NOT NULL,

 `year` varchar(4) NOT NULL,

 `amount` int NOT NULL,

 `winery_ID` varchar(45) NOT NULL,

 PRIMARY KEY (`WP_ID`),

 KEY `winery_ID` (`winery_ID`),

 CONSTRAINT `wineproduction_ibfk_1` FOREIGN KEY (`winery_ID`) REFERENCES `winery` (`winery_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `winery` (

 `winery_ID` varchar(45) NOT NULL,

 `owner` varchar(45) NOT NULL,

 `address` varchar(45) NOT NULL,

 `tel_number` varchar(45) NOT NULL,

 `inv_white` int NOT NULL,

 `inv_red` int NOT NULL,

 `money` int NOT NULL,

 `grade_ID` varchar(45) NOT NULL,

 `vineyard_ID` varchar(45) NOT NULL,

 PRIMARY KEY (`winery_ID`),

 KEY `vineyard_ID` (`vineyard_ID`),

 CONSTRAINT `winery_ibfk_1` FOREIGN KEY (`vineyard_ID`) REFERENCES `vineyard` (`vineyard_ID`)

) DEFAULT CHARSET=utf8mb3

 

CREATE TABLE `winetrade` (

 `WT_ID` varchar(45) NOT NULL,

 `category_ID` varchar(45) NOT NULL,

 `year` varchar(4) NOT NULL,

 `amount` int NOT NULL,

 `winery_ID` varchar(45) NOT NULL,

 PRIMARY KEY (`WT_ID`),

 KEY `winery_ID` (`winery_ID`),

 CONSTRAINT `winetrade_ibfk_1` FOREIGN KEY (`winery_ID`) REFERENCES `winery` (`winery_ID`)

) DEFAULT CHARSET=utf8mb3
```





 

# 어려웠던 점, 배운 점, 느낌 점

어려웠던 점 : 웹과 DB 둘 다 다루니 어려웠습니다.

배운 점 : DB 설계방법을 배웠으며, 웹(jsp) 에 대해서도 배웠습니다.

느낀 점 : DB에 대한 거부감이 사라졌습니다. 

 

# 앞으로 개선되었으면 하는 점

DB를 편하게 다룰 수 있는 툴을 추가로 배우고 싶습니다.