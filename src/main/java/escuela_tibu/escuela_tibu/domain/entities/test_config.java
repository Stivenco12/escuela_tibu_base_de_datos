package escuela_tibu.escuela_tibu.domain.entities;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    int id;

    @Column(name = "end_data", nullable = false)
    LocalDate end_Data;
    
    @Column(name = "is_active", nullable = false)
    boolean isActive;

    @Column(name = "score", nullable = false)
    int score;

    @Column(name = "start_data", nullable = false)
    LocalDate start_Data;

    @Column(name = "description", length = 90, nullable = true)
    String description;


    @Column(name = "test_summary", columnDefinition="TEXT")
    private String testSummary;


}
