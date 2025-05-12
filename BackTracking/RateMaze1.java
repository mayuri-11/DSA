package BackTracking;
// RateMaze1 - 2 DIRECTIONS
// Condition : You can only go right or down usind recursion
public class RateMaze1 {
    public static void main(String[] args) {
        int row = 3;
        int cols = 3;
        int count = maze(1,1,row,cols);
        System.out.println("Total Ways to reach destination :"+count);

        printPath(1,1, row,cols, "");
    }

    private static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr == er && sc == ec) return 1;

        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr, sc+1, er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }

    private static void printPath(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) System.out.println(s);

        // go down
        printPath(sr+1, sc, er, ec, s+"D");

        // go right
        printPath(sr, sc+1, er, ec, s+"R");

    }
}
