public class Pattern{
	
	static void pattern1(int n){
		int i,j;
		for(i=1;i<=n;i++){
			char alpha = 'A';
			for(j=1;j<=n-i+1;j++){
				System.out.print(alpha);
				alpha++;
			}
			System.out.println();
			
		}
	}
	
	static void pattern2(int n){
		int i,j,k;
		
		for(i=1;i<=n;i++){
			char alpha = 'A';
			for(j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(k=1;k<=n-i+1;k++){
				System.out.print(alpha);
				alpha++;
			}
			System.out.println();
			
		}
	}
	static void pattern3(int n){
			int i,j,k;
			
			for(i=1;i<=n;i++){
				char alpha = 'A';
				for(j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(k=1;k<=i;k++){
					System.out.print(alpha);
				    alpha++;
				}
				System.out.println();
			}
		}
		
	static void pattern4(int n){
			int i,j,k;
			
			for(i=1;i<=n;i++){
				char alpha = 'A';
				for(j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(k=1;k<=i;k++){
					System.out.print(" "+alpha);
				    alpha++;
				}
				System.out.println();
			}
		}
	
	static void pattern5(int n){
		int i,j,k;
		
		for(i=1;i<=n;i++){
			char alpha = 'A';
			for(j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(k=1;k<=n-i+1;k++){
				System.out.print(" "+alpha);
				alpha++;
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args){
		pattern1(7);
			System.out.println();
		pattern2(7);
			System.out.println();
		pattern3(7);
			System.out.println();
		pattern4(7);
			System.out.println();
		pattern5(7);
		
		
		
		
	}
}