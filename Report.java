import java.util.List;
import java.util.Calendar;
import java.util.Date;

public class Report {

    // Tổng doanh thu theo từng người
    public static void generateRevenueByCustomer(List<ServiceOrder> orders) {
        System.out.println("Revenue by Customer:");
        double customer1Revenue = 0;
        double customer2Revenue = 0;

        for (ServiceOrder order : orders) {
            if (order.getCustomer().getName().equals("Nguyen Thi Lan")) {
                customer1Revenue += order.getAmount();
            } else if (order.getCustomer().getName().equals("Tran Minh Tu")) {
                customer2Revenue += order.getAmount();
            }
        }

        System.out.println("Nguyen Thi Lan: " + customer1Revenue);
        System.out.println("Tran Minh Tu: " + customer2Revenue);
    }

    // Tổng doanh thu theo ngày
    public static void generateRevenueByDate(List<ServiceOrder> orders, Date targetDate) {
        double totalRevenueByDate = 0;

        // Chuyển targetDate thành một đối tượng Calendar để so sánh ngày
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(targetDate);
        int targetYear = calendar.get(Calendar.YEAR);
        int targetMonth = calendar.get(Calendar.MONTH);
        int targetDay = calendar.get(Calendar.DAY_OF_MONTH);

        for (ServiceOrder order : orders) {
            calendar.setTime(order.getOrderDate());
            int orderYear = calendar.get(Calendar.YEAR);
            int orderMonth = calendar.get(Calendar.MONTH);
            int orderDay = calendar.get(Calendar.DAY_OF_MONTH);

            if (orderYear == targetYear && orderMonth == targetMonth && orderDay == targetDay) {
                totalRevenueByDate += order.getAmount();
            }
        }

        System.out.println("Revenue for the date " + targetDate + ": " + totalRevenueByDate);
    }

    // Tổng doanh thu tháng
    public static void generateRevenueByMonth(List<ServiceOrder> orders, int targetMonth, int targetYear) {
        double totalRevenueByMonth = 0;

        for (ServiceOrder order : orders) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(order.getOrderDate());
            int orderYear = calendar.get(Calendar.YEAR);
            int orderMonth = calendar.get(Calendar.MONTH);

            if (orderYear == targetYear && orderMonth == targetMonth) {
                totalRevenueByMonth += order.getAmount();
            }
        }

        System.out.println("Revenue for " + targetMonth + "/" + targetYear + ": " + totalRevenueByMonth);
    }

    // Báo cáo tổng doanh thu của tất cả các đơn hàng
    public static void generateRevenueReport(List<ServiceOrder> orders) {
        double totalRevenue = 0;
        for (ServiceOrder order : orders) {
            totalRevenue += order.getAmount();
        }
        System.out.println("Total Revenue: " + totalRevenue);
    }

    // Báo cáo thống kê đơn hàng
    public static void generateOrderStatistics(List<ServiceOrder> orders) {
        System.out.println("Order Statistics:");
        for (ServiceOrder order : orders) {
            System.out.println(order);
        }
    }
}
