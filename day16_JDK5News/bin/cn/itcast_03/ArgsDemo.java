// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ArgsDemo.java

package cn.itcast_03;

import java.io.PrintStream;

public class ArgsDemo
{

	public ArgsDemo()
	{
	}

	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int result = sum(new int[] {
			a, b
		});
		System.out.println((new StringBuilder("result:")).append(result).toString());
		int c = 30;
		result = sum(new int[] {
			a, b, c
		});
		System.out.println((new StringBuilder("result:")).append(result).toString());
		int d = 30;
		result = sum(new int[] {
			a, b, c, d
		});
		System.out.println((new StringBuilder("result:")).append(result).toString());
		result = sum(new int[] {
			a, b, c, d, 40
		});
		System.out.println((new StringBuilder("result:")).append(result).toString());
		result = sum(new int[] {
			a, b, c, d, 40, 50
		});
		System.out.println((new StringBuilder("result:")).append(result).toString());
	}

	public static transient int sum(int a[])
	{
		int s = 0;
		int ai[];
		int j = (ai = a).length;
		for (int i = 0; i < j; i++)
		{
			int x = ai[i];
			s += x;
		}

		return s;
	}
}
