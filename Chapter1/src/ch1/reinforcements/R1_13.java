package ch1.reinforcements;

import ch1.generic.CreditCard;

public class R1_13 {

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("John Bowman", "California Savings",
                            "5391 0375 9387 5309",  5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500.0);
        wallet[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500,300.0);


        for (int val =1; val <=16; val++){
            //cause wallet 0 to go past the limit
            wallet[0].charge(5001);
            wallet[1].charge(2 *val);
            wallet[2].charge(val);
        }
//        CreditCard card = wallet[0];

        for (CreditCard card: wallet){
            card.printSummary();
            while(card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New Balance = " + card.getBalance());
            }
        }


    }
}
