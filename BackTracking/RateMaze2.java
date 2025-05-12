package BackTracking;
// Rate in Maze-2 [4 Directions]
public class RateMaze2 {
    public static void main(String[] args) {
        int row = 3;
        int cols = 3;
        boolean [][] isVisited= new boolean[row][cols];
        printPath(0,0,row-1,cols-1,"",isVisited);
    }

    private static void printPath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
        if(isVisited[sr][sc]== true) return;
        if(sc<0 || sr<0)return;
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) System.out.println(s);

        isVisited[sr][sc] = true;
        // go down
        printPath(sr+1, sc, er, ec, s+"D",isVisited);

        // go right
        printPath(sr, sc+1, er, ec, s+"R",isVisited);

        //go left
        printPath(sr, sc-1, er, ec, s+"L",isVisited);

        //go up
        printPath(sr-1, sc, er, ec, s+"U",isVisited);


    }
}
