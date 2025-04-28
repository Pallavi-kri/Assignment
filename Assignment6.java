//WAP java program for switch statement..

import java.util.Scanner;

public class Assignment6 {

        public static void main(String[] args) {
           // int day = 4;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter any number in week:");
            int day = obj.nextInt();
            String dayString;
    
            switch (day) {
                case 1:
                    dayString = "Monday";
                    break;
                case 2:
                    dayString = "Tuesday";
                    break;
                case 3:
                    dayString = "Wednesday";
                    break;
                case 4:
                    dayString = "Thursday";
                    break;
                case 5:
                    dayString = "Friday";
                    break;
                case 6:
                    dayString = "Saturday";
                    break;
                case 7:
                    dayString = "Sunday";
                    break;
                default:
                    dayString = "Invalid day";
            }
            System.out.println(dayString);
        }
    
}
