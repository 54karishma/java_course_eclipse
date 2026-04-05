package _2_04_26;

public class constructorexample{
	constructorexample(){
		System.out.println("No parameterized constructor");
	}
	constructorexample(String name){
		System.out.println("one paramaterized constructor");
		System.out.println("name is :" +name);
		
	}
	constructorexample(int a,int b){
		this("karishma");
		System.out.println("two parameterized constructor");
		System.out.println("the age is:"+(a+b));
	}
	public static void main(String[] args) {
		//constructorexample c=new constructorexample();
		//constructorexample c1=new constructorexample("karishma");
		constructorexample c2=new constructorexample(10,12);
		
	}

}
