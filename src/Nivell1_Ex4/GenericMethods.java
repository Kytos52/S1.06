package Nivell1_Ex4;

public class GenericMethods {
	
	public GenericMethods() {
		
	}

	public <T> String f(T[] elementos) {
		return (elementos[0].toString() +" "+elementos[1].toString()+ " "+elementos[2].toString());
	}

}
