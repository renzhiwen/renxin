package com.hwua.damo1;

public class Match {
	public static void main(String[] args) {
		
		String atr = "sdsadsad";
		String str = "sdsadsad";
		if (str.length()==atr.length()) {
			char[] a = atr.toCharArray();
			char[] b = str.toCharArray();
			boolean c=true;
				for (int i = 0; i < b.length; i++) {
					if (a[i]==b[i]) {
						c=true;
						continue;
					}else {
						
						System.out.println("不是一样的");
						break;
					}
				}
				if (c==true) {
					
					System.out.println("是一样的");
				}
				
				
		}else {
			System.out.println("不一样");
		}
	
		
	}

	
}