public class Problem_1 {
	public static void main(String[] args) {
		int ceil=1000;
		int num=1;
		int sum=0;
		while (num<ceil){
			if (num%3==0||num%5==0){
				sum+=num;
			}
			num++;
		}
		System.out.println(sum);  // 233168
	}
}
