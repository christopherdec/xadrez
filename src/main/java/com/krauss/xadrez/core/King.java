package com.krauss.xadrez.core;

public class King extends Piece{

    public King(Color color) {
        super(color);
    }

    @Override
    public void move(Square destination) {

    }

    @Override
    public String toString() {
        if (color == Color.WHITE)
            return "wK";
        else
            return "bK";
    }
}
