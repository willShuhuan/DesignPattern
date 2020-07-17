package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description 学院审批人
 */
public class CollegeApprover extends Approver{

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getPrice()>5000&&request.getPrice()<=10000){
            System.out.println("请求编号id="+request.getId()+" 被 "+this.name+"处理");
        }else {
            System.out.println(this.name+"无法处理，交给上一级处理 -> "+approver.name);
            approver.processRequest(request);
        }
    }
}
