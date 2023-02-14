package ArrayPractice;

public class SmallestNoInColumn {

	public static void main(String[] args) {
		int [][] a = { {1,3,13},{4,5,6},{7,18,9}};
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
		for(int r=0;r<a.length;r++)
		{
			int c=0;
			int colMax = a[r][c];
			for(c=0;c<a[r].length;c++)
			if(a[c][r]< colMax)
			colMax = a[c][r];

		System.out.println("Max : " + colMax);
		}
		
	}

}
