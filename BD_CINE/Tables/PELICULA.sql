CREATE TABLE cine_jpa.pelicula (
  idpel NUMBER(11) NOT NULL,
  nompel VARCHAR2(30 BYTE) NOT NULL,
  genpel VARCHAR2(25 BYTE) NOT NULL,
  fechestreno DATE NOT NULL,
  fechtermino DATE NOT NULL,
  CONSTRAINT pelicula_pk PRIMARY KEY (idpel)
);