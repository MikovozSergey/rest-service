alter table orders add foreign key (consumer_id) references consumers(id);
alter table orders add foreign key (item_id) references  orders(id);