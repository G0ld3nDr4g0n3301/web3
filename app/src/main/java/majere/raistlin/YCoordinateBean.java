package majere.raistlin;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.annotation.*;
import java.io.Serializable;

import jakarta.faces.bean.*;

@Named("yCoordinateBean")
@SessionScoped
@NoArgsConstructor
@Data
public class YCoordinateBean implements Serializable{
    private Float y;
}
