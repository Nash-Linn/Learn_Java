public class StringToBasic {
	public static void main(String[] args) {
		//基本数据类型->String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);

		//String -> 对应的基本数据类型
		// parseXXX
		String s5 = "123";
		//会在OOP 讲对象和方法的时候会详细讲
		//Integer.parseInt()
		//Double.parseDouble()
		//Float.parseFloat()
		//Long.parseLong()
		//Byte.parseByte()
		//Boolean.parseBoolean("true")
		//Short.parseShort()
		//解读  使用 基本数据类型对应的包装类,的相应方法,得到基本数据类型

		int num1 = Integer.parseInt(s5);
		System.out.println(s5);
		System.out.println(Double.parseDouble(s5));

		//怎么把字符串转成字符char -> 含义是把字符串的第一个字符d得到
		//解读 s5.charAt(0) 得到 s5字符串的第一个字符
		System.out.println(s5.charAt(0));
	}
}