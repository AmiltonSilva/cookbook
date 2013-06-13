package pt.ulht.es.cookbook.domain;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c933cefd3a1292870bfca0aa3e6186b9c19a27c0
import pt.ist.fenixframework.FenixFramework;

public class CookbookManager extends CookbookManager_Base {
    
    public static CookbookManager getInstance() {
        return FenixFramework.getRoot();
    }
    
<<<<<<< HEAD
=======
=======
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CookbookManager {
	
	private static int nextRecipeId=1;
	private static Map<String,Recipe> RECIPE_MAP = new HashMap<String,Recipe>();

	public static void saveRecipe(Recipe recipe) {
		String id = nextRecipeId+"";
		RECIPE_MAP.put(id, recipe);
		recipe.setId(id);
		nextRecipeId++;	
		
	}

	public static Recipe getRecipe(String id) {
		return RECIPE_MAP.get(id);
	}
	public static Collection<Recipe> getRecipes(){
		return RECIPE_MAP.values();
	}

>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a
>>>>>>> c933cefd3a1292870bfca0aa3e6186b9c19a27c0
}
