package CaseStudent.Controllers;

import CaseStudent.Commons.WriteAndReadyFileCSV;
import CaseStudent.Model.House;
import CaseStudent.Model.Room;
import CaseStudent.Model.Services;
import CaseStudent.Model.Villa;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc = new Scanner(System.in);

    public static void disPlayMainMenu() {
        System.out.println("\n1.Add new services." +
                "\n2.Show Services." +
                "\n3.Exit." +
                "\nPlease choose:");
        switch (sc.nextInt()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                System.exit(0);

            default:
                System.out.println("\nError!!!");
                backBackToMenu();
        }
    }

    private static void backBackToMenu() {
        System.out.println("Enter to continue");
        System.out.println();
        System.out.println("_____________");
        disPlayMainMenu();
    }

    private static void addNewServices() {
        System.out.println("________________");
        System.out.println("\n1. Add New Villa" +
                "\n2. Add New House" +
                "\n3. Add New Room" +
                "\n4. Back to menu" +
                "\nExit."
        );
        switch (sc.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                disPlayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("\nError!!!");
                backBackToMenu();
        }
    }

    private static Services addNewService(Services services) {
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.println("Enter name services:");
        services.setName(sc.nextLine());
        System.out.println("Enter area used :");
        services.setArea_used(sc.nextDouble());
        System.out.println("Enter rental costs:");
        services.setRental_costs(sc.nextDouble());
        System.out.println("Enter maximum_number_of_people:");
        services.setMaximum_number_of_people(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter type_of_rent:");
        services.setType_of_rent(sc.nextLine());
        return services;
    }

    private static void showServices() {
        System.out.println("__________" +
                "\n1. Show All Villa" +
                "\n2. Show All House" +
                "\n3. Show All Room" +
                "\n4. Back to menu" +
                "\n5. Exit"
        );
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                backBackToMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("\nError!!!");
                backBackToMenu();
        }
    }

    private static void addNewVilla() {
        Services villa = new Villa();
        villa = addNewService(villa);
        System.out.println("Enter room standard :");
        ((Villa) villa).setRoom_standard(sc.nextLine());
        System.out.println("Enter description of other amenities:");
        ((Villa) villa).setDescription_of_other_amenities(sc.nextLine());
        System.out.println("Enter number of floors");
        ((Villa) villa).setNumber_of_floors(sc.nextInt());
        System.out.println("Enter pool area: ");
        ((Villa) villa).setPool_area(sc.nextDouble());
        sc.nextLine();//pass enter
        // write file
        ArrayList<Villa> villaArrayList = new ArrayList<Villa>();
        villaArrayList.add((Villa) villa);
        WriteAndReadyFileCSV.writeVillaToFileCSV(villaArrayList);
        System.out.println("\nAdd Villa: " + villa.getName() + " Successfully!!!");
        backBackToMenu();
    }

    private static void addNewHouse() {
        Services house = new House();
        house = addNewService(house);
        //tiêu chuẩn phòng
        System.out.println("Enter room standard :");
        ((House) house).setRoom_standard(sc.nextLine());
        // mô tả các tiện nghi khác
        System.out.println("Enter description of other amenities:");
        ((House) house).setDescription_of_other_amenities(sc.nextLine());
        //Số tầng
        System.out.println("Enter number of floors");
        ((House) house).setNumber_of_floors(sc.nextInt());
        sc.nextLine();//pass enter
        // write file
        ArrayList<House> houseArrayList = new ArrayList<House>();
        houseArrayList.add((House) house);
        WriteAndReadyFileCSV.writeHouseToFileCSV(houseArrayList);
        System.out.println("\nAdd House: " + house.getName() + " Successfully!!!");
        backBackToMenu();
    }

    private static void addNewRoom() {
        Services room = new Room();
        room = addNewService(room);
        System.out.println("Enter free service included :");
        ((Room) room).setFree_service_included(sc.nextLine());

        //  sc.nextLine();//pass enter
        // write file
        ArrayList<Room> roomArrayList = new ArrayList<Room>();
        roomArrayList.add((Room) room);
        WriteAndReadyFileCSV.writeRoomToFileCSV(roomArrayList);
        System.out.println("\nAdd Villa: " + room.getName() + " Successfully!!!");
        backBackToMenu();
    }

    private static void showAllVilla() {
        ArrayList<Villa> villaArrayList = WriteAndReadyFileCSV.getVillaFromCSV();
        System.out.println(villaArrayList.size());
        for (Villa villa : villaArrayList) {
            System.out.println("\n____________________");
            System.out.println(villa.showInfor());
            System.out.println("\n____________________");
        }
    }

    private static void showAllHouse() {
        ArrayList<House> houseArrayList = WriteAndReadyFileCSV.getHouseFromCSV();
        // System.out.println(h.size());
        for (House house : houseArrayList) {
            System.out.println("\n____________________");
            System.out.println(house.showInfor());
            System.out.println("\n____________________");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> roomArrayList = WriteAndReadyFileCSV.getRoomFromCSV();
        // System.out.println(h.size());
        for (Room room : roomArrayList) {
            System.out.println("\n____________________");
            System.out.println(room.showInfor());
            System.out.println("\n____________________");
        }
    }
}
