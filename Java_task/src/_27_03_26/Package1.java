package _27_03_26;

public class Package1 {
	String name;
	public void display(String name) {
		name=this.name;
		System.out.println(name);	
	}
	public static void main(String[] args) {
		Package1 p=new Package1();
		p.name="karishma";
		p.display("komma");		
	}
}
