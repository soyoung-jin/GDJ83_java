//package com.jin.study.jung;
//
//public class Ex9_6 {
//	public static String fillZero(String src, int length) {
//		if(src.equals(null)|| src.length()==length) {
//			return src;
//		}
//		if(src.length()>length){
//			return src.substring(0,length);
//		}
//		char[] c = new char[length];
//		for(int i =0; i<c.length; i++) {
//			c[i] = '0';
//		}
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		String src = "12345";
//		System.out.println(fillZero(src,10));
//		System.out.println(fillZero(src,-1));
//		System.out.println(fillZero(src,3));
//	}
//
//}
