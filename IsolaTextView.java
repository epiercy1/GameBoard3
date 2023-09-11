
public class IsolaTextView {
	private IsolaBoard board;
	public IsolaTextView(IsolaBoard board) {
		this.board = board;
	}
	public void display() {
		for(int row = 0; row < board.getHeight(); row++) {
			for(int col = 0; col < board.getWidth(); col++) {
				BoardSpace which = board.get(row, col);
				System.out.print(which);
				System.out.print("_");
			}
		}
	}
}
