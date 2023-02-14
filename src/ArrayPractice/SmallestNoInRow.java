package ArrayPractice;

public class SmallestNoInRow {

	public static void main(String[] args) {
		int [][] arr = { {10,2},{3,4},{-10,6}};
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			int m = arr[i][j];
			for(j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] <m)
				m = arr[i][j];
			}
		System.out.println("Min no.in row = " + m);
		}
	}

}
