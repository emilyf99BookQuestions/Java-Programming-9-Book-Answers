public class PickTwoCards {

    public static void main(String[] args){
        Card card1 = new Card();
        Card card2 = new Card();

        card1.setSuit('S');
        card1.setValue(getRandomNumber());
        card2.setSuit('H');
        card2.setValue(getRandomNumber());

        showCard(card1);
        showCard(card2);
    }

    public static int getRandomNumber(){
        final int CARDS_IN_SUIT = 13;
        int number = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        return number;
    }

    public static void showCard(Card card) {
        System.out.println(card.getSuit() + " " + card.getValue());
    }
}
