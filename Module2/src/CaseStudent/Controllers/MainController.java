package CaseStudent.Controllers;

import CaseStudent.Commons.*;
import CaseStudent.Model.*;

import java.util.*;

public class MainController {
    public static String REGEX = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
    private static Scanner sc = new Scanner(System.in);
    private static Queue<Customer> customerQueueBookingTicket = new LinkedList<Customer>();

    public static void disPlayMainMenu() {
        System.out.println("\n1.Add New Services." +
                "\n2.Show Services." +
                "\n3.Add New Customer" +
                "\n4.Show Information Customer" +
                "\n5.Exit" +
                "\n6.Show Information Employee" +
                "\n7.Booking MovieTicket 4D " +
                "\n8.Find Employee" +
                "\n9.Exit" + "\n" +
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
                showInformationCustomer();
            case 5:
                addNewBookingResort();
                break;
            case 6:
                showInformationEmployees();
                break;
            case 7:
                addBookingMovieTicket4D();
                break;
            case 8:
                findInforEmployee();
                break;
            case 9:
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

    // add service
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

    // show service
    private static void showServices() {
        System.out.println("__________" +
                "\n1. Show All Villa" +
                "\n2. Show All House" +
                "\n3. Show All Room" +
                "\n4.Show All Villa Not Duplicate" +
                "\n5.Show All House Not Duplicate" +
                "\n6.Show All Room Not Duplicate" +
                "\n7. Back to menu" +
                "\n8. Exit"
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
                showAllVillaNotDuplicate();
                backBackToMenu();
                break;
            case 5:
                showAllHouseNotDuplicate();
                backBackToMenu();
                break;
            case 6:
                showAllRoomNotDuplicate();
                backBackToMenu();
                break;
            case 7:
                backBackToMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("\nError!!!");
                backBackToMenu();
        }
    }

    // add new villa
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

    // add house
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

    // add room
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

    // show villa
    private static void showAllVilla() {
        ArrayList<Villa> villaArrayList = WriteAndReadyFileCSV.getVillaFromCSV();
        System.out.println(villaArrayList.size());
        for (Villa villa : villaArrayList) {
            System.out.println("\n____________________");
            System.out.println(villa.showInfo());
            System.out.println("\n____________________");
        }
    }

    // show house
    private static void showAllHouse() {
        ArrayList<House> houseArrayList = WriteAndReadyFileCSV.getHouseFromCSV();
        // System.out.println(h.size());
        for (House house : houseArrayList) {
            System.out.println("\n____________________");
            System.out.println(house.showInfo());
            System.out.println("\n____________________");
        }
    }

    // show room
    private static void showAllRoom() {
        ArrayList<Room> roomArrayList = WriteAndReadyFileCSV.getRoomFromCSV();
        // System.out.println(h.size());
        for (Room room : roomArrayList) {
            System.out.println("\n____________________");
            System.out.println(room.showInfo());
            System.out.println("\n____________________");
        }
    }

    // add customer -----------------------------------------------------------------------------------------------------------
    private static void addNewCustomer() {
        Customer customer = new Customer();
        //Id random
        customer.setId(UUID.randomUUID().toString().replace("-", ""));
        //add nameCUs exception no throws
//        customer.setName_customer(NameException.validateNameCustomer());
//        //add ngay sinh thuc nghiem dung catch bat throws
        while (true) {
            try {
                customer.setBirthday(BirthdayException.validBirthday("Enter birthday", "EMail invalid!!!Please try again."));
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
//        /// add gender
        while (true) {
            try {
                customer.setGender(GenderException.validGender("enter gender :", "Error try again."));
                break;
            } catch (GenderException ex) {
                System.out.println(ex.getMessage());
            }
        }
        // add ID
        customer.setId_card(Validation.checkValidNumberInteger("Enter Id Card Customer: ", "ID invalid"));
        while (customer.getId_card() < 100000000 || customer.getId_card() >= 1000000000) {
            System.out.println("Id Card Is Invalid. Id Card Mus Be Integer (100.000.000 - 999.999.999) !!!");
            customer.setId_card(Validation.checkValidNumberInteger("Enter Id Card Customer: ", "ID invalid"));
        }
        // add Email
        customer.setEmail(EmailException.validDateEmail());
        // add phone
        customer.setPhone_number(Validation.checkValidNumberInteger("Enter phone-number :", "Phone-number invalid."));
        // add type
        customer.setGuest_type(Validation.NameException("Enter Type Customer: ", "Customer Type is invalid, please try again!"));
        //add address

//-----------------------------------------------------------------//

        //Write File Customer.CSV
        System.out.println("Enter address : ");
        customer.setAddress(sc.nextLine());
        ArrayList<Customer> customers = WriteAndReadyFileCSV.getCustomerFromCSV();
        customers.add(customer);
        WriteAndReadyFileCSV.writeCustomerToFileCsv(customers);
        System.out.println("\nAdd Customer: " + customer.getName_customer() + " Successfully !!!");
        ScannerUtils.scanner.nextLine();
        backBackToMenu();

    }

    //Show Information Customer
    private static void showInformationCustomer() {
        ArrayList<Customer> listCustomers = WriteAndReadyFileCSV.getCustomerFromCSV();
        //Sap xep alpha B theo ten
        listCustomers.sort(new SoftName());
        for (Customer customer : listCustomers) {
            System.out.println("\n---------------------------------------------");
            System.out.println(customer.showInfo());
            System.out.println("\n---------------------------------------------");
        }
    }

    // add booking

    private static void addNewBookingResort() {
        ArrayList<Customer> listCustomers = WriteAndReadyFileCSV.getCustomerFromCSV();
        //Sap xep alpha B theo ten
        listCustomers.sort(new SoftName());
        int i = 1;
        for (Customer customer : listCustomers) {
            System.out.println("\n---------------------------------------------");
            System.out.println("No: " + i);
            System.out.println(customer.showInfo());
            System.out.println("\n---------------------------------------------");
            i++;
        }
        System.out.println("Choose Customer Booking");
        Customer customer = new Customer();
        customer = listCustomers.get(ScannerUtils.scanner.nextInt() - 1);
        System.out.println("\n1.Booking Villa." +
                "\n2.Booking House." +
                "\n3.Booking Room.");
        System.out.println("Choose Services Booking");
        int choose = ScannerUtils.scanner.nextInt();
        switch (choose) {
            case 1:
                i = 1;
                ArrayList<Villa> listVillas = WriteAndReadyFileCSV.getVillaFromCSV();
                for (Villa villa : listVillas) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(villa.showInfo());
                    System.out.println("\n---------------------------------------------");
                    i++;
                }
                System.out.println("Choose Villa Booking");
                Villa villa = listVillas.get(ScannerUtils.scanner.nextInt() - 1);
                customer.setServices(villa);
                break;
            case 2:
                i = 1;
                ArrayList<House> listHouses = WriteAndReadyFileCSV.getHouseFromCSV();
                for (House house : listHouses) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(house.showInfo());
                    System.out.println("\n---------------------------------------------");
                    i++;
                }
                System.out.println("Choose House Booking");
                House house = listHouses.get(ScannerUtils.scanner.nextInt() - 1);
                customer.setServices(house);
                break;
            case 3:
                i = 1;
                ArrayList<Room> listRooms = WriteAndReadyFileCSV.getRoomFromCSV();
                for (Room room : listRooms) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(room.showInfo());
                    System.out.println("\n---------------------------------------------");
                    i++;
                }
                System.out.println("Choose Room Booking");
                Room room = listRooms.get(ScannerUtils.scanner.nextInt() - 1);
                customer.setServices(room);
                break;
            default:
                backBackToMenu();
                break;
        }
        ArrayList<Customer> listBooking = WriteAndReadyFileCSV.getBookingFromCSV();
        listBooking.add(customer);
        WriteAndReadyFileCSV.writeBookingToFileCsv(listBooking);
        System.out.println("\nAdd Booking for : " + customer.getName_customer() + " Successfully !!!");
        ScannerUtils.scanner.nextLine();
        backBackToMenu();
    }

    // show information Employee
    private static void showInformationEmployees() {
        Map<Integer, Employee> map = new HashMap<>();
        map.put(100, new Employee("Nguyễn Thành Kiên", 25, "Đà Nẵng"));
        map.put(101, new Employee("Nguyễn Văn Toàn", 22, "Quảng Nam"));
        map.put(102, new Employee("Lê Văn Hải", 20, "Hà Nội"));
        map.put(103, new Employee("Đoàn Phước Trung", 18, "Vũng Tàu"));
        map.put(104, new Employee("Đoàn Ngọc Sơn", 18, "Tây Nguyên"));
        map.put(105, new Employee("Đoàn Văn Tùng", 28, "Tây Ninh"));
        map.put(106, new Employee("Trần Cường", 24, "Bắc Giang"));
        map.put(107, new Employee("Trần Cường Tú", 24, "Huế"));
        map.put(108, new Employee("Trần Văn Tài", 34, "Quảng Trị"));
        map.put(109, new Employee("Trần Thanh", 32, "Quảng Ninh"));
        // show
        for (Map.Entry m : map.entrySet()) {
            System.out.println("Key: " + m.getKey() + "\n" + m.getValue().toString());
        }
    }

    private static void showAllVillaNotDuplicate() {
        Set<String> set = WriteAndReadyFileCSV.getTreeSetService(WriteAndReadyFileCSV.pathVilla);
        for (String nameService : set) {
            System.out.println(nameService);
        }
    }

    private static void showAllHouseNotDuplicate() {
        Set<String> set = WriteAndReadyFileCSV.getTreeSetService(WriteAndReadyFileCSV.pathHouse);
        for (String nameService : set) {
            System.out.println(nameService);
        }
    }

    private static void showAllRoomNotDuplicate() {
        Set<String> set = WriteAndReadyFileCSV.getTreeSetService(WriteAndReadyFileCSV.pathRoom);
        for (String nameService : set) {
            System.out.println(nameService);
        }
    }

    private static void addBookingMovieTicket4D() {
        // lua chon customer booking ticket
        try {
            ArrayList<Customer> listCustomer = WriteAndReadyFileCSV.getCustomerFromCSV();
            listCustomer.sort(new SoftName());
            int i = 1;
            for (Customer customer : listCustomer) {
                System.out.println("============");
                System.out.println("No " + i);
                customer.showInfo();
                System.out.println("============");
                i++;
            }
            System.out.println("Chose customer want booking: ");
            Customer customer = listCustomer.get((sc.nextInt() - 1));
            customerQueueBookingTicket.add(customer);
            System.out.println("====Booking successfully====");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("customer not exist!!!Try again");
            addBookingMovieTicket4D();
        }
    }

    // ham tim kiem employee trong stack
    private static void findInforEmployee() {
        Stack<Employee> employeeStack = FilingCabinets.addToFilingCabinets();
        System.out.print("Enter key of employee: ");
        int key = sc.nextInt();
        try {
            while (true) {
                if (employeeStack.peek().getNumerical_order() != key) {
                    employeeStack.pop();
                } else {
                    System.out.println(employeeStack.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException ex) {
            System.out.print("key invalid, please try again");
            findInforEmployee();
        }
    }

}





