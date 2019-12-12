CREATE TABLE cine_jpa.venta_entrada (
  idventdet NUMBER(11) NOT NULL,
  idvent NUMBER(11) NOT NULL,
  idpel NUMBER(11) NOT NULL,
  ident NUMBER(11) NOT NULL,
  canvendet NUMBER(11) NOT NULL,
  CONSTRAINT venta_entrada_pk PRIMARY KEY (idventdet),
  CONSTRAINT venta_entrada_entrada FOREIGN KEY (ident) REFERENCES cine_jpa.entrada (ident),
  CONSTRAINT venta_entrada_pelicula FOREIGN KEY (idpel) REFERENCES cine_jpa.pelicula (idpel),
  CONSTRAINT venta_entrada_venta FOREIGN KEY (idvent) REFERENCES cine_jpa.venta (idvent)
);