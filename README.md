#   说明

##	1.搭建环境

* 创建数据库`jwglxt`，注意使用`utf-8`编码
* 导入表:`/main/resources/table/import.sql`
* 进行测试
  ```
  1.运行。参照下面的运行方式，或者自行用tomcat运行本项目
  2.浏览器输入:http://localhost:8080/menu/selectByParentId。能获取数据，没有报错信息，则环境搭建成功。
  ```




##	2.约定

* 项目中`Menu**`均为测试，可以参考这个开发标准。
* 请不要随意更改配置文件。
* git控制版本，在自己的分支开发，完成一个功能后合并到master分支。




##  3.运行

*   进入`jwglxt`文件夹
*   输入命令：`mvn clean compile tomcat7:run`，启动服务器
*   浏览器输入：`http://localhost:8080/`
