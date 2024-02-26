create schema if not exists hibernate;
create table hibernate.Person
(
    name         varchar(255),
    surname      varchar(255),
    age          int,
    phone_number varchar(255),
    city         varchar(255),
    id           serial,
    PRIMARY KEY (name, surname, age)
);
insert into hibernate.Person (name, surname, age, phone_number, city)
VALUES ('Ivan', 'Ivanov', 18, '89101234564', 'Voronezh');
insert into hibernate.Person (name, surname, age, phone_number, city)
VALUES ('Stepan', 'Stepanov', 35, '89106541298', 'Moscow');
insert into hibernate.Person (name, surname, age, phone_number, city)
VALUES ('Petr', 'Petrov', 39, '89109874563', 'Moscow');
insert into hibernate.Person (name, surname, age, phone_number, city)
VALUES ('Sonya', 'Ushakova', 78, '89102416541', 'Voronezh');

-- drop table hibernate.PERSON