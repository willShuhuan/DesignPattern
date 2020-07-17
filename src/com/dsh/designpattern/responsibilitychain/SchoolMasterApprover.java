package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description 校长
 */
public class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getPrice()>30000){
            System.out.println("请求编号id="+request.getId()+" 被 "+this.name+"处理");
        }else {
            System.out.println(this.name+"无法处理，交给下一级处理 -> "+approver.name);
            approver.processRequest(request);
        }
    }

}
