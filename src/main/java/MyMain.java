public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int x = 0;
        int timesrolled = 0;
        int total = 0;

        for (int i = 1; i <= 10000; i++){
            x = 0;
            for (int k = 1; k <= 6; k++){
                int change = (int)(Math.random() * 6 + 1);
                if (change == 6){
                    x = x + 1;
                } 
            }
            if (x > 0){
                total++;
            }
            timesrolled++;

        }
        Double total2 = new Double(total);
        Double times2 = new Double(timesrolled);
        Double avg = (total2/times2) * 100;
        System.out.println( "The average amount of six's rolled in six roles is " + avg);
        return avg;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int x = 0;
        int timesrolled= 0;
        int total= 0;

        for (int i = 1; i <= 1000000; i++){
            x = 0;
            for (int k = 1; k <= 12; k++){
                int change = (int)(Math.random() * 6 + 1);
                if (change == 6){
                    x = x + 1;
                } 
            }
            if (x > 1){
                total++;
            }
            timesrolled++;
        }
        Double total2 = new Double(total);
        Double times2 = new Double(timesrolled);
        Double avg = (total2/times2) * 100;
        System.out.println("The average amount of six's rolled in twelve roles is " + avg);
        return avg;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int x = 0;
        int timesrolled = 0;
        int total = 0;
        
        for (int i = 1; i <= 10000000; i++){
            x = 0;
            for (int k = 1; k <= 18; k++){
                int change = (int)(Math.random() * 6 + 1);
                if (change == 6){
                    x = x +1;
                } 
            }
            if (x > 2){
                total++;
            }
         
            timesrolled++;
        }
        Double total2 = new Double(total);
        Double times2 = new Double(timesrolled);
        Double avg = (total2/times2) * 100;
        System.out.println("The average amount of six's rolled in eighteen roles is " + avg);
        return avg;
    }
    public static void main(String[] args) {
        probabilityOneSix();
        probabilityTwoSixes();
        probabilityThreeSixes();

    }
}