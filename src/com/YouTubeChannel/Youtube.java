package com.YouTubeChannel;

public class Youtube {
    public static void main(String[] args) {

        Channel apple = new Channel();

        Subscriber s1 = new Subscriber("A");
        Subscriber s2 = new Subscriber("B");
        Subscriber s3 = new Subscriber("C");

        apple.subscribe(s1);
        apple.subscribe(s2);
        apple.subscribe(s3);

        apple.unSubscribe(s2 );

        s1.subscriberChannel(apple);
        s2.subscriberChannel(apple);
        s3.subscriberChannel(apple);

        apple.upload("Apple Event is live!");
    }
}