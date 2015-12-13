package fr.iutvalence.info.dut.m3105.preamble;

public class Red extends StateSignal
{
	private static final int ConstantRed = 10;
	private int remainTime;
	
	public int getRemainTime() {
		return remainTime;
	}

	public Red()
	{
		this.remainTime=ConstantRed;
	}
	
	@Override
	public void secondEllapsed(TrafficSignal TS) {
		if (this.remainTime==0)
		{
			TS.switchToState(new Green());
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
		return "Red";
	}
}
