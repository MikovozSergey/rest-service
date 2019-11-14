create table items
(
    id   bigint auto_increment,
    name varchar(300),
    cost int,
    primary key (id)
);

create table consumers
(
    id      bigint auto_increment,
    name    varchar(300),
    phone   varchar(15),
    address varchar(300),
    primary key (id)
);

create table orders
(
    id          bigint auto_increment,
    count       int,
    order_time  timestamp,
    consumer_id bigint not null,
    item_id     bigint not null,
    primary key (id)
);