create table client (
    id int not null auto_increment,
    name varchar(50) not null,
    contact varchar(200) not null,
    extra_data VARCHAR(200) default null,
    has_work_in_progress tinyint(1) default 0,
    primary key (id)
);

create table order_request (
   id int not null auto_increment,
   status varchar(50) not null,
   details varchar(200),
   creation_date datetime not null,
   client_id int null,
   solved tinyint(1) not null,
   primary key (id),
   foreign key (client_id) references client (id)
);

