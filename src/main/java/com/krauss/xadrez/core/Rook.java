package com.krauss.xadrez.core;

public class Rook extends Piece{

    public Rook(Color color) {
        super(color);
    }

    @Override
    public void move(Square destination) {

    }

    @Override
    public String toString() {
        if (color == Color.WHITE)
            return "wR";
        else
            return "bR";
    }
}
