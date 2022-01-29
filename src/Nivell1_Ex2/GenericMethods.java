package Nivell1_Ex2;

public class GenericMethods {

	public GenericMethods() {
		
	}

	public <T> String f(T elemento1, T elemento2, T elemento3) {
		return (elemento1.toString() +" "+elemento2.toString()+ " "+elemento3.toString());
	}
	
}
