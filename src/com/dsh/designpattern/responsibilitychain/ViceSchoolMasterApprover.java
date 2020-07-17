package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description 副校长
 */
public class ViceSchoolMasterApprover extends Approver{

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getPrice()>10000&&request.getPrice()<=30000){
            System.out.println("请求编号id="+request.getId()+" 被 "+this.name+"处理");
        }else {
            System.out.println(this.name+"无法处理，交给上一级处理 -> "+approver.name);
            approver.processRequest(request);
        }
    }

}
