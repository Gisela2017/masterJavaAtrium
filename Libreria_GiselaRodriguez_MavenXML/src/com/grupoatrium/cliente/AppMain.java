package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grupoatrium.modelo.Autor;
import com.grupoatrium.modelo.Editorial;
import com.grupoatrium.modelo.Libro;
import com.grupoatrium.negocio.AutorService;
import com.grupoatrium.negocio.EditorialService;
import com.grupoatrium.negocio.LibroService;
import com.grupoatrium.persistencia.Connection;

public class AppMain {
	
	public static void main(String[] args) {
		
		// Levantar el contexto de Spring
		// Crear el contenedor de beans a partir del archivo applicationContext.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("");
		System.out.println("FACTORIAS DE CONEXION");
		//Connection Factory bean 
		Connection connFactoryBean = context.getBean("connection", Connection.class);
		connFactoryBean.metodoCualquiera();
				
		//Connection Factory Bean Instance
		Connection connFactoryInstance = context.getBean("connectionOther", Connection.class);
		connFactoryInstance.metodoCualquiera();
		
		System.out.println("");
		System.out.println("AUTORES");
		// Bean Autor
		Autor autor1 = context.getBean("autor1", Autor.class);
//		Autor autor2 = context.getBean("autor2", Autor.class);
//		Autor autor3 = context.getBean("autor3", Autor.class);
//		Autor autor4 = context.getBean("autor4", Autor.class);
				
		//Bussiness Bean AutorService
		AutorService autorService = context.getBean("autorService", AutorService.class);
		autorService.connectar();
		autorService.altaAutor(autor1);
		autorService.modificarAutor(autor1);
		autorService.eliminarAutor(autor1);
		autorService.obtenerAutor("");
		autorService.obtenerTodos();
		
		System.out.println("");
		System.out.println("EDITORIALES");
		// Bean Editorial
		Editorial editorial = context.getBean("editorial", Editorial.class);
		
		//Bussiness Bean EditorialService
		EditorialService editorialService = context.getBean("editorialService", EditorialService.class);
		editorialService.connectar();
		editorialService.altaEditorial(editorial);
		editorialService.modificarEditorial(editorial);
		editorialService.eliminarEditorial(editorial);
		editorialService.obtenerEditorial("");
		editorialService.obtenerTodos();
		
		System.out.println("");
		System.out.println("LIBROS");
		// Bean libro
		Libro libro1 = context.getBean("libro1", Libro.class);
//		Libro libro2 = context.getBean("libro2", Libro.class);
//		Libro libro3 = context.getBean("libro3", Libro.class);
		
		//Bussinnes Bean LibroService
		LibroService libroService = context.getBean("libroService", LibroService.class);
		libroService.connectar();
		libroService.altaLibro(libro1);
		libroService.modificarLibro(libro1);
		libroService.eliminarLibro(libro1);
		libroService.obtenerAutor("");
		libroService.obtenerTodos();
		
	}

}
