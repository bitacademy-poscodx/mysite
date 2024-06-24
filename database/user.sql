desc user;

-- join
insert into user values(null, '관리자', 'admin@mysite.com', password('1234'), 'male', current_date(), 'ADMIN');

-- login
select no, name from user where email = 'kickscar@gmail.com' and password=password('1234');

-- test
desc user;
select * from user;

-- role 추가
alter table user add column role enum('ADMIN', 'USER') not null default 'USER'; 
update user set role='ADMIN' where no = 20;