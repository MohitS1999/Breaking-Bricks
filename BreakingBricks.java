import java.util.*;
public class BreakingBricks{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int s=sc.nextInt();
			int w1=sc.nextInt();
			int w2=sc.nextInt();
			int w3=sc.nextInt();
			if(w1+w2+w3<=s){
				System.out.println("1");
			}
			else if(w1+w2<=s||w2+w3<=s){
				System.out.println("2");
			}
			else{
				System.out.println("3");
			}
		}
	}	
}	