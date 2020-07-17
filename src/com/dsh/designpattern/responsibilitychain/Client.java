package com.dsh.designpattern.responsibilitychain;

/**
 * @author DSH
 * @date 2020/7/17
 * @description 职责链模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //创建一个审批请求
        PurchaseRequest request = new PurchaseRequest(1,1,13200);
        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
        //需要将各个审批节点的下一级设置好
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);
        //处理请求
        departmentApprover.processRequest(request);

    }
}
