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
public class Choroba {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nazwa;
    @Column
    private Date dataWystapienia;

    //foreignkeys
    @JoinColumn(name = "alfa_id")
    @OneToOne(fetch = FetchType.LAZY)
    private ZgloszenieAlfa zgloszenieAlfa;
}
