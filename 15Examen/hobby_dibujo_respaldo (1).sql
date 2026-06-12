CREATE DATABASE IF NOT EXISTS hobby_dibujo;
USE hobby_dibujo;

CREATE TABLE tecnicas(
    id_tecnica INT AUTO_INCREMENT PRIMARY KEY,
    nombre_tecnica VARCHAR(50) NOT NULL,
    medio VARCHAR(30)
);

CREATE TABLE materiales(
    id_material INT AUTO_INCREMENT PRIMARY KEY,
    nombre_material VARCHAR(50) NOT NULL,
    marca VARCHAR(40),
    precio DECIMAL(6, 2),
    id_tecnica INT,
    FOREIGN KEY (id_tecnica) REFERENCES tecnicas(id_tecnica) ON DELETE CASCADE
);

CREATE TABLE estilos (
    id_estilo INT AUTO_INCREMENT PRIMARY KEY,
    nombre_estilo VARCHAR(50) NOT NULL,
    complejidad VARCHAR(20),
    id_tecnica INT,
    FOREIGN KEY (id_tecnica) REFERENCES tecnicas(id_tecnica) ON DELETE CASCADE
);

INSERT INTO materiales (nombre_material, marca, precio, id_tecnica) VALUES
('Lapices graduados', 'Prisma', 149.90),
('Estilografo', 'Sakuara', '380.00'),
('Acuarelas', 'Newton', 400.50),
('Tableta grafica', 'XP pen', 890.50),
('Oleo', 'Castel', 550.00);

INSERT INTO tecnicas (nombre_tecnica, medio) VALUES
('Grafito', 'Tradicional'),
('Tinta China', 'Tradicional'),
('Pintura acuarela', 'Tradicional'),
('Dibujo digital', 'Digital'),
('Pintura al oleo', 'Tradicional');

INSERT INTO estilos (nombre_estilo, complejidad) VALUES
('Realismo', 'Alta'),
('Manga', 'Media'),
('Cartoon', 'Baja'),
('Arte conceptual', 'Alta');