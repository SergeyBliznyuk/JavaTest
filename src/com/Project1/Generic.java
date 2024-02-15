package com.Project1;

public class Generic <T> {

    private T inf;

    public void setInfo (T str) {
        this.inf = str;
    }

    public T getInfo()  {
        return this.inf;
    }

    public <TT1, TT2> TT2 print (TT1 [] args, TT2 info) {
        for (Object item : args) {
            System.out.println(item);
        }
        return info;
    }
}
