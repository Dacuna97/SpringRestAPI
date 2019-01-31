package com.example.demo.conf;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/* (1) 
 * La anotación @Configuration indica a Spring que esta clase 
 * tiene métodos anotados con @Bean que puede procesar en tiempo 
 * de ejecución para producir beans que pueden ser inyectados por 
 * otros beans.
*/

@Configuration 
public class DozerMapper {
	/* (2)
	 * La anotación @Bean en un método indica que el valor que retorne
	 * el método quedará disponible como un bean en el contexto de Spring,
	 * listo para ser inyectado en otro bean.
	 */
    @Bean  
    public Mapper beanMapper() {
    	 /* (3)
    	  * Creamos una instancia de DozerBeanMapper que podremos inyectar en 
    	  * nuestro RestController u otro bean de Spring. Por defecto, el nombre 
    	  * del nuevo bean será el mismo nombre del método que lo produce. El 
    	  * nombre se puede personalizar con el parámetro name.
    	  */
        return new DozerBeanMapper(); 
    }
}
