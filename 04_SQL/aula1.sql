CREATE TABLE pessoas (
    id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(30) NOT NULL,
    nascimento DATE
)

INSERT INTO pessoas (nome, nascimento) VALUES ('Marcos Roberto', '1987-05-09')
INSERT INTO pessoas (nome, nascimento) VALUES ('Mateus', '1997-05-27')
INSERT INTO pessoas (nome, nascimento) VALUES ('Diva', '1966-03-10')
INSERT INTO pessoas (nome, nascimento) VALUES ('Euripedes', '1962-05-29')