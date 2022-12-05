import java.util.Scanner;
public class menu1 {
	
	public static void main(String[] args) {
		int choice;
		String order;
		Scanner sc = new Scanner(System.in);
		System.out.println("menu");
		System.out.println("1.tea");
		System.out.println("2.cold drinks");
		System.out.println("3.nargile");
		System.out.println("Enter choice(1-3):");
		choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			order="tea";
			break;
		case 2 :
			order="cold drinks";
			break;
		case 3 :
			order="nargile";
			break;
			default:
				order="not in menu";
 		}
		//output
		
		System.out.println("yourorder:"+order);
	}

	
	
	
}
