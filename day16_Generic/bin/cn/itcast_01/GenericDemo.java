// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GenericDemo.java

package cn.itcast_01;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo
{

	public GenericDemo()
	{
	}

	public static void main(String args[])
	{
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add(Integer.valueOf(10));
		String s;
		for (Iterator it = array.iterator(); it.hasNext(); System.out.println(s))
			s = (String)it.next();

	}
}
