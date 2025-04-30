package escuela_tibu.escuela_tibu.domain.entities;

import java.time.LocalDateTime;

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
@Table(name = "road_paths")
@Entity
public class road_paths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "imagen_path", length = 80, nullable = true)
    String imagenPath;

    @Column(name = "name_path", length = 80, nullable = true)
    String namePath;

    @Column(name = "description", columnDefinition = "TEXT", nullable = true)
    String description;

}
