package com.schopf;

public class SpecificSubscriber implements Subscriber{
	public SpecificSubject subject;
	String varName;

	public SpecificSubscriber(SpecificSubject subject){
		this.subject = subject;
		//this.varName = varName;
	}

	public SpecificSubscriber(){
		
	}

	public void remove(){
		subject.detach(this);
	}

	public void update(){
		System.out.println("Der aktuelle Zustand ist: "+subject.getState());
	}

	public void updateValue(){
		System.out.println("Der aktuelle Value ist: " + subject.getValue());
	}

}