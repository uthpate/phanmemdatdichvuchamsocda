public class Feedback {
    private Customer customer;
    private int rating; // 1 to 5 stars
    private String comment;

    public Feedback(Customer customer, int rating, String comment) {
        this.customer = customer;
        this.rating = rating;
        this.comment = comment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Feedback{customer=" + customer + ", rating=" + rating + ", comment='" + comment + "'}";
    }
}
