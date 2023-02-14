package ArrayPractice;

public class DiagonalAddition {

	public static void main(String[] args) {
		int [][] a = {{2,1,3,7},{19,2,21,61},{99,92,2,22},{97,91,91,2}};
		int sum =0;
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(r == c)
					sum = sum + a[r][c];
			}
		}
		System.out.println("Sum = " + sum);
	}

}
