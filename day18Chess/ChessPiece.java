package day18;

public enum ChessPiece implements Describable {
    KING_WHITE(100, "♔"),
    KING_BLACK(100, "♚"),
    QUEEN_WHITE(9, "♕"),
    QUEEN_BLACK(9, "♛"),
    ROCK_WHITE(5, "♗"),
    ROCK_BLACK(5, "♝"),
    BISHOP_WHITE(3.5, "♖"),
    BISHOP_BLACK(3.5, "♜"),
    KNIGHT_WHITE(3, "♘"),
    KNIGHT_BLACK(3, "♞"),
    PAWN_WHITE(1, "♙"),
    PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double value;
    private String piece;

    ChessPiece(double value, String piece) {
        this.value = value;
        this.piece = piece;
    }

    @Override
    public String description() {
        return piece;
    }
}
