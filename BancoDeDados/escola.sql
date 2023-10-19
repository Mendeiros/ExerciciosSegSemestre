CREATE TABLE Alunos (
IDAlunos INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(255) NOT NULL,
DataNascimento DATE,
Genero CHAR,
Endereco VARCHAR(255),
Contato VARCHAR(255)
);

CREATE TABLE Professores (
IDProfessor INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(255) NOT NULL,
DataNascimento DATE,
Genero CHAR,
Endereco VARCHAR(255),
Contato VARCHAR(255)
);

CREATE TABLE Disciplinas (
IDDisciplina INT AUTO_INCREMENT PRIMARY KEY,
NomeDisciplina VARCHAR(255) NOT NULL
);

CREATE TABLE Turmas (
IDTurma INT AUTO_INCREMENT PRIMARY KEY,
NomeTurma VARCHAR(255) NOT NULL,
AnoLetivo INT,
ProfessorResponsavel INT,
FOREIGN KEY (ProfessorResponsavel) REFERENCES Professores (IDProfessor)
);

CREATE TABLE Notas (
IDNota INT AUTO_INCREMENT PRIMARY KEY,
IDAluno INT,
IDDisciplina INT,
Nota DECIMAL(5, 2),
FOREIGN KEY (IDAluno) REFERENCES Alunos (IDAlunos),
FOREIGN KEY (IDDisciplina) REFERENCES Disciplinas (IDDisciplina)
);

CREATE TABLE Frequencia (
IDFrequencia INT AUTO_INCREMENT PRIMARY KEY,
IDAluno INT,
IDDisciplina INT,
Dia DATE,
Presenca boolean,
FOREIGN KEY (IDAluno) REFERENCES Alunos (IDAlunos),
FOREIGN KEY (IDDisciplina) REFERENCES Disciplinas (IDDisciplina)
);

CREATE TABLE EventosEscolares (
IDEvento INT AUTO_INCREMENT PRIMARY KEY,
NomeEvento VARCHAR(255) NOT NULL,
DataEvento DATE,
Descricao TEXT,
Endereco VARCHAR(255)
);

CREATE TABLE Usuarios (
IDUsuario INT AUTO_INCREMENT PRIMARY KEY,
NomeUsuario VARCHAR(50) NOT NULL,
Senha VARCHAR(255) NOT NULL
);

INSERT INTO Alunos (Nome, DataNascimento, Genero, Endereco, Contato) VALUES
('John Smith', '2005-03-15', 'M', '123 Main St, City, Country', 'john.smith@email.com'),
('Alice Johnson', '2004-07-20', 'F', '456 Elm St, City, Country', 'alice.johnson@email.com'),
('Michael Davis', '2006-01-10', 'M', '789 Oak St, City, Country', 'michael.davis@email.com'),
('Emma Wilson', '2005-09-25', 'F', '101 Pine St, City, Country', 'emma.wilson@email.com'),
('Daniel Brown', '2005-11-30', 'M', '111 Cedar St, City, Country', 'daniel.brown@email.com'),
('Olivia Taylor', '2006-03-08', 'F', '222 Maple St, City, Country', 'olivia.taylor@email.com'),
('William Jones', '2004-12-18', 'M', '333 Elm St, City, Country', 'william.jones@email.com'),
('Sophia Garcia', '2005-05-07', 'F', '444 Oak St, City, Country', 'sophia.garcia@email.com'),
('Ethan Martinez', '2006-02-14', 'M', '555 Pine St, City, Country', 'ethan.martinez@email.com'),
('Ava Davis', '2004-10-29', 'F', '666 Cedar St, City, Country', 'ava.davis@email.com'),
('Mason Johnson', '2006-06-12', 'M', '777 Birch St, City, Country', 'mason.johnson@email.com'),
('Isabella Smith', '2005-08-05', 'F', '888 Oak St, City, Country', 'isabella.smith@email.com'),
('Liam Wilson', '2004-04-25', 'M', '999 Willow St, City, Country', 'liam.wilson@email.com'),
('Charlotte Brown', '2006-09-14', 'F', '123 Pine St, City, Country', 'charlotte.brown@email.com'),
('Noah Taylor', '2005-07-30', 'M', '234 Elm St, City, Country', 'noah.taylor@email.com'),
('Amelia Garcia', '2004-12-10', 'F', '345 Oak St, City, Country', 'amelia.garcia@email.com'),
('Logan Johnson', '2006-02-22', 'M', '456 Birch St, City, Country', 'logan.johnson@email.com'),
('Harper Davis', '2005-11-19', 'F', '567 Willow St, City, Country', 'harper.davis@email.com'),
('Benjamin Smith', '2004-06-03', 'M', '678 Cedar St, City, Country', 'benjamin.smith@email.com'),
('John Snow', '2003-10-15', 'M', '789 California St, City, Country', 'john.snow@email.com');

