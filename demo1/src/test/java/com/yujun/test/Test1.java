package com.yujun.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yujun.FirstDemo;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 @Test
	 public void testHello() {
		 FirstDemo fd= new FirstDemo();
		 String string = fd.sayHello("test");
		 assertEquals("hello test", string);
		 
	 }
}