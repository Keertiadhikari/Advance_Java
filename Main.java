public class GradedLab3 {
private int sum = 0;
public static void main(String[] args){
    GradedLab3 ths = new GradedLab3();
    ths.Sum();
}

public void Sum(){
    ExecutorService executor = Executors.newFixedThreadPool(1000);     
    for(int i =0 ; i<1000 ; i++){
        executor.execute(new Runnable(){
            public void run() {
                System.out.println("The sum is " + sum + Thread.currentThread());
                counter();
                }

            public synchronized void counter(){
                sum++;
            }
            });
        }
        executor.shutdown();
    }
}