package main.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Model.Enums.TypZgloszenia;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zgloszeniewspolne")
public class ZgloszenieWspolne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String numerZgloszenia;

    @Enumerated(EnumType.STRING)
    @Column(name = "typzgloszenia")
    private TypZgloszenia typZgloszenia;

}
