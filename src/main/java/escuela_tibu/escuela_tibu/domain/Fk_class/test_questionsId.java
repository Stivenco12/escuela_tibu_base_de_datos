package escuela_tibu.escuela_tibu.domain.Fk_class;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable 
public class test_questionsId implements Serializable {
    @Column(name = "id_test_config")
    private int idTestConfig;

    @Column(name = "id_question")
    private int idQuestion;
}
