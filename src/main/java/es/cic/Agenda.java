package es.cic;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();

	public void anadirAlumno(String nombre, String apellido, String dni) {
		Alumno alumno = new Alumno(nombre, apellido, dni);
		listaDeAlumnos.add(alumno);
	}

	public Alumno buscarAlumno(String dni) {

		Alumno alumno = null;

		for (int i = 0; i < listaDeAlumnos.size(); i++) {
			Alumno alumnoLista = listaDeAlumnos.get(i);
			if (alumnoLista.getDni().equals(dni)) {
				alumno = alumnoLista;
			}
		}
		
		return alumno;
	}
	
	public void borrarAlumno(String dni) {
		
		for (int i = 0; i < listaDeAlumnos.size(); i++) {
			Alumno alumnoLista = listaDeAlumnos.get(i);
			 if (alumnoLista.getDni().equals(dni)) { 
				 listaDeAlumnos.remove(alumnoLista);
				 }
			 
		}
		
	}
	
	public void modificarNombreAlumno(String dni, String nuevoNombre) {
		
		Alumno alumnoEncontrado = buscarAlumno(dni);		
		
		if(alumnoEncontrado != null) {
			alumnoEncontrado.setNombre(nuevoNombre);	
		}
		
	}
	
	public void modificarApellidoAlumno(String dni, String nuevoApellido) {
		
		Alumno alumnoEncontrado = buscarAlumno(dni);		
		
		if(alumnoEncontrado != null) {
			alumnoEncontrado.setApellido(nuevoApellido);	
		} else {
			throw new RuntimeException("El alumno no existe");
		}
		
	}
	
	public void modificarDniAlumno(String dni, String nuevoDni) {
		
		Alumno alumnoEncontrado = buscarAlumno(dni);		
		
		if(alumnoEncontrado != null) {
			alumnoEncontrado.setDni(nuevoDni);
		}
		
	}

}
