public class RatRoute {
    private int myCheeseRow;
    private int myCheeseCol;
    private char[][] myBoard;
    private int[] myDims;

    public int numRoutes(String[] enc) {
        int ratRow = 0;
        int ratCol = 0;

        // Store Dimensions
        myDims = new int[2];
        myDims[0] = enc.length;
        myDims[1] = enc[0].length();

        // initialize board, cheese grid location, and rat position
        myBoard = new char[enc.length][enc[0].length()];
        for (int r = 0; r < enc.length; r++) {
            for (int c = 0; c < enc[0].length(); c++) {
                myBoard[r][c] = enc[r].charAt(c);
                if (myBoard[r][c] == 'R') {
                    ratRow = r;
                    ratCol = c;
                }
                else if (myBoard[r][c] == 'C') {
                    myCheeseRow = r;
                    myCheeseCol = c;
                }

            }

        }


        return moveCount(ratRow, ratCol);
    }

    private int moveCount(int r, int c) {
        // BASE CASES
        if (r < 0 || r > myDims[0] ||
                c < 0 || c > myDims[1] ) return 0; // out of bounds

        if (myBoard[r][c] == 'X') return 0; // you can't move to an X

        if (r == myCheeseRow && c == myCheeseCol) return 1; // IT'S VALID


        // will be changed
        int totalMoves = 0;
        int distNow = cheeseDist(r,c);

        // set for looping possible movement
        int[] dR = {0, -1, 0, 1};
        int[] dC = {-1, 0, 1, 0};

        for (int k = 0; k < dR.length; k++) { // first try down a col, left a row, up a col, right a row
            int nr = r + dR[k];
            int nc = c + dC[k];

            if (cheeseDist(nr, nc) < distNow) { // valid moves only decrease distance
                totalMoves += moveCount(nr, nc); // recursive call*** to see if it goes to cheese
            }
        }
        return totalMoves;

    }
    private int cheeseDist(int r, int c) { // not diagonalized
        int dx = Math.abs(myCheeseRow - r);
        int dy = Math.abs(myCheeseCol - c);
        return dx + dy;


    }





}
