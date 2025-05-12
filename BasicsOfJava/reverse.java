public class reverse {

	public static long reverseNum(long num){
        long reverse = 0;
        while(num != 0){
            int digit = (int)(num % 10);
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        
        return reverse;
    }
	public static void main(String[] args) {
		System.out.print(reverseNum(123));
	}
    // public static void main(String[] args) {
	// 	long num = 126456;
	// 	long pow = 1;
	// 	long reverse = 0;
		
	// 	while(pow < num){
	// 	    int digit = (int)((num/pow)%10);
	// 	    reverse = reverse * 10 + digit;
	// 	    pow *= 10;
	// 	}
		
	// 	System.out.print(reverse);
	// }
}