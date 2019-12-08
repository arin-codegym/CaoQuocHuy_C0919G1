package CaseStudent.Model;

public class Employee implements Comparable<Employee> {
    private String fullNameEmp;
    private int ageEmp;
    private String addressEmp;
    private int numerical_order;

    private Employee(String fullNameEmp, int ageEmp, String addressEmp, int numerical_order) {
        this.fullNameEmp = fullNameEmp;
        this.ageEmp = ageEmp;
        this.addressEmp = addressEmp;
        this.numerical_order = numerical_order;
    }

    public int getNumerical_order() {
        return numerical_order;
    }

    public void setNumerical_order(int numerical_order) {
        this.numerical_order = numerical_order;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "fullNameEmp='" + fullNameEmp + '\'' +
                ", ageEmp=" + ageEmp +
                ", addressEmp='" + addressEmp + '\'' +
                ", numerical_order=" + numerical_order +
                '}';
    }

    public String getFullNameEmp() {
        return fullNameEmp;
    }

    public void setFullNameEmp(String fullNameEmp) {
        this.fullNameEmp = fullNameEmp;
    }

    public int getAgeEmp() {
        return ageEmp;
    }

    public void setAgeEmp(int ageEmp) {
        this.ageEmp = ageEmp;
    }

    public String getAddressEmp() {
        return addressEmp;
    }

    public void setAddressEmp(String addressEmp) {
        this.addressEmp = addressEmp;
    }

    public Employee() {
    }

    public Employee(String fullNameEmp, int ageEmp, String addressEmp) {
        this.fullNameEmp = fullNameEmp;
        this.ageEmp = ageEmp;
        this.addressEmp = addressEmp;
    }

    @Override
    public int compareTo(Employee o) {
        return this.numerical_order;
    }
}
