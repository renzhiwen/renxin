package com.hwua.damo;

public class Demo {
	public static void main(String[] args) {
		String s = "abcdefabcd";
		int a = s.length();
		while (a != 0) {
			// s.charAt(0)��ȡ��һ��Ԫ�ص�ֵ
			// valueOf����һ������Ϊһ���ַ���,��������s.charAt(0)���ַ�
			//temp������ǵ�һ��ȡ������Ԫ��
			String temp = String.valueOf(s.charAt(0));
			// ����һ������һ��Ԫ��ȥ�����µ��ַ���
			//�������еĵ�һ��ȡ������Ԫ��ȥ��,����������һ���µ�����
			s = s.replace(temp, "");
			//System.out.println(temp);
			//a-s.length()�ǽ�ԭ����ĳ��ȼ�ȥ������ĳ���,����ȥ��Ԫ�صĸ���
			System.out.print((a - s.length()) + temp);
			//���µ����鳤�ȸ�ֵ��ԭ����,����ѭ�������
			a = s.length();
		}
	}
}
