package fr.iutvalence.info.dut.m3105.preamble;

public class Green extends StateSignal
{
	private static final int ConstantGreen = 10;
	private int remainTime;

	public int getRemainTime() {
		return remainTime;
	}

	public Green()
	{
		this.remainTime=ConstantGreen;
	}
	
	@Override
	public void secondEllapsed(TrafficSignal TS)
	{
		if (this.remainTime==0)
		{
			TS.switchToState(new Orange());
		}
		else
		{
			this.remainTime-=1;
		}
		
	}

	@Override
	public void pressButton(TrafficSignal TS) 
	{
		if(this.remainTime>2)
		{
			System.out.println("PressButton !");
			this.remainTime=2;
		}
	}

	@Override
	public String toString() {
		return "Green";
	}

}
