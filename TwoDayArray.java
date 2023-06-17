import java.util.*;
class TwoDayArray{
	public static void main(String[] t){
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c= sc.nextInt();
		int[][] matrix = new int[r][c];
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}