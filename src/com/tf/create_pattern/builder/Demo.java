package com.tf.create_pattern.builder;

public class Demo {
    public static void main(String[] args) {
        //知道名字创建构造者
        PersonBuilder fatPerson = new PersonThinBuilder();

        //创建指导者，用来封装内部复杂的组合逻辑
        PersonDirector director = new PersonDirector();

        //调用指导者的方法组装相应构造者的复杂产品
        director.createPerson(fatPerson);

    }
}
