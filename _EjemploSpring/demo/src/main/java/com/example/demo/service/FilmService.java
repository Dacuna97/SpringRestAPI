package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.FilmRepository;
import com.example.demo.dto.Film;

/*(1)La anotación o estereotipo “@Service” indica a Spring que cree una 
 * instancia de esta clase (bean) que podremos usar en otras instancias
 */
@Service
public class FilmService {
	
	/* (2) @Autowired es equivalente a @Inject que se usa en ambientes JavaEE,
	 * incluso esta última funciona con Spring también. Se utiliza para indicar
	 * a Spring que queremos que asigne una instancia de un bean a la variable 
	 * que tiene la anotación @Autowired*/
	
    @Autowired
    FilmRepository dao;
     
    /* (3) Nuestro método de lógica de negocio. En este caso la lógica es mínima 
     * pero es en este tipo de métodos y clases en donde debemos concentrar las 
     * operaciones, condiciones, reglas y demás acciones de lógica de negocio de 
     * nuestra aplicación*/
    
    public Film save(Film contact){
        return dao.saveAndFlush(contact);
    }

	public Film findbyId(String id) {
		return dao.findOne(id);
	}
	
	public List<Film> selectAll(){
		return dao.findAll();
	}

}
