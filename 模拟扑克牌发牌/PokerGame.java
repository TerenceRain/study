package Study0301;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    public static final String[] suits = {"♥","♠","♣","♦"};
    private static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(suits[i] , String.valueOf(j)));
            }
            poker.add(new Card(suits[i] , "J"));
            poker.add(new Card(suits[i] , "Q"));
            poker.add(new Card(suits[i] , "K"));
            poker.add(new Card(suits[i] , "A"));
        }
        poker.add(new Card("" , "big Joker"));
        poker.add(new Card("" , "small Joker"));

        return poker;
    }
    public static void main(String[] args) {

List<Card> poker = buyPoker();
        System.out.println(poker);

        shuffle(poker);
        System.out.println(poker);

        //三个玩家，一人发五张牌
//        List<Card> player1 = new ArrayList<>();
//        List<Card> player2 = new ArrayList<>();
//        List<Card> player3 = new ArrayList<>();
            List<List<Card>> players = new ArrayList<>();players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card top = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
            }
        }

        for (int i = 0; i < players.size() - 1; i++) {
            List<Card> player = players.get(i);
            System.out.println("玩家" + i + " 的手牌是：" + player);
        }
    }
    private static void shuffle(List<Card> poker){
        Random random = new Random();
        for (int i = poker.size() - 1; i > 0; i--) {
            int pos = random.nextInt(i);
            swap(poker, i, pos);

        }
    }

    private static void swap(List<Card> poker, int i, int j) {
        Card temp = poker.get(i);
        poker.set(i, poker.get(j));
        poker.set(j ,temp);
    }
}
