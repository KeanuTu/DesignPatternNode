# DesignPatern

#### 介绍
对于设计模式的代码总结和类图

**模式：在某些场景下，针对某类问题的某种通用的解决方案。**

场景：项目所在的环境

问题：约束条件，项目目标等

解决方案：通用、可复用的设计，解决约束达到目标。





#### 六大设计原则
[设计原则](src/com/tf/six_principle/README.md)

设计模式是软件设计中常见问题的典型解决方案，模式不是一段特定的代码，而是解决特定问题的一般性概念。

**算法与模式间的区别**：

相同点：算法与设计模式概念上都是已知特定问题的典型解决方案。

异同点：
+ 算法像是“菜谱”：提供达成目标的明确步骤
+ 模式像是“蓝图”：提供最后的结构和模式的功能，但需要人实施才能看到

模式的描述通常包括：
+ **意图**部分简单描述问题和解决方案
+ **动机**部分将进一步解释问题并说明模式会如何提供解决方案
+ **结构**部分展示模式的每个部分和它们之间的关系
+ **代码实现**让人更直接了解模式的思想



[《设计模式：可复用面向对象软件的基础》]( https://zh.wikipedia.org/zh-hans/设计模式：可复用面向对象软件的基础 )是软件工程领域很重要的一本书， 提出和总结了对于一些常见软件设计问题的标准解决方案 。其作者是 [埃里希·伽玛](https://zh.wikipedia.org/wiki/埃里希·伽瑪)（Erich Gamma）、[Richard Helm](https://zh.wikipedia.org/w/index.php?title=Richard_Helm&action=edit&redlink=1)、[Ralph Johnson](https://zh.wikipedia.org/w/index.php?title=Ralph_Johnson&action=edit&redlink=1)和[John Vlissides](https://zh.wikipedia.org/w/index.php?title=John_Vlissides&action=edit&redlink=1) ，简称”四人组（Gang of Four，GoF）“的书。



**这本书的阅读地址**：[点这]( https://d1.amobbs.com/bbs_upload782111/files_35/ourdev_608272DMR8VS.pdf )



#### 😘创建型模式

​	创建对象机制，增加已有代码的灵活性和可复用性。

+ 类创建型：通过有效使用类之间的继承关系
+ 对象创建型：通过使用代理完成其任务



[抽象工厂]()(***Abstract Factory***)

[构造器]()(***Builder***)

[工厂方法]()(***Factory Method***)

[原型]()(***Prototype***)

[单例模式]()(***Singleton***)





#### 🔗结构型模式

​	如何将`对象`和`类`组装成较大的结构，并同时保持结构的灵活和高效。



- [适配器]()(***Adapter***)
- [桥接]()(***Bridge***)
- [组合]()(***Composite***)
- [装饰]()(***Decorator***)
- [外观]()(***Facade***)
- [享元]()(***Flyweight***)
- [代理]()(***Proxy***)



#### 🏃行为型模式

​	对象间的高效沟通和职责委派，即对象间如何通讯。

- [职责链](https://zh.wikipedia.org/w/index.php?title=职责链模式&action=edit&redlink=1)(***Chain-of-responsibility***)
- [命令](https://zh.wikipedia.org/wiki/命令模式)(***Command***)
- [翻译器](https://zh.wikipedia.org/w/index.php?title=翻译器模式&action=edit&redlink=1)(***Interpreter***)
- [迭代器](https://zh.wikipedia.org/wiki/迭代器模式)(***Iterator***)
- [中介者](https://zh.wikipedia.org/wiki/中介者模式)(***Mediator***)
- [回忆](https://zh.wikipedia.org/w/index.php?title=回忆模式&action=edit&redlink=1)(***Memento***)
- [观察者](https://zh.wikipedia.org/wiki/观察者模式)(***Observer***)
- [状态机](https://zh.wikipedia.org/w/index.php?title=状态机模式&action=edit&redlink=1)(***State***)
- [策略](https://zh.wikipedia.org/wiki/策略模式)(***Strategy***)
- [模板方法](https://zh.wikipedia.org/wiki/模板方法模式)(***Template method***)
- [参观者](https://zh.wikipedia.org/wiki/訪問者模式)(***Visitor***)



### 总结：

A：学设计模式有什么用？

Q：设计出更优秀、干净明了的代码结构。

推荐阅读： https://www.cnblogs.com/pony1223/p/7608955.html 



