import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phone;
    private String email;
    private List<ServiceOrder> orderHistory;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<ServiceOrder> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(ServiceOrder order) {
        this.orderHistory.add(order);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', phone='" + phone + "', email='" + email + "'}";
    }
}
