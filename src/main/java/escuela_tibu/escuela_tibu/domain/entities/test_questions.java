package escuela_tibu.escuela_tibu.domain.entities;

import escuela_tibu.escuela_tibu.domain.Fk_class.test_questionsId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "test_questions")
@Entity
public class test_questions {
    @EmbeddedId
    private test_questionsId id;

    @ManyToOne
    @JoinColumn(name = "id_test_config", insertable = false, updatable = false)
    private test_config testConfig;

    @ManyToOne
    @JoinColumn(name = "id_question", insertable = false, updatable = false)
    private questions question;
}
