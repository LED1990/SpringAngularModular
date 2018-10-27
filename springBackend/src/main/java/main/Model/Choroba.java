package main.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Model.alfa.ZgloszenieAlfa;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "choroba")
public class Choroba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nazwa;

    @Column(name = "datawystapienia")
    private Date dataWystapienia;

    @ManyToOne
    @JoinColumn(name = "choroba_id")
    ZgloszenieAlfa zgloszenieAlfa;

}
