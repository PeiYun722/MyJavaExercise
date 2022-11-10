import java.util.*;
public class Game_1A2B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] bomb=new String[4];
		Arrays.fill(bomb, "10");//陣列預設值為0，避免產生出的值沒有0，故先將陣列填補大於9的數字
		for(int i=0;i<4;i++) {
			String temp=Integer.toString((int)(Math.random()*10));
			repeat:
			while(true) {
				for(String num:bomb) {
					if(num.equals(temp)) {
						temp=Integer.toString((int)(Math.random()*10));
						continue repeat;
					}
				}
				break;
			}	
			bomb[i]=temp;
		}//產生4個由0~9組成的數字，且不能重複
		String newBomb=String.join("", bomb);
		for(String a:bomb)System.out.print(a);
		System.out.println();

		System.out.println();
		System.out.print("1A2B遊戲開始!!"
				+ "\n規則:答案由四個0~9的數字組成，且不能重複。"
				+ "\n數字正確且位置正確，結果為A"
				+ "\n數字正確但位置不對，結果為B"
				+ "\n\n遊戲開始，請輸入您的猜測數字:");//規則
		
		repeat2:
		while(true) {
			System.out.print("請輸入數字:");
			String ans=input.nextLine();
			int A=0;
			int B=0; 
			
			//比對是否為四位數
			if(ans.length()!=4) {
				System.out.println("輸入數值不為四位數!");
				continue repeat2;
			}
			//比對是否為數值資料
			for(int i=0;i<ans.length();i++) {
				if(Character.isDigit(ans.charAt(i))==false) {
					System.out.println("輸入數值不能為非數字!");
					continue repeat2;
				}
			}
			//比對是否有重複數字
			for(int i=0;i<ans.length()-1;i++) {
				for(int a=i+1;a<ans.length();a++) {
					if(ans.charAt(i)==ans.charAt(a)) {
						System.out.println("輸入數值不能重複!");
						continue repeat2;
					}
				}
			}
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					 if(ans.charAt(i)==newBomb.charAt(i)&&ans.charAt(i)==newBomb.charAt(j)) {
						A+=1;
						continue;
					}else if(ans.charAt(i)==newBomb.charAt(j)) {
						B+=1;
					}
				}
			}
			System.out.println(A+"A"+B+"B");
			if(A==4) {
				System.out.print("正確答案!!");
				break;
			} else continue repeat2;
		}	
	
	}
}
