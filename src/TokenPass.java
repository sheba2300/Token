public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for(int x =0; x<playerCount; x++)
        {
            board[x] = 1+(int)(10*Math.random());
        }
        currentPlayer = (int)(playerCount * Math.random());
        System.out.println(currentPlayer);

    }
    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;
        while (numToDistribute > 0)
        {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }

    }
    public String printBoard()
    {
        String display = "";
        for(int x = 0; x<board.length;x++)
        {
            display = display + x + ":" + board[x] + "\n";
        }
        return display;
    }
    public int gameOver()
    {
        for(int x =0; x<board.length; x++)
        {
            if(board[x] <= 0);
            return -1;
        }
        return 1;
    }
    public void nextPlayer()
    {
        currentPlayer++;
    }
}
