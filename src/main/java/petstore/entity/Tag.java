package petstore.entity;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import java.io.Serializable;

/**
 * @author kawasima
 */
@Entity
@Data
public class Tag implements Serializable {
    @Id
    private Long id;
    private String name;
}
