package com.schopf;

public interface Subject{

	public boolean getState();

	public void setState(int input);

	public void attach(Subscriber e);

	public void detach(Subscriber e);

	public void updateSubscribers();
}