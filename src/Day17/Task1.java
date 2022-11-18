package Day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] array = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece c : array) {
            System.out.print(c.getShapeDesignation() + " ");
        }

    }
}
