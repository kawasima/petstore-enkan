package petstore.dao;

import org.seasar.doma.*;
import petstore.DomaConfig;
import petstore.entity.Category;

import java.util.List;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface CategoryDao {
    @Select
    public List<Category> findAll();

    @Insert
    public int insert(Category category);

    @Update
    public int update(Category category);

    @Delete
    public int delete(Category category);
}
