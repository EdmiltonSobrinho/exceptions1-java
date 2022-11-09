package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	List x = new List();  da erro
		
		List<String> list = new ArrayList();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2,"Marco"); // add na posicao 2 movendo o resto para baixo
		System.out.println("Tamanho da lista "+list.size());
		
//		list.remove("anna");      // nao achou
		list.remove("Anna");     // achou
		list.remove(1);          // remove da posicao

		// remove por predicado ou função lambida
		list.removeIf(x -> x.charAt(0) == 'M');

		for(String x : list) {  // for each
			System.out.println(x);
		}
		
		// localiza e mostra a posição na lista
		System.out.println("Index of bob : " + list.indexOf("Bob"));
	
		// nao localizou e retorna -1
		System.out.println("Marcos not found : " + list.indexOf("Marco"));
		
		// filtrar na lista - somente começados com B
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		for(String x : result) {  // for each
			System.out.println(x);
		}
		
		// achar o primeiro elemento - letra B
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
		
		// achar o primeiro elemento - letra Y nao achou retorna null
		String name2 = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
		System.out.println(name2);
	}

}
