package Study0222;

import javafx.scene.chart.ScatterChart;

class AppleException extends RuntimeException{
    int count = 0;
    public AppleException(){
        super();
    }
    public AppleException(String message){
        super(message);
    }
    public AppleException(String message , int count){
        super(message);
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
}
public class Demo3 {

    public void throwException() {
        try{
            throw new AppleException("不合格的苹果！");
        }catch(AppleException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Demo3().throwException();
    }
}
