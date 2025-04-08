### 概要
JetBrains IDEを買ったので試しにSpring Bootプロジェクトを作る...というのが目的の当リポジトリ。
慣れてきたらTypeScript系でも色々開発していきたい。

### application.propertiesについて
application.propertiesはDBのパスワードが描かれてるのでコミットしてない（Javaで良い感じに扱う方法あるのか？.envファイルを扱う方法、他言語だと簡単な方法がたくさんあるけど...）

動かしたい場合は
```properties
spring.application.name=yuyujan-dev-blog-spring

spring.datasource.url=jdbc:postgresql://<DB_IP>:<DB_PORT>/<DB_NAME>?currentSchema=<SCHEMA_NAME>
spring.datasource.username=<USER_NAME>
spring.datasource.password=<PASSWORD>

```
みたいな感じで定義すれば良い。
