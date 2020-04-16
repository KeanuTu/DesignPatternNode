package com.tf.create_pattern.singleton;

public class SingleObject {

    //占有一个单例对象
    private static SingleObject instance = new SingleObject();

    /**让构造函数private,这样类就不会被实例化*/
    private SingleObject(){}

    //只有通过getInstance方法获取唯一可用对象
    public static SingleObject getInstance(){
        return instance;
    }

    //内部对象调用方法
    public void showMessage(){
        System.out.println("Hello World!");
    }


}
