package petstore.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import petstore.DomaConfig;
import petstore.entity.Pet;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface PetDao {
    @Insert
    int insert(Pet pet);

    @Update
    int update(Pet pet);

    @Delete
    int delete(Pet pet);
}
