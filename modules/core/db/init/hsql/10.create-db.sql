-- begin CUBA7STU_CUSTOMER
create table CUBA7STU_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBA7STU_CUSTOMER
-- begin CUBA7STU_ORDER
create table CUBA7STU_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID varchar(255) not null,
    QUANTITY integer not null,
    CUSTOMER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CUBA7STU_ORDER
-- begin CUBA7STU_PRODUCTION
create table CUBA7STU_PRODUCTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCTION_NAME varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end CUBA7STU_PRODUCTION
-- begin CUBA7STU_ORDER_LINE
create table CUBA7STU_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCTION_ID varchar(36),
    QUANTITY integer not null,
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CUBA7STU_ORDER_LINE
