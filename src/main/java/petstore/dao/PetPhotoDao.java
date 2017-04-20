package petstore.dao;

import org.seasar.doma.Insert;
import petstore.entity.PetPhoto;

/**
 * @author kawasima
 */
public interface PetPhotoDao {
    @Insert
    public int insert(PetPhoto petPhoto);
}
