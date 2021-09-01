package lk.ijse.pos.dto;

import lk.ijse.pos.entity.OrderDetails;
import java.util.ArrayList;
import java.util.Date;

public class OrdersDTO {

    String id;
    Date date;
    String customerId;

    ArrayList<OrderDetailsDTO> orderDetails = new ArrayList<>();

    public OrdersDTO() {
    }

    public OrdersDTO(String id, Date date, String customerId) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
    }

    public OrdersDTO(String id, Date date, String customerId, ArrayList<OrderDetailsDTO> orderDetails) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.orderDetails = orderDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<OrderDetailsDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetailsDTO> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", customerId='" + customerId + '\'' +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