INSERT INTO Professores (Nome, DataNascimento, Genero, Endereco, Contato) VALUES
('Robert Lee', '1975-11-12', 'M', '333 Birch St, City, Country', 'robert.lee@email.com'),
('Linda Martinez', '1985-08-18', 'F', '444 Oak St, City, Country', 'linda.martinez@email.com'),
('James Taylor', '1970-02-27', 'M', '555 Maple St, City, Country', 'james.taylor@email.com'),
('Emily Clark', '1990-06-15', 'F', '666 Pine St, City, Country', 'emily.clark@email.com'),
('Daniel Moore', '1982-03-20', 'M', '777 Elm St, City, Country', 'daniel.moore@email.com'),
('Olivia Smith', '1978-09-05', 'F', '888 Oak St, City, Country', 'olivia.smith@email.com'),
('Matthew Davis', '1987-04-10', 'M', '999 Cedar St, City, Country', 'matthew.davis@email.com'),
('Sophia Johnson', '1983-07-22', 'F', '111 Willow St, City, Country', 'sophia.johnson@email.com'),
('David Wilson', '1976-12-30', 'M', '222 Maple St, City, Country', 'david.wilson@email.com'),
('Ava Martin', '1989-08-28', 'F', '333 Pine St, City, Country', 'ava.martin@email.com'),
('Jacob Anderson', '1981-01-15', 'M', '444 Birch St, City, Country', 'jacob.anderson@email.com'),
('Emma Taylor', '1984-05-25', 'F', '555 Oak St, City, Country', 'emma.taylor@email.com'),
('William Martinez', '1979-10-03', 'M', '666 Cedar St, City, Country', 'william.martinez@email.com'),
('Mia Lee', '1986-02-08', 'F', '777 Willow St, City, Country', 'mia.lee@email.com'),
('Ethan Davis', '1988-06-19', 'M', '888 Birch St, City, Country', 'ethan.davis@email.com'),
('Sophie Johnson', '1980-07-14', 'F', '999 Pine St, City, Country', 'sophie.johnson@email.com'),
('Benjamin Smith', '1987-04-03', 'M', '111 Cedar St, City, Country', 'benjamin.smith@email.com'),
('Zoe Anderson', '1982-09-10', 'F', '222 Willow St, City, Country', 'zoe.anderson@email.com'),
('James Acaster', '1992-02-27', 'M', '333 Abbey St, City, Country', 'james.acaster@email.com'),
('Olivia Rodrigo', '2000-05-05', 'F', '444 Rode St, City, Country', 'olivia.rodrigo@email.com');

INSERT INTO Disciplinas (NomeDisciplina) VALUES
('Ciências'),
('História'),
('Língua Portuguesa'),
('Geografia'),
('Artes'),
('Educação Física'),
('Inglês'),
('Física'),
('Química'),
('Biologia'),
('Matemática'),
('Economia'),
('Filosofia'),
('Sociologia'),
('Informática'),
('Música'),
('Psicologia'),
('Literatura'),
('Teatro'),
('Educação financeira');

INSERT INTO Turmas (NomeTurma, AnoLetivo, ProfessorResponsavel) VALUES
('Turma A', 2023, 1),
('Turma B', 2023, 2),
('Turma C', 2023, 3),
('Turma D', 2023, 4),
('Turma E', 2023, 5),
('Turma F', 2023, 1),
('Turma G', 2023, 2),
('Turma H', 2023, 3),
('Turma I', 2023, 4),
('Turma J', 2023, 5),
('Turma K', 2023, 1),
('Turma L', 2023, 2),
('Turma M', 2023, 3),
('Turma N', 2023, 4),
('Turma O', 2023, 5),
('Turma P', 2023, 1),
('Turma Q', 2023, 2),
('Turma R', 2023, 3),
('Turma S', 2023, 4),
('Turma T', 2023, 4);

INSERT INTO Notas (IDAluno, IDDisciplina, Nota) VALUES
(1, 1, 90.5),
(2, 1, 88.0),
(3, 1, 92.5),
(4, 1, 85.0),
(5, 1, 78.5),
(6, 1, 94.0),
(7, 1, 89.5),
(8, 1, 91.0),
(9, 1, 82.5),
(10, 1, 76.0),
(11, 1, 95.5),
(12, 1, 88.5),
(13, 1, 90.0),
(14, 1, 84.5),
(15, 1, 86.5),
(16, 1, 79.5),
(17, 1, 93.5),
(18, 1, 87.0),
(19, 1, 89.0),
(20, 1, 77.5);

