public class TestThreadYeild {
    public static void main(String[] args){
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread{
    MyThread(String s){
        super(s);
    }

    public void run(){
        for(int i=1; i<=100;i++){
            System.out.println(getName() +": "+i);
            if(i%10 == 0){
                yield(); //到10就切换一个线程
            }
        }
    }
}
