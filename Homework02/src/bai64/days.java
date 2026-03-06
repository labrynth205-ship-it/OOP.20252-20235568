package bai64;
import java.util.Scanner;
public class days {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String month;
        int year;
        while (true) {
            System.out.print("Enter a month: ");
            month = keyboard.next();
            System.out.print("Enter a year: ");
            year = keyboard.nextInt();
            if (year < 0) {
                System.out.println("Invalid year.\n");
                continue;
            }
            int days = 0;
            boolean isValidMonth = true;
            switch (month) {
                case "January": case "Jan.": case "Jan": case "1":
                case "March": case "Mar.": case "Mar": case "3":
                case "May": case "5":
                case "July": case "Jul.": case "Jul": case "7":
                case "August": case "Aug.": case "Aug": case "8":
                case "October": case "Oct.": case "Oct": case "10":
                case "December": case "Dec.": case "Dec": case "12":
                    days = 31;
                    break;
                case "April": case "Apr.": case "Apr": case "4":
                case "June": case "Jun.": case "Jun": case "6":
                case "September": case "Sep.": case "Sep": case "9":
                case "November": case "Nov.": case "Nov": case "11":
                    days = 30;
                    break;
                case "February": case "Feb.": case "Feb": case "2":
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    isValidMonth = false;
            }
            if (isValidMonth) {
                System.out.println(days);
                break;
            } else {
                System.out.println("Invalid month.\n");
            }
        }    
        keyboard.close();
    }

}
