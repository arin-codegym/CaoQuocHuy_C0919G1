package CauTrucDuLieuVaGiaiThuatCoBan.Generic;

public class KeyValueDemo {
    public static void main(String[] args) {
        // Tạo một đối tượng KeyValue
        // Integer: Số điện thoại (K = Integer)
        // String: Tên người dùng. (V = String).
        KeyValue<Integer, String> entry = new KeyValue<Integer, String>(12000111, "Tom");
        // Java hiểu kiểu trả về là Integer (K = Integer).
        Integer phone = entry.getKey();

        // Java hiểu kiểu trả về là String (V = String).
        String name = entry.getValue();

        System.out.println("Phone = " + phone + " / name = " + name);
        PhoneNameEntry entry1 = new PhoneNameEntry(2410,"huy");
        // Java hiểu kiểu trả về là Integer.


        // Java hiểu kiểu trả về là String.


        System.out.println("Phone = " + phone + " / name = " + name);



    }
}
