package CaseStudent.Model;

public class Employee {
    private String fullNameEmp;
    private int ageEmp;
    private String addressEmp;

    @Override
    public String toString() {
        return
                "Full Name: " + this.fullNameEmp +
                        "\nAge: " + this.ageEmp +
                        "\nAddress: " + this.addressEmp;
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
}
