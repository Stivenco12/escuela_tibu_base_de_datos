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
@Table(name = "schools")
@Entity
public class schools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @Column (name = "City_id", nullable = false)
    int cityId;

    @ManyToOne
    @JoinColumn(name = "id_city")
    @JsonBackReference
    city idCity;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "descrition_school", length = 50, nullable = true)
    String descritionSchool;

    @Column(name = "headmaster_school", length = 50, nullable = true)
    String headmasterSchool;

    @Column(name = "cellphone_school", length = 80, nullable = true)
    String cellphoneSchool;

    @Column(name = "email_school", length = 80, nullable = true, unique = true)
    String emailSchool;
}
