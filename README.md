# 暖德英语园

Java 8 + Maven 基础项目，包含命令行入口和 JUnit 单元测试。

## 开发要求

- JDK 8
- Maven 3.9.9

本云环境已安装工具，可在 Bash 中激活：

```bash
export JAVA_HOME=/workspace/toolchains/jdk8u482-b08
export PATH="$JAVA_HOME/bin:/workspace/toolchains/apache-maven-3.9.9/bin:$PATH"
```

## 编译、测试和运行

在仓库根目录执行：

```bash
mvn -B -s /workspace/toolchains/settings.xml -Djavax.net.ssl.trustStore=/etc/ssl/certs/java/cacerts -Dmaven.repo.local=/workspace/toolchains/m2 clean verify
java -jar target/englishpark-1.0.0-SNAPSHOT.jar
java -jar target/englishpark-1.0.0-SNAPSHOT.jar Alice
```

入口：`src/main/java/com/nuande/englishpark/App.java`。
测试：`src/test/java/com/nuande/englishpark/AppTest.java`。

当前项目不需要数据库、外部服务或密钥。

云环境通过 Maven settings 使用平台 HTTPS 代理，并使用系统 Java 信任库验证 TLS。
在其他机器上安装 JDK 8 和 Maven 后，可直接执行 `mvn clean verify`。
