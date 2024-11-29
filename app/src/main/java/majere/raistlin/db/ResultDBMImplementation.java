package majere.raistlin.db;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import majere.raistlin.entities.ResultEntity;

public class ResultDBMImplementation implements ResultDBM{
    private Connection con = null;

    public ResultDBMImplementation(Connection con){
        this.con = con;
    }

    public Boolean addNewDot(ResultEntity res){

        String query = String.format("INSERT INTO RESULTS (x,y,r,result) VALUES (%d,%f,%d,%b)", res.getX(), res.getY(), res.getR(), res.getResult());
        try {
            con.createStatement().executeUpdate(query);
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public Boolean clearResults(){
        String query = "TRUNCATE TABLE RESULTS";
        try {
            con.createStatement().executeUpdate(query);
            return true;
        } catch (SQLException e){
            return false;
        }
    }

    public List<ResultEntity> getAllResults() {

        String query = "SELECT * FROM RESULTS";
        try {
            ResultSet resultSet = con.createStatement().executeQuery(query);

            List<ResultEntity> results = new ArrayList<ResultEntity>();
            while(resultSet.next()){
                ResultEntity resultEntity = new ResultEntity();
                resultEntity.setX(resultSet.getInt("x"));
                resultEntity.setY(resultSet.getFloat("y"));
                resultEntity.setR(resultSet.getInt("r"));
                resultEntity.setResult(resultSet.getBoolean("result"));
                results.add(resultEntity);
            }
        
            return results;
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
