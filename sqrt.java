package Day6;

public class sqrt {
    public static void main(String[] args) {
        int c=9;
        int t=c;
        while(Math.abs(t-(c/t)) > (1e-15)){
            t=(c/t + t)/2;
        }
        System.out.println(t);
    }
}
