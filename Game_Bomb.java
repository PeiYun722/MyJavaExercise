import java.util.*;
public class Game_Bomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int bomb=(int)(Math.random()*99+1);
		int max=100;
		int min=1;
		int times=1;
		System.out.print("�п�J�Ʀr:");
		int num=input.nextInt();
		while(!(num==bomb)) {
			if(num<=min||num>=max) {
				System.out.println("��J���~�A��Ƥ���"+min+"��"+max+"�����A"+"\n"+"�ЦA��J�@��");
				num=input.nextInt();
			}else if(num<=bomb) {
				System.out.println("�Ʀr����"+num+"��"+max+"����");
				min=num;
				times+=1;
				System.out.println("�ЦA��J�@��");
				num=input.nextInt();
				
			}else if(num>=bomb){
				System.out.println("�Ʀr����"+min+"��"+num+"����");	
				max=num;
				times+=1;
				System.out.println("�ЦA��J�@��");
				num=input.nextInt();
			}
		
		}
		System.out.println();
		System.out.print("���T����!!"+"\n"+"�q������:"+times+"��");	

	}
		

}


