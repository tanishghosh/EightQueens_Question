public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;
	
	GameStrategy(){
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				placedQueens[i][j] = false;
		
	}

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		
		int cellColumnId = (cellId%8);
		
		return cellColumnId;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		int cellRowId = (cellId/8);
		
		return cellRowId;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		
		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/

	        int i, j;
	  
	        /* Conditional check for preventing two queens in single row 
	         * given that the second queen is tried to be placed
	         * at left of the first queen
	         * */
	        for (i = 0; i < col; i++)
	            if (placedQueens[row][i] == true)
	            		return false;
	        
	        /* Conditional check for preventing two queens in single column */
	        for (i = 0; i < row; i++)
	            if (placedQueens[i][col] == true)
	            		return false;
	  
	        /* Conditional check for queens on upper diagonal on left side */
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	            if (placedQueens[i][j] == true)
            		return false;
	  
	        /* Conditional check for queens on lower diagonal on left side */
	        for (i = row, j = col; j >= 0 && i <=7 ; i++, j--)
	            if (placedQueens[i][j] == true)
            		return false;
	        
	        placedQueens[row][col] = true;
	        numQueens+=1;
	        return true;
	}
}














