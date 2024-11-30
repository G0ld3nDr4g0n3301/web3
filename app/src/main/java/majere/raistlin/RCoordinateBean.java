package majere.raistlin;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.annotation.*;
import java.io.Serializable;
import jakarta.faces.bean.*;

@Named("rCoordinateBean")
@SessionScoped
@NoArgsConstructor
@Data
public class RCoordinateBean implements Serializable{
    private Integer r = 3;
}
