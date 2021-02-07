package 关于自增自减的实验;

public class Chapter2 {

	public static void main(String[] args) {
		int num=10;
		int result1=0;
		int result2=0;
		result1=++num;
		System.out.print("result1=：");
		System.out.println(result1);
		System.out.print(",num=:");
		System.out.println(num);
		num=10;
		result2=num++;
		System.out.print("result2=：");
		System.out.println(result2);
		System.out.print(",num=:");
		System.out.println(num);
		
	}

}
