package com.krauss.xadrez.core;

public class Pawn extends Piece{

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public void move(Square destination) {

    }

    @Override
    public String toString() {
        if (color == Color.WHITE)
            return "wp";
        else
            return "bp";
    }
}
