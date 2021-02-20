import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][] visited = new boolean[n][m];
        
        floodfill(arr,0,0,"",visited);
    }
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    static char[] w = {'t','l','d','r'};
    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(psf);
            return;
        }
        for(int i=0;i<4;i++){
            int nr = row + dir[i][0];
            int nc = col + dir[i][1];
            char ch = w[i];
            if(nr>= 0 && nc >= 0 && nr < maze.length && nc < maze[0].length && maze[nr][nc] == 0 && visited[nr][nc] == false){
                visited[nr][nc] = true;
                floodfill(maze,nr,nc,psf+ch,visited);
                visited[nr][nc] = false;
            }
        }
    }
}