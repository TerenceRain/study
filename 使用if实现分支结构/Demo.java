package 使用if实现分支结构;

public class Demo {

	public static void main(String[] args) {
		int a=10,b=-5;
		if(a>=b){
			System.out.println("a大于等于b");//yes
			
		}else{
			System.out.println("a小于b");//no
		}
		if(a%2==0){
			System.out.println("a是偶数");	
		}
		if(b>0){
			System.out.println("b是正数");//no
		}
		if((a>0)&&(b>0)){
			System.out.println("a和b都是正数");//no
			
		}
		if(((a>0)&&(b>0)||(a<0)&&(b<0))){
			System.out.println("a和b相乘的结果是正数");
		}
	}

}
