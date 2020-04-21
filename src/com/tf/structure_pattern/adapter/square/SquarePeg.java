package com.tf.structure_pattern.adapter.square;

/**
 * 方钉不适配与圆洞
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        double result = Math.pow(this.width,2);
        return result;
    }
}
