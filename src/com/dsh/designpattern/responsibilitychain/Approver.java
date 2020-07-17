package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public abstract class Approver {

    protected Approver approver;//下一个处理者
    protected String name;//名字

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    abstract void processRequest(PurchaseRequest request);
}
