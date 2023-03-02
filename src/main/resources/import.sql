create table if not exists products(id  bigserial primary key, title varchar(255), price integer);

insert into products (title, price) values ('first', 50), ('second', 60),('third', 80);
