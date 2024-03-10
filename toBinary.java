package Day6;

public class toBinary {
    String s="";
    String binary(int decimal){
        for(int i=7;i>=0;i--){
            int m = (int) Math.pow(2,i);
            if(m<=decimal){
                s+=1;
                decimal = decimal-m;
            }
            else{
                s+=0;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        toBinary b=new toBinary();
        System.out.println(b.binary(111));
    }
}
