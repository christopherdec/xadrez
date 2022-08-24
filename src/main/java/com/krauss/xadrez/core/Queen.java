package com.krauss.xadrez.core;

public class Queen extends Piece{

    public Queen(Color color) {
        super(color);
    }

    @Override
    public void move(Square destination) {

    }

    @Override
    public String toString() {
        if (color == Color.WHITE)
            return "wQ";
        else
            return "bQ";
    }
}
