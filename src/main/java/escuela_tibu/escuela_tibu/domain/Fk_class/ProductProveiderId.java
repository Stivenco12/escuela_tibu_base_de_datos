package escuela_tibu.escuela_tibu.domain.Fk_class;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable 
public class ProductProveiderId implements Serializable {
    @Column(name = "product_id")
    private long productid;
    @Column(name = "provider_id")
    private String providerid;
}
