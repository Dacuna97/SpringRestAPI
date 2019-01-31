package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// (2)
@Entity
public class Film implements Serializable {
 
    // (3) 
    private static final long serialVersionUID = 4894729030347835498L;
 
    // (4)
    @Id
    private String id;
    private String film_name;
    private String id_director;
    private String trailer;
    private String film_description;
    private String genre;
    private Long duration;
    private Long valoration;
    private String country;
    
	
	public Film() {}
	
	
	public Film(String id, String film_name, String id_director, String trailer, String film_description, String genre, Long duration, Long valoration, String country) {
		this.id = id;
		this.film_name = film_name;
		this.id_director = id_director;
		this.trailer = trailer;
		this.film_description = film_description;
		this.genre = genre;
		this.duration = duration;
		this.valoration = valoration;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Film [id=" + this.id + ", film_name=" + film_name + ", idDirector=" + this.id_director + ", trailer="
				+ this.trailer + ",film description=" + this.film_description + ",genre=" + this.genre +  ",duration=" + this.duration + ",valoration=" + this.valoration + ",country=" + this.country + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getFilm_name() {
		return film_name;
	}

	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}

	public String getIdDirector() {
		return id_director;
	}

	public void setIdDirector(String idDirector) {
		this.id_director = idDirector;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getFilm_description() {
		return film_description;
	}

	public void setFilm_description(String film_description) {
		this.film_description = film_description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getValoration() {
		return valoration;
	}

	public void setValoration(Long valoration) {
		this.valoration = valoration;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
