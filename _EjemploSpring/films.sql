CREATE TABLE Director (
    id char(36) NOT NULL,
    director_name varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE Film (
    id char(36) NOT NULL,
    film_name varchar(255),
    id_director char(36),
    trailer varchar(255),
    film_description varchar(255),
    genre varchar(255),
    duration int,
    valoration int,
    country varchar(255),
    release_date DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (id_director) REFERENCES Director(id)
);

INSERT INTO Director(id, director_name) VALUES ("e72296b8c7d845c69be9c63bd6a57018", "Chris Buck" );
INSERT INTO Film (id, film_name, id_director, trailer, film_description, genre, valoration, country, release_date)
VALUES ("e72296b8c7d845c69be9c63bd6a57019", "Frozen: El reino del hielo", "e72296b8c7d845c69be9c63bd6a57018", "https://www.youtube.com/watch?v=QTvcYow0Z5U", "película animada sobre una princesa y hielo",
"animation", "7.5", "USA", '2013-11-29'); 
