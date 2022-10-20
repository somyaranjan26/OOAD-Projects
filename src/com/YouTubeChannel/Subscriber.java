package com.YouTubeChannel;

public class Subscriber implements Observer {

    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", " + channel.title);
    }

    @Override
    public void subscriberChannel(Channel ch)
    {
        channel = ch;
    }
}
