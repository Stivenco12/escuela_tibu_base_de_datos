package escuela_tibu.escuela_tibu.domain.Fk_class;

import jakarta.persistence.Column;

public class media_sub_chaptersId {
    @Column(name = "id_sub_chapters")
    private int idMediaChapters;

    @Column(name = "id_media_types")
    private int idMediaTypes;
    
}
