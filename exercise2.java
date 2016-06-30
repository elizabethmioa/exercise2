import java.util.Scanner;
public class exercise2 {
	public static void main (String []args){
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter lower range 1 :");
		int lowerrange1 = scanner.nextInt(); 
		System.out.print("Enter upper range 1 :");
		int upperrange1 = scanner.nextInt();
		System.out.print("Enter lower range 2 :");
		int lowerrange2 = scanner.nextInt();
		System.out.print("Enter upper range 2 :");
		int upperrange2 = scanner.nextInt();
		
		scanner.close();
		
		int Answer1 = solve(lowerrange1, upperrange1);
		int Answer2 = solve(lowerrange2, upperrange2);
		
		System.out.println(Answer1);
		System.out.println(Answer2);
		
		
		if (Answer1 > Answer2){
			System.out.println("Range1 has more squarefree numbers than Range2");
		}
		else{
			System.out.println("Range2 has more squarefree numbers than Range1");
		}
	}

	public static boolean isSquare (int n){
		for (int i = 1; i*i <= n ; i++){ 
	
			if (i*i == n){
				return true ; 
			}
		}
		return false;
	}

	public static int solve (int lowerrange,int upperrange){
		int ALL1= 0 ;

		for(int i = lowerrange; i <=upperrange ; i ++){
			if (i == 1){
				ALL1 = ALL1 +1;
			}
			else {
				boolean numSq = isSquare(i);
				if (numSq){ 
					ALL1 = ALL1;
				}
				else{ 
					ALL1 = ALL1 + 1;
				}
			}
	
		}	
		return ALL1;
	}
}
