package NgonNguLapTrinhJava;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Money: ");
        money = input.nextDouble();
        System.out.println("time(month):");
        month = input.nextInt();
        System.out.println("Interest rate:");
        interset_rate = input.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Total interest :"+total_interest);
    }

}
