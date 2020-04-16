package com.tf.create_pattern.builder;

public class PersonFatBuilder extends PersonBuilder{
    public static final String   FAT ="fat";

    /**内部持有一个复杂对象的实例，在内部构造完成所需产品*/
    private Person person;

    public PersonFatBuilder(){
    this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.drawHead(FAT);
    }

    @Override
    public void buildBody() {
        person.drawBody(FAT);
    }

    @Override
    public void buildArmLeft() {
        person.drawArmLeft(FAT);
    }

    @Override
    public void buildArmRight() {
        person.drawArmRight(FAT);
    }

    @Override
    public void buildLegLeft() {
        person.drawLegLeft(FAT);
    }

    @Override
    public void buildLegRight() {
        person.drawLegRight(FAT);
    }

    @Override
    public Person getResult() {
        return person;
    }


}
