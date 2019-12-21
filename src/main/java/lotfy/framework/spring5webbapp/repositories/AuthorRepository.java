package lotfy.framework.spring5webbapp.repositories;

import lotfy.framework.spring5webbapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
