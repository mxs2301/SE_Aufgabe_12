package com.schopf;

import java.util.ArrayList;

public class SpecificSubject implements Subject{
	private ArrayList<Subscriber> subscribers = new ArrayList<>(); 
	private boolean state;
	private Integer value = 0;


	public boolean getState(){
		return state;
	}

	public Integer getValue(){
		return value;
	}

	public void setState(int input){
		switch(input){
		case 0:
			state = false;
			updateSubscribers();
			break;
		
	case 1:
			state = true;
			updateSubscribers();
			break;
	default:
		System.out.println("Invalid Input");
		}
	}

	public void setValue(Integer value){
		this.value = value;
		updateSubscribers();
	}


	public void attach(Subscriber e){
		subscribers.add(e);
	}

	public void detach(Subscriber e){
		subscribers.remove(e);
	}


	public void updateSubscribers(){
		for(int i = 0; i<subscribers.size(); i++){
			subscribers.get(i).update();
		}
	}

	public void updateValueSubscribers(){
		for(int i = 0; i<subscribers.size(); i++){
			subscribers.get(i).updateValue();
		}
	}

}