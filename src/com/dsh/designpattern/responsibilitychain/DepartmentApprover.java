package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description 系审批人
 */
public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name) {
        super(name);
    }


    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getPrice()<=5000){
            System.out.println("请求编号id="+request.getId()+" 被 "+this.name+"处理");
        }else {
            System.out.println(this.name+"无法处理，交给上一级处理 -> "+approver.name);
            approver.processRequest(request);
        }
    }

}
