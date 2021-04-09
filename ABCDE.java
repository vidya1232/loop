class ABCDE
{
public static void  main(String [] args) 
{
	char cc = 'A';
	for(int col=5;col>=1;col--)
	{
		for(int row=5;row>=col;row--)
		{
		System.out.print(" ");
		}
		
		for(int coll=1;coll<=col;coll++)
		{
		System.out.print( cc+" ");
		cc++;
		}
		System.out.println();
	   }
	
    }
}
