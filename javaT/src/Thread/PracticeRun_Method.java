package Thread;
class Two extends Thread{
    public void run(){  //override the run method
        for(int i=1;i<=10;i++){
            System.out.println("2*"+i+"="+2*i);
        }
    }

}
class Three extends Thread{
    public void run() {  //override the run method
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
        }
    }
}

public class PracticeRun_Method {
    public static void main(String args[]){
        Two t2= new Two();
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        Three t3 = new Three();
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY); // MIN_Priority is static variable in class hence it is called bby the class name .
        t2.setPriority(Thread.NORM_PRIORITY);
    }
}
