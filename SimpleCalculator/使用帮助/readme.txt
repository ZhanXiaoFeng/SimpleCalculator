编译：javac SimpleCalculator/*
运行：java SimpleCalculator

生成jar,先回到SimpleCalculator文件夹上一层
新建MANIFEST.MF文件，参考内容如下：
Manifest-Version: 1.0
Mainfest-Version: 1.0
Created-By: 1.8.1_101(Sun Microsystems Inc.)
Main-Class: SimpleCalculator/SimpleCalculator


生成jar包
jar cvfm SimpleCalculator.jar MANIFEST.MF - C SimpleCalculator/
生成bat文件
javaw -jar SimpleCalculator.jar

运行
点击SimpleCalculator.bat文件