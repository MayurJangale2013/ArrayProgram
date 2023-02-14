package ArrayPractice;

public class ThreeDimArrayDemo {

	public static void main(String[] args) {
		int[][][]  td = new int[][][]
				{
					{
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
					},
					
					{
						{13,14,15,16},
						{17,18,19,20},
						{21,22,23,24}
					}
				};
				System.out.println("td.length          : " + td.length);
				System.out.println("td[0].length      : " + td[0].length);
				System.out.println("td[0][0].length  : " + td[0][0].length);
				
				for(int i=0;i<td.length;i++)
				{
					for(int j=0;j<td[0].length;j++)
					{
						for(int k=0;k<td[0][0].length;k++)
							System.out.print(td[i][j][k] + " \t");
						System.out.println();
					}
					System.out.println();
				}
	}

}
