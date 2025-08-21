select * from actor
--between
select * from actor where actor_id between 2 and 5;

--in
select * from actor where actor_id in (1,3,5,9,66,100,99999999);

--like(büyük küçük harf duyarlı) ilike
select * from actor where first_name ilike '%x'

--order by
select * from actor order by last_name ASC--default
select * from actor order by first_name DEsc

--limit offset
select * from actor limit 4;--ilk 4  -- // */ /*
select * from actor offset 2; --2 datayı atla
select * from actor limit 4;--ilk 4  -- // */ /*
select * from actor offset 2 limit 3;

--aggregate
select * from payment;

--sum
select sum(amount) from payment

--count 
select count(*) from payment

--min max
select min(amount) from payment;
select max(amount) from payment;

--avg
select avg(amount) from payment;

--round
select round(avg(amount),3) from payment;



select * from city;
--group by
select country_id from city group by country_id
select city from city group by city

--having(group by ile birlikte kullanılır)
select count(*), country_id from city group by country_id having country_id>8;

--null kontrolü
select * from film where description is null











