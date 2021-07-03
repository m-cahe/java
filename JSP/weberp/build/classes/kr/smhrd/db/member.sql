-- tblMember ���̺� ����
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
--�Ϸù�ȣ ������ ����
create sequence num_seq
increment by 1
start with 1;
--tblMember ��ȸ
select * from tblMember;
--insert
insert into tblMember
values(num_seq.nextval, 'admin', 'admin', '������', '010-1234-5678', 'admin@naver.com', '����CGI����');
--delete
delete from tblMember;
drop table tblMember cascade constraints;
drop table tblMember;
drop sequence num_seq;
delete from tblMember where num='7';
--����
update tblMember set num=3 where num=13;
--���� ������ ���� (cur����� next�ѹ���Ű�� �ϱ�)
select num_seq.nextval from dual;
select num_seq.currval from dual;


