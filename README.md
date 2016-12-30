# 项目说明

该项目是一个初步验证微服务microservice的框架程序，基于netflix开源的eureka和zuul，以及spring技术栈（主要是spring-boot和spring-cloud）搭建的最小化示例程序，包含验证微服务，服务注册和代理网关等核心功能。

### 项目结构

* 服务发现（总线）service-discovery
* 代理网关  api-gateway
* 微服务 user-service

### 运行环境

* jdk8+
* maven3.3+(下载的程序较多，建议添加阿里云的镜像)

### 操作步骤

* 从github clone项目到本地
* 在根目录执行mvn install下载依赖并且构建项目
* 进入service-discovery目录，执行mvn spring-boot:run启动
* 进入api-gateway目录，执行mvn spring-boot:run启动
* 进入 user-service目录，执行mvn spring-boot:run启动
* 以上顺序最好不要打乱，当然打乱也没有太大的问题

### 验证步骤

* 微服务user-service集成了swagger2，可以通过http://localhost:8081/swagger-ui.html中的添加用户接口来添加一个用户，编辑一个含有username和password属性的json提交即可。然后通过获取用户列表接口来验证一下添加是否成功。该步骤验证user-service本身是否已经能工作。
* 打开http://localhost:8761/可以发现Application栏目中已经有LOGIN模块了。该步骤说明微服务已经注册成功。
* 打开http://localhost:8080/user/看到有第一步提交的数据。该步骤说明代理网关也已经正常工作。
