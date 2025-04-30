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
@Table(name = "chapters")
@Entity
public class chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    int id;

    @Column(name = "name_chapter")
    int nameChapter;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    @JsonBackReference
    private skills skills;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "description", length = 80, nullable = true)
    String description;

    @Column(name = "chapter_summary", columnDefinition = "TEXT", nullable = true)
    String chapterSummary;
}
