CREATE TABLE cine_jpa.personal (
  idper NUMBER(11) NOT NULL,
  nomper VARCHAR2(30 BYTE) NOT NULL,
  apeper VARCHAR2(30 BYTE) NOT NULL,
  dniper CHAR(8 BYTE) NOT NULL,
  celper CHAR(9 BYTE) NOT NULL,
  tipper CHAR(2 BYTE) NOT NULL,
  CONSTRAINT personal_pk PRIMARY KEY (idper)
);