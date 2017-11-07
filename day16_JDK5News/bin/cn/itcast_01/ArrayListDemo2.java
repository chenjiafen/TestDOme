// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ArrayListDemo2.java

package cn.itcast_01;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package cn.itcast_01:
//			Student

public class ArrayListDemo2
{

	public ArrayListDemo2()
	{
	}

	public static void main(String args[])
	{
		ArrayList array = new ArrayList();
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("貂蝉", 22);
		Student s3 = new Student("杨玉环", 24);
		Student s4 = new Student("西施", 21);
		Student s5 = new Student("王昭君", 23);
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		Student s;
		for (Iterator it = array.iterator(); it.hasNext(); System.out.println((new StringBuilder(String.valueOf(s.getName()))).append("---").append(s.getAge()).toString()))
			s = (Student)it.next();

		System.out.println("---------------");
		for (int x = 0; x < array.size(); x++)
		{
			Student s = (Student)array.get(x);
			System.out.println((new StringBuilder(String.valueOf(s.getName()))).append("---").append(s.getAge()).toString());
		}

		System.out.println("---------------");
		Student s;
		for (Iterator iterator = array.iterator(); iterator.hasNext(); System.out.println((new StringBuilder(String.valueOf(s.getName()))).append("---").append(s.getAge()).toString()))
			s = (Student)iterator.next();

	}
}
