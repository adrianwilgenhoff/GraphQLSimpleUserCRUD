package com.graph.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ejemplo simple de GraphQL con una entidad usuarios persistidos en una base de
 * datos mysql. Unico endpoint para probar querys en localhost:8080/graphql.
 * Recomendacion usar Insomnia.
 * 
 * @author Adrian E. Wilgenhoff
 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
