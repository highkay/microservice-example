# 微服务架构调研

本文主要根据相关资料探讨微服务架构的一般性工程实践，并提供了相应的最简项目代码示例。

## 微服务概念

http://microservices.io/

## 微服务模块

### 服务注册和发现（必要）

eureka vs consul
http://www.nvisia.com/insights/comparison-of-spring-cloud-with-eureka-vs.-consul

eureka提供了更好的java技术栈的整合，还有即将发布的2.0，生态圈比较成熟，也有三方的grpc整合。consul有更多的java之外的优势，go保证性能，但是在java层面需要在服务发现之外需要更多的胶水代码。可以考虑牺牲一些简单性，同时采用两个设施，一个用来管理微服务，一个用来管理docker。

更多选型比较
https://segmentfault.com/a/1190000004944218

### 分布式配置（必要）

spring-cloud-config vs zookeeper vs diconf vs archaius ...

spring-cloud-config把git作为设施，很有意思，足够用了。

### 服务网关（必要）

zuul vs kong/nginx ...

zuul的性能足够用了。

### 客户端服务框架（必要）

ribbon/feign/grpc vs motan

ribbon/feign/grpc足够用了。

### 服务容错

hystrix

### 全链路监控（追踪）

spring-cloud-sleuth/zipkin

### 度量

servo vs metrics

http://www.moskito.org/
https://github.com/naver/pinpoint
https://www.icinga.com/
https://mmonit.com/monit/
http://www.hawkular.org/

### 日志

blitz4j vs elk

elk非常成熟和强大。

### 消息队列

kalfka vs rabbitMQ

kalfka似乎更好，需要看实际场景。

### 异步编程

rxjava vs vert.x

## 应用部署

[使用Spring Cloud与Docker实战微服务](https://www.gitbook.com/book/eacdy/spring-cloud-book/details)

这个里面讲的比较全了，我个人觉得设施层面没什么需要定制的，可以先docker跑起来，微服务本身也有现成的脚本打镜像，不过考虑到配置和数据的测试问题，需要一定的投入做持续集成（Rancher）。

### 应用构建

#### 容器构建

### 应用运维

#### 容器管理和调度

## 其他

### spring-boot

[Spring Boot中文参考手册](https://qbgbook.gitbooks.io/spring-boot-reference-guide-zh/content/)
[Spring Boot构建RESTful API与单元测试](http://blog.didispace.com/springbootrestfulapi/)
[Spring Boot中使用Swagger2构建强大的RESTful API文档](http://blog.didispace.com/springbootswagger2/)
[其他Spring Boot相关](http://blog.didispace.com/categories/Spring-Boot/page/3/)
https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples
[master spring](https://github.com/eugenp/tutorials)

## 参考文档

http://itmuch.com/

http://xujin.org/

http://springcloud.cn/

构建微服务体系结构的最佳实践
http://www.infoq.com/cn/articles/best-practice-of-constructing-micro-service-system
http://www.infoq.com/cn/articles/best-practice-of-constructing-micro-service-system-part02
http://www.infoq.com/cn/articles/best-practice-of-constructing-micro-service-system-part03

关于架构优化和设计，架构师必须知道的事情
http://www.infoq.com/cn/articles/architecture-optimization-and-design-the-architect-must-know

实施微服务，我们需要哪些基础框架？
http://www.infoq.com/cn/articles/basis-frameworkto-implement-micro-service

### 示例代码

https://github.com/yidongnan/spring-cloud-netflix-example
http://git.oschina.net/zhou666/spring-cloud-7simple
https://github.com/zpng/spring-cloud-7simple

