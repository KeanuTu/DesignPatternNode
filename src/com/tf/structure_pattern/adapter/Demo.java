package com.tf.structure_pattern.adapter;

import com.tf.structure_pattern.adapter.adapters.SquarePegAdapter;
import com.tf.structure_pattern.adapter.round.RoundHole;
import com.tf.structure_pattern.adapter.round.RoundPeg;
import com.tf.structure_pattern.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)){
            System.out.println("半径5的圆洞 fit 半径5的圆钉");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
        //hole.fits(smallPeg) //不能通过编译

        //借助一个适配器解决问题
        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);

        if (hole.fits(smallPegAdapter)){
            System.out.println("半径5的圆洞 fit 半径5的圆钉");
        }

        if (hole.fits(largePegAdapter)){
            System.out.println("半径20的圆洞 didn't fit 半径5的圆钉");
        }

    }
}
