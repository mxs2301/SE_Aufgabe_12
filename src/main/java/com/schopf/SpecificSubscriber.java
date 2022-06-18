package com.schopf;

public class SpecificSubscriber implements Subscriber{
	public SpecificSubject subject;
	

	public SpecificSubscriber(SpecificSubject subject){
		this.subject = subject;
	}

	public void update(){
		System.out.println("Der aktuelle Zustand ist: "+subject.getState());
	}
}