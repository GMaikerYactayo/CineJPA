CREATE TABLE cine_jpa.entrada (
  ident NUMBER(11) NOT NULL,
  tipent VARCHAR2(30 BYTE) NOT NULL,
  preent NUMBER(8,2) NOT NULL,
  CONSTRAINT entrada_pk PRIMARY KEY (ident)
);