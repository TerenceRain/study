package Study0301;

public class Card {
    public String suit;//花色
    public String rank;//点数
    public Card(String suit , String rank){
        this.rank = rank;
        this.suit = suit;

    }
@Override
    public String toString(){
        return "(" + this.suit + this.rank + ")";
    }

}
