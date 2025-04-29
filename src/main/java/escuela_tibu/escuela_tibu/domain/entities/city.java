package escuela_tibu.escuela_tibu.domain.entities;

import java.time.LocalDateTime;

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
@Table(name = "CITIES")
@Entity
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @Column(name = "state_id", nullable = true)
    int stateId;

    @ManyToOne
    @JoinColumn(name = "id_state")
    @JsonBackReference
    states idState;

    @Column(name = "state_abbreviation", length = 50, nullable = true)
    String stateAbbreviation;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Column(name = "name_city", length = 50, nullable = true, unique = true)
    String nameCity;
}
