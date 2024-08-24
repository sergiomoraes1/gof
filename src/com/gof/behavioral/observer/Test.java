package com.gof.behavioral.observer;


public class Test {

    public static void main(String[] args) {

        News news = new News();

        Observer observer1 = new Jornal1("The New York Times");
        Observer observer2 = new Jornal2("The Wall Street Journal");

        news.attach(observer1);
        news.attach(observer2);

        news.setState("1");
        news.setState("2");

        news.detach(observer1);
        news.setState("3");

    }
}
