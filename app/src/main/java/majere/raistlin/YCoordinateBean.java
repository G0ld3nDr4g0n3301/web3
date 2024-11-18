package majere.raistlin;

import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.annotation.*;
import java.io.Serializable;

import jakarta.faces.bean.*;

@ManagedBean(name="yCoordinateBean")
@SessionScoped
@NoArgsConstructor
@Data
public class YCoordinateBean implements Serializable{
    private Float y;
}
