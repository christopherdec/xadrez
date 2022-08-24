package com.krauss.xadrez.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Board {

    private Square[][] squares = new Square[8][8];

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                squares[i][j] = new Square();
        }
        Arrays.stream(getRow('2')).forEach(square -> square.setPiece(new Pawn(Color.WHITE)));
        Arrays.stream(getSquares("a1", "h1")).forEach(square -> square.setPiece(new Rook(Color.WHITE)));
        Arrays.stream(getSquares("b1", "g1")).forEach(square -> square.setPiece(new Knight(Color.WHITE)));
        Arrays.stream(getSquares("c1", "f1")).forEach(square -> square.setPiece(new Bishop(Color.WHITE)));
        getSquare("d1").setPiece(new Queen(Color.WHITE));
        getSquare("e1").setPiece(new King(Color.WHITE));

        Arrays.stream(getRow('7')).forEach(square -> square.setPiece(new Pawn(Color.BLACK)));
        Arrays.stream(getSquares("a8", "h8")).forEach(square -> square.setPiece(new Rook(Color.BLACK)));
        Arrays.stream(getSquares("b8", "g8")).forEach(square -> square.setPiece(new Knight(Color.BLACK)));
        Arrays.stream(getSquares("c8", "f8")).forEach(square -> square.setPiece(new Bishop(Color.BLACK)));
        getSquare("d8").setPiece(new Queen(Color.BLACK));
        getSquare("e8").setPiece(new King(Color.BLACK));
    }

    public Square[] getRow(char row) {
        int row_index = Character.getNumericValue(row) - 1;
        return squares[row_index];
    }

    public Square[] getColumn(char column) {
        int column_index = column - 'a';
        List<Square> columnSquares = new ArrayList<>();
        for (int row = 0; row < 8; row++) {
            columnSquares.add(squares[row][column_index]);
        }
        return columnSquares.toArray(new Square[0]);
    }

    public Square[] getSquares(String... coordinates) {
        return Arrays.stream(coordinates)
                .map(this::getSquare)
                .toArray(Square[]::new);
    }

    public Square getSquare(String coordinates) {
        char column = coordinates.charAt(0);
        char row = coordinates.charAt(1);

        int row_index = Character.getNumericValue(row) - 1;
        int column_index = column - 'a';

        return squares[row_index][column_index];
    }

    // TODO: BoardPrinter class
    public void drawBoard() {
        for (int row = 7; row >= 0; row--) {
            StringBuilder builder = new StringBuilder('|');
            for (int column = 0; column < 8; column++) {
                Square square = squares[row][column];
                if (square.isOcuppied())
                    builder.append(square.getPiece().toString())
                            .append('|');
                else
                    builder.append("--|");
            }
            System.out.println(builder);
        }
    }
}
