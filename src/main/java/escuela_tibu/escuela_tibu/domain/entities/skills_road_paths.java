package escuela_tibu.escuela_tibu.domain.entities;

import java.time.LocalDateTime;

import escuela_tibu.escuela_tibu.domain.Fk_class.skills_road_pathsId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "skills_road_paths")
@Entity
public class skills_road_paths {
    @EmbeddedId
    private skills_road_pathsId id;

    @ManyToOne
    @JoinColumn(name = "id_skills", referencedColumnName = "id", insertable = false, updatable = false)
    private skills skills;

    @ManyToOne
    @JoinColumn(name = "id_road_paths", referencedColumnName = "id", insertable = false, updatable = false)
    private road_paths roadPaths;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
