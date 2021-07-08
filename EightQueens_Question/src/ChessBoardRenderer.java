public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		
		int lineNumber = square/8;
		
		if(lineNumber%2==0)
			if(square%2==0)
				return false;
			else
				return true;
		else
			if(square%2==0)
				return true;
			else
				return false;
	}
}
