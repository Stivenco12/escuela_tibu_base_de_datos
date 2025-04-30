package escuela_tibu.escuela_tibu.domain.entities;

import java.time.LocalDateTime;

import escuela_tibu.escuela_tibu.domain.Fk_class.media_sub_chaptersId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "media_sub_chapters")
@Entity
public class media_sub_chapters {
    @EmbeddedId
    private media_sub_chaptersId id;

    @ManyToOne
    @JoinColumn(name = "id_sub_chapters", referencedColumnName = "id", insertable = false, updatable = false)
    private subchapters subchapters;

    @ManyToOne
    @JoinColumn(name = "id_media_types", referencedColumnName = "id", insertable = false, updatable = false)
    private media_types mediaTypes;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "description", length = 80, nullable = true)
    String description;

    @Column(name = "summary", columnDefinition = "TEXT", nullable = true)
    String summary; 
}
