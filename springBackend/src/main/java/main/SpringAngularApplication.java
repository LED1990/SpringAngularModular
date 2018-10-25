package main;

import main.Model.alfa.ZgloszenieAlfa;
import main.repository.daoimpl.ZgloszenieAlfaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class SpringAngularApplication implements CommandLineRunner {

    @Autowired
    ZgloszenieAlfaServiceImpl zgloszenieAlfaDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... arg0) throws Exception {
//        ZgloszenieAlfa zgloszenieAlfa = new ZgloszenieAlfa();
//        zgloszenieAlfa.setCiaza(false);
//        ZgloszenieWspolne wspolne = new ZgloszenieWspolne();
//        wspolne.setNumerZgloszenia("AA1");
//        zgloszenieAlfa.setZgloszenieWspolne(wspolne);
//        zgloszenieAlfaDao.zapiszNoweZgloszenie(zgloszenieAlfa);

        ZgloszenieAlfa zgloszenieAlfa = zgloszenieAlfaDao.pobierzPoId(8L);
        System.out.println("tak sobie "+zgloszenieAlfa.getCiaza()+" "+zgloszenieAlfa.getZgloszenieWspolne().getNumerZgloszenia());

    }
}
