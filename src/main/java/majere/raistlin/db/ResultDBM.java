package majere.raistlin.db;

import java.sql.Connection;
import java.util.List;
import majere.raistlin.entities.ResultEntity;

public interface ResultDBM {
    

    public Boolean addNewDot(ResultEntity res);

    public Boolean clearResults();

    public List<ResultEntity> getAllResults();

}
