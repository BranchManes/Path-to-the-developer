package Day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"),
    ROOK_WHITE(5, "♖"), BISHOP_WHITE(3.5, "♗"),
    KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"),
    ROOK_BLACK(5, "♜"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double TheValueOfTheFigure;
    private String ShapeDesignation;

    ChessPiece(double theValueOfTheFigure, String shapeDesignation) {
        TheValueOfTheFigure = theValueOfTheFigure;
        ShapeDesignation = shapeDesignation;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "ShapeDesignation='" + ShapeDesignation + '\'' +
                '}';
    }

    public String getShapeDesignation() {
        return ShapeDesignation;
    }
}
