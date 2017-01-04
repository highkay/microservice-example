# 微服务架构调研

本文主要根据相关资料探讨微服务架构的一般性工程实践，并提供了相应的最简项目代码示例。

## 微服务概念

http://microservices.io/

## 微服务模块

### 服务注册和发现（必要）

eureka vs consul
http://www.nvisia.com/insights/comparison-of-spring-cloud-with-eureka-vs.-consul

更多选型比较
https://segmentfault.com/a/1190000004944218

### 分布式配置（必要）

spring-cloud-config vs zookeeper vs diconf vs archaius ...

### 服务网关（必要）

zuul vs kong/nginx ...

### 客户端服务框架（必要）

ribbon/feign/grpc vs motan vs

### 服务容错

hystrix

### 全链路监控（追踪）

spring-cloud-sleuth/zipkin

### 度量

servo

### 日志

blitz4j vs elk

### 消息队列

kalfka vs rabbitMQ

## 应用部署

### 应用构建

#### 容器构建

### 应用运维

#### 容器管理和调度

## 参考文档

构建微服务体系结构的最佳实践
http://www.infoq.com/cn/articles/best-practice-of-constructing-micro-service-system
http://www.infoq.com/cn/articles/best-practice-of-constructing-micro-service-system-part02
http://www.infoq.com/cn/articles/best-practice-of-constructing-micro-service-system-part03

关于架构优化和设计，架构师必须知道的事情
http://www.infoq.com/cn/articles/architecture-optimization-and-design-the-architect-must-know

实施微服务，我们需要哪些基础框架？
http://www.infoq.com/cn/articles/basis-frameworkto-implement-micro-service
