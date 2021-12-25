public class ForceConvertDetail {
	public static void main(String[] args){
		//演示强制类型转换
		//int x = (int)10*3.5 + 6*1.5; //错误 强转符号只针对于最近的操作数有效.往往会使用小括号提升优先级
		int x = (int)(10*3.5 + 6*1.5); //44.0 -> 44
		System.out.println(x);

		char c1 = 100; //ok
		int m = 100; //ok
		//char c2 = m; //错误
		char c3 = (char)m; //ok
		System.out.println(c3);//100对应的字符d
		
	}
}