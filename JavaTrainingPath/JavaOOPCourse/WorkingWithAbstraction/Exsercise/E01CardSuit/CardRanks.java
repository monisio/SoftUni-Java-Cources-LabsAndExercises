package JavaOOPCourse.WorkingWithAbstraction.Exsercise.E01CardSuit;

public enum CardRanks {
   // ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    ACE (14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN (7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    int power;

    CardRanks(int power){
        this.power=power;
    }

    int getPower(){
        return this.power;
    }

}
