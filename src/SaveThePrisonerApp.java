import java.util.Scanner;

public class SaveThePrisonerApp {
    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
//    	int w = 0;
//    	if((s + m)% n == 0) {
//    		w = n - 1; 		
//    	} else if((s + m)% n - 1 == 0) {
//			w = n;
//    	} else {
//    		 w = (s + m) % n - 1;
//    	}  	
//    	return w;
    
    	return (((s+m-2)%n)+1);
	}  
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of test cases, T (integer 1-100): "); 
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Enter number of prisoners, n (integer 1-1000000000): ");
            int n = in.nextInt();
            System.out.print("Enter number of candies, m (integer 1-1000000000): ");
            int m = in.nextInt();
            System.out.print("Enter the starting number for the prisoners, s (integer 1-n): ");
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        in.close();
    }
}
