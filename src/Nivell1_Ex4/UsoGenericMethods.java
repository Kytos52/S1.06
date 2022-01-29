package Nivell1_Ex4;


public class UsoGenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GenericMethods usoGenerico = new GenericMethods();
		
		System.out.println("Uso el método genérico f() con una lista que contiene Strings");
		String listaString[] = {"uno","dos","tres"};
				
		System.out.println(usoGenerico.f(listaString));
		
		System.out.println("Uso el método genérico f() con una lsita de enteros");
		Integer listaInt[] = { 1,2,3};
		
		System.out.println(usoGenerico.f(listaInt));
	
		System.out.println("Uso el método genérico f() con una lista de objetos tipo Alumno");
		Alumno alum1 = new Alumno("Mario");
		Alumno alum2 = new Alumno("Juan");
		Alumno alum3 = new Alumno("Pedro");
		Alumno alumnos[] = {alum1, alum2,alum3};
		System.out.println(usoGenerico.f(alumnos));
		
		
	
	}
			
	

}
class Alumno{
	private String nombre;
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}



}