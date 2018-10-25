package main.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "daneosobowe")
public class DaneOsobowe {

    @Id
    @GeneratedValue
    private Long id;

    private String imie;
    private String nazwisko;
}
