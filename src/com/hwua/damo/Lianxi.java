package com.hwua.damo;

public class Lianxi {
	//只能在构造方法初始化,不能再普通方法进行初始化,因为普通方法不知道什么时候进行运用
	private final char value[];
	
	public Lianxi() {
		value =new char[10];
	}
}
