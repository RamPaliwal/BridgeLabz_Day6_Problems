package Day6;

import java.util.Scanner;
public class DayOfWeek {
    void day(int day,int month,int year){
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int y_0 = year-(14-month)/12;
        int x = y_0 + y_0/100 + y_0/400;
        int m_0 = month+(12 *((14-month)/12))-2;
        int d_0 = (day+ x + (31*m_0)/12)%7;
        System.out.println("On "+day+"-"+month+"-"+year+" there is: "+days[d_0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        DayOfWeek dw=new DayOfWeek();
        dw.day(day, month, year);
    }
}
