class Smallabc
{
public static void  main(String [] args) 
{
	//char cc = 'A';
	for(int col=1;col<=5;col++)
	{
		for(int row=1;row<=col;row++)
		{
		System.out.print(" ");
		}
		
		for(int coll=5;coll>=col;coll--)
		{
		System.out.print((char)(col+96)+" ");
		//cc++;
		}
		System.out.println();
	   }
	
    }
}
