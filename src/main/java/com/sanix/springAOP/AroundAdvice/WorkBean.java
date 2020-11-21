package com.sanix.springAOP.AroundAdvice;

public class WorkBean {
    public void doSomeWork(int noOfTimes){
        for(int x=0; x<noOfTimes; x++){
            work();
        }
    }

    private void work(){
        System.out.println("");
    }
}
