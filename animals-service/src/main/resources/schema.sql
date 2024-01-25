CREATE TABLE animal (
  id INT AUTO_INCREMENT NOT NULL,
   especie VARCHAR(255) NOT NULL,
   nome_provisorio VARCHAR(255) NOT NULL,
   idade_estimada INT NOT NULL,
   raca VARCHAR(255) NOT NULL,
   data_entrada datetime NOT NULL,
   data_adocao datetime NULL,
   condicoes_chegada VARCHAR(255) NOT NULL,
   id_recebedor INT NOT NULL,
   nome_recebedor VARCHAR(255) NOT NULL,
   data_obito datetime NULL,
   funcionario_id INT NULL,
   porte VARCHAR(255) NOT NULL,
   CONSTRAINT pk_animal PRIMARY KEY (id)
);

CREATE TABLE funcionario (
  id INT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(255) NULL,
   CONSTRAINT pk_funcionario PRIMARY KEY (id)
);
