package day18;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROCK_BLACK, ChessPiece.ROCK_BLACK,
                ChessPiece.ROCK_BLACK, ChessPiece.ROCK_BLACK
        };
        for (ChessPiece piece : chessPieces) {
            System.out.print(piece.description() + " ");
        }
    }
}