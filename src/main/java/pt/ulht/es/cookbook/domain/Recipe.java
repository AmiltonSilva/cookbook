package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;

public class Recipe extends Recipe_Base implements Comparable<Recipe> {
    					//Metodo Criar Receita
    public Recipe(String titulo, String problema, String solucao, String autor, String etiqueta) {
    	
        setTitulo(titulo);
        setProblema(problema);
        setAutor(autor);
        setSolucao(solucao);
        setEtiqueta(etiqueta);
        setCreationTimestamp(new DateTime());
        setCookbookManager(CookbookManager.getInstance());
    }
    					
    					//Metodo apagar as receitas
	public void delete() {
		removeCookbookManager(); //setCookbookManager(null); mesma coisa
		deleteDomainObject();	//super.deleteDomainObject();
		
	}	
	
					//Metodo Edita
	public static void edit(Recipe recipe, String titulo, String problema,
			String solucao, String autor, String etiqueta) {
		
			recipe.setTitulo(titulo);
	        recipe.setProblema(problema);
	        recipe.setAutor(autor);
	        recipe.setSolucao(solucao);
	        recipe.setEtiqueta(etiqueta);
	        
	        recipe.setCreationTimestamp(new DateTime());
	}
					//recebemos a receita e comparamos td para minuscula
	public int compareTo(Recipe o) {		
		return getTitulo().toLowerCase().compareTo(o.getTitulo().toLowerCase());
	}
				//corre todos os tokens i para cada uma comparamos com o T,P,S,E, atravez do metodo .contains para ver se fazem MATCH e adciona a lista
	public boolean match(String[] tokens) {
		for(String token : tokens){
			if(getTitulo().toLowerCase().contains(token.toLowerCase())
					|| getProblema().toLowerCase().contains(token.toLowerCase()) 
					|| getSolucao().toLowerCase().contains(token.toLowerCase()) 
					|| getEtiqueta().toLowerCase().contains(token.toLowerCase())){
				return true;
			}
		}
		return false;
	}
    
}
