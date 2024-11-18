package majere.raistlin;

import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.annotation.*;
import java.io.Serializable;
import jakarta.faces.bean.*;

@ManagedBean(name="rCoordinateBean")
@SessionScoped
@NoArgsConstructor
@Data
public class RCoordinateBean implements Serializable{
    private Integer r;
}
