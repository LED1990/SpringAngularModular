package main.repository.daoimpl;

import main.Model.alfa.ZgloszenieAlfa;
import main.repository.ZgloszenieAlfaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZgloszenieAlfaServiceImpl implements ZgloszenieAlfaService{

    @Autowired
    ZgloszenieAlfaRepository zgloszenieAlfaRepository;

    @Override
    public void zapiszNoweZgloszenie(ZgloszenieAlfa zgloszenieAlfa){
        zgloszenieAlfaRepository.save(zgloszenieAlfa);
    }

    @Override
    public ZgloszenieAlfa pobierzPoId(Long id){
        return zgloszenieAlfaRepository.findOne(id);
    }
}
