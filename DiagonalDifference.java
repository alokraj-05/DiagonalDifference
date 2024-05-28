import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n-1-i];
        }
        int absoluteDifference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        
        System.out.println(absoluteDifference);
    }
}
