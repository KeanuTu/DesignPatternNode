package com.tf.structure_pattern.adapter.adapters;

import com.tf.structure_pattern.adapter.round.RoundPeg;
import com.tf.structure_pattern.adapter.square.SquarePeg;

/**
 * 让方钉适配圆洞
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        //计算适配方钉的圆洞的最小半径
        result = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));
        return super.getRadius();
    }
}
