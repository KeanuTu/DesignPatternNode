package com.tf.create_pattern.factory_method;

public interface NumberFactory {
    // 创建方法:
    Number parse(String s);

    static NumberFactory impl = new NumberFactoryImpl();

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

}