package com.schopf;

public interface Subject{

	public boolean getState();

	public Integer getValue();

	public void setState(int input);

	public void setValue(Integer value);

	public void attach(Subscriber e);

	public void detach(Subscriber e);

	public void updateSubscribers();


}