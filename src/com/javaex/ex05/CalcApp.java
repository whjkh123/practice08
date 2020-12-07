package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String calc = sc.nextLine();

			String[] cArr = calc.split(" ");

			if (calc.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else if (cArr[1].equals("-")) {
				Sub result02 = new Sub();
				result02.setValue(Integer.parseInt(cArr[0]), Integer.parseInt(cArr[2]));
				System.out.println(">> " + result02.calculate());
			} else if (cArr[1].equals("*")) {
				Mul result03 = new Mul();
				result03.setValue(Integer.parseInt(cArr[0]), Integer.parseInt(cArr[2]));
				System.out.println(">> " + result03.calculate());
			} else if (cArr[1].equals("/")) {
				Div result04 = new Div();
				result04.setValue(Integer.parseInt(cArr[0]), Integer.parseInt(cArr[2]));
				System.out.println(">> " + result04.calculate());
			} else if (cArr[1].equals("+")) {
				Add result01 = new Add();
				result01.setValue(Integer.parseInt(cArr[0]), Integer.parseInt(cArr[2]));
				System.out.println(">> " + result01.calculate());
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}
		}

	}
}