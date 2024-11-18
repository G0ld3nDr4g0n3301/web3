package majere.raistlin;

import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.annotation.*;
import java.io.Serializable;
import jakarta.faces.bean.*;

@ManagedBean(name="coordinateHandlerBean")
@SessionScoped
@Data
@NoArgsConstructor
public class CoordinateHandlerBean implements Serializable{
    private Integer x;
    private Float y;
}
