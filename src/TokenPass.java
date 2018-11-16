public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        int [] board = new int[playerCount];
        for(int x =0; x<playerCount; x++)
        {
            board[x] = 1+(int)(10*Math.random());
        }
        currentPlayer = (int)(playerCount * Math.random());
        System.out.println(board.length);

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
        for(int i=0; i<board.length;i++)
        {
            display = display + i + ":" + board[i] + "\n";
        }
        return display;
    }
    public int gameOver()
    {
        for(int x=0; x<board.length; x++)
        {
            if(board[x] == 0);
            return x;
        }
        return -1;
    }
    public void nextPlayer()
    {
        currentPlayer+= (currentPlayer +1) % board.length;
    }
}
