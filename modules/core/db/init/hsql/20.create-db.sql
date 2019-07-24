-- begin CUBA7STU_ORDER
alter table CUBA7STU_ORDER add constraint FK_CUBA7STU_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references CUBA7STU_CUSTOMER(ID)^
create index IDX_CUBA7STU_ORDER_ON_CUSTOMER on CUBA7STU_ORDER (CUSTOMER_ID)^
-- end CUBA7STU_ORDER
-- begin CUBA7STU_ORDER_LINE
alter table CUBA7STU_ORDER_LINE add constraint FK_CUBA7STU_ORDER_LINE_ON_PRODUCTION foreign key (PRODUCTION_ID) references CUBA7STU_PRODUCTION(ID)^
alter table CUBA7STU_ORDER_LINE add constraint FK_CUBA7STU_ORDER_LINE_ON_ORDER foreign key (ORDER_ID) references CUBA7STU_ORDER(ID)^
create index IDX_CUBA7STU_ORDER_LINE_ON_PRODUCTION on CUBA7STU_ORDER_LINE (PRODUCTION_ID)^
create index IDX_CUBA7STU_ORDER_LINE_ON_ORDER on CUBA7STU_ORDER_LINE (ORDER_ID)^
-- end CUBA7STU_ORDER_LINE