package Nivell1_Ex1;



public class UsoNoGenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno("Pepe");
		Alumno a2 = new Alumno("Jose");
		Alumno a3 = new Alumno("Pedro");

		// Pongo los argumentos en difernete posicion en el constructor
		NoGenericMethods noGenericos = new NoGenericMethods (a1,a2,a3);
		System.out.println(noGenericos.toString());
		
		NoGenericMethods noGenericos1 = new NoGenericMethods (a3,a2,a1);
		System.out.println(noGenericos1.toString());
		
		
	}

}


class Alumno{
	private String nombre;
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return  nombre;
	}


}
