alter table CUBA7STU_ORDER add constraint FK_CUBA7STU_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references CUBA7STU_CUSTOMER(ID);
create index IDX_CUBA7STU_ORDER_ON_CUSTOMER on CUBA7STU_ORDER (CUSTOMER_ID);
