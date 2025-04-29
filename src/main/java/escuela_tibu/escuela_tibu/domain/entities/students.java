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
@Table(name = "students")
@Entity
public class students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @Column(name = "age", length = 50, nullable = false)
    int age;

    @Column(name = "city_id", nullable = false)
    int cityId;

    @ManyToOne
    @JoinColumn(name = "id_city")
    @JsonBackReference
    city idCity;

    @Column(name = "school_id", nullable = false)
    int schoolId;

    @ManyToOne
    @JoinColumn(name = "id_school")
    @JsonBackReference
    schools idSchool;

    @Column(name = "celphone", length = 80, nullable = true, unique = true)
    String celphone;

    @Column(name = "email", length = 80, nullable = true, unique = true)
    String email;

    @Column(name = "first_name", length = 50, nullable = true)
    String firstName;

    @Column(name = "last_name", length = 50, nullable = true)
    String lastName;
}
