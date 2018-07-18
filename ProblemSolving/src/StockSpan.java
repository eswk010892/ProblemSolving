import java.util.Stack;
import java.util.Arrays;
public class StockSpan {
static void calculateSpan(int price[],int n,int S[]){
	Stack<Integer> sp = new Stack<>();
	sp.push(0);
	for(int i = 0;i<n;i++){
	while((!sp.isEmpty())&&price[sp.peek()] <= price[i])
		sp.pop();
	S[i] = (sp.isEmpty())?(i+1):(i-sp.peek());
	sp.push(i);
	}
	}
static void printArray(int arr[]){
	System.out.println(Arrays.toString(arr));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int price[] = {10, 4, 5, 90, 120, 80};
	        int n = price.length;
	        int S[]=new int[n];
	        calculateSpan(price,n,S);
	        printArray(S);
	}

}
