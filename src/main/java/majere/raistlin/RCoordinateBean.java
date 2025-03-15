package majere.raistlin;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

//import jakarta.annotation.*;
import java.io.Serializable;
import java.util.Locale;

import jakarta.faces.bean.*;

@Named("rCoordinateBean")
@SessionScoped
public class RCoordinateBean implements Serializable{
    private Integer r = 3;

    public RCoordinateBean(){
    }

    public void setR(Integer r){
	    this.r = r;
    }

    public Integer getR(){
	    return r;
    }

    public void updateRadius(Integer new_r) {
        this.setR(new_r);
        String script = String.format("clearDots();\nr = %d;\n$(\"#update-radius\\\\:updateCanvas\").click();", new_r);
        FacesContext.getCurrentInstance()
                .getPartialViewContext()
                .getEvalScripts()
                .add(script);

    }
}
