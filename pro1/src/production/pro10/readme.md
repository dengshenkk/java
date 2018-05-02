# 内部类
	- 在一个类中定义类
## 描述
	- 在内部类中可以访问外部类的成员(包括私有)
	- 在外部类中需要访问内部类必须创建对象
## 内部类的位置
- 成员内部类
- 局部内部类
```java
class person {
	
	// 成员内部类
	class inner {}
	
	
	// 局部内部类
	public void method() {
		
		class inner {}
	}
}
```