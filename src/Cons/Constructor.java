package Cons;

public class Constructor {

	
	Constructor() {
		System.out.println("Saiprasad");
	}
	static void para (int a, String b) {
		System.out.println(a+b);
	}
	void cons () {
		int a=10,b=4,c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor v=new Constructor();
		para(10, "Saiprasad");
		v.cons();
		
	}

}
