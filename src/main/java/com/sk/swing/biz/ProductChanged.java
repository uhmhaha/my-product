package com.sk.swing.biz;

import lombok.Data;

@Data
public class ProductChanged {
    String eventType;
    Long productId;
    String productName;
    int productStock;

    public ProductChanged() {
        this.eventType = this.getClass().getSimpleName();
    }
}
