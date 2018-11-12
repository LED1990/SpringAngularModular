package main.Kontrolery;

import main.Model.alfa.ZgloszenieAlfa;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ZgloszeniaKontroler {

    private static final String ZGLOSZENIE_ALFA_URL = "/api/zgloszenie/zapisz";

    @PostMapping(value = ZGLOSZENIE_ALFA_URL)
    public ResponseEntity<ZgloszenieAlfa> zapiszZgloszenie(@RequestBody ZgloszenieAlfa zgloszenieAlfa) {
//        System.out.println(zgloszenieAlfa.toString() + " " + zgloszenieAlfa.getPacjent().toString() + " " + zgloszenieAlfa.getChoroba().toString());
        //todo obsluga zapisywania zgloszenia
        return ResponseEntity.ok(zgloszenieAlfa);
    }
}
