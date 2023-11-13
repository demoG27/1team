create table "user"
(
    id           uuid primary key,
    first_name   varchar(25)         not null,
    last_name    varchar(25)         not null,
    middle_name  varchar(50),
    user_type    varchar             not null,
    phone_number varchar(20) unique  not null,
    email        varchar(320) unique not null,
    password     varchar             not null
);