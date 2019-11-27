package CaseStudent.Model;



public class House extends Architecture {

    public House() {
    }

    public House(String id, String name, double area_used, double rental_costs, int maximum_number_of_people, String type_of_rent, String room_standard, String description_of_other_amenities, int number_of_floors) {
        super(id, name, area_used, rental_costs, maximum_number_of_people, type_of_rent, room_standard, description_of_other_amenities, number_of_floors);
    }

    @Override
    public String showInfor() {
        return super.showInfor();

    }
}
