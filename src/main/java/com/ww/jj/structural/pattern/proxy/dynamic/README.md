## 动态代理

### 定义：
动态代理也叫JDK代理或接口代理，在程序运行时，运用反射机制动态创建。遵循开闭原则

### 特点：
````
1.代理对象不需要实现接口。
2.代理对象的生成是利用JDK的API动态的在内存中构建代理对象。
3.能在代码运行时动态地改变某个对象的代理，并且能为代理对象动态地增加方法、增加行为。
````

### 实现方式：
#### JDK自带代理实现
只需要使用 newProxyInstance 方法，该方法是Proxy类中是静态方法，需要接收三个参数
````
static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h )
````
ClassLoader loader：指定当前目标对象使用类加载器，获取加载器的方法是固定的。 
Class<?>[] interfaces：目标对象实现的接口的类型，使用泛型方式确认类型。  
InvocationHandler h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，传入要调用的方法(一般为this)。  
#### CGLib提供的类库实现