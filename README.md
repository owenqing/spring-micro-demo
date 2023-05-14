## spring-micro-demo
基于 spring-boot 的微服务, 整合了 spring-cloud, spring-cloud-alibaba
- spring-boot 相当于一个 IOC 容器底座，提供了一个基础面
- spring-cloud, spring-cloud-alibaba 像是一些组件框架

### 微服务调用实验
- 使用 Nacos 做为服务发现组件
- 使用 OpenFeign 作为服务调用组件
- `order-service` 调用 =>`stock-service`, 
- `stock-service-api` 是 `stock-service` 的 Feign 协议包