package com.seven.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class HelloServer {


    public static void main(String[] args) {
        //定义一对线程组
        //主线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //从线程组
        EventLoopGroup workerGroup = new NioEventLoopGroup();


        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            serverBootstrap.group(bossGroup, workerGroup)
                    .channel(new NioServerSocketChannel().getClass())
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childHandler(new HelloServerInit());
            ChannelFuture channelFuture = serverBootstrap.bind(8088).sync();
            channelFuture.channel().close().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
