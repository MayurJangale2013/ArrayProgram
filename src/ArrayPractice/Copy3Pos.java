package ArrayPractice;

public class Copy3Pos {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70,80};
		int [] a = new int[4];
		int j=0;
		for(int i=2;i<=5;i++)
		{
			a[j++]=arr[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
		
	}

}
