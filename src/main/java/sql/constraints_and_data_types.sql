CREATE TABLE personel(
					 id serial primary key,
					  tc_kimlik_no char(11) UNIQUE NOT NULL,
					  isim VARCHAR(30) not null,
					  aciklama text,
					  d_tarihi date not null,
					  ise_bas_tar time DEFAULT CURRENT_TIME,
					  maas INTEGER CHECK (maas > 22000),
					  aktif_mi boolean DEFAULT true
					 );
					 
select * from personel;

insert into personel(tc_kimlik_no,isim,aciklama,d_tarihi,maas) 
values('12345678911','patika','açıklama test', '2000-12-12',22001);

insert into personel(tc_kimlik_no,isim,aciklama,d_tarihi,maas) 
values('12356788911','patika','açıklama test', '2000-12-12',22111);