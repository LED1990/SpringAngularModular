package main.Kontrolery;

import main.Model.Choroba;
import main.Model.alfa.ZgloszenieAlfa;
import main.repository.daoimpl.ZgloszenieAlfaServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ZgloszeniaKontroler {

    private static final Logger logger = LogManager.getLogger(ZgloszeniaKontroler.class);
    private static final String ZGLOSZENIE_ALFA_URL = "/api/zgloszenie/zapisz";

    @Autowired
    private ZgloszenieAlfaServiceImpl zgloszenieAlfaService;

    @PostMapping(value = ZGLOSZENIE_ALFA_URL)
    public ResponseEntity<ZgloszenieAlfa> zapiszZgloszenie(@RequestBody ZgloszenieAlfa zgloszenieAlfa) {
        logger.info("Zapisywanie nowego zgłoszenia "+zgloszenieAlfa.toString());
        //todo obsluga zapisywania zgloszenia
        zgloszenieAlfaService.zapiszNoweZgloszenie(zgloszenieAlfa);
        return ResponseEntity.ok(zgloszenieAlfa);
    }
}
