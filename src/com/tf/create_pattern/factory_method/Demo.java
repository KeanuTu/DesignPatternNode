package com.tf.create_pattern.factory_method;

public class Demo {
    NumberFactory factory = NumberFactory.getFactory();
    Number result = factory.parse("123.456");
}
