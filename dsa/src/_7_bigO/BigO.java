package _7_bigO;

public class BigO {

//	O(n)
	int addUp(int n){
	    int sum = 0;
	    for(int i = 0; i <= n; i++) {
	        sum += i;
	    }
	    return sum;
	}
	
//	O(1)
	int addUp(int n){
	    int sum = n * (n + 1) / 2;
	    return sum;
	}
	
}
