/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.composite;
//import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        // college中包含的department
        System.out.println("------"+getName()+"---------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }


}
