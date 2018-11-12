package main.Model.alfa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Model.Choroba;
import main.Model.Pacjent;
import main.Model.ZgloszenieWspolne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zgloszeniealfa")
public class ZgloszenieAlfa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Autowired
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pacjent_id")
    private Pacjent pacjent;

    @Autowired
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "choroba_id")
    private List<Choroba> choroba;

    /**
     * @JoinColumn okresla nazwe kolumny dla klucza obcego
     * jeśli się nie zdefiniuje to JPA zastosuje nazwę domyślną w tym przypadku zloszenie_wspolne_id -> '_id' odaje sam, a pierwszy człon to nazwa obiektu
     */
    @Autowired
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "wspolne_id")
    private ZgloszenieWspolne zgloszenieWspolne;

    @Column
    private Boolean izolacja;
    @Column
    private Boolean ciaza;

}
