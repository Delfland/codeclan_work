DROP TABLE characters;
DROP TABLE lightsabers;

CREATE TABLE characters(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    darkside BOOLEAN,
    age INT
);

CREATE TABLE lightsabers(
    id SERIAL PRIMARY KEY,
    colour VARCHAR(255) NOT NULL,
    hilt_metal VARCHAR(255) NOT NULL,
    character_id INT REFERENCES characters(id)
);

INSERT INTO characters (name, darkside, age) VALUES ('Obi-Wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);
INSERT INTO characters (name, darkside) VALUES ('Yoda', false);

INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('green', 'paladium', 2);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('red', 'gold', 3);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('red', 'copper', 3);

SELECT name FROM characters;

SELECT * FROM characters WHERE darkside=false;

SELECT COUNT(*) FROM characters;

UPDATE characters SET darkside = true;

UPDATE characters SET darkside = false WHERE name = 'Anakin Skywalker';

UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name = 'Anakin Skywalker';

INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);

UPDATE characters SET age = (65) WHERE name = 'Obi-Wan Kenobi';

UPDATE characters SET darkside = false WHERE name = 'Obi-Wan Kenobi';

UPDATE characters SET darkside = false WHERE name = 'Yoda';

DELETE FROM characters WHERE name = 'Darth Maul';

INSERT INTO characters (name, darkside, age) VALUES ('stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('stormtrooper', true, 25);

UPDATE characters SET age = 29 WHERE id = 7;

SELECT * FROM characters;
SELECT * FROM lightsabers;

SELECT * FROM lightsabers WHERE character_id = 3

