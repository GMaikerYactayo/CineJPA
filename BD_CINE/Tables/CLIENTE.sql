CREATE TABLE cine_jpa.cliente (
  idcli NUMBER(11) NOT NULL,
  nomcli VARCHAR2(30 BYTE),
  apecli VARCHAR2(30 BYTE),
  dnicli CHAR(8 BYTE),
  CONSTRAINT cliente_pk PRIMARY KEY (idcli)
);