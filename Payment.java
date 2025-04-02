package ut.edu.project.Models;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount; // Số tiền thanh toán

    private String method; // Phương thức thanh toán (Ví dụ: Credit Card, PayPal, Cash)

    private String status; // Trạng thái thanh toán (Pending, Completed, Failed)

    private LocalDateTime paymentDate; // Ngày thanh toán

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer; // Khách hàng thực hiện thanh toán

    @ManyToOne
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment; // Thanh toán gắn với cuộc hẹn

    public Payment() {}

    public Payment(Double amount, String method, String status, LocalDateTime paymentDate, Customer customer, Appointment appointment) {
        this.amount = amount;
        this.method = method;
        this.status = status;
        this.paymentDate = paymentDate;
        this.customer = customer;
        this.appointment = appointment;
    }

    // Getters và Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}

