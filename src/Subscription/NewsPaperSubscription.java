package Subscription;

public class NewsPaperSubscription {


        String WeekDay;
    double amount;
        int daycount;
        static String newsPaper = "HT";

    NewsPaperSubscription(String WeekDay, double amount, int daycount) {
            this.WeekDay = WeekDay;
            this.amount = amount;
            this.daycount = daycount;

        }

    double subscription() {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday"};

            int len = days.length;
        double cal = 0;
            int totalamt = 0;
            for (int i = 0; i <= len - 1; i++) {

                //     System.out.println(newsPaper + " " + WeekDay + " " + amount);

                if (WeekDay.equalsIgnoreCase(days[i])) ;
                cal = daycount * amount;

            }


            return cal;

        }

}
