package Study0222;

public class Seller {
    public void check(Apple[] apples) throws AppleException{
        int count = 0;
        for (int i = 0; i < apples.length; i++) {
            if(apples[i].getWeight() < 10){
                count++;
            }
        }
        if(count >= 3){
            throw new AppleException("本批苹果不合格！" , count);
        }
    }

}
