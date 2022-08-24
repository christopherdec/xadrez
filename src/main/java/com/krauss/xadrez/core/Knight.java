package com.krauss.xadrez.core;

public class Knight extends Piece{

    public Knight(Color color) {
        super(color);
    }

    @Override
    public void move(Square destination) {

    }

    @Override
    public String toString() {
        if (color == Color.WHITE)
            return "wN";
        else
            return "bN";
    }
}
