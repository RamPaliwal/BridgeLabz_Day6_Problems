package Day6;

public class Prime {
    public static void main(String[] args) {
        int num=4;
        boolean prime=true;
        if(num==0 || num==1){
            System.out.println(num+" is not a prime number");
        }
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
