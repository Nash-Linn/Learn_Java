public class StringToBasic {
	public static void main(String[] args) {
		//������������->String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);

		//String -> ��Ӧ�Ļ�����������
		// parseXXX
		String s5 = "123";
		//����OOP ������ͷ�����ʱ�����ϸ��
		//Integer.parseInt()
		//Double.parseDouble()
		//Float.parseFloat()
		//Long.parseLong()
		//Byte.parseByte()
		//Boolean.parseBoolean("true")
		//Short.parseShort()
		//���  ʹ�� �����������Ͷ�Ӧ�İ�װ��,����Ӧ����,�õ�������������

		int num1 = Integer.parseInt(s5);
		System.out.println(s5);
		System.out.println(Double.parseDouble(s5));

		//��ô���ַ���ת���ַ�char -> �����ǰ��ַ����ĵ�һ���ַ�d�õ�
		//��� s5.charAt(0) �õ� s5�ַ����ĵ�һ���ַ�
		System.out.println(s5.charAt(0));
	}
}