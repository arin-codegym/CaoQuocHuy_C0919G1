package MangVaPhuongThucJava;

import java.util.Scanner;

public class HinhTron {

    /**
     * Demo cách khai báo các constructor,
     * các thuộc tính và phương thức vẫn được giữ nguyên như bài 19,
     * bạn hãy chú ý các constructor được comment
     */

    final float PI = 3.14f;

    float r;
    float cv;
    float dt;

    // Một constructor, chú ý không có kiểu trả về,
    // và constructor này không có tham số truyền vào
    public HinhTron() {
        // Chúng ta khởi tạo gì đó sau
        nhapBanKinh();
    }

    // Một constructor khác, cũng không có kiểu trả về,
    // nhưng có một tham số truyền vào
    public HinhTron(float r) {
        // Chúng ta khởi tạo gì đó sau
        this.r = r;

    }

    public void nhapBanKinh() {
        System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * PI * r;
    }

    public void tinhDienTich() {
        dt = PI * r * r;
    }

    public void inChuVi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }

    public void inDienTich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
    public static void main(String[] args) {
        // Cách khai báo HinhTron dựa vào constructor thứ nhất
        HinhTron hinhTron1 = new HinhTron();

        // Cách khai báo HinhTron dựa vào constructor thứ hai
        HinhTron hinhTron2 = new HinhTron(10);

        // Tính toán và in ra kết quả cho hinhTron1
        System.out.println("======== Kết quả hinhTron1 ========");
        hinhTron1.tinhChuVi();
        hinhTron1.tinhDienTich();
        hinhTron1.inChuVi();
        hinhTron1.inDienTich();

        // Tính toán và in ra kết quả cho hinhTron2
        System.out.println("======== Kết quả hinhTron2 ========");
        hinhTron2.tinhChuVi();
        hinhTron2.tinhDienTich();
        hinhTron2.inChuVi();
        hinhTron2.inDienTich();
    }
}