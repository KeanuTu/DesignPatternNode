package com.tf.create_pattern.builder;

public class Person {
    private String head;
    private String body;
    private String armLeft;
    private String armRight;
    private String legLeft;
    private String legRight;

    public static final String HEAD = "head";
    public static final String BODY = "body";
    public static final String ARM_LEFT = "armLeft";
    public static final String ARM_RIGHT = "armRight";
    public static final String LEG_LEFT = "legLeft";
    public static final String LEG_RIGHT = "legRight";

    public void drawHead(String characteristic) {
        this.head = HEAD + characteristic;
        System.out.println(head);
    }

    public void drawBody(String characteristic) {
        this.body = BODY + characteristic;
        System.out.println(body);
    }

    public void drawArmLeft(String characteristic) {
        this.armLeft = ARM_LEFT + characteristic;
        System.out.println(armLeft);
    }

    public void drawArmRight(String characteristic) {
        this.armRight = ARM_RIGHT + characteristic;
        System.out.println(armRight);
    }

    public void drawLegLeft(String characteristic) {
        this.legLeft = LEG_LEFT + characteristic;
        System.out.println(legLeft);
    }

    public void drawLegRight(String characteristic) {
        this.legRight = LEG_RIGHT + characteristic;
        System.out.println(legRight);
    }

}
