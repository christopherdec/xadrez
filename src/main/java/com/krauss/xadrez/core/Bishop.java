package com.krauss.xadrez.core;

public class Bishop extends Piece{

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public void move(Square destination) {

    }

    @Override
    public String toString() {
        if (color == Color.WHITE)
            return "wB";
        else
            return "bB";
    }
}
