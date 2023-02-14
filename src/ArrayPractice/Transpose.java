package ArrayPractice;

public class Transpose {

	public static void main(String[] args) {
		int [][] a = {{2,1,3,7},{19,20,21,61},{99,92,90,22},{97,91,91,21}};
		int [][] b = new int [4][4];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
			{
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				b[c][r] = a[r][c];
			}
		}
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
			{
				System.out.print(b[r][c] + "\t");
			}
			System.out.println();
		}

	}

}
