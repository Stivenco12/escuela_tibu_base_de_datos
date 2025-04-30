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
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "subchapters")
@Entity
public class subchapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @ManyToOne
    @JoinColumn(name = "chapter_id", nullable = false)
    @JsonBackReference
    private chapters chapters;

    @Column(name = "description", length = 80, nullable = true)
    String description;

    @Column(name = "summary", columnDefinition = "TEXT", nullable = true)
    String summary;
}
