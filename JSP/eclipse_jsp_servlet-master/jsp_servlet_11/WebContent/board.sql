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
-- seq ����
create sequence board_seq 
start with 1
increment by 1;
-- ����
select * from board;
-- insert
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '����ȣ', 'sonjunho@naver.com', '1234', '��ǰ', '�����⸸�غ���');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '������', 'ojung@daum.net', '1234', '��Ź��', '��������');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '�ֱ�', 'choi@nate.com', '3333', '����', '��ũ');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '������', 'kim@naver.com', '1111', '������', '�̾ƴ϶� ��������');
insert into board(num,name,email,pass,title, content) values(board_seq.nextval, '������', 'ysj@naver.com', '1111', '��������', '�������δٲݾ�');
--drop
drop table board;
drop sequence board_seq;
