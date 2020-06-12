package cu.sarracent.recipe_app.repositories;

import cu.sarracent.recipe_app.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
