/**
 * 
 */
package Lista;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */
public abstract class Lista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nomes = new ArrayList();
		
		nomes.add("Odair");
		nomes.add("Tatisa");
		nomes.add("Liam");
		nomes.add("Johann");
		
		for(String nome : nomes) {
		
		System.out.println(nome);
			
		}
		//adicionando um iten no inicio da linha 
		
		nomes.add(0, "Dominique");
				
		for(String nome : nomes)
		{
				System.out.println(nome);
		}
		//Verificando a quantidade de itens na lista 
				
		System.out.println(nomes.size() - 1);
		
		//pegando um iten na lista -1 
		//nomes.get(4);
		
		//Removendo iten da lista 
		
		nomes.remove(4);
		
		
		System.out.println("---MOsta a lista sem o primeiro elemento ----");
		for(String nome : nomes)
		{
			    
				System.out.println(nome);
		}
	   
		//Verificando itens Odair
		boolean existe = nomes.contains("Odair");
		System.out.println("Checando nomes na lista");
		System.out.println(existe);
		
		//ordenação
		
		Collections.sort(nomes);
		
		for(String nome : nomes)
		{
			    
				System.out.println(nome);
		}
	   
		

	}

}
