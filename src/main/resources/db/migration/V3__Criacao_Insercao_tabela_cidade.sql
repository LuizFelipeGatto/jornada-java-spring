-- CREATE SEQUENCE IF NOT EXISTS curso.departamento_codigo_seq;
-- AUTO INCREMENT NO MYSQL, no POSTGRE SERIAL ou GENERATED ... AS IDENTITY

CREATE TABLE IF NOT EXISTS curso.cidade(
    id SERIAL NOT NULL,
    nome VARCHAR(100) NOT NULL,
    capital BOOLEAN DEFAULT FALSE NOT NULL, -- no MYSQL TINYINT(1)
    estado_id INTEGER NOT NULL,

    CONSTRAINT cidade_pk PRIMARY KEY (id),
    CONSTRAINT cidade_unique UNIQUE (nome, estado_id),
    CONSTRAINT cidade_estado_fk FOREIGN KEY (estado_id) REFERENCES curso.estado(id)
);

INSERT INTO curso.cidade (nome, estado_id) VALUES ('Machado', 13);
INSERT INTO curso.cidade (nome, estado_id) VALUES ('Poços de Caldas', 13);
INSERT INTO curso.cidade (nome, estado_id) VALUES ('Alfenas', 13);
INSERT INTO curso.cidade (nome, estado_id) VALUES ('Pouso Alegre', 13);
INSERT INTO curso.cidade (nome, capital, estado_id) VALUES ('Belo Horizonte', TRUE, 13);

INSERT INTO curso.cidade (nome, estado_id) VALUES ('Campinas', 25);
INSERT INTO curso.cidade (nome, capital, estado_id) VALUES ('São Paulo', TRUE, 25);
INSERT INTO curso.cidade (nome, estado_id) VALUES ('Ubatuba', 25);
INSERT INTO curso.cidade (nome, estado_id) VALUES ('Guarujá', 25);
