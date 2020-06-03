package com.sk.swing.biz;

import lombok.Data;

@Data
public class OrderPlaced {
    String eventType;
    Long orderId;
    Long productId;
    int qty;
    String productName;

    public OrderPlaced(){
        this.eventType = OrderPlaced.class.getSimpleName();
    }
}
