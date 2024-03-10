package Day6;

import java.util.Scanner;
public class Stopwatch {
    long start_time=0;
    long stop_time=0;
    public long start(){
        start_time=System.currentTimeMillis();
        System.out.println("Start time is: "+start_time);
        return start_time;
    }
    public void stop(){
        stop_time=System.currentTimeMillis();
        System.out.println("Stop time is: "+stop_time);
        System.out.println("Elapsed time in seconds is: "+((stop_time-start_time)/1000));
    }
    public static void main(String[] args) {
        Stopwatch sw=new Stopwatch();
        Scanner sc =new Scanner(System.in);
        System.out.println("Press 1 to start: ");
        int input1 = sc.nextInt();
        if(input1==1){
            sw.start();
        }
        System.out.println("Press 2 to stop: ");
        int input2=sc.nextInt();
        if(input2==2){
            sw.stop();
        }
    }
}
