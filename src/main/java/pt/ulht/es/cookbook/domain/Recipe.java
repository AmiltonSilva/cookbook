package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;

public class Recipe extends Recipe_Base {
    
    public  Recipe(String titulo, String problema, String solucao, String autor) {
        setTitulo(titulo);
        setProblema(problema);
        setAutor(autor);
        setSolucao(solucao);
        setCreationTimestamp(new DateTime());
        setCookbookManager(CookbookManager.getInstance());
    }

	public void delete() {
		setCookbookManager(null);
		super.deleteDomainObject();
		
	}
    
}
