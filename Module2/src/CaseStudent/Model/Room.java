package CaseStudent.Model;

public class Room extends Services {
    private  String free_service_included;

    public Room(String free_service_included) {
        this.free_service_included = free_service_included;
    }

    public Room(String id, String name, double area_used, double rental_costs, int maximum_number_of_people, String type_of_rent, String free_service_included) {
        super(id, name, area_used, rental_costs, maximum_number_of_people, type_of_rent);
        this.free_service_included = free_service_included;
    }

    public Room() {

    }

    public String getFree_service_included() {
        return free_service_included;
    }
    public void setFree_service_included(String free_service_included) {
        this.free_service_included = free_service_included;
    }
    @Override
    public String showInfo() {
        return "\nName Service :"+getName()+
                "\nArea Used :"+getArea_used()+
                "\nRental costs  :"+getRental_costs()+
                "\nMaxinum number of the people :"+getMaximum_number_of_people()+
                "\nType of rent :"+getType_of_rent()+
                "Free service included : "+  this.free_service_included;

}
}
