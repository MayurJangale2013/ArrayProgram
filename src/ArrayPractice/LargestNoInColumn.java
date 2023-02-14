package ArrayPractice;

public class LargestNoInColumn {

	public static void main(String[] args) {
		int [][] arr = { {25,25,38},{14,35,16},{7,32,34,}};
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
				if(arr[j][i] > m )
					m = arr[j][i];
			}
			System.out.println("The Largest no.in Column = "+m);
		}
	}

}
