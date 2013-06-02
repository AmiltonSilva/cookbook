package pt.ulht.es.cookbook.controller;

import java.util.Collection;
import java.util.Map;
<<<<<<< HEAD
import java.util.Set;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
=======
>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
import pt.ist.fenixframework.pstm.AbstractDomainObject;
import pt.ulht.es.cookbook.domain.CookbookManager;
import pt.ulht.es.cookbook.domain.Recipe;

import java.util.Date;

@Controller
public class RecipeController {
		
		@RequestMapping(method = RequestMethod.GET, value = "/recipes")
		public String listRrecipes(Model model) {
			Collection<Recipe> recipes = CookbookManager.getInstance().getRecipeSet();
			if (recipes.isEmpty()) {
				return "recipeNotFound";
			} else {
				model.addAttribute("recipes", recipes);
				return "listRecipes";
			}

		}

		


	@RequestMapping(method = RequestMethod.GET, value = "/recipes/create")
	public String showRecipeCreationForm() {

		return "createRecipe";
	}
	

	@RequestMapping(method = RequestMethod.POST, value = "/recipes")
	public String createRecipe(@RequestParam Map<String, String> params) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		String titulo = params.get("titulo");
		String problema = params.get("problema");
		String solucao = params.get("solucao");
		String autor = params.get("autor");

		String[] dataHora = dateFormat.format(date).split(" ");
		String hora = dataHora[0];
		String data = dataHora[1];

		Recipe recipe = new Recipe(titulo, problema, solucao, autor);
		
		return "redirect:/recipes/" + recipe.getExternalId();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/{id}")
	public String showRecipe(Model model, @PathVariable String id) {

		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		if (recipe != null) {
			model.addAttribute("recipe", recipe);
			return "detailedRecipe";
		} else
			return "recipeNotFound";

	}

	
	// Recebe a receita e altera na posicao da lista
	@RequestMapping(method = RequestMethod.GET, value = "/recipes/edit/{id}")
	public String showRecipeEditForm(Model model, @PathVariable String id) {

		Recipe recipe = AbstractDomainObject.fromExternalId(id);

		model.addAttribute("recipe", recipe);

		return "editRecipe";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/recipes/edit/editRecipe")
	public String editRecipe(@RequestParam Map<String, String> params) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		String titulo = params.get("titulo");
		String problema = params.get("problema");
		String solucao = params.get("solucao");
		String autor = params.get("autor");

		String[] dataHora = dateFormat.format(date).split(" ");
		String hora = dataHora[0];
		String data = dataHora[1];

		Recipe recipe = new Recipe(titulo, problema, solucao, autor);
		//CookbookManager.editRecipe(recipe);
		return "redirect:/recipes/";
	}

	@RequestMapping(method = RequestMethod.GET, value = "recipes/deleteRecipe/{id}")
	public String deleteRecipe(Model model, @PathVariable("id") String id) {

		Recipe recipe = AbstractDomainObject.fromExternalId(id);

		recipe.delete();
		//CookbookManager.getInstance().removeRecipe(recipe);

		return "redirect:/recipes";
	}
	

=======
import pt.ulht.es.cookbook.domain.CookbookManager;
import pt.ulht.es.cookbook.domain.Recipe;

@Controller
public class RecipeController {
  
    @RequestMapping(method=RequestMethod.GET, value="/recipes")
    public String listRecipes(Model model) {
    	Collection<Recipe> recipes = CookbookManager.getRecipes();
    	model.addAttribute("recipes", recipes);
    	return "listRecipes";
    }
    
    @RequestMapping(method=RequestMethod.GET, value="recipes/create")
    public String showRecepieCreationForm(){
    	return "createRecipe";
    }
    
    
    @RequestMapping(method=RequestMethod.POST, value="recipes")
    public String createRecipe(@RequestParam Map<String, String> params){
    	String titulo = params.get("titulo");
    	String problema = params.get("problema");
    	String solucao = params.get("solucao");
    	
    	Recipe recipe = new Recipe(titulo, problema, solucao);
    	CookbookManager.saveRecipe(recipe);
    	
    	return "redirect:/recipes/"+recipe.getId();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/recipes/{id}")
    public String showRecipe(Model model, @PathVariable String id) {
    	Recipe recipe = CookbookManager.getRecipe(id);
    	if(recipe != null){
    		model.addAttribute("recipe", recipe);
    	return "detailedRecipe";
    }
    	else{
    		return "recipeNotFound";
    		
    	}
    	
    }       
    
    
>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a
}