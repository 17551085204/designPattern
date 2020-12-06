package principle.liskov.improve;

public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));
		System.out.println("-----------------------");
		B b = new B();
		//因为B类不再继承A类，所以耦合性降低，同时，通过聚合的方式，B中可以使用
        // A中的方法
		System.out.println("11-3+9=" + b.func2(11, 3));


	}

}

//创建一个更加基础的基类
class Base {
	//把更加基础的方法和成员写到Base类
}

// A类
class A extends Base {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class B extends Base {
	//如果B需要使用A类的方法,使用组合关系
	private A a = new A();

	//我们仍然想使用A的方法
	public int func2(int a, int b) {
		return this.a.func1(a, b)+9;
	}
}
