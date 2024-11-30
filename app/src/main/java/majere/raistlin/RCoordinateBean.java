package majere.raistlin;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

//import jakarta.annotation.*;
import java.io.Serializable;
import java.util.Locale;

import jakarta.faces.bean.*;

@Named("rCoordinateBean")
@SessionScoped
@NoArgsConstructor
@Data
public class RCoordinateBean implements Serializable{
    private Integer r = 3;


    public void updateRadius(Integer new_r) {
        this.setR(new_r);
        String script = String.format("clearDots();\nr = %d;\n$(\"#update-radius\\\\:updateCanvas\").click();", new_r);
        FacesContext.getCurrentInstance()
                .getPartialViewContext()
                .getEvalScripts()
                .add(script);

    }
}
