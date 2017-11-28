package com.hwua.damo;

public class Demo {
	public static void main(String[] args) {
		String s = "abcdefabcd";
		int a = s.length();
		while (a != 0) {
			// s.charAt(0)获取第一个元素的值
			// valueOf返回一个长度为一的字符串,包含参数s.charAt(0)的字符
			//temp保存的是第一个取出来的元素
			String temp = String.valueOf(s.charAt(0));
			// 返回一个将第一个元素去除的新的字符串
			//将数组中的第一个取出来的元素去除,并重新生成一个新的数组
			s = s.replace(temp, "");
			//System.out.println(temp);
			//a-s.length()是将原数组的长度减去新数组的长度,就是去除元素的个数
			System.out.print((a - s.length()) + temp);
			//将新的数组长度赋值给原数组,更新循环体变量
			a = s.length();
		}
	}
}
