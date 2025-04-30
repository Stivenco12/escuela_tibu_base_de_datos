package escuela_tibu.escuela_tibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "questions")
@Entity
public class questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @Column(name = "score", nullable = false)
    int score;

    @Column(name = "typeoption_id",  nullable = true)
    int typeOptionId;

    @ManyToOne
    @JoinColumn(name = "id_typeoption")
    @JsonBackReference
    type_options idTypeOption;

    @Column(name = "description", length = 80, nullable = true)
    String description;

    @OneToMany(mappedBy = "question")
    private Set<test_questions> testQuestions = new HashSet<>();
}
