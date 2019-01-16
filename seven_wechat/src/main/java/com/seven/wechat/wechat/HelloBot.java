package com.seven.wechat.wechat;

import io.github.biezhi.wechat.WeChatBot;
import io.github.biezhi.wechat.api.annotation.Bind;
import io.github.biezhi.wechat.api.constant.Config;
import io.github.biezhi.wechat.api.enums.AccountType;
import io.github.biezhi.wechat.api.model.WeChatMessage;
import io.github.biezhi.wechat.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloBot extends WeChatBot {
    Logger log = LoggerFactory.getLogger(HelloBot.class);

    public HelloBot(Config config) {
        super(config);
    }

   /* @Bind(msgType = MsgType.TEXT)
    public void handleText(WeChatMessage message) {
        if (StringUtils.isNotEmpty(message.getName())) {
            System.out.println("接收到 [{}] 的消息: {}"+message.getName()+"文本"+message.getText());
            this.sendMsg(message.getFromUserName(), "自动回复: " + message.getText());
        }
    }*/

    /* @Bind(accountType = AccountType.TYPE_GROUP)
     public void groupMessage(WeChatMessage message) {
         if(StringUtils.isNotEmpty(message.getName())){
             log.info("接收到群 [{}] 的消息: {}", message.getName(), message.getText());
             this.sendMsg(message.getFromUserName(), "自动回复: " + message.getText());
         }
     }*/
    @Bind(accountType = AccountType.TYPE_FRIEND)
    public void friendMessage(WeChatMessage message) {
        if (StringUtils.isNotEmpty(message.getMineNickName())) {
            log.info("接收到好友 [{}] 的消息: {}", message.getName(), message.getText());
            this.sendImg(message.getFromUserName(), "D:\\workspace\\timg.jpg");
        }
    }

    public static void main(String[] args) {
        new HelloBot(Config.me().autoLogin(true).showTerminal(true)).start();
    }
}
