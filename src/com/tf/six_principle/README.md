### 《设计模式的六大原则》

 + ***开闭原则***：对扩展开放，对修改关闭，多用抽象类和接口


 + ***里氏替换原则***：基类可以被子类替换，使用抽象类继承，不使用具体类继承

 + ***依赖倒转原则***：要依赖于抽象，不依赖于具体；针对接口编程

   > 在代码中使用抽象类，而将具体类放在配置文件中。而具体类的实现主要通过**依赖注入**的方法。
   >
   > 参考链接：[轻松学，浅析依赖倒置（DIP）、控制反转(IOC)和依赖注入(DI)](https://blog.csdn.net/briblue/article/details/75093382)

 + ***接口隔离原则***：根据单一职责原则，建立最小的接口

 + ***迪米特法则***：又称最小知识原则， 一个软件实体应当尽可能少地与其他实体发生相互作用，通过中间类建立联系

 + ***合成复用原则***：尽量使用聚合/组合，少用继承

   > <font color="red">使用继承和组合/聚合的目的是为了复用</font>
   >
   > 什么时候使用继承,必须满足以下所有的条件:
   >
   > ​	1.子类是超类的一个特殊种类,而不是超类的一个角色,也就是区分"Has -a " 与 " is -a" .
   >
   > ​	2.永远不会出现需要将子类换成另外一个子类的情况.如果不能肯定将来是否会变成另外一个子类的话,就不要使用继承.
   >
   > ​	3.子类具有扩展超类的责任,而不是具有置换掉(override)或注销掉(Nullify)超类的责任,如果一个子类需要大量的置换掉超类的行为,那么这个类就不应该是这个超类的子类.
   >
   > ​	4.只有在分类学角度上有意义时,才可以使用继承.不要从工具类继承.

   

   **自己写的更详细的Blog：** [设计原则](https://keanu_cr.gitee.io/2020/03/02/设计模式01-设计原则/#more) 

