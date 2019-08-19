#ghMall
##SpringBoot-based web store,expect not only with springboot

##项目架构
分布式<br>
controller<-->(dubbo)<-->service+dao

## 工程结构
maven项目，分层结构

## 模块说明
###ghmall-api
提供所有外部接口

### ghmall-parent
1. 管理所有依赖版本号
2. 其他模块继承该模块
3. maven project

### ghmall-common-util
通用模块
- web
- test
- fastjson
- dubbo

### ghmall-service-util
服务模块
- mybatis
- jdbc
- mysqlDriver
- mybatis plus
- redis
### ghmall-web-util
前端模块

### ghmall-user
1. 功能：提供用户服务
2. 端口号:8080
3. url:user.ghmall.com
4. 依赖(springboot默认以外)<br>
#### 结构
 ghmall-user-service
> 端口号:8070

 ghmall-user-web
> 端口号:8080

### ghmall-manage
后台管理模块
####　结构
 ghmall-manage-web
> 端口号:8081


 ghmall-manage-service
> 端口号: