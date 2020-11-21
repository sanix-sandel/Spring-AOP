package com.sanix.springAOP.AfterAdvice;

import com.sanix.springAOP.BeforeAdvice.Singer;

public class Guitarist implements Singer {
    private String lyric="You are gonna live forever in me";

    @Override
    public void sing(){
        System.out.println(lyric);
    }

}
