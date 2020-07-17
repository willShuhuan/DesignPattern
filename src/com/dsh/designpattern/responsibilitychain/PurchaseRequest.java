package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class PurchaseRequest {
    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int id, int type, float price) {
        this.type = type;
        this.id = id;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
