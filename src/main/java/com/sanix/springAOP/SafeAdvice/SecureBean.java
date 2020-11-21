package com.sanix.springAOP.SafeAdvice;

public class SecureBean {
    //This class will be securing using AOP
    public void writeSecureMessage(){
        System.out.println("every time I learn something new, "
            +"it pushes some old stuff out of my brain");
    }
}
