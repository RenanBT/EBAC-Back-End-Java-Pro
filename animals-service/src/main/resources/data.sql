INSERT INTO animal (especie, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, id_recebedor, nome_recebedor, porte, funcionario_id)
VALUES ('Cachorro', 'Rex', 2, 'Vira-lata', '2022-01-01', 'Encontrado na rua', 1, 'João', 'Médio',1);

-- Exemplo 2: Animal adotado por um funcionário
INSERT INTO animal (especie, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, id_recebedor, nome_recebedor, porte, data_adocao, funcionario_id)
VALUES ('Gato', 'Whiskers', 1, 'Siamês', '2022-02-01', 'Resgatado de um abrigo', 2, 'Maria', 'Pequeno', '2022-03-01', 2);

-- Exemplo 3: Animal falecido
INSERT INTO animal (especie, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, id_recebedor, nome_recebedor, porte, data_obito, funcionario_id)
VALUES ('Cachorro', 'Buddy', 4, 'Labrador', '2022-03-01', 'Entregue pelo dono', 1, 'João', 'Grande', '2022-04-15',1);