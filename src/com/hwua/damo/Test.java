package com.hwua.damo;

import java.util.Arrays;
import java.util.Comparator;
/**
 * 
 *@Title        :Test.java
 *@Package      :com.hwua.damo
 *@Description  :TODO
 *
 *@author        Administrator
 *@dare          2017��11��15������1:31:42
 *@Version 1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		Student[] s = new Student[5];
		Student stu1 = new Student(1, "��һ",122);
		Student stu2 = new Student(2, "�¶�",21);
		Student stu3 = new Student(3, "����",22);
		Student stu4 = new Student(4, "����",24);
		Student stu5 = new Student(5, "����",45);
		s[0] = stu1;
		s[1] = stu2;
		s[2] = stu3;
		s[3] = stu4;
		s[4] = stu5;
		Arrays.sort(s,new Comparator<Student>() {
			
		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getAge()-o2.getAge();
		}
		});
		for (Student student : s) {
			System.out.println(student);
		}
	}
}
