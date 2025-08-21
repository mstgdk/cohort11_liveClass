--tablo oluşturma
create table yazarlar(
id serial primary key, --primaryrkey= not null + uniq
	isim varchar(20),
	soy_isim varchar(20),
	birthday date
);
select * from yazarlar;

--eleman ekleme
insert into yazarlar(isim,soy_isim,birthday) values('mesut','gedik','2000-01-01');
insert into yazarlar(isim,soy_isim) values('kerem','gedik');

--aynı tablodan tekrar oluşturma
create table yazarlar2 (like yazarlar);

--bir tabloya başka bir tablodan veri ekleme
insert into yazarlar2 select * from yazarlar where id=1;

--verileriyle birlikte
create table yazarlar3 as select * from yazarlar;

--tablo silme DROP
drop table yazarlar4;
drop table if exists yazarlar4;
drop table if exists yazarlar3;

--DELETE
delete from yazarlar;
delete from yazarlar where id=6;

--transaction
begin;
delete from yazarlar where id=9;
ROLLBACK;

--date update
update yazarlar set isim ='ali' where id=7

--tablo adını değiştirme
alter table yazarlar2 rename to yazarlar22;

--tablodan sütun silme
alter table yazarlar22 drop column soy_isim;

--sütun adı değiştirme
alter table yazarlar22 RENAME column isim to ad 

--sütun data tipi değiştirme
alter table yazarlar22 alter column ad type char(20); 
