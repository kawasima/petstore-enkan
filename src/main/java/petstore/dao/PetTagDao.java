package petstore.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import petstore.DomaConfig;
import petstore.entity.PetTag;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface PetTagDao {
    @Insert
    public int insert(PetTag petTag);
}
