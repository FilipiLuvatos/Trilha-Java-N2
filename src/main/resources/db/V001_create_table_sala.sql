create table sala(
    id bigserial not null,
    tipo varchar(30) not null,
    nome varchar(100) not null,
    dtReservaFim date,
    dtReservaInicio date,

    primary key(id)
);