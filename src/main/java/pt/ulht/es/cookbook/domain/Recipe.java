package pt.ulht.es.cookbook.domain;

<<<<<<< HEAD
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
}
