package CaseStudent.Commons;

import CaseStudent.Model.Customer;

import java.util.Comparator;

public class SoftName implements Comparator<Customer> {
    @Override
    public int compare(Customer C1, Customer C2) {
        return C1.getName_customer().compareTo(C2.getName_customer());
    }
}
