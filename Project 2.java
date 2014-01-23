public class Fibonacci {
	public static void main(String[] args) {
fibonacci();
}
public static boolean checkEven(int num){
	if (num%2==0){
	return true;
	}
	else {
		return false;
	}
}
static void fibonacci() {
    int ptr1 = 1;
	int ptr2 = 1;
    int temp = 0;
    int total = 0;
    System.out.print(ptr1 + " " + ptr2 + " ");
    for (int i = 0; i < 100; i++) {
        System.out.print(ptr1 + ptr2 + " ");
        temp = ptr1;
        ptr1 = ptr2;
        ptr2 = temp + ptr2;
        
        if(checkEven(ptr2)){
        	total += ptr2;
        }
        if(ptr2<4000000){
        	continue;
        }
        else if (ptr2>4000000)
    {
    	break;
    }
  }
   System.out.println(total);
}
}
