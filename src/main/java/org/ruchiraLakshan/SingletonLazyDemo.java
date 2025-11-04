package org.ruchiraLakshan;

class LazyTest {

    private static LazyTest check;

    private LazyTest() {}

    //use synchronization for thread - safe
    public synchronized static LazyTest getCheck() {
        if (check == null) {
            check = new LazyTest();
        }
        return check;
    }

    public void Message(){
        System.out.println("Lazy Initialization");
    }
}


public class SingletonLazyDemo {
    public static void main(String[] args){

        LazyTest lazy = LazyTest.getCheck();
        lazy.Message();
    }
}
