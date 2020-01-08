/*
 * 作者：刘时明
 * 时间：2019/12/29-16:29
 * 作用：
 */
package com.novel.im.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WSServer implements ApplicationListener<ContextRefreshedEvent>
{
    private EventLoopGroup mainGroup;
    private EventLoopGroup subGroup;
    private ServerBootstrap server;
    private ChannelFuture future;

    private WSServer()
    {
        mainGroup = new NioEventLoopGroup();
        subGroup = new NioEventLoopGroup();
        server = new ServerBootstrap();
        server.group(mainGroup, subGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new WSServerInit());
    }

    public void startWs()
    {
        try
        {
            future = server.bind(8000).sync();
            log.info("ws server start...");
            future.channel().closeFuture().sync();
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            mainGroup.shutdownGracefully();
            subGroup.shutdownGracefully();
        }
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent refreshedEvent)
    {
        if (refreshedEvent.getApplicationContext().getParent() == null)
        {
            this.startWs();
        }
    }
}
