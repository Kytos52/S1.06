package Nivell1_Ex2;

public class UsoGenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods usoGenerico = new GenericMethods();
		
		System.out.println("Uso el método genérico f() con Strings");
		String string1 = "uno";
		String string2 = "dos";
		String string3 = "tres";
		System.out.println(usoGenerico.f(string1, string2,string3));
		
		System.out.println("Uso el método genérico f() con enteros");
		int int1 = 1;
		int int2 = 2;
		int int3 = 3;
		System.out.println(usoGenerico.f(int1, int2, int3));
	
		System.out.println("Uso el método genérico f() con objetos tipo Alumno");
		Alumno alum1 = new Alumno("Mario");
		Alumno alum2 = new Alumno("Juan");
		Alumno alum3 = new Alumno("Pedro");
		System.out.println(usoGenerico.f(alum1, alum2, alum3));
		
		System.out.println("Uso el método genérico f() con diferentes tipos");
		System.out.println(usoGenerico.f(string1, int2, alum3));
	
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



