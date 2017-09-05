# sa-struts-tutorial

[SAStruts](http://sastruts.seasar.org/index.html) のチュートリアルを利用した雛形プロジェクトです。

pom.xmlを追加しています。

## Getting started

本プロジェクトを動作させるにはJava, Maven3, Tomcat6, MySQLが必要です。

動作確認はMac OS Xで行っています。

### tomcat6

Macでインストールする参考手順です。

```bash
# tomcat を検索
brew search tomcat
# tomcat6をインストール
brew install tomcat@6
```

**動作確認**

1. 起動: `/usr/local/Cellar/tomcat\@6/6.0.51/libexec/bin/catalina.sh start`
1. 管理画面表示: http://localhost:8080/
1. 停止: `/usr/local/Cellar/tomcat\@6/6.0.51/libexec/bin/catalina.sh stop`

### MySQL

S2JDBCでMySQLを使えるようにしてあります。

`src/main/resources/jdbc.dicon` の接続情報を適宜書き換えて下さい。

```xml
<component name="xaDataSource"
    class="org.seasar.extension.dbcp.impl.XADataSourceImpl">
    <property name="driverClassName">
        "com.mysql.jdbc.Driver"
    </property>
    <property name="URL">
        "jdbc:mysql://localhost:13306/sastruts_sample"
    </property>
    <property name="user">"root"</property>
    <property name="password">""</property>
</component>
```

**データベースの作成**

```sql
create database if not exists sastruts_sample character set utf8;
```

**テストデータの投入**

作成したデータベースに`src/main/resources/test.sql`を実行して下さい。

### Build & Deploy

**Build**

`mvn package`

**Deploy**

`target/sa-struts-tutorial-1.0.4-sp4.war` をtomcatにデプロイします。

起動後、下記URLにアクセスします。

http://localhost:8080/


### Notes

参考までにIntelliJ IDEAで起動する設定を記載しておきます。

- Tomcat Home: `/usr/local/Cellar/tomcat@6/6.0.51/libexec`
- Tomcat base directory: `/usr/local/Cellar/tomcat@6/6.0.51/libexec`


