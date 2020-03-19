### 重点说明

#### 1 Druid加解密
```java
public static void main(String[] args) throws Exception {
    String[] arr = genKeyPair(512);
    System.out.println("privateKey:" + arr[0]);
    System.out.println("publicKey:" + arr[1]);
    System.out.println("password:" + ConfigTools.encrypt(arr[0], "root"));
}   
```
#### 2 springboot启动执行sql
```yaml
spring:
  datasource:
   初始化sql配置 用schema和data都可以
    schema:
      - classpath:sql/cat.sql
    data:
     - classpath:sql/db_user.sql
    initialization-mode: always    
```
#### 3 日期类型转换
* get请求是在url后面拼接参数，spring mvc有默认的类型转换器来处理数据，我们也可以添加自己的转换器，
只需要实现convert接口，参见DateConfig类。
* **如果前端传输数据编码ajax.setRequestHeader("content-type","application/x-www-form-urlencoded")**，
传输类容为json字符串，后端可以正常接收数据。**如果前端传输数据编码content-type:application/json**发送get请求,
后端则不能正常接收数据。
* post请求携带的数据，我们用jackson来转换

#### 4 枚举转换
* get请求还是需要实现convert接口
* post请求，枚举默认只支持传枚举值字符串。默认jackson不支持转换。如果使用@JsonValue 用在枚举指定字段上，
可以传字符串，将支持转换。


