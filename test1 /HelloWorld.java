// Khai báo lớp chính
public class HelloWorld {

    // Phương thức main - điểm bắt đầu của chương trình Java
    public static void main(String[] args) {
        // In một thông điệp chào mừng ra màn hình
        System.out.println("Hello, World!");

        // Khai báo và khởi tạo các biến số học
        int a = 5;
        int b = 3;

        // Thực hiện phép tính cộng và in kết quả
        int sum = a + b;
        System.out.println("Tổng của " + a + " và " + b + " là: " + sum);

        // Thực hiện phép tính trừ và in kết quả
        int difference = a - b;
        System.out.println("Hiệu của " + a + " và " + b + " là: " + difference);

        // Thực hiện phép tính nhân và in kết quả
        int product = a * b;
        System.out.println("Tích của " + a + " và " + b + " là: " + product);

        // Thực hiện phép tính chia và in kết quả
        // Sử dụng (double) để ép kiểu để đảm bảo kết quả chính xác
        double quotient = (double) a / b;
        System.out.println("Thương của " + a + " và " + b + " là: " + quotient);

        // Kiểm tra số chẵn lẻ và in kết quả
        if (a % 2 == 0) {
            System.out.println(a + " là số chẵn.");
        } else {
            System.out.println(a + " là số lẻ.");
        }

        // Vòng lặp for đơn giản
        System.out.println("Các số từ 1 đến 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
