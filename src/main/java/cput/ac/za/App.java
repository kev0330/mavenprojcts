package cput.ac.za;

public class App 
{
    public static void main( String[] args )
    {	
        System.out.println( "Creating Project" );
        System.out.println( "Made a change by Artemis1234");
	System.out.println( "Made a change by MatthewMarkBrown");
	App app = new App();
        System.out.print("num1 + num2 = " + app.calculate(3, 4));
    }
	
	public int calculate(int num1 , int num2){
        int total = num1 + num2;
        return total;
    }
}
