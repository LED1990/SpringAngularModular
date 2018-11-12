package main.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Model.alfa.ZgloszenieAlfa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@Entity
@Table(name = "pacjent")
public class Pacjent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Autowired
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "dane_osobowe_id")
    private DaneOsobowe daneOsobowe;

    @Column
    private Integer wiek;

    @Column(name = "dataurodzenia")
    private Date dataUrodzenia;
}
