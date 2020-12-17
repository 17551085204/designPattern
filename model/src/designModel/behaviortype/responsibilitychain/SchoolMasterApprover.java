/*
 * @Author hdk
 * @QQ:2890241339
 * @Date 2020/12/17 0017
 **/
package designModel.behaviortype.responsibilitychain;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()>30000  ){
            System.out.println("请求id="+purchaseRequest.getId()+"被"+this.name+"处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}

