package ArrayPractice;

public class Substraction2D {

	public static void main(String[] args) {
		int [][] a = {{20,20},{60,40}};
		int [][] b = {{5,10},{15,20}};
		int [][] sub = new int [a.length][a[0].length];
		
		if((a.length == b.length) && (a[0].length == b[0].length) && a[1].length == b[1].length)
		{
			for(int r=0;r<a.length;r++)
			{
				for(int c=0;c<a[r].length;c++)
				{
					sub[r][c] = a[r][c] - b[r][c];
				}
			}
			for(int r=0;r<a.length;r++)
			{
				for(int c=0;c<a[r].length;c++)
				{
					System.out.print(sub[r][c] +"\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Matrix sustraction is not possible because row and column dimension not matching !!!! ");
	}

}
