package majere.raistlin;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.annotation.*;
import java.io.Serializable;
import jakarta.faces.bean.*;

@Named("coordinateHandlerBean")
@SessionScoped
@Data
@NoArgsConstructor
public class CoordinateHandlerBean implements Serializable{
    private Integer x;
    private Float y;
}
