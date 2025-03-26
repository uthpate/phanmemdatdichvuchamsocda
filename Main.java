import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static List<Customer> customers = new ArrayList<>();
    private static List<ServiceOrder> orders = new ArrayList<>();

    public static void main(String[] args) {
        // Tạo khách hàng và đơn hàng mẫu
        createSampleData();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChọn hoạt động:");
            System.out.println("1. Xem thông tin khách hàng");
            System.out.println("2. Xem tất cả đơn hàng");
            System.out.println("3. Xem feedback");
            System.out.println("4. Xem báo cáo doanh thu");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewCustomerInfo();
                    break;
                case 2:
                    viewAllOrders();
                    break;
                case 3:
                    viewFeedback();
                    break;
                case 4:
                    viewRevenueReport();
                    break;
                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        } while (choice != 5);
    }

    // Tạo dữ liệu mẫu cho khách hàng và đơn hàng
    private static void createSampleData() {
        // Tạo khách hàng mẫu
        Customer customer1 = new Customer("Nguyen Thi Lan", "0123456789", "lan@gmail.com");
        Customer customer2 = new Customer("Tran Minh Tu", "0987654321", "tu@gmail.com");
        customers.add(customer1);
        customers.add(customer2);

        // Tạo đơn hàng mẫu
        ServiceOrder order1 = new ServiceOrder(customer1, new Date(), 200000, "Trang điểm cưới");
        ServiceOrder order2 = new ServiceOrder(customer2, new Date(), 150000, "Trang điểm sự kiện");
        ServiceOrder order3 = new ServiceOrder(customer2, new Date(), 300000, "Trang điểm sự kiện");

        // Thêm các đơn hàng vào danh sách đơn hàng
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
    }

    // Hiển thị thông tin khách hàng
    private static void viewCustomerInfo() {
        System.out.println("\nThông tin khách hàng:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    // Hiển thị tất cả các đơn hàng với tên khách hàng, ngày tháng và dịch vụ
    private static void viewAllOrders() {
        System.out.println("\nDanh sách tất cả các đơn hàng:");

        // Định dạng ngày tháng
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // Tạo một Map để nhóm đơn hàng theo khách hàng và ngày
        Map<String, String> groupedOrders = new HashMap<>();

        // Duyệt qua các đơn hàng và nhóm theo khách hàng và ngày
        for (ServiceOrder order : orders) {
            String customerName = order.getCustomer().getName();
            String orderDate = sdf.format(order.getOrderDate());
            String serviceType = order.getServiceType();
            double amount = order.getAmount();  // Tiền của đơn hàng

            // Tạo khóa cho nhóm là tên khách hàng + ngày
            String key = customerName + " " + orderDate;

            // Nếu đã có đơn hàng của khách hàng này vào ngày đó, thêm dịch vụ vào
            if (groupedOrders.containsKey(key)) {
                groupedOrders.put(key, groupedOrders.get(key) + ", " + serviceType + " (" + amount + " VND)");
            } else {
                // Nếu chưa có, tạo mới
                groupedOrders.put(key, serviceType + " (" + amount + " VND)");
            }
        }

        // In ra kết quả theo nhóm
        for (Map.Entry<String, String> entry : groupedOrders.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Hiển thị feedback từ khách hàng
    private static void viewFeedback() {
        System.out.println("\nDanh sách feedback:");
        Feedback feedback1 = new Feedback(customers.get(0), 5, "Dịch vụ rất tốt, sẽ quay lại!");
        Feedback feedback2 = new Feedback(customers.get(1), 4, "Trang điểm ổn, nhưng thời gian làm hơi lâu.");
        System.out.println(feedback1);
        System.out.println(feedback2);
    }

    // Hiển thị báo cáo doanh thu
    private static void viewRevenueReport() {
        System.out.println("\nGenerate Revenue Report:");
        Report.generateRevenueReport(orders);

        System.out.println("\nGenerate Revenue by Customer:");
        Report.generateRevenueByCustomer(orders);

        System.out.println("\nGenerate Revenue by Date:");
        Report.generateRevenueByDate(orders, new Date());

        System.out.println("\nGenerate Revenue by Month:");
        Report.generateRevenueByMonth(orders, 3, 2025);  // Doanh thu theo tháng 3, 2025 (tháng bắt đầu từ 0)
    }
}
