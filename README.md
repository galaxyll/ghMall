#ghMall
##SpringBoot-based web store,expect not only with springboot

##项目架构
分布式

## 工程结构
maven项目，分层结构

## 模块说明

### ghmall-parent
1. 管理所有依赖版本号
2. 其他模块继承该模块
3. maven project

### ghmall-user
1. 功能：提供用户服务
2. 端口号:8080
3. url:user.ghmall.com
4. 依赖(springboot默认以外)
- web
- mybatis
- jdbc
- mysqlDriver
- mybatis plus

5.结构
  mvc结构