INSERT INTO Frequencia (IDAluno, IDDisciplina, Dia, Presenca) VALUES
(1, 1, '2023-10-01', 1),
(2, 1, '2023-10-01', 1),
(3, 1, '2023-10-01', 0),
(4, 1, '2023-10-01', 1),
(5, 1, '2023-10-01', 1),
(6, 1, '2023-10-01', 0),
(7, 1, '2023-10-01', 1),
(8, 1, '2023-10-01', 1),
(9, 1, '2023-10-01', 1),
(10, 1, '2023-10-01', 0),
(11, 1, '2023-10-01', 1),
(12, 1, '2023-10-01', 1),
(13, 1, '2023-10-01', 1),
(14, 1, '2023-10-01', 0),
(15, 1, '2023-10-01', 1),
(16, 1, '2023-10-01', 1),
(17, 1, '2023-10-01', 1),
(18, 1, '2023-10-01', 0),
(19, 1, '2023-10-01', 1),
(20, 1, '2023-10-01', 1);

INSERT INTO EventosEscolares (NomeEvento, DataEvento, Descricao, Endereco) VALUES
('Festa Junina', '2023-06-25', 'Comida típica, danças e diversão', 'School Playground'),
('Reunião de Pais', '2023-09-05', 'Discussão do progresso dos alunos', 'School Meeting Room'),
('Dia do Esporte', '2023-04-20', 'Competições esportivas entre turmas', 'School Sports Field'),
('Baile de Formatura', '2023-12-10', 'Celebração de formatura dos alunos', 'School Gymnasium'),
('Show de Talentos', '2023-03-08', 'Apresentações de talentos dos alunos', 'School Auditorium'),
('Excursão ao Museu', '2023-07-14', 'Visita educativa ao museu da cidade', 'City Museum'),
('Feira de Livros', '2023-11-30', 'Exposição e venda de livros', 'School Library'),
('Campeonato de Xadrez', '2023-09-18', 'Competição de xadrez entre estudantes', 'School Chess Room'),
('Noite Cultural', '2023-05-20', 'Apresentações culturais de diferentes países', 'School Auditorium'),
('Visita à Fazenda', '2023-08-12', 'Passeio educativo a uma fazenda', 'Local Farm'),
('Sarau Literário', '2023-10-07', 'Leitura de poemas e textos literários', 'School Library'),
('Feira de Ciências', '2023-11-15', 'Apresentação de projetos de ciências', 'School Auditorium'),
('Torneio de Futebol', '2023-03-30', 'Competição de futebol entre turmas', 'School Soccer Field'),
('Apresentação de Teatro', '2023-04-25', 'Espetáculo teatral dos alunos', 'School Auditorium'),
('Concurso de Pintura', '2023-07-02', 'Competição de pintura artística', 'School Art Room'),
('Dia do Meio Ambiente', '2023-06-05', 'Atividades de conscientização ambiental', 'School Courtyard'),
('Dia do Livro', '2023-04-23', 'Celebração da leitura e dos livros', 'School Library'),
('Feira de Alimentos', '2023-09-28', 'Venda de alimentos e sobremesas', 'School Cafeteria'),
('Torneio de Basquete', '2023-07-21', 'Competição de basquete entre turmas', 'School Basketball Court'),
('Feira de Artesanato', '2023-11-02', 'Exposição e venda de artesanato', 'School Common Area');

INSERT INTO Usuarios (NomeUsuario, Senha) VALUES
('teacher1', 'teacher123'),
('teacher2', 'teacher456'),
('teacher3', 'teacher789'),
('teacher4', 'teacher101'),
('teacher5', 'teacher202'),
('student1', 'student123'),
('student2', 'student456'),
('student3', 'student789'),
('student4', 'student101'),
('student5', 'student202'),
('principal1', 'principal123'),
('principal2', 'principal456'),
('librarian1', 'librarian123'),
('librarian2', 'librarian456'),
('accountant1', 'accountant123'),
('accountant2', 'accountant456'),
('custodian1', 'custodian123'),
('custodian2', 'custodian456'),
('parent1', 'parent123'),
('parent2', 'parent456');

SELECT * FROM Alunos ORDER BY DataNascimento;

SELECT Professores.Nome AS NomeProfessorResponsavel
FROM Turmas
INNER JOIN Professores ON Turmas.ProfessorResponsavel = Professores.IDProfessor
WHERE Turmas.NomeTurma = 'Turma D';

