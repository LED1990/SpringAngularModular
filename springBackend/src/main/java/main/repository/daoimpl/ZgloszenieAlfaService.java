package main.repository.daoimpl;

import main.Model.alfa.ZgloszenieAlfa;

public interface ZgloszenieAlfaService {
    ZgloszenieAlfa pobierzPoId(Long id);
    void zapiszNoweZgloszenie(ZgloszenieAlfa zgloszenieAlfa);
}
