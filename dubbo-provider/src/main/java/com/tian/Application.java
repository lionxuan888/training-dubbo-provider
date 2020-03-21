package com.tian;

/**
 * 创建spring web的过程, 非spring boot, 使用tomcat的web.xml加载spring
 * 1. 创建普通的maven架构的工程
 * 2. 创建tomcat用到的web.xml
 * 3. 在web.xml里声明listener和servlet等组件, 让tomcat去加载spring
 * 4. 创建spring用的applicationContext
 * 5. 引入相关的jar包,
 *    5.1 spring web相关的包
 *    5.2 servlet的包
 *    5.3 aspectj 需要单独引入
 *    5.4 引入dubbo相关的jar包
 * 6. idea的配置, 在Project Structure 里进行设置, 设置成web工程, 并需要把lib引入进去, 要不然会报noClass异常
 *    需要注意的两点Module和artifact都需要单独设置, 在module里设置tomcat的部署描述符, artifact里设置引入lib包
 * 7 dubbo配置相关: https://www.cnblogs.com/chanshuyi/p/5144288.html  (Dubbo配置方式详解)
 * Created by logan on 2020/3/11.
 */
public class Application {
}
