---
### 👉作者QQ ：1556708905 微信：zheng0123Long (支持修改、部署调试、定制毕设)

### 👉接网站建设、小程序、H5、APP、各种系统等

### 👉选题+开题报告+任务书+程序定制+安装调试+ppt 都可以做
---

**博客地址：
[https://blog.csdn.net/2303_76227485/article/details/138862399](https://blog.csdn.net/2303_76227485/article/details/138862399)**

**视频演示：
[https://www.bilibili.com/video/BV1L1421B7vG/](https://www.bilibili.com/video/BV1L1421B7vG/)**

**毕业设计所有选题地址：
[https://github.com/zhengjianzhong0107/allProject](https://github.com/zhengjianzhong0107/allProject)**

## 基于Java+Springboot+Vue的景区旅游购票管理系统(源代码+数据库+8000字文档)140

## 一、系统介绍
本项目前后端分离，分为管理员、用户两种角色

### 1、用户：
- 注册登录、景区浏览、购买门票、按分类查询、按地区查询、模糊搜索、景区收藏、我的订单、我的评论、公告、个人信息、修改密码
### 2、管理员：
- 用户管理、景区管理、景区类别管理、地区管理、订单管理、评论管理、公告管理、日志管理、统计分析

## 二、所用技术
后端技术栈：

- Springboot
- MybatisPlus
- Mysql
- Maven

前端技术栈：

- Vue3
- Vue-router 
- axios 
- bootstrap

## 三、环境介绍

基础环境:IDEA/eclipse, JDK1.8, Mysql5.7或以上, Maven3.6, node14, navicat, vscode

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图
文档截图
![contents](./picture/picture0.png)
### 1、用户
![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)
![contents](./picture/picture19.png)
### 2、管理员：
![contents](./picture/picture20.png)
![contents](./picture/picture21.png)
![contents](./picture/picture22.png)
![contents](./picture/picture23.png)
![contents](./picture/picture24.png)
![contents](./picture/picture25.png)
![contents](./picture/picture26.png)
![contents](./picture/picture27.png)
![contents](./picture/picture28.png)
![contents](./picture/picture29.png)
![contents](./picture/picture30.png)
![contents](./picture/picture31.png)
![contents](./picture/picture32.png)

## 五、浏览地址
前台登录页面: http://localhost:8000/

- 用户账号/密码：ddd/123456

后台登录页面: http://localhost:8000/admin

- 管理员账号/密码：admin/123456
## 六、部署教程

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并执行项目的sql

2. 使用IDEA/Eclipse导入nongchanpinxiaoshou项目，导入时，若为maven项目请选择maven; 等待依赖下载完成

3. 修改resources目录下面application.yml里面的数据库配置,BASE_LOCATION文件路径配置

4. com/gk/study/MySpringApplication.java启动后端

5. vscode或idea打开web项目

6. 在编译器中打开terminal，执行npm install 依赖下载完成后执行 npm run dev,执行成功后会显示访问地址

