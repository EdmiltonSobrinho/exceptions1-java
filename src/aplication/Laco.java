package aplication;

public class Laco {

	public static void main(String[] args) {
	String[] vect = new String[] {"Maria","bob","alex"};

		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		// for each - igual ao de cima
		System.out.println("====================");
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
