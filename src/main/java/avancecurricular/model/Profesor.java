package avancecurricular.model;

/*
 *Clase Profesor, cuenta con los atributos nombre y rut.  
 **/

public class Profesor {
	private String nombre; 
	private String rut; 


public Profesor (String nombre, String rut) {
	this.nombre = nombre;
	this.rut = rut;
}

/*
 * Getters y Setters de la clase Profesor
 * **/


//NOMBRE
public String getNombre () {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre; 
}

//RUT
public String getRut () {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut; 
}

}

