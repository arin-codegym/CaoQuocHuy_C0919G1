package CaseStudent.Model;

public class Villa extends Architecture {
    private double pool_area;

    public Villa() {
    };

    public Villa(String id, String name, double area_used, double rental_costs, int maximum_number_of_people, String type_of_rent, String room_standard, String description_of_other_amenities, int number_of_floors, double pool_area) {
        super(id, name, area_used, rental_costs, maximum_number_of_people, type_of_rent, room_standard, description_of_other_amenities, number_of_floors);
        this.pool_area = pool_area;
    }

    public Villa(double pool_area) {
        this.pool_area = pool_area;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    @Override
    public String showInfo() {
        return super.showInfo()+
                "\nPool Area :"+this.pool_area;
    }
}
