public class FloatDetail {
	public static void main(String[] args) {
		//Java�ĸ����ͳ���(����ֵ)Ĭ��Ϊdouble��,����float�ͳ�������'f'��'F'
		//float num1 = 1.1; 	//�Բ���? ����
		float num2 = 1.1F; 		//��
		double num3 = 1.1; 		//��
		double num4 = 1.1f;		//��
		//ͨ�������,Ӧ��ʹ��double��,��Ϊ����float�͸���ȷ
		double num5 = 2.1234567851;
		float num6 = 2.1234567851F;
		System.out.println(num5);
		System.out.println(num6);
		//������ʹ������ 2.7 �� 8.1/3 �Ƚ�
		double num7 = 2.7;
		double num8 = 8.1/3; //2.7
		System.out.println(num7); //2.7
		System.out.println(num8); //һ���ӽ�2.7��С��,������2.7
		//�õ�һ����Ҫ��ʹ�õ�,�����Ƕ���������С���Ľ�������ж�ʱ,ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ��ĳ�����ȵķ�Χ���ж�
		if(num7 == num8){
			System.out.println("���");
		}
		//��ȷ��д��
		if(Math.abs(num7 - num8) < 0.00000001) {
			System.out.println("���");
		}
		System.out.println(Math.abs(num7 - num8));
	}
}