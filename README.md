#GradleSpringProject
* 建立一个基于Gradle的Springmvc+mybates+mysql+freeMarker的项目<br/>
* 其中:<br/>
* 数据库连接池:commons-dbcp<br/>
* {'mybatis:3.3.0'+'mybatis-spring:1.2.3'}(因为使用了org.mybatis.spring.mapper.MapperScannerConfigurer)[@MapperScan注解]<br/>
*
* 考虑打包时的环境变量时，请使用[gradle build -Denv=test]命令进行打包[dev/test/online]默认为dev<br/>
* 主要是使用tomcatRun运行<br/>
* http://localhost:8082/GradleSpringProject/controller/show/0<br/>