DROP TABLE TB_CUSTOMER;

CREATE TABLE TB_CUSTOMER(
	ID VARCHAR2(100) PRIMARY KEY,
	PASSWORD VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(100) NOT NULL
);

SELECT * FROM TB_CUSTOMER;

INSERT INTO TB_CUSTOMER VALUES('admin', 'admin123', '관리자');