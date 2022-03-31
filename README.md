# wework-message

企业微信-会话内容存档 java SDK
本包为最基础的聊天记录拉取 解密 媒体文件下载

### 包含以下包

- [wework-sdk](https://github.com/aa24615/wework-sdk) 企业微信 会话内容存档 sdk调用接口

### 相关集成包

- [wework-msgaudit](https://github.com/aa24615/wework-msgaudit) 带web管理 支持多企业 入库mysql


### 把动态库拷贝到系统

linux系统
```shell
cp ./lib/WeWorkFinanceSdk.so /usr/lib/WeWorkFinanceSdk.so
```

win系统

```shell
//请把lib下四个文件拷贝到C盘 C:\Windows\System32\

libcrypto-1_1-x64.dll
libcurl-x64.dll
libssl-1_1-x64.dll
WeWorkFinanceSdk.dll
```

### 调用示例

```java

import com.php127.wework.message.Message;

 String prikey = "-----BEGIN PRIVATE KEY-----\n" +
                "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAL7tJ+y+xwF6vSiQ\n" +
                "flHm7FLs4Qpfp5gM9Ud1bzN91i8CKkJTPwhr+eN3stfFkf3rgoEujF0CQZZVzeTL\n" +
                "M/id6nbQ7OBbVgN7v+Gww5d7mbEV6PVau+DDms8BZej/BWWXppo+57K4tcNuETQr\n" +
                "AAf/POuV2HGaZR8rd...............................YJrBhmg6oYf+FE//\n" +
                "soi5bDKu4H0ytAxXJfziwOSqglT5RFTY60ez6ge89CseU7intZpbAkEAqr6/QAlC\n" +
                "cFNfb6QezPLiUXZJYrMBNYPTio+D7HOiGVK9HStB/IZqWWkSBuNvqxgwW+DOmsTn\n" +
                "DJdIFET1TStlFg==\n" +
                "-----END PRIVATE KEY-----";

Message message = new Message("corpid","secret",prikey);

//============可选配置项===========//

//媒体保存位置
message.setSavePath("./msgfile/");
//拉取超时
message.setTimeout(60);
//设置代理
message.setProxy("127.0.0.1:8080");
message.setPasswd("123456");

//============拉取聊天记录===========//

ArrayList<?> list =  message.getList(0,100); // seq limit

for (int i = 0; i < list.size(); i++) {
    
    Data data = (Data) list.get(i);
    
    System.out.println(data.getMsgid()); //消息id
    System.out.println(data.getSeq()); //seq
    System.out.println(data.getText()); //文本消息
    System.out.println(data.getMsgfrom()); //发送方
    System.out.println(data.getSdkfileid()); //媒体文件id
    System.out.println(data.getTolist()); //接收方列表
    System.out.println(data.getRoomid()); //群聊id
    System.out.println(data.getMsgtype()); //消息类型
    System.out.println(data.getMsgdata()); //消息内容
    System.out.println(data.getMediaPath()); //媒体文件路径
    System.out.println(data.getAction()); //消息动作
    System.out.println(data.getMsgtime()); //消息时间戳(13位)
}

```


###  参与贡献

1. fork 当前库到你的名下
2. 在你的本地修改完成审阅过后提交到你的仓库
3. 提交 PR 并描述你的修改，等待合并


###  License

[MIT license](https://opensource.org/licenses/MIT)


