create table yazarlar (
id serial primary key,
	yazar_ismi varchar(50) not null,
	d_tarihi integer check(d_tarihi<2020),
	il varchar(50)
);
create table kitaplar (
id serial primary key,
	kitap_ismi varchar(50) not null,
	bas_tarihi integer,
	yazar_id integer references yazarlar(id) 
);
--tablo içine data ekleme
insert into yazarlar (yazar_ismi,d_tarihi,il) values ('Reşat Nuri Güntekin',1916,'Balıkesir');
INSERT INTO yazarlar (yazar_ismi, d_tarihi, il) VALUES ('Nazım Hikmet', 1902, 'Selanik');
INSERT INTO yazarlar (yazar_ismi, d_tarihi, il) VALUES ('Yaşar Kemal', 1923, 'Osmaniye');
INSERT INTO yazarlar (yazar_ismi, d_tarihi, il) VALUES ('Sabahattin Ali', 1907, 'Edirne');
INSERT INTO yazarlar (yazar_ismi, d_tarihi, il) VALUES ('Ahmet Hamdi Tanpınar', 1901, 'Istanbul');
INSERT INTO yazarlar (yazar_ismi, d_tarihi, il) VALUES ('Sait Faik Abasıyanık', 1906, 'Adapazarı');

insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('çalıkuşu',1984,1);
insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('yeşil gece',1980,1);
insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('ince memed',1970,3);
insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('kuyucaklı yusuf',1981,4);
insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('saatleri ayarlama',1954,5);
insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('semaver',1944,6);
insert into kitaplar (kitap_ismi,bas_tarihi,yazar_id) values ('serenad',2000,null);

--inner Join
select yazar_ismi, kitap_ismi from yazarlar inner join kitaplar on yazarlar.id = kitaplar.yazar_id; 

--left join
select yazar_ismi, d_tarihi,kitap_ismi from yazarlar left join kitaplar on yazarlar.id = kitaplar.yazar_id; 

--full join
select yazar_ismi, d_tarihi, kitap_ismi from yazarlar full join kitaplar on yazarlar.id = kitaplar.yazar_id;



