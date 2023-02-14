package ArrayPractice;

public class BubbleSorting {

	public static void main(String[] args) {
		int [] a = {10,5,25,30,4,8,45};
		int t;
	try {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					
				t = a[i];
				a[i] = a[j];
				a[j] = t;
				}
				
			}
		}
	}catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
