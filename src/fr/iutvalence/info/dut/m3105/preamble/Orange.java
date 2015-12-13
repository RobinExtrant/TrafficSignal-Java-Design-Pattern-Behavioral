package fr.iutvalence.info.dut.m3105.preamble;

public class Orange extends StateSignal
{
	private static final int ConstantOrange = 2;
	private int remainTime;

	public int getRemainTime() {
		return remainTime;
	}

	public Orange()
	{
		this.remainTime=ConstantOrange;
	}
	
	@Override
	public void secondEllapsed(TrafficSignal TS)
	{
		if (this.remainTime==0)
		{
			TS.switchToState(new Red());
		}
		else
		{
			this.remainTime-=1;
		}
		
	}

	@Override
	public void pressButton(TrafficSignal TS)
	{
		//action vide//
	}

	@Override
	public String toString() {
		return "Orange";
	}
}
