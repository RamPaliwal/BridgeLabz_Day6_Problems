package Day6;

public class PerfectNumber {
    public static void main(String[] args) {
        int num=56;int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
