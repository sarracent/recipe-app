package cu.sarracent.recipe_app.repositories;

import cu.sarracent.recipe_app.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
