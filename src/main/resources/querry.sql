create database if not exists financial_management;

use financial_management;

insert into roles(name) values ('ROLE_ADMIN');

insert into users(email, password, username) values ('a','user1','1');

insert into user_roles(user_id, role_id) values (1,1);