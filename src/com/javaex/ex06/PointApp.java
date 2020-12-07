package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;

		System.out.println(p1 == p2);// 주소값 비교
		System.out.println(p2 == p3);// 주소값 비교
		System.out.println(p3 == p4);// 주소값 비교
		System.out.println(p4 == p1);// > p1의 주소값과 p4의 주소값은 같다.
		System.out.println(p1.equals(p2));// 이클립스가 제공하는 Object.equals()를 사용하였기 때문
		System.out.println(p4.equals(p1));// 이클립스가 제공하는 Object.equals()를 사용하였기 때문
	}

}
