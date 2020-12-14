/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.behaviortype.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    // 维护 一个集合
    private List<Person> persons=new LinkedList<>();
    
    // 增加
    public void attach(Person person){
        persons.add(person);
    }
    // 移除
    public void detach(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
        
    }

}
