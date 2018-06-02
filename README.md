# dubboFrame
##一个使用dubbo框架的demo
###使用IDEA，maven，springmvc整合
###分为customer，dubboapi，provider三个模块
#####最终customer，provider打包成war包，dubboapi是共用jar包
--
###常见错误解决:
* customer 和 provider的接口包要相同名
* 使用使用multicast广播注册中心时，需要在JVM配置-Djava.net.preferIPv4Stack=true启动参数
* 使用zookeeper时，zookeeper本地配置的data文件要更改权限为777
* ...