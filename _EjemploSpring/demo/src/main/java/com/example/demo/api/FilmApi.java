package com.example.demo.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Film;
import com.example.demo.service.FilmService;



@RestController
public class FilmApi {
	
	/*(1)
	 * Indicamos a Spring que debe inyectar una instancia de nuestra clase de lógica de negocio
	 */
	@Autowired
	FilmService filmService;
	
	
	/*@Autowired
	private JdbcTemplate jdbcTemplate;*/
	
	/*@RequestMapping(value="/film/{id}", method=RequestMethod.GET)
	public Film getById(@PathVariable("id") long id){
		/*String sql = "select * from Contact where id = " + id;
		return this.jdbcTemplate.query(sql, new RowMapper<Contact>() {
	        @Override
	        public Contact mapRow(ResultSet rs, int i) throws SQLException {
	            Contact c = new Contact();
	            c.setId((long) rs.getInt("id"));
	            c.setFirstName(rs.getString("firstname"));
	            c.setLastName(rs.getString("lastname"));
	            c.setEmail(rs.getString("email"));
	            return c;
	        }
	    });
		return filmService.findbyId(id);
    }*/
	
	/* (2)
	 * Creamos un método REST que mediante una petición HTTP POST en la url http://localhost:8080/film.
	 * Fíjate en la anotación @RequestBody antes de la variable “contact”. Esta anotación indica que la 
	 * variable debe ser creada con los valores que lleguen en el cuerpo de la petición HTTP, 
	 * para lo cual usaremos una estructura JSON
	 */
	@RequestMapping(value="/film", method=RequestMethod.POST)
	public Film updateOrSave(@RequestBody Film film) {
		System.out.print(film.toString());
	    return filmService.findbyId(film.getId());
	}
	
	@RequestMapping(value="/film", method=RequestMethod.GET)
	public List<Film> selectAll() {
	    return filmService.selectAll();
	}
}

