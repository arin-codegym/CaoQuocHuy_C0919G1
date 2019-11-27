package CaseStudent.Model;

import java.util.Scanner;

public class ServiceTest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Services villa = new Villa();
        System.out.println("Enter Name service:");
        villa.setName(sc.nextLine());
        System.out.println("Enter Area used:");
        villa.setArea_used(sc.nextDouble());
        System.out.println("Maxxinum number of people:");
        villa.setMaximum_number_of_people(sc.nextInt());
        System.out.println("Enter Rental costs:");
        villa.setRental_costs(sc.nextDouble());
        sc.nextLine();
        System.out.println("Enter Type of rent :");
        villa.setType_of_rent(sc.nextLine());
        System.out.println("Enter Room Standard:");
        ((Villa)villa).setRoom_standard(sc.nextLine());
        System.out.println("Enter Number of floors:");
        ((Villa)villa).setNumber_of_floors(sc.nextInt());
        System.out.println("Enter Pool Area:");
        ((Villa)villa).setPool_area(sc.nextDouble());
        System.out.println("Enter Description of other amenities:");
        ((Villa)villa).setDescription_of_other_amenities(sc.nextLine());
        System.out.println(villa.showInfor());





    }
}
