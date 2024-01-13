CREATE TABLE seller
(
    code             varchar(36)        not null,
    fantasy_name     varchar(50) unique not null,
    company_name     varchar(50) unique not null,
    cnpj             varchar(14) unique not null,
    active           boolean            not null,
    created_at       timestamp          not null,
    created_by       varchar(100)       not null,
    last_modified_at timestamp          not null,
    last_modified_by varchar(100)       not null,
    primary key (code)
);

CREATE TABLE seller_aud
(
    code             varchar(36),
    rev              int,
    revtype          int,
    fantasy_name     varchar(50),
    company_name     varchar(50),
    cnpj             varchar(14),
    active           boolean,
    created_at       timestamp,
    created_by       varchar(100),
    last_modified_at timestamp,
    last_modified_by varchar(100),
    primary key (code, rev)
);