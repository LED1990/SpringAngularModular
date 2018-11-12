package main;

import main.repository.daoimpl.ZgloszenieAlfaServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAngularApplication{

    private static final Logger logger = LogManager.getLogger(ZgloszenieAlfaServiceImpl.class);

    @Autowired
    ZgloszenieAlfaServiceImpl zgloszenieAlfaDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularApplication.class, args);
    }


}
