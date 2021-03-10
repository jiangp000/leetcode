package myCallable;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class myCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("this is my callable ");
        return  null;
    }

    public static void main(String[] args) {
        myCallable test = new myCallable();
        FutureTask futuretask = new FutureTask(test);
        new Thread(futuretask).start();

    }
}
