create table "`group`"
(
    id           uuid primary key,
    name         varchar(25) not null,
    mentor_id    uuid        not null,
    start_time   timestamp   not null,
    group_type   varchar     not null,
    group_status varchar     not null
);