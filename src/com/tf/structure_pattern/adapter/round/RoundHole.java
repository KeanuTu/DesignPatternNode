package com.tf.structure_pattern.adapter.round;

//圆孔
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg){
        boolean result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
