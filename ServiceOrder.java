import java.util.Date;

public class ServiceOrder {
    private Customer customer;
    private Date orderDate;
    private double amount;
    private String serviceType;

    public ServiceOrder(Customer customer, Date orderDate, double amount, String serviceType) {
        this.customer = customer;
        this.orderDate = orderDate;
        this.amount = amount;
        this.serviceType = serviceType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "ServiceOrder{customer=" + customer + ", orderDate=" + orderDate + ", amount=" + amount + ", serviceType='" + serviceType + "'}";
    }
}
