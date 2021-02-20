import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] chess = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j]=0;
            }
        }
        printKnightsTour(chess,r,c,1);
    }
    static int [][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    public static void printKnightsTour(int[][] chess, int row,int col,int moves) {
        if(moves == chess.length*chess[0].length){
            chess[row][col] = moves;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }
        // System.out.println(moves);
        chess[row][col] = moves;
        for(int i=0;i<8;i++){
            int r = row+dir[i][0];
            int c = col+dir[i][1];
            if(r >= 0 && c >= 0 && r<chess.length && c < chess[0].length && chess[r][c] == 0){
                printKnightsTour(chess,r,c,moves+1);
            }
        }
        chess[row][col] = 0;
    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}