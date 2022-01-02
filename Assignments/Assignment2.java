package Assignments;
class largestofthreenumbers{
	public static void main(String[] args)
    {
        
        int a = 10, b = 20, c = 30, temp, largest;

        System.out.println(" The first number:" + a); 

        System.out.println(" The second number:" + b);  
  
        System.out.println(" The third number:" + c);  
  
        temp = a > b ? a : b;

        largest = c > temp ? c : temp;

        System.out.println("The largest of three numbers is: "+largest); 

    }

}