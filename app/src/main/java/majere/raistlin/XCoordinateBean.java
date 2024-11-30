package majere.raistlin;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//import jakarta.annotation.*;
import java.io.Serializable;

//import jakarta.faces.bean.*;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.*;
import jakarta.inject.Named;

@Named("xCoordinateBean")
@SessionScoped
@Data
@NoArgsConstructor
public class XCoordinateBean implements Serializable {
    private Float x;

}
