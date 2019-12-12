CREATE TABLE cine_jpa.combo (
  idcom NUMBER(11) NOT NULL,
  tipcom VARCHAR2(30 BYTE) NOT NULL,
  precom NUMBER(8,2) NOT NULL,
  CONSTRAINT combo_pk PRIMARY KEY (idcom)
);