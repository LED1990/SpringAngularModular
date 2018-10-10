package main.Model.Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Model.Choroba;
import main.Model.Enums.TypZgloszenia;
import main.Model.Pacjent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ZgloszenieWspolne {

    private Long id;
    private String numerZgloszenia;
    private TypZgloszenia typZgloszenia;

    @Autowired
    private Pacjent pacjent;
    @Autowired
    private Choroba choroba;

}
