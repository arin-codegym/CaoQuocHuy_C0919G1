package CaseStudent.Model;

import java.util.Stack;

public class FilingCabinets {
    public FilingCabinets() {
    }
    public static Stack<Employee> addToFilingCabinets() {
        // nhap thong tin nhan vien
        Employee employee1 = new Employee("Cao Quốc Huy", 23, "Quảng Nam", 1);
        Employee employee2 = new Employee("Nguyễn Văn Toàn", 25, "Da Nang", 2);
        Employee employee3 = new Employee("Chánh", 25, "Kon tum", 3);
        Employee employee4 = new Employee("Tuấn", 26, "Đà Nẵng", 4);
        Employee employee5 = new Employee("Trân Viết Dũng", 28, "Nghệ An", 5);
        Employee employee6 = new Employee("Dang Ngoc L", 29, "Hue", 6);
        Employee employee7 = new Employee("Nguyen Van A", 21, "Sai Gon", 7);
        Employee employee8 = new Employee("Tran Thi T", 30, "Quang Binh", 8);
        Employee employee9 = new Employee("Le Van C", 24, "Quang Nam", 9);
        Employee employee10 = new Employee("Tran Q", 27, "Ha Noi", 10);

        Stack<Employee> filingCabinets = new Stack<Employee>();
        filingCabinets.push(employee1);
        filingCabinets.push(employee9);
        filingCabinets.push(employee3);
        filingCabinets.push(employee4);
        filingCabinets.push(employee5);
        filingCabinets.push(employee7);
        filingCabinets.push(employee8);
        filingCabinets.push(employee2);
        filingCabinets.push(employee10);
        filingCabinets.push(employee6);
        return filingCabinets;
    }


}
