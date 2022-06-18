package com.schopf;

public class Main {
	public static void main(String[] args) {

		SpecificSubject alphaSubject = new SpecificSubject();

		System.out.println(alphaSubject.getState());
		SpecificSubscriber newyork = new SpecificSubscriber(alphaSubject);

		alphaSubject.attach(newyork);

		alphaSubject.setState(1);

	}
}
