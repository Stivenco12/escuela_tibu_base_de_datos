package escuela_tibu.escuela_tibu.domain.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "test_config")
@Entity
public class test_config {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    private int id;

    @Column(name = "end_data", nullable = false)
    private LocalDate endData;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "score", nullable = false)
    private int score;

    @Column(name = "start_data", nullable = false)
    private LocalDate startData;

    @Column(name = "description", length = 90, nullable = true)
    private String description;

    @Column(name = "test_summary", columnDefinition = "TEXT")
    private String testSummary;

    @OneToMany(mappedBy = "testConfig")
    private Set<test_questions> testQuestions = new HashSet<>();
}