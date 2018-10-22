package main.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Pacjent {

    private Long id;
    private DaneOsobowe daneOsobowe;
    private Integer wiek;
    private Date dataUrodzenia;
}
