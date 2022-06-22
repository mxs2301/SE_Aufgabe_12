package com.schopf;

public class Main {
	public static void main(String[] args) {
		SpecificSubject subject = new SpecificSubject();
		SpecificSubscriber subscriber = new SpecificSubscriber(subject);

		System.out.println(subject.getState());
		subject.attach(subscriber);

		subject.setState(1);
		
	}
}
