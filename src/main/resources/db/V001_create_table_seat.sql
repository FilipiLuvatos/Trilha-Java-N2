create table seat(
    id bigserial not null,
    lugar varchar(5) not null,
    dtReservaFim date,
    dtReservaInicio date,
    status varchar(200) not null,

    primary key(id)
);