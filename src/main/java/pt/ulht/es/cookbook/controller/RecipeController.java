package pt.ulht.es.cookbook.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pt.ist.fenixframework.pstm.AbstractDomainObject;
import pt.ulht.es.cookbook.domain.CookbookManager;
import pt.ulht.es.cookbook.domain.Recipe;

import java.util.Date;

@Controller
public class RecipeController {
	
						/**************CRIAR RECEITAS*************/
		@RequestMapping(method = RequestMethod.POST, value = "/recipes")
		public String createRecipe(@RequestParam Map<String, String> params) {	
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
										//vai buscar cada um dos parametros
			String titulo = params.get("titulo");
			String problema = params.get("problema");
			String solucao = params.get("solucao");
			String autor = params.get("autor");
			String etiqueta = params.get("etiqueta");
			
			dateFormat.format(date).split(" ");
			
			Recipe recipe = new Recipe(titulo, problema, solucao, autor, etiqueta);
			return "redirect:/recipes/" + recipe.getExternalId();
		}
						/*************EDITAR AS RECEITAS**************/
		@RequestMapping(method = RequestMethod.POST, value = "/recipes/editRecipe/{id}")
		public String editRecipe(@RequestParam Map<String, String> params, @PathVariable String id) {
		
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
										//vai buscar cada um dos parametros
			String titulo = params.get("titulo");
			String problema = params.get("problema");
			String solucao = params.get("solucao");
			String autor = params.get("autor");
			String etiqueta = params.get("etiqueta");
			
			dateFormat.format(date).split(" ");
			
			Recipe recipe = AbstractDomainObject.fromExternalId(id);
			Recipe.edit(recipe, titulo, problema, solucao, autor, etiqueta);
			
			return "redirect:/recipes/";
		}
						/*************PROCURA AS RECEITAS**************/
		@RequestMapping(method = RequestMethod.POST, value = "/recipes/procurar")
		public String searchRecipe(@RequestParam Map<String, String> params, Model model) {
			String searchParams = params.get("searchParams");
			String[] tokens = searchParams.split(",");
			List<Recipe> resultados = new ArrayList<Recipe>();
			
			for(Recipe recipe : CookbookManager.getInstance().getRecipeSet()){
				if(recipe.match(tokens)){
					resultados.add(recipe);
				}
		}
		model.addAttribute("recipes", resultados);
		return "procurarResultados";
		}
						/**************LISTA A RECEITA***************/
		@RequestMapping(method = RequestMethod.GET, value = "/recipes")
		public String listRrecipes(Model model) {
			List<Recipe> recipes = new ArrayList<Recipe> (CookbookManager.getInstance().getRecipeSet());
			Collections.sort(recipes);
			model.addAttribute("recipes", recipes);
			
			if (recipes.isEmpty()) {
				return "recipeNotFound";
			} else {
				model.addAttribute("recipes", recipes);
				return "listRecipes";
			}

		}
						/**************MOSTA O FORMULARIO DA CRIACAO DA RECEITA***************/
		@RequestMapping(method = RequestMethod.GET, value = "/recipes/create")
		public String showRecipeCreationForm() {

		return "createRecipe";
	}
						/**************MOSTA O FORMULARIO DO EDITAR RECEITA***************/
		@RequestMapping(method = RequestMethod.GET, value = "/recipes/edit/{id}")
		public String showRecipeEditForm(Model model, @PathVariable String id) {
			
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		
		model.addAttribute("recipe", recipe);
		return "editRecipe";
	}
						/**************MOSTA O FORMULARIO DE PROCURAR DA RECEITA***************/
		@RequestMapping(method = RequestMethod.GET, value = "/recipes/procurar")
		public String showRecipeSearchForm() {
		return "procurarRecipe";
	}

						/**************MOSTA A RECEITA***************/
		@RequestMapping(method = RequestMethod.GET, value = "/recipes/{id}")
		public String showRecipe(Model model, @PathVariable String id) {
			
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		
			if (recipe != null) {
				model.addAttribute("recipe", recipe);
				return "detailedRecipe";
			} 
			else
				return "recipeNotFound";
			}
	
						/*************APAGAR RECEITAS**************/
		@RequestMapping(method = RequestMethod.GET, value = "recipes/deleteRecipe/{id}")
		public String deleteRecipe(Model model, @PathVariable("id") String id) {
		
			Recipe recipe = AbstractDomainObject.fromExternalId(id);
			
		recipe.delete();
		
		//redirecionar para a lista de receitas depois de apagar
		return "redirect:/recipes";
	}							
}