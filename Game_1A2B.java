import java.util.*;
public class Game_1A2B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] bomb=new String[4];
		Arrays.fill(bomb, "10");//�}�C�w�]�Ȭ�0�A�קK���ͥX���ȨS��0�A�G���N�}�C��ɤj��9���Ʀr
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
		}//����4�ӥ�0~9�զ����Ʀr�A�B���୫��
		String newBomb=String.join("", bomb);
		for(String a:bomb)System.out.print(a);
		System.out.println();

		System.out.println();
		System.out.print("1A2B�C���}�l!!"
				+ "\n�W�h:���ץѥ|��0~9���Ʀr�զ��A�B���୫�ơC"
				+ "\n�Ʀr���T�B��m���T�A���G��A"
				+ "\n�Ʀr���T����m����A���G��B"
				+ "\n\n�C���}�l�A�п�J�z���q���Ʀr:");//�W�h
		
		repeat2:
		while(true) {
			System.out.print("�п�J�Ʀr:");
			String ans=input.nextLine();
			int A=0;
			int B=0; 
			
			//���O�_���|���
			if(ans.length()!=4) {
				System.out.println("��J�ƭȤ����|���!");
				continue repeat2;
			}
			//���O�_���ƭȸ��
			for(int i=0;i<ans.length();i++) {
				if(Character.isDigit(ans.charAt(i))==false) {
					System.out.println("��J�ƭȤ��ର�D�Ʀr!");
					continue repeat2;
				}
			}
			//���O�_�����ƼƦr
			for(int i=0;i<ans.length()-1;i++) {
				for(int a=i+1;a<ans.length();a++) {
					if(ans.charAt(i)==ans.charAt(a)) {
						System.out.println("��J�ƭȤ��୫��!");
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
				System.out.print("���T����!!");
				break;
			} else continue repeat2;
		}	
	
	}
}
