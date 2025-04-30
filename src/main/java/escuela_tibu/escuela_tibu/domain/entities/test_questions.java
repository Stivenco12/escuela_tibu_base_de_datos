package escuela_tibu.escuela_tibu.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "test_questions")
@Entity
public class test_questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_question", nullable = false)
    @JsonBackReference
    private questions question;

    @ManyToOne
    @JoinColumn(name = "id_testconfig", nullable = false)
    @JsonBackReference
    private test_config testConfig;
}