# 创建型模式

​	不使用new运算符直接实例化对象，二建创建逻辑隐藏。

##  简单工厂模式

​	**工厂模式**（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。 

### 介绍

**意图**：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

**主要解决**：主要解决接口选择的问题。

**何时使用**：我们明确地计划不同条件下创建不同实例时。

**如何解决**：让其子类实现工厂接口，返回的也是一个抽象的产品。

**应用实例**： 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。 2、Hibernate 换数据库只需换方言和驱动就可以。

**优点**：
​	1、一个调用者想创建一个对象，只要知道其名称就可以了。
​	2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
​	3、屏蔽产品的具体实现，调用者只关心产品的接口。

**缺点**：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。

**使用场景**： 
​		1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
​		2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。

​		3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。

<font color="red">**注意事项**：</font>作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。



## 工厂方法模式

**意图**：简单工厂模式下，添加产品需要修改工厂类，违背了“开闭原则”。

**工厂方法**（Factory Method）为了解决这个问题，将生产不同具体产品的分散到子工厂类，工厂父类负责定义创建产品对象的公共接口。

```ascii
┌─────────────┐      ┌─────────────┐
│   Product   │      │   Factory   │
└─────────────┘      └─────────────┘
       ▲                    ▲
       │                    │
┌─────────────┐      ┌─────────────┐
│ ProductImpl │<─ ─ ─│ FactoryImpl │
└─────────────┘      └─────────────┘
```

**实际使用**：（静态）工厂方法可以隐藏创建产品的细节，且不一定每次都会真正创建产品，完全可以返回缓存的产品，从而提升速度并减少内存消耗。 

```java
public final class Integer {
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
    
}
```

就是将工厂类和实现类合二为一。

## 抽象工厂方法

​	提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

**简单来说**：多个产品如果相互依赖，就应该有一个抽象工厂类来具体生产！

> 工厂方法与抽象工厂区别：
>
> - 工厂方法解决一个产品多个层级的事情
> - 抽象工厂方法解决多个产品多个层级的事情

![抽象工厂方法](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCAYufIamkKN034lb5bTMrN52MeOAUdfr2G55-IcboYQCXLc4dkB0HYceZhC9EHWX3T7NjO5R2rM8J1Ec7cOf5p8dBEISpDQy4HQj3QbuAq6y0)

产品族与产品等级结构示意图

![产品族与产品等级](/src/com/tf/create_pattern/image/product.png)

**抽象工厂模式**：

> 多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。**（一个抽象产品是一个产品等级结构）**
>
> 一个抽象工厂类，可以派生出多个具体工厂类。**（一个具体工厂是一个产品族）**
>
> 每个具体工厂类可以创建多个具体产品类的实例，也就是创建的是一个产品线下的多个产品。  

**工厂方法模式**：

> 一个抽象产品类，可以派生出多个具体产品类。 
>
> 一个抽象工厂类，可以派生出多个具体工厂类。 
>
> 每个具体工厂类只能创建一个具体产品类的实例。

**优点**：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

**缺点**：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

**使用场景**： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。

**注意事项**：产品族难扩展，产品等级易扩展。



## 建造者模式

>  *将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。* 

简单来说就是：用多个工厂创造的对象来组装一个完整的对象。

**应用举例**：你第一次学着做汤，有两种汤，西红柿蛋汤和土豆排骨汤。

汤就是复杂对象，因为不同汤里面的材料是不同的。而做汤这个过程就是建造者（`AbstractBuilder`），所以具体的汤就是`ConcreteBuilder`。

这个时候，管家`Director`来帮你做汤，你只需要知道你做什么汤即（`ConcreteBuilder`），这样你就很简单的做了一道汤。哈哈哈哈😛😛😛



## 原型模式

​	原型模式（**Prototype**）用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

用于创建重复的对象，同时又能保证性能。

**应用举例**：细胞复制增殖，绕过构造方法直接利用内存（基因）拷贝对象，这样大大提高了对象的创建效率。

常在大量对象创建或者类初始化消耗多的场景下来利用原型模式做优化。

注意：
[浅拷贝与深拷贝的区别]( https://www.cnblogs.com/always-chang/p/6107437.html )

> 在对含有指针成员的对象进行拷贝时，必须要自己定义拷贝构造函数，使拷贝后的对象指针成员有自己的内存空间，即进行深拷贝，这样就避免了内存泄漏发生。

[浅拷贝和深拷贝的实现方式](https://www.cnblogs.com/shakinghead/p/7651502.html)

## 单例模式
保证一个类仅有一个实例，并且提供一个访问它的全局访问点。
**主要解决**：一个全局使用的类频繁地创建与销毁。

**何时使用**：当您想控制实例数目，节省系统资源的时候。

**如何解决**：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。

**关键代码**：构造函数是私有的。

**应用实例**：

1、一个班级只有一个班主任。

2、Windows 是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。

3、一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件。

<font color="red">**注意事项**</font>：`getInstance()` 方法中需要使用同步锁 `synchronized (Singleton.class)` 防止多线程同时进入造成 instance 被多次实例化。
