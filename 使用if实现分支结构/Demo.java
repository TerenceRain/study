package ʹ��ifʵ�ַ�֧�ṹ;

public class Demo {

	public static void main(String[] args) {
		int a=10,b=-5;
		if(a>=b){
			System.out.println("a���ڵ���b");//yes
			
		}else{
			System.out.println("aС��b");//no
		}
		if(a%2==0){
			System.out.println("a��ż��");	
		}
		if(b>0){
			System.out.println("b������");//no
		}
		if((a>0)&&(b>0)){
			System.out.println("a��b��������");//no
			
		}
		if(((a>0)&&(b>0)||(a<0)&&(b<0))){
			System.out.println("a��b��˵Ľ��������");
		}
	}

}
