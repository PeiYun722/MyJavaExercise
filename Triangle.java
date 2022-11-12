import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("輸入三角形層數：");
		int tri=input.nextInt();
		for(int i=0;i<tri;i++) {
			for(int j=tri;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<(i+1);j++) {
				System.out.print("* ");
			}	
			
			System.out.println();
		}
	}

}
