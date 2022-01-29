package Nivell1_Ex1;

/*
 * No genericsMethods almacena tres objetos de tipo Alumno
 */


public class NoGenericMethods {
	
	private Alumno alumno1;
	private Alumno alumno2;
	private Alumno alumno3;
	
	public NoGenericMethods(Alumno a1, Alumno a2, Alumno a3) {
		this.alumno1 = a1;
		this.alumno2 = a2;
		this.alumno3 = a3;
		
	}
	public void setAlumno1(Alumno nuevoAlumno) {
		this.alumno1 = nuevoAlumno;
	}
	
	public Alumno getAlumno1() {
		return alumno1;
	}
	public void setAlumno2(Alumno nuevoAlumno) {
		this.alumno2 = nuevoAlumno;
	}
	
	public Alumno getAlumno2() {
		return alumno2;
	}
	public void setAlumno3(Alumno nuevoAlumno) {
		this.alumno3 = nuevoAlumno;
	}
	
	public Alumno getAlumno3() {
		return alumno3;
	}
	@Override
	public String toString() {
		return "NoGenericMethods [alumno1=" + alumno1 + ", alumno2=" + alumno2 + ", alumno3=" + alumno3 + "]";
	}
	
	

	
	

}
