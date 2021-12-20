public class FloatDetail {
	public static void main(String[] args) {
		//Java的浮点型常量(具体值)默认为double型,声明float型常量须后加'f'或'F'
		//float num1 = 1.1; 	//对不对? 错误
		float num2 = 1.1F; 		//对
		double num3 = 1.1; 		//对
		double num4 = 1.1f;		//对
		//通常情况下,应该使用double型,因为它比float型更精确
		double num5 = 2.1234567851;
		float num6 = 2.1234567851F;
		System.out.println(num5);
		System.out.println(num6);
		//浮点数使用陷阱 2.7 和 8.1/3 比较
		double num7 = 2.7;
		double num8 = 8.1/3; //2.7
		System.out.println(num7); //2.7
		System.out.println(num8); //一个接近2.7的小数,而不是2.7
		//得到一个重要的使用点,当我们对运算结果是小数的进行相等判断时,要小心
		//应该是以两个数的差值的绝对值在某个精度的范围内判断
		if(num7 == num8){
			System.out.println("相等");
		}
		//正确的写法
		if(Math.abs(num7 - num8) < 0.00000001) {
			System.out.println("相等");
		}
		System.out.println(Math.abs(num7 - num8));
	}
}