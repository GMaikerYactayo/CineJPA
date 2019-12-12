CREATE TABLE cine_jpa.venta (
  idvent NUMBER(11) NOT NULL,
  tipvent CHAR NOT NULL,
  idper NUMBER(11) NOT NULL,
  fecvent TIMESTAMP DEFAULT SYSDATE,
  idcli NUMBER(11) NOT NULL,
  CONSTRAINT venta_pk PRIMARY KEY (idvent),
  CONSTRAINT venta_fk1 FOREIGN KEY (idcli) REFERENCES cine_jpa.cliente (idcli),
  CONSTRAINT venta_personal FOREIGN KEY (idper) REFERENCES cine_jpa.personal (idper)
);