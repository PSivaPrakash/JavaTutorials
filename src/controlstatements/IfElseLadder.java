package controlstatements;

public class IfElseLadder {

	public static void main(String[] args) {
		int a = 30;
		String gender = "female";
		if(a<35) {
			if(gender == "male") {
       System.out.println("fail");
	}
			else  {
				System.out.println("you are not failed");
			}	
		}else if(a>=35 && a<=49) {
		System.out.println("average");
	}else if(a>=50 && a<=74) {
		System.out.println("good");
	}else if(a>=75 && a<=79) {
		System.out.println("awesome");
	}else if(a>=80 && a<=89) {
		System.out.println("super awesome");
	}else if(a>=90 && a<=94) {
		System.out.println("genius");
	}else if(a>=95 && a<=99) {
		System.out.println("out of this world");
	}else if(a==100) {
		System.out.println("god");
	}else  {
		System.out.println("absent");
	}

}
}