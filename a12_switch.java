public class a12_switch {
    public static void main(String[] args){
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day " + day + " is " + dayName);


        int day2 = 5;
        switch (day2) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");}

            int day3 = 2;
            switch (day3) {
                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
                case 6, 7 -> System.out.println("Weekend");
                default -> System.out.println("Invalid day");
            }

            int day4 = 4;
            switch (day4){
                case 1:
                System.out.println("Monday");
                case 2:
                System.out.println("Tuesday");
                case 3:
                System.out.println("Wednesday");
                case 4:
                System.out.println("Thursday");
                case 5:
                System.out.println("Friday");
                case 6:
                System.out.println("Saturday");
                case 7:
                System.out.println("Sunday");
                default:
                System.out.println("Invalid day");
            }

        
    }
}
