package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	
	private Agenda cut;

	@BeforeEach
	public void setUp() throws Exception {
		cut = new Agenda();
	}

	@Test
	public void testCrearAlumno() {		
			
		cut.anadirAlumno("Francisco", "Gomez", "44889912K");
		
		Alumno alumno = cut.buscarAlumno("44889912K");
		
		assertEquals("Francisco", alumno.getNombre());
		assertEquals("Gomez", alumno.getApellido());
		assertEquals("44889912K", alumno.getDni());
		
	}
	
	@Test
	public void testBorrarAlumno() {
		
		cut.anadirAlumno("Lucas", "Pérez", "65533322K");
		cut.anadirAlumno("Marina", "Sanchez", "87745423J");
		cut.anadirAlumno("Vanesa", "López", "22889912K");
		
		cut.buscarAlumno("65533322K");		
		cut.borrarAlumno("87745423J");
		
		Alumno alumno = cut.buscarAlumno("87745423J");
		
		assertNull(alumno);		
		
		
	}
	
	@Test
	public void testModificarNombre() {
		
		cut.anadirAlumno("Lucas", "Pérez", "65533322K");
		cut.anadirAlumno("Marina", "Sanchez", "87745423J");
		cut.anadirAlumno("Vanesa", "López", "22889912K");
	
		cut.modificarNombreAlumno("65533322K", "Jose");
		cut.modificarNombreAlumno("22889912K", "Pepe");
		
		Alumno alumno = cut.buscarAlumno("65533322K");
		Alumno alumno3 = cut.buscarAlumno("22889912K");
		
		assertEquals("Jose", alumno.getNombre());
		assertEquals("Pepe", alumno3.getNombre());	
		
	}
	
	@Test
	public void testModificarApellido() {
		
		cut.anadirAlumno("Lucas", "Pérez", "65533322K");
		cut.anadirAlumno("Marina", "Sanchez", "87745423J");
		cut.anadirAlumno("Vanesa", "López", "22889912K");
		
		cut.modificarApellidoAlumno("65533322K", "Garcia");
		cut.modificarApellidoAlumno("87745423J", "Rodriguez");
		
		Alumno alumno = cut.buscarAlumno("65533322K");
		Alumno alumno2= cut.buscarAlumno("87745423J");
		
		assertEquals("Garcia", alumno.getApellido());
		assertEquals("Rodriguez", alumno2.getApellido());
		
	}
	
	@Test
	public void testModificarDni() {
		
		cut.anadirAlumno("Lucas", "Pérez", "65533322K");
		cut.anadirAlumno("Marina", "Sanchez", "87745423J");
		cut.anadirAlumno("Vanesa", "López", "22889912K");
		
		cut.modificarDniAlumno("65533322K", "11111111K");
		cut.modificarDniAlumno("22889912K", "22222222J");
		
		Alumno alumno = cut.buscarAlumno("11111111K");
		Alumno alumno3 = cut.buscarAlumno("22222222J");
		
		assertEquals("Lucas", alumno.getNombre());
		assertEquals("López", alumno3.getApellido());
		
	}


}
