package com.krauss.xadrez.core;

public class Square {

    private Piece piece;

    public Square() {
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public boolean isOcuppied() {
        return piece != null;
    }
}
