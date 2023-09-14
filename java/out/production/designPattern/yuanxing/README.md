# 3:原型模式，主要是通过clone来进行

### 1：抽象类实现cloneable接口 - String，ID
### 2：具体的子类继承抽象类，重写drwa方法，并且复制StringId
### 3：创建一个loadCache，Hashmap中用ID，SHAPE来创建基本的几个对象
### 4：main函数中，运行loadCache，用get(ID).clone进行clone