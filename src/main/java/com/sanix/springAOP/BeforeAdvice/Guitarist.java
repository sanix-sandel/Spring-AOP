package com.sanix.springAOP.BeforeAdvice;

public class Guitarist implements Singer{
    private String lyric="You are gonna live forever in me";

    @Override
    public void sing(){
        System.out.println(lyric);
    }

}
