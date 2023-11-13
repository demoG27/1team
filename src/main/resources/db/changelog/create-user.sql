create type user_type as enum ('STUDENT', 'MENTOR', 'ADMIN', 'ASSISTANT');
create table "user"(
  id uuid primary key ,
  first_name varchar(25) not null ,
  last_name varchar(25) not null ,
  midle_name varchar(50),
  user_type user_type not null,
  phone_number varchar(20) unique not null ,
  email varchar(320) unique not null ,
  password varchar not null
);