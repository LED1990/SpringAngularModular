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
    @GeneratedValue
    private Long id;

    @Autowired
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private DaneOsobowe daneOsobowe;

    @Column
    private Integer wiek;
    @Column
    private Date dataUrodzenia;

    //foreign keys
    @JoinColumn(name = "alfa_id")
    @OneToOne(fetch = FetchType.LAZY)
    private ZgloszenieAlfa zgloszenieAlfa;
}
