
public class Test {

	public static void main(String[] args) {
  
		String str="WATER"  ; 
		int n=str.length();
		String res=str.substring( n/2,n)+str.substring( 0,n/2);
		
		for(int i=0;i< res.length();i++)
		{
			for(int space=0;space<2*(n-i-1);space++)
			{
				System.out.print(" "); 
			}
			
			for(int j=0;j<=i ;j++)
			{
				System.out.print( res.charAt( j));
			}
			System.out.println();
		}
	}

}
