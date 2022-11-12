
public class BubbleSort_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x,y;
		 boolean ok=true;
		// int[] ary = {15, 8, 25, 48, 2, 10};
		 int[] ary = {2, 8, 10, 15, 25, 48};
		 System.out.println("原始陣列:");
		 for(int nums:ary) System.out.print(nums+"  ");
		 System.out.print("\n\n");
		 
		 for(x=1;x < ary.length;x++) {
			 ok=true;
			 for(y=0;y<ary.length-x-1;y++) {
				 if(ary[y]>ary[y+1]) {
					 int temp;
					 temp=ary[y];
					 ary[y]=ary[y+1];
					 ary[y+1]=temp;
					 ok=false;
				 } 
				
			 }
			 if (ok)
				break;
		 System.out.println("第"+x+"輪的結果:");
		 for(int nums:ary)System.out.print(nums+"  ");
		 System.out.print("------->");
		 System.out.println(y+"次");
		 }
		 System.out.println("\n\n");
		 System.out.println("排序後的結果:");
		 for(int nums:ary)System.out.print(nums+"  ");

	}
}