介绍几款常用的AndroidStudio插件

一. GsonFormat  
  
  Gson是google推出的一个实现 JSON 与 Java 对象间转化的库，帮助我们解析接口返回的json数据，转换为javaBean
  
  在Android Studio中，可以利用 GsonFormat插件，快速创建符合 Gson要求的 javaBean;


二. 翻译插件 Translation


三. Lombok
  
   Lombok能通过注解的方式，在编译时自动为属性生成构造器、getter/setter、equals、hashcode、toString方法。
   出现的神奇就是在源码中没有getter和setter方法，但是在编译生成的字节码文件中有getter和setter方法。
   这样就省去了手动重建这些代码的麻烦，使代码看起来更简洁些。
   
   添加依赖
   compileOnly 'org.projectlombok:lombok:1.18.6'
   annotationProcessor 'org.projectlombok:lombok:1.18.6'