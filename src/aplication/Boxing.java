package aplication;

public class Boxing {

	public static void main(String[] args) {
		// int - tipo primitivo nao aceita nulo
		// integer - classe aceita nulo
		// double = Double / char = Char
		
		int x = 20;
		Object obj = x;  // obj = variavel qualquer
		System.out.println(obj);
		
		Object obj2 = x;  // variavel qualquer
		System.out.println(obj2);
		
// umboxing - desencaixotar
		
		int y = (int) obj;
//		int y =  obj;	// dar erri
	}

}
// int tipo primitivo não aceita nulo
// Integer tipo classe aceita nulo ou wraper classe