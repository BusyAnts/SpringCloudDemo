package com.cimc.cloud.entity;

import lombok.Data;

/**
 * @author chenz
 */
@Data
public class Order {
    private String id;
    private Double price;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;
}
