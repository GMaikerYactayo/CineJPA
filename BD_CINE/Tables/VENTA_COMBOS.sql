CREATE TABLE cine_jpa.venta_combos (
  idvenco NUMBER(11) NOT NULL,
  idcom NUMBER(11) NOT NULL,
  idvent NUMBER(11) NOT NULL,
  CONSTRAINT venta_combos_pk PRIMARY KEY (idvenco),
  CONSTRAINT venta_combos_combo FOREIGN KEY (idcom) REFERENCES cine_jpa.combo (idcom),
  CONSTRAINT venta_combos_venta FOREIGN KEY (idvent) REFERENCES cine_jpa.venta (idvent)
);