package pt.ulht.es.cookbook.domain;

<<<<<<< HEAD
import org.joda.time.DateTime;

public class Recipe extends Recipe_Base implements Comparable<Recipe> {
    					//Metodo Criar Receita
    public Recipe(String titulo, String problema, String solucao, String autor, String etiqueta) {
    	
=======
<<<<<<< HEAD
import org.joda.time.DateTime;

public class Recipe extends Recipe_Base {
    
    public  Recipe(String titulo, String problema, String solucao, String autor) {
>>>>>>> c933cefd3a1292870bfca0aa3e6186b9c19a27c0
        setTitulo(titulo);
        setProblema(problema);
        setAutor(autor);
        setSolucao(solucao);
<<<<<<< HEAD
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
    
=======
        setCreationTimestamp(new DateTime());
        setCookbookManager(CookbookManager.getInstance());
    }

	public void delete() {
		setCookbookManager(null);
		super.deleteDomainObject();
		
	}
    
=======
public class Recipe {
	
	private String id;
	
	private String titulo;
	private String problema;
	private String solucao;
	
	
	public Recipe(String titulo, String problema, String solucao) {
		this.titulo = titulo;
		this.problema = problema;
		this.solucao = solucao;
		
	}
	
	public String getTitulo(){
		return titulo;
	}
	public String getProblema(){
		return problema;
	}
	public String getSolucao(){
		return solucao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;		
	}


>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a
>>>>>>> c933cefd3a1292870bfca0aa3e6186b9c19a27c0
}
