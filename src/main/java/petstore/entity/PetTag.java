package petstore.entity;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

/**
 * @author kawasima
 */
@Entity
@Data
public class PetTag {
    public PetTag() {}
    public PetTag(Long petId, Long tagId) {
        this.petId = petId;
        this.tagId = tagId;
    }

    @Id
    private Long petId;
    @Id
    private Long tagId;
}
