package Day17;

public class ChessBoard {
    private ChessPiece[][] array;

    public ChessBoard(ChessPiece[][] array) {
        this.array = array;

    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j].getShapeDesignation());
            }
            System.out.println();
        }
    }
}
