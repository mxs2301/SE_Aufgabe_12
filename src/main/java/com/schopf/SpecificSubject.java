package com.schopf;

import java.util.ArrayList;

public class SpecificSubject{
	private ArrayList<Subscriber> subscribers = new ArrayList<>(); 
	private boolean state;


	public boolean getState(){
		return state;
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

	public void attach(Subscriber e){
		subscribers.add(e);
	}

	public void detach(Subscriber e){
		subscribers.remove(e);
	}

	public void ret(){
		subscribers.get(0);
	}

	public void updateSubscribers(){
		for(int i = 0; i<subscribers.size(); i++){
			subscribers.get(i).update();
		}
	}
}