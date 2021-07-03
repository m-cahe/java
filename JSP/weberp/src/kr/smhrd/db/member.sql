-- tblMember 테이블 생성
create table tblMember(
num number(3) not null,
id varchar2(20) not null,
pw varchar2(20) not null,
name varchar2(20) not null,
tel varchar2(20),
email varchar2(30),
addr varchar2(100),
constraint tblMember_num_pk primary key(num)
);
--일련번호 시퀀스 생성
create sequence num_seq
increment by 1
start with 1;
--tblMember 조회
select * from tblMember;
--insert
insert into tblMember
values(num_seq.nextval, 'admin', 'admin', '관리자', '010-1234-5678', 'admin@naver.com', '광주CGI센터');
--delete
delete from tblMember;
drop table tblMember cascade constraints;
drop table tblMember;
drop sequence num_seq;
delete from tblMember where num='7';
--수정
update tblMember set num=3 where num=13;
--현재 시퀀스 보기 (cur볼라믄 next한번시키고 하기)
select num_seq.nextval from dual;
select num_seq.currval from dual;


