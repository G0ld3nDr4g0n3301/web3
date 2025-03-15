package majere.raistlin.entities;



public class ResultEntity {
    private Float x;
    private Float y;
    private Integer r;
    private Boolean result;


    public ResultEntity(Float x, Float y, Integer r, Boolean result){
	    this.x = x;
	    this.y = y;
	    this.r = r;
	    this.result = result;
    }

    public ResultEntity(){
    }

    public Float getX(){
	    return x;
    }


    public void setX(Float x){
	    this.x = x;
    }

    public Float getY(){
	    return y;
    }
    public Integer getR(){
	    return r;
    }

    public void setResult(Boolean result){
	    this.result = result;
    }

    public Boolean getResult(){
	    return result;
    }

    public void setR(Integer r){
	    this.r = r;
    }
    public void setY(Float y){
	    this.y = y;
    }

}
