import java.util.*;
public class Game_Bomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int bomb=(int)(Math.random()*99+1);
		int max=100;
		int min=1;
		int times=1;
		System.out.print("請輸入數字:");
		int num=input.nextInt();
		while(!(num==bomb)) {
			if(num<=min||num>=max) {
				System.out.println("輸入錯誤，資料介於"+min+"到"+max+"之間，"+"\n"+"請再輸入一次");
				num=input.nextInt();
			}else if(num<=bomb) {
				System.out.println("數字介於"+num+"到"+max+"之間");
				min=num;
				times+=1;
				System.out.println("請再輸入一次");
				num=input.nextInt();
				
			}else if(num>=bomb){
				System.out.println("數字介於"+min+"到"+num+"之間");	
				max=num;
				times+=1;
				System.out.println("請再輸入一次");
				num=input.nextInt();
			}
		
		}
		System.out.println();
		System.out.print("正確答案!!"+"\n"+"猜測次數:"+times+"次");	

	}
		

}


