package main.repository.daoimpl;

import main.Model.Choroba;
import main.Model.DaneOsobowe;
import main.Model.Enums.TypZgloszenia;
import main.Model.Pacjent;
import main.Model.ZgloszenieWspolne;
import main.Model.alfa.ZgloszenieAlfa;
import main.repository.ZgloszenieAlfaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * NIE MA SENSU TESTOWAC SPRING DATA!!!!!!!
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = {ZgloszenieAlfaServiceImpl.class})
@EnableAutoConfiguration
public class ZgloszenieAlfaDaoImplTest {

    @Autowired
    private ZgloszenieAlfaServiceImpl zgloszenieAlfaService;

    @MockBean
    ZgloszenieAlfaRepository zgloszenieAlfaRepository;
    /**
     * Test polega na tym że nie powinno być żadnego wyjatku
     */
    @Test
    @Transactional //odpowiada za utworzenie sesji do komunikacji z baza
    public void zapisDoBazydanych(){
        ZgloszenieAlfa zgloszenieAlfa = new ZgloszenieAlfa();
        zgloszenieAlfa.setCiaza(false);
        zgloszenieAlfa.setIzolacja(false);

        ZgloszenieWspolne wspolne = new ZgloszenieWspolne();
        wspolne.setNumerZgloszenia("Wartość z testu");
        wspolne.setTypZgloszenia(TypZgloszenia.ALFA);

        Choroba choroba = new Choroba();
        choroba.setDataWystapienia(new Date());
        choroba.setNazwa("nazwa testowa");
        Choroba choroba2 = new Choroba();
        choroba2.setDataWystapienia(new Date());
        choroba2.setNazwa("nazwa testowa2");

        List<Choroba> listaChorub = new ArrayList<>();
        listaChorub.add(choroba);
        listaChorub.add(choroba2);

        DaneOsobowe daneOsobowe = new DaneOsobowe();
        daneOsobowe.setImie("imie A");
        daneOsobowe.setNazwisko("nazwisko A");

        Pacjent pacjent = new Pacjent();
        pacjent.setWiek(22);
        pacjent.setDataUrodzenia(new Date());
        pacjent.setDaneOsobowe(daneOsobowe);

        zgloszenieAlfa.setPacjent(pacjent);
        zgloszenieAlfa.setChoroba(listaChorub);
        zgloszenieAlfa.setZgloszenieWspolne(wspolne);

        zgloszenieAlfaService.zapiszNoweZgloszenie(zgloszenieAlfa);

        verify(zgloszenieAlfaRepository, times(1)).save(zgloszenieAlfa);
    }

}