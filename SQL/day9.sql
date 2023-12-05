CREATE TABLE Pets(
    id INTEGER PRIMARY KEY,
    name TEXT(30) NOT NULL,
    type TEXT(20)
);

INSERT INTO Pets(id, name, type)
VALUES(1, 'Muris', 'Kaķis');

INSERT INTO Pets(id, name, type)
VALUES(2, 'Rada', 'Suns');

INSERT INTO Pets(id, name, type)
VALUES(3, 'Poga', 'Suns'),
      (4, 'Miks', 'Kaķis');
      
SELECT * FROM Pets;

SELECT name, type FROM Pets;