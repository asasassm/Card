import java.util.Random;
/*
 * @author dong
 */
public class Card implements Shuffle{
    int num;
    Suit shape;
    String showingNumber;
    Random random;
    public Card(int num,String showingNumber,Suit shape){
        this.num = num;
        this.shape = shape;
        this.showingNumber = showingNumber;
    }

    public int getNum() {
        return num;
    }

    public Suit getShape() {
        return shape;
    }
    public String getShowingNumber(){
        return showingNumber;
    }

    @Override
    public void mix(Card card) {

    }

    @Override
    public Card getCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCard'");
    }

   
    
}

 class Test{
    public static void main(String[] args) {
        Card c1 = new Card(1,"A",Suit.Spade);
                Card c2 = new Card(1,"2",Suit.Diamond);

        if(c1.getShape() == c2.getShape());
        
        Suit suit = Suit.valueOf("Diamond");
        Suit[] suits = Suit.values();

    }
}