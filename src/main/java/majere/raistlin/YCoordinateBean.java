package majere.raistlin;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

//import jakarta.annotation.*;
import java.io.Serializable;

import jakarta.faces.bean.*;

@Named("yCoordinateBean")
@SessionScoped
public class YCoordinateBean implements Serializable{
    private Float y;
}
