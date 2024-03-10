package Day6;

public class fibonacci {
    void fibonac(int count){
		int a=0,c=0;
		int b=1;
		System.out.println("0"+'\n'+"1");
		for(int i=2;i<=count;i++){
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}
public static void main(String args[]){
	fibonacci p=new fibonacci();
	p.fibonac(10);
	}
}
