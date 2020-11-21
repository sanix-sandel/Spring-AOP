package com.sanix.springAOP.AroundAdvice;

import org.springframework.aop.framework.ProxyFactory;

public class ProfilingDemo {

    public static void main(String [] args){
        WorkBean bean=getWorkerBean();
        bean.doSomeWork(10000000);
    }

    private static WorkBean getWorkerBean(){
        WorkBean target=new WorkBean();

        ProxyFactory factory=new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new ProfilingInterceptor());

        return (WorkBean)factory.getProxy();
    }
}
