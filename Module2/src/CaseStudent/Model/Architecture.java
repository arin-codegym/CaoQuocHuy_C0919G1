package CaseStudent.Model;

public class Architecture extends Services {
    private String room_standard;
    private String description_of_other_amenities;
    private int number_of_floors;

    public String getRoom_standard() {
        return room_standard;
    }

    public void setRoom_standard(String room_standard) {
        this.room_standard = room_standard;
    }

    public String getDescription_of_other_amenities() {
        return description_of_other_amenities;
    }

    public void setDescription_of_other_amenities(String description_of_other_amenities) {
        this.description_of_other_amenities = description_of_other_amenities;
    }

    public int getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(int number_of_floors) {
        this.number_of_floors = number_of_floors;
    }


    public Architecture(String id, String name, double area_used, double rental_costs, int maximum_number_of_people, String type_of_rent, String room_standard, String description_of_other_amenities, int number_of_floors) {
        super(id, name, area_used, rental_costs, maximum_number_of_people, type_of_rent);
        this.room_standard = room_standard;
        this.description_of_other_amenities = description_of_other_amenities;
        this.number_of_floors = number_of_floors;
    }

    public Architecture() {
    }

    @Override
    public String showInfor() {
        return "\nID :" + getId() +
                "\nName Service :" + getName() +
                "\nArea Used :" + getArea_used() +
                "\nRental costs  :" + getRental_costs() +
                "\nMaxinum number of the people :" + getMaximum_number_of_people() +
                "\nType of rent :" + getType_of_rent() +
                "\nRoom standard :" + this.room_standard +
                "\nDescription of ohter amenities:" + this.description_of_other_amenities +
                "\nNumber of floors :" + this.number_of_floors
                ;
    }


}
