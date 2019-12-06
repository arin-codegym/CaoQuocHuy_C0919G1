package CaseStudent.Controllers;

import CaseStudent.Commons.BirthdayException;
import CaseStudent.Commons.NameException;
import CaseStudent.Commons.Validation;
import CaseStudent.Model.*;
import CaseStudent.Commons.WriteAndReadyFileCSV;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    public static String REGEX = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
    private static Scanner sc = new Scanner(System.in);

    public static void disPlayMainMenu() {
        System.out.println("\n1.Add New Services." +
                "\n2.Show Services." +
                "\n3.Add New Customer" +
                "\n4.Show Information Customer" +
                "\n5.Exit" +
                "\nPlease choose:");
        switch (sc.nextInt()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                // showInformationCustomer();
            case 5:
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
        String content = "";
        String errorMessage = "";

        services.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.println("Enter name services:");
        services.setName(sc.nextLine());
        while (!Validation.checkName(services.getName())) {
            System.out.println("Name service is invalid!!! Please try again.");
            System.out.println("Enter name service :");
            services.setName(sc.nextLine());
        }
        //enter area used
        content = "Enter area used: ";
        errorMessage = " Area used is invalid (Area >30 , Area must be a double. ) Please try again";
        services.setArea_used(Validation.checkValidNumberDouble(content, errorMessage));
        while (services.getArea_used() <= 30) {
            System.out.println(errorMessage);
            services.setArea_used(Validation.checkValidNumberDouble(content, errorMessage));
        }
        // enter rental costs
        content = "Enter rental costs";
        errorMessage = "Rental costs is invalid(Costs >0 , Costs must be Double)Please try again !!!";
        services.setRental_costs(Validation.checkValidNumberDouble(content, errorMessage));
        while (services.getRental_costs() <= 0) {
            System.out.println(errorMessage);
            services.setRental_costs(Validation.checkValidNumberDouble(content, errorMessage));
        }
        // enter max num of people
        content = "Enter max number of people: ";
        errorMessage = "Max number of people is invalid(Number of people >0 and Number of People <20,Number of People must be integer)";
        services.setMaximum_number_of_people(Validation.checkValidNumberInteger(content, errorMessage));
        while (services.getMaximum_number_of_people() <= 0 || services.getMaximum_number_of_people() >= 20) {
            System.out.println(errorMessage);
            services.setMaximum_number_of_people(Validation.checkValidNumberInteger(content, errorMessage));
        }
        System.out.println("Enter type_of_rent:");
        services.setType_of_rent(sc.nextLine());
        while (!Validation.checkName(services.getType_of_rent())) {
            System.out.println("Type rent is invalid.Please try again!!! ");
            System.out.println("Enter type_of_rent:");
            services.setType_of_rent(sc.nextLine());
        }
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
        String content = "";
        String errorMessage = "";
        Services villa = new Villa();
        villa = addNewService(villa);
        System.out.println("Enter room standard :");
        ((Villa) villa).setRoom_standard(sc.nextLine());
        while (!Validation.checkName(((Villa) villa).getRoom_standard())) {
            System.out.println("Room standard is invalid. Please try a gain!!!");
            System.out.println("Enter room standard :");
            ((Villa) villa).setRoom_standard(sc.nextLine());
        }
        System.out.println("Enter description of other amenities:");
        ((Villa) villa).setDescription_of_other_amenities(sc.nextLine());

        content = "Enter number of floors: ";
        errorMessage = "Number of floors is invalid(Number of floors >0,Number of floors must be a integer).Please try again!!!";
        ((Villa) villa).setNumber_of_floors(Validation.checkValidNumberInteger(content, errorMessage));
        while (((Villa) villa).getNumber_of_floors() <= 0) {
            System.out.println(errorMessage);
            ((Villa) villa).setNumber_of_floors(Validation.checkValidNumberInteger(content, errorMessage));
        }

        content = "Enter Area Pool: ";
        errorMessage = "Area pool is invalid(Area>30,Area must be a double).Please try again!!!";

        ((Villa) villa).setPool_area(Validation.checkValidNumberDouble(content, errorMessage));
        while (((Villa) villa).getPool_area() <= 30) {
            System.out.println(errorMessage);
            ((Villa) villa).setPool_area(Validation.checkValidNumberDouble(content, errorMessage));
        }

        // write file
        //Khắc phục isue ko lưu dc nhiều villa trong file
        // trước khi thực thêm vào file chúng ta phải lấy ra toàn bộ danh sách các villa trong file villa ra listvilla
        ArrayList<Villa> villaArrayList = new ArrayList<Villa>();
        // sau khi thực hiện xong thì thực hiên thêm vào sanh sách listvilla đó
        villaArrayList.add((Villa) villa);
        // sau đó lưu listvilla vào file villa.csv
        WriteAndReadyFileCSV.writeVillaToFileCSV(villaArrayList);
        System.out.println("\nAdd Villa: " + villa.getName() + " Successfully!!!");
        backBackToMenu();
    }

    private static void addNewHouse() {
        String content = "";
        String errorMessage = "";
        Services house = new House();
        house = addNewService(house);
        //tiêu chuẩn phòng
        System.out.println("Enter room standard :");
        ((House) house).setRoom_standard(sc.nextLine());
        while (!Validation.checkName(((House) house).getRoom_standard())) {
            System.out.println("Room standard is invalid. Please try a gain!!!");
            System.out.println("Enter room standard :");
            ((House) house).setRoom_standard(sc.nextLine());
        }
        // mô tả các tiện nghi khác
        System.out.println("Enter description of other amenities:");
        ((House) house).setDescription_of_other_amenities(sc.nextLine());
        //Số tầng
        content = "Enter number of floors: ";
        errorMessage = "Number of floors is invalid(Number of floors >0,Number of floors must be a integer).Please try again!!!";
        ((House) house).setNumber_of_floors(Validation.checkValidNumberInteger(content, errorMessage));
        while (((House) house).getNumber_of_floors() <= 0) {
            System.out.println(errorMessage);
            ((House) house).setNumber_of_floors(Validation.checkValidNumberInteger(content, errorMessage));
        }
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
            System.out.println(villa.showInfo());
            System.out.println("\n____________________");
        }
    }

    private static void showAllHouse() {
        ArrayList<House> houseArrayList = WriteAndReadyFileCSV.getHouseFromCSV();
        // System.out.println(h.size());
        for (House house : houseArrayList) {
            System.out.println("\n____________________");
            System.out.println(house.showInfo());
            System.out.println("\n____________________");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> roomArrayList = WriteAndReadyFileCSV.getRoomFromCSV();
        // System.out.println(h.size());
        for (Room room : roomArrayList) {
            System.out.println("\n____________________");
            System.out.println(room.showInfo());
            System.out.println("\n____________________");
        }
    }

    private static void addNewCustomer() {
        Customer customer = new Customer();
        //Id

        customer.setId(UUID.randomUUID().toString().replace("-", ""));
        //add nameCUs
        customer.setName_customer(NameException.validateNameCustomer());
        //add ngay sinh thuc nghiem dung catch bat throws
        while (true) {
            try {
                customer.setBirthday(BirthdayException.validBirthday("Enter birthday", "EMail invalid!!!Please try again."));
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        /// add gender



    }
}


//    private static void showInformationCustomer() {
//
//    }


