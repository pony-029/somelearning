package mutiplThread;

public class MulThread3Ways {
    //继承Thread类并重写run方法
    public static class Mythread extends Thread{
        @Override
        public void run(){
            System.out.println("I am a child thread");
        }
    }

    //实现Runnable接口的run方法
    public static class RunnableTask implements Runnable{
        @Override
        public void run(){
            System.out.println("I am a child thread");
        }
    }

    public staic class CalllerTask implements  Callable<String>{
        public String call() throws Exception{
            return "hello";
        }
    }
    public static void  main(String []args){
//        Mythread mythread = new Mythread();
//        mythread.start();
//        RunnableTask runnableTask = new RunnableTask();
//        new Thread(runnableTask).start();
//        new Thread(runnableTask).start();

    }

}
