package majere.raistlin;

import java.util.*;

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
    }
    
    public void addNewResult(Integer x, Float y, Integer r){
        Boolean res = AreaChecker.checkDot(x,y,r);
        ResultEntity entity = new ResultEntity(x,y,r,res);
        results.add(entity);
        DBMFactory.getInstance().getResultDBM().addNewDot(entity);
    }


    public void clearResults(){
        results.clear();
        DBMFactory.getInstance().getResultDBM().clearResults();
    }
}
