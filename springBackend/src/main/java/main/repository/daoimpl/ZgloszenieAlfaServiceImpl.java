package main.repository.daoimpl;

import main.Model.alfa.ZgloszenieAlfa;
import main.repository.ZgloszenieAlfaRepository;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZgloszenieAlfaServiceImpl implements ZgloszenieAlfaService{

    private static final Logger logger = LogManager.getLogger(ZgloszenieAlfaServiceImpl.class);

    @Autowired
    ZgloszenieAlfaRepository zgloszenieAlfaRepository;

    @Override
    public void zapiszNoweZgloszenie(ZgloszenieAlfa zgloszenieAlfa){
        logger.debug("zapisywanie nowego zgłoszenia");
        zgloszenieAlfaRepository.save(zgloszenieAlfa);
    }

    @Override
    public ZgloszenieAlfa pobierzPoId(Long id){
        logger.debug("pobieranie zgłoszenia po ID = " + id);
        return zgloszenieAlfaRepository.findOne(id);
    }
}
