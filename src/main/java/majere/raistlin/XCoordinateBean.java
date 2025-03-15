package majere.raistlin;


//import jakarta.annotation.*;
import java.io.Serializable;

//import jakarta.faces.bean.*;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.*;
import jakarta.inject.Named;

@Named("xCoordinateBean")
@SessionScoped
public class XCoordinateBean implements Serializable {
    private Float x = 0f;

}
