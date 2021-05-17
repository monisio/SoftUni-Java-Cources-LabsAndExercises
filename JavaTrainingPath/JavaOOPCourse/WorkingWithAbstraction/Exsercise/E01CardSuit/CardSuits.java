package JavaOOPCourse.WorkingWithAbstraction.Exsercise.E01CardSuit;

public enum CardSuits {

   // CLUBS, DIAMONDS, HEARTS, SPADES;
   CLUBS(0), DIAMONDS (13), HEARTS(26), SPADES(39);

   int suitPower;

   CardSuits(int suitPower){
       this.suitPower= suitPower;
   }

   int getSuitPower(){
       return this.suitPower;
   }

}
