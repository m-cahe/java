create table board(
num number(5),
name varchar2(30),
pass varchar2(30),
email varchar2(30),
title varchar2(30),
content varchar2(1000),
readcount number(4) default 0,
writedate date default sysdate,
constraint board_num_pk primary key(num)
);
-- seq 생성
create sequence board_seq 
start with 1
increment by 1;
-- 보기
select * from board;
-- insert
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '손준호', 'sonjunho@naver.com', '1234', '딱품', '잡히기만해봐라');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '오유정', 'ojung@daum.net', '1234', '세탁기', '돌돌돌돌');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '최광', 'choi@nate.com', '3333', '핫팩', '핑크');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '김유리', 'kim@naver.com', '1111', '반찬통', '이아니라 수납도구');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '윤승주', 'ysj@naver.com', '1111', '선물머지', '내밑으로다꿇어');
--drop
drop table board;
drop sequence board_seq;
