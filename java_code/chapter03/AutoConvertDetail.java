public class AutoConvertDetail {
	public static void main(String[] args) {
		//ϸ��1:�ж������͵����ݻ������ʱ
		//ϵͳ�����Զ�����������ת������������������������,Ȼ���ٽ��м���
		int n1 = 10; //ok
		//float d1 = n1 + 1.1; //���� n1 + 1.1 => ��������� double
		float d2 = n1 + 1.1f; //��ȷ ��1.1ת��Ϊfloat
		double d3 = n1 + 1.1; //��ȷ

		//ϸ��2:�����ǰѾ���(����)����������͸�ֵ������(����)С����������ʱ,�ͻᱨ��,��֮�ͻ�����Զ�����ת��
		//int n2 = 1.1; //����

		//ϸ��3:(byte,short)��char ֮�䲻���໥�Զ�ת��
		//����������byteʱ,���жϸ����Ƿ���byte��Χ��,����ǾͿ���
		byte b1 = 10; //��ȷ  , -128-127
		int n2 = 1; //n2��int
		//byte b2 = n2; //����;ԭ��:����Ǳ�����ֵ,�ж�����
		//char c1 = b1; //����,byte�����Զ�ת��Ϊchar

		//ϸ��4:byte,short,char �������߿��Լ���,�ڼ���ʱ����ת��Ϊint����
		byte b2 = 1;
		short s1 = 1;
		//short s2 = b2 + s1; //����, b2 + s1 => int
		int s2 = b2 + s1; //��ȷ
		//boolean������ת��
		boolean pass = true;
		//int num100 = pass; //����;boolean���������͵��Զ�ת��
		//�Զ�����ԭ��:���ʽ����������Զ�����Ϊ ����������������
		//��һ����
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double num500 =	b4 + s3 + num200 + num300;  //����Ϊ double
		// float num500 =	b4 + s3 + num200 + num300;  //����Ϊ double;���ܰ�doubleת��Ϊfloat
		
	}
}