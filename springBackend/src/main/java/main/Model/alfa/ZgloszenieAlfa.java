package main.Model.alfa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Model.Abstract.ZgloszenieWspolne;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZgloszenieAlfa extends ZgloszenieWspolne {

    private Boolean iziolacja;
    private Boolean ciaza;
}
