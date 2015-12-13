package fr.iutvalence.info.dut.m3105.preamble;

public abstract class StateSignal
{
	private int remainTime;
	
	public abstract int getRemainTime();

	public abstract void secondEllapsed(TrafficSignal TS);
	
	public abstract void pressButton(TrafficSignal TS);
}
