package Nivell1_Ex3;

public class GenericMethods {
	
	public GenericMethods() {
		
	}

	public <T> String f(T elemento1, T elemento2, String elemento3) {
		return (elemento1.toString() +" "+elemento2.toString()+ " "+elemento3.toString());
	}

}
