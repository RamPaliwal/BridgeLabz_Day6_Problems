package Day6;
import Day6.toBinary;
public class SwapNibble {
    String swap_nibble(String s){
        String nibble1 = s.substring(0,4);
        String nibble2 = s.substring(4,8);
        String nibble = nibble2+nibble1;
        return nibble;
    }

    int decimal(String toconvert){
        int decimal=0;
        for(int i=7;i>=0;i--){
            if((Character.getNumericValue(toconvert.charAt(i)))==1)
            {
                decimal = decimal + (int) Math.pow(2, 7-i);
            }
        }
        return decimal;
    }
    public static void main(String[] args) {
        toBinary tb=new toBinary();
        String s= tb.binary(48);
        SwapNibble sn = new SwapNibble();
        String swapped = sn.swap_nibble(s);
        int deci = sn.decimal(swapped);
        System.out.println("Swapped form is: "+swapped+" and its decimal value is: "+deci);
    }
}
