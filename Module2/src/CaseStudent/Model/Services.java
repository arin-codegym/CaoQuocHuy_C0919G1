package CaseStudent.Model;

public abstract class Services {
    private String id;
    private String name;
    private double area_used;
    private double rental_costs;
    private int maximum_number_of_people;
    private String type_of_rent;
    public Services() {
    };

    public Services(String id, String name, double area_used, double rental_costs, int maximum_number_of_people, String type_of_rent) {
        this.id = id;
        this.name = name;
        this.area_used = area_used;
        this.rental_costs = rental_costs;
        this.maximum_number_of_people = maximum_number_of_people;
        this.type_of_rent = type_of_rent;
    }

    public Services(String name, double area_used, double rental_costs, int maximum_number_of_people, String type_of_rent) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea_used() {
        return area_used;
    }

    public void setArea_used(double area_used) {
        this.area_used = area_used;
    }

    public double getRental_costs() {
        return rental_costs;
    }

    public void setRental_costs(double rental_costs) {
        this.rental_costs = rental_costs;
    }

    public int getMaximum_number_of_people() {
        return maximum_number_of_people;
    }

    public void setMaximum_number_of_people(int maximum_number_of_people) {
        this.maximum_number_of_people = maximum_number_of_people;
    }

    public String getType_of_rent() {
        return type_of_rent;
    }

    public void setType_of_rent(String type_of_rent) {
        this.type_of_rent = type_of_rent;
    }


    public abstract   String showInfo() ;

    }



