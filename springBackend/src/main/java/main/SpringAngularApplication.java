package main;

import main.Model.Choroba;
import main.Model.alfa.ZgloszenieAlfa;
import main.repository.daoimpl.ZgloszenieAlfaServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class SpringAngularApplication implements CommandLineRunner {

    private static final Logger logger = LogManager.getLogger(ZgloszenieAlfaServiceImpl.class);

    @Autowired
    ZgloszenieAlfaServiceImpl zgloszenieAlfaDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularApplication.class, args);
    }

    /**
     * @Transactional pozwala utworzenie sessji do polaczneia zbaza danych
     * @param arg0
     * @throws Exception
     */
    @Override
    @Transactional
    public void run(String... arg0) throws Exception {
        ZgloszenieAlfa zgloszenieAlfa = zgloszenieAlfaDao.pobierzPoId(18L);
        for (Choroba ch:zgloszenieAlfa.getChoroba()
             ) {
            logger.info("zgłoszenie: "+zgloszenieAlfa.getId()+" choroba: "+ch.getNazwa()+" data "+ch.getDataWystapienia());
        }
    }
}
