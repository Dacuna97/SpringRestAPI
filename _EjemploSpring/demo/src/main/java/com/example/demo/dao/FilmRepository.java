package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.Film;
 
/*Fíjate que esta interfaz extiende la interfaz JpaRepository. Durante la inicialización de la aplicación,
Spring Data busca estas interfaces y crea  clases que las implementan, ofreciendo automáticamente 
los métodos típicos para Crear, Actualizar o Eliminar (CRUD) una entidad. 
Los parámetros de esta interfaz son: la entidad a gestionar (Contact) y el 
tipo de dato de su clave primaria (Long).*/

public interface FilmRepository extends JpaRepository<Film, String> {
	/*@Query("SELECT uuid, film_name, id_director, trailer, film_description, genre, duration, valoration, country, release_date FROM Film WHERE uuid = :uuid")
    Film findByUUID(@Param("uuid") String uuid);*/
}