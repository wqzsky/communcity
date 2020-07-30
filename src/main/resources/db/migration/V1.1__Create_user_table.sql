create table user
(
    id           int auto_increment primary key,
    account_id   tinytext     null,
    name         tinytext     null,
    token        char(36)     null,
    gmt_create   bigint       null,
    gmt_modified bigint       null
);

