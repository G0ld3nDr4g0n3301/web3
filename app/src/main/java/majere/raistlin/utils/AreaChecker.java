package majere.raistlin.utils;

public class AreaChecker {

    public static Boolean checkDot(Integer x, Float y, Integer r){
        if (r == 0) {
            return false;
        }


        if (x >= 0 && y >= 0) {
            return x <= r && y <= r / 2;
        }
        else if (x <= 0 && y <= 0) {
            return (x * x + y * y) <= (r * r) / 4;
        }
        else if (x <= 0 && y >= 0) {
            return y <= (0.5*x + r/2);
        }
        return false;
    }
    
}
