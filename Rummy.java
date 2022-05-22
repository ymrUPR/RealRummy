//Terminal Line Version of the Game
//RUN THIS INSTEAD OF 'Table.java'

public class Rummy { 
    public static void main(String[] arg){
        Deck deck = new Deck();
        for(char s : Card.suit){
            for(char r : Card.rank) {
            deck.addCard(new Card(s, r));
            }
        }
       
        Pile<Card> discard = new Pile();


    //Initialize both player hands

        Hand p1 = new Hand();
        for(int i = 0; i < 9; i++){
            p1.addCard(deck.dealCard());
        }
        
        Hand p2 = new Hand();
        for(int i = 0; i < 9; i++){
            p2.addCard(deck.dealCard());
        }

        System.out.println("Initial Player 1: " + p1);
        System.out.println("Initial Player 2: " + p2);


    //This is where the fun begins. PLAY!
        for(boolean turn = true; !(deck.isEmpty() || p1.isEmpty() || p2.isEmpty()); turn = !turn){ //Check if either the deck is empty or one of the players' hands is empty to declare a game over.

            if(turn){
                System.out.println("Player 1");
                p1.play(deck, discard);
                System.out.println("\tHand now: " + p1);
                }
             else{
                System.out.println("Player 2");
                p2.play(deck, discard);
                System.out.println("Hand now: " + p2);
                }
           }
           
            //Gotta count the votes somehow, right...?
           int p1_val = p1.evaluateHand();
           int p2_val = p2.evaluateHand();


            //And the winner is.........
           if(p1_val == p2_val){
              System.out.println("\tIt's a tie!'");
                }
            else if(p1_val < p2_val){
              System.out.println("\tPlayer 1 wins!");
                }

            else{
              System.out.println("\tPlayer 2 wins!");
                }
       }


}
