package petstore.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import petstore.DomaConfig;
import petstore.entity.Tag;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface TagDao {
    @Insert
    public int insert(Tag tag);

    @Update
    public int update(Tag tag);

    @Delete
    public int delete(Tag tag);
}
