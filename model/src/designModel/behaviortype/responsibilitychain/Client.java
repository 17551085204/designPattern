/*
 * @Author hdk
 * @QQ:2890241339
 * @Date 2020/12/17 0017
 **/
package designModel.behaviortype.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 2000, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("系主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        schoolMasterApprover.processRequest(purchaseRequest);



    }


}
