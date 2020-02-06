package Subscription;

public class SubscriptionAmount extends NewsPaperSubscription{


    SubscriptionAmount(String WeekDay, double amount, int daycount) {
        super(WeekDay, amount, daycount);

    }

   public static void main(String[] args) {
   // public static double subscriptiontotal(double total){

        SubscriptionAmount mon = new SubscriptionAmount("Monday", 2,4);
        SubscriptionAmount tues = new SubscriptionAmount("Tuesday", 2,4);
        SubscriptionAmount wed = new SubscriptionAmount("Wednesday", 2,4);
        SubscriptionAmount thur = new SubscriptionAmount("Thursday", 2, 4);
        SubscriptionAmount fri = new SubscriptionAmount("FriDay", 2, 4);
        SubscriptionAmount sat = new SubscriptionAmount("Saturday",4,5);
        SubscriptionAmount sun = new SubscriptionAmount("Sunday",4,4);
       double httotal = mon.subscription()+tues.subscription()+wed.subscription()+thur.subscription()+fri.subscription()+sat.subscription()+sun.subscription();
            System.out.println("Total Amount for month of Februray for NewsPaper: HT is : "+httotal);

           //--------------------------TOI--------------------//
        SubscriptionAmount toimon = new SubscriptionAmount("Monday", 3,4);
        SubscriptionAmount toitues = new SubscriptionAmount("Tuesday", 3,4);
        SubscriptionAmount toiwed = new SubscriptionAmount("Wednesday", 3,4);
        SubscriptionAmount toithur = new SubscriptionAmount("Thursday", 3, 4);
        SubscriptionAmount toifri = new SubscriptionAmount("FriDay", 3, 4);
        SubscriptionAmount toisat = new SubscriptionAmount("Saturday",5,5);
        SubscriptionAmount toisun = new SubscriptionAmount("Sunday",6,4);
        double toitotal = mon.subscription()+tues.subscription()+wed.subscription()+thur.subscription()+fri.subscription()+sat.subscription()+sun.subscription();
        System.out.println("Total Amount for month of Februray for NewsPaper: TOI is : "+toitotal);




        //-------------------------------------Hindu----------------------------------//

        SubscriptionAmount hindumon = new SubscriptionAmount("Monday", 2.5,4);
        SubscriptionAmount hindutues = new SubscriptionAmount("Tuesday", 2.5,4);
        SubscriptionAmount hinduwed = new SubscriptionAmount("Wednesday", 2.5,4);
        SubscriptionAmount hinduthur = new SubscriptionAmount("Thursday", 2.5, 4);
        SubscriptionAmount hindufri = new SubscriptionAmount("FriDay", 2.5, 4);
        SubscriptionAmount hindusat = new SubscriptionAmount("Saturday",4,5);
        SubscriptionAmount hindusun = new SubscriptionAmount("Sunday",4,4);
        double hindutotal = mon.subscription()+tues.subscription()+wed.subscription()+thur.subscription()+fri.subscription()+sat.subscription()+sun.subscription();
        System.out.println("Total Amount for month of Februray for NewsPaper: Hindu is : "+hindutotal);



        //-------------------------BM-----------------------------//

        SubscriptionAmount bmumon = new SubscriptionAmount("Monday", 1.5,4);
        SubscriptionAmount bmtues = new SubscriptionAmount("Tuesday", 1.5,4);
        SubscriptionAmount bmwed = new SubscriptionAmount("Wednesday", 1.5,4);
        SubscriptionAmount bmthur = new SubscriptionAmount("Thursday", 1.5, 4);
        SubscriptionAmount bmfri = new SubscriptionAmount("FriDay", 1.5, 4);
        SubscriptionAmount bmsat = new SubscriptionAmount("Saturday",1.5,5);
        SubscriptionAmount bmsun = new SubscriptionAmount("Sunday",1.5,4);
        double bmtotal = mon.subscription()+tues.subscription()+wed.subscription()+thur.subscription()+fri.subscription()+sat.subscription()+sun.subscription();
        System.out.println("Total Amount for month of Februray for NewsPaper: BM is : "+bmtotal);

        //-----------------------------ET------------------------------//

        SubscriptionAmount etumon = new SubscriptionAmount("Monday", 2,4);
        SubscriptionAmount ettues = new SubscriptionAmount("Tuesday", 2,4);
        SubscriptionAmount etwed = new SubscriptionAmount("Wednesday", 2,4);
        SubscriptionAmount etthur = new SubscriptionAmount("Thursday", 2, 4);
        SubscriptionAmount etfri = new SubscriptionAmount("FriDay", 2, 4);
        SubscriptionAmount etsat = new SubscriptionAmount("Saturday",2,5);
        SubscriptionAmount etsun = new SubscriptionAmount("Sunday",10,4);
        double ettotal = mon.subscription()+tues.subscription()+wed.subscription()+thur.subscription()+fri.subscription()+sat.subscription()+sun.subscription();
        System.out.println("Total Amount for month of Februray for NewsPaper: ET is : "+ettotal);

    }


    }
