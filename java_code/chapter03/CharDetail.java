//��ʾchar�Ļ���ʹ��
public class CharDetail {
	public static void main(String[] args) {
		//��java��,char�ı�����һ������,�����ʱ,��unicode���Ӧ���ַ�
		char c1 = 97;
		System.out.println(c1); //a

		char c2 = 'a'; //���'a'��Ӧ������
		System.out.println((int)c2);
		char c3 = '��';
		System.out.println((int)c3);

		//char�����ǿ��Խ��������,�൱��һ������,��Ϊ������Ӧ��unicode��
		System.out.println('a' + 10); //107

		char c5 = 'b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);
	}
}