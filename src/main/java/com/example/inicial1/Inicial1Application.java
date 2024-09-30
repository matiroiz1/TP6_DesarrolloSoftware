package com.example.inicial1;

import com.example.inicial1.entities.*;
import com.example.inicial1.repositories.AutorRepository;
import com.example.inicial1.repositories.LocalidadRepository;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}

	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository, LocalidadRepository localidadRepository, AutorRepository autorRepository) {
		return args -> {
			// Creo un objeto persona
			Persona per1 = Persona.builder().
					nombre("Matías").apellido("Roiz").dni(44248428).
					build();
			Persona per2 = Persona.builder().
					nombre("Franco").apellido("Aguirre").dni(44248428).
					build();
			personaRepository.save(per2);
			Domicilio dom1 = Domicilio.builder().
					calle("Ruta Provincial 60").
					numero(5923).build();

			per1.setDomicilio(dom1);

			// Creo las localidades
			Localidad loc1 = Localidad.builder().denominacion("Maipú").build();
			Localidad loc2 = Localidad.builder().denominacion("Godoy Cruz").build();
			Localidad loc3 = Localidad.builder().denominacion("Lujan").build();

			// Guarda las localidades primero
			loc1 = localidadRepository.save(loc1);
			loc2 = localidadRepository.save(loc2);
			loc3 = localidadRepository.save(loc3);

			// Asigna la localidad guardada al domicilio
			dom1.setLocalidad(loc1);

			// Creo los autores
			Autor aut1 = Autor.builder()
					.nombre("Gabriel")
					.apellido("García Márquez")
					.biografia("Gabriel García Márquez fue un escritor, periodista y premio Nobel de " +
							"Literatura colombiano")
					.build();
			Autor aut2 = Autor.builder()
					.nombre("Miguel")
					.apellido("de Cervantes")
					.biografia("Miguel de Cervantes Saavedra (1547-1616) fue un novelista, dramaturgo y " +
							"poeta español ")
					.build();
			Autor aut3 = Autor.builder()
					.nombre("George")
					.apellido("Orwell")
					.biografia("George Orwell, cuyo nombre real era Eric Arthur Blair, nació el 25 de junio de 1903" +
							" en Motihari, India, y falleció el 21 de enero de 1950 en Londres.'")
					.build();

			// Guarda los autores primero
			aut1 = autorRepository.save(aut1);
			aut2 = autorRepository.save(aut2);
			aut3 = autorRepository.save(aut3);

			// Creo los libros
			Libro lib1 = Libro.builder()
					.titulo("Cien años de soledad")
					.fecha(1967)
					.genero("Realismo mágico")
					.paginas(471)
					.build();
			Libro lib2 = Libro.builder()
					.titulo("Don Quijote de la Mancha")
					.fecha(1605)
					.genero("Novela")
					.paginas(863)
					.build();
			Libro lib3 = Libro.builder()
					.titulo("1984")
					.fecha(1949)
					.genero("Distopía")
					.paginas(328)
					.build();

			// Asigna los autores guardados a los libros
			lib1.getAutores().add(aut1);
			lib1.getAutores().add(aut2);
			lib1.getAutores().add(aut3);

			// Asigna los libros a la persona
			per1.getLibros().add(lib1);
			per1.getLibros().add(lib2);
			per1.getLibros().add(lib3);

			// Guarda la persona
			personaRepository.save(per1);
		};
	}

}