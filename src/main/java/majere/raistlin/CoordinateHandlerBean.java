package majere.raistlin;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
//import jakarta.annotation.*;
import java.io.Serializable;
import jakarta.faces.bean.*;

@Named("coordinateHandlerBean")
@SessionScoped
    /**
     *
     * Test Javadoc comment
     *
     **/
public class CoordinateHandlerBean implements Serializable{

    private Float x;
    private Float y;

    public CoordinateHandlerBean(){
    }

    public Float getX(){
	    return x;
    }

    public Float getY(){
	    return y;
    }

    public void setX(Float x){
	    this.x = x;
    }
    public void setY(Float y){
	    this.y = y;
    }
}
