package majere.raistlin;

import java.util.*;

import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import majere.raistlin.db.DBMFactory;
import majere.raistlin.entities.ResultEntity;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import majere.raistlin.utils.AreaChecker;
import jakarta.faces.annotation.ManagedProperty;
//import jakarta.annotation.*;
import java.io.Serializable;
import jakarta.enterprise.context.ApplicationScoped;

@Named("resultsControllerBean")
@Getter
@Setter
@ApplicationScoped
public class ResultsControllerBean implements Serializable{

    @ManagedProperty(value="#{xCoordinateBean}")
    private XCoordinateBean xCoordinateBean;

    @ManagedProperty(value="#{yCoordinateBean}")
    private YCoordinateBean yCoordinateBean;
    
    @ManagedProperty(value="#{rCoordinateBean}")
    private RCoordinateBean rCoordinateBean;


    private List<ResultEntity> results = new ArrayList<ResultEntity>();

    @PostConstruct
    public void init(){
        results = DBMFactory.getInstance().getResultDBM().getAllResults();
        Collections.reverse(results);
    }



    public void addNewResult(Float x, Float y, Integer r){
        Boolean res = AreaChecker.checkDot(x,y,r);
        ResultEntity entity = new ResultEntity(x,y,r,res);
        results.add(0, entity);
        DBMFactory.getInstance().getResultDBM().addNewDot(entity);

        String script = String.format(
                Locale.US, "drawDot(%f, %f, %d, %b, true);", x, y, r,
                res);
        FacesContext.getCurrentInstance()
                .getPartialViewContext()
                .getEvalScripts()
                .add(script);
    }

    public void updateCanvas(Integer r){
        for(ResultEntity entity : results){
            Boolean newRes = AreaChecker.checkDot(entity.getX(),entity.getY(),r);

            String script = String.format(
                    Locale.US, "drawDot(%f, %f, %d, %b, true);",entity.getX(), entity.getY(), r,
                    newRes);
            FacesContext.getCurrentInstance()
                    .getPartialViewContext()
                    .getEvalScripts()
                    .add(script);
        }
    }

    public void clearResults(){
        results.clear();
        DBMFactory.getInstance().getResultDBM().clearResults();
        String script = "clearDots();";

        FacesContext.getCurrentInstance()
                .getPartialViewContext()
                .getEvalScripts()
                .add(script);
    }
}
