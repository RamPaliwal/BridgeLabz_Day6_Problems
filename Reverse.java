package Day6;

public class Reverse {
    public static void main(String[] args) {
        int number=1234;int reverse=0;
        while(number>0){
            int rem=number%10;
            reverse = reverse*10 + rem;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
