public class ProblemSet1 {

    public static void main(String[] args) {
        // Part 1

        // Tested by using my Birthday as an appropriate argument
        System.out.println(getAmerican("Sunday",6,"October", 2024));
        System.out.println(getEuropean("Sunday",6,"October", 2024));

        //Part 2

        System.out.println("Number of seconds since midnight: " + secondsSinceMidnight(14,13,12));
        System.out.println("Number of seconds left today: " + secondsLeftToday(14,13,12));
        System.out.println("Percent of day passed : " + percentOfDayPassed(14,13,12)+ "%");

        // Part 3

        System.out.println("Result of Multadd: "+ multadd(3,2,1));//7
        System.out.println("Result of Multadd: "+ multadd(Math.cos(Math.PI / 4),.5,Math.sin(Math.PI / 4)));
        System.out.println("Result of Multadd: "+ multadd(Math.log(10),1, Math.log(20)));
        System.out.println("Result of yikes(3): "+ yikes(3));
        System.out.println("Result of yikes(2): "+ yikes(2));


    }


    //PART 1 CODE

    public static String getAmerican(String day,int date, String month, int year ) {
        // American looks like:Monday, September 9, 2024
        return day + ", " + month + " " + date + ", " + year;
    }

    public static String getEuropean(String day,int date, String month, int year ) {
        // European looks like: Monday 9 September, 2024
        return day + " " + date + " " + month + ", " + year;

    }

    // PART 2 CODE

    public static int secondsSinceMidnight(int hour, int minute, int second) {
        return second + (hour * 3600) + (minute * 60);

    }

    public static int secondsLeftToday(int hour, int minute, int second) {
        int secondsSinceMidnight = (hour * 3600) + (minute * 60) + (second);
        int totalsec = 86400;
        return totalsec - secondsSinceMidnight;

    }

    public static double percentOfDayPassed(int hour, int minute, int second) {
        int totalsec = 86400;
        int calcSeconds = (hour * 3600) + (minute * 60) + second;
        return ((double) calcSeconds / totalsec) * 100;

    }

    // Part 3 Code

    public static double multadd(double a, double b, double c){
        return (a * b) +c;

    }

    public static double yikes(double x){
    double expX = Math.exp(-x);
    return multadd(x,(expX), Math.sqrt(1 - (expX)));

    }
}
