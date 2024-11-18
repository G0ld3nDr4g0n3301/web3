package majere.raistlin;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//import jakarta.annotation.*;
import java.io.Serializable;

import jakarta.faces.bean.*;
import jakarta.annotation.PostConstruct;

@ManagedBean(name = "xCoordinateBean")
@SessionScoped
@NoArgsConstructor
@Data
@Slf4j
public class XCoordinateBean implements Serializable {
    private Integer x;

    @PostConstruct
    private void init() {
    log.info("####################################\nIM ALIVE!\n####################################");
    }

}
