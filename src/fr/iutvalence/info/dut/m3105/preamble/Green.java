package fr.iutvalence.info.dut.m3105.preamble;

public class Green extends StateSignal
{
	private static final int ConstantGreen = 10;
	private int remainTime;

	public Green()
	{
		this.remainTime=ConstantGreen;
	}
	@Override
	public void secondEllapsed(TrafficSignal TS)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pressButton(TrafficSignal TS) 
	{
		if(remainTime>2)
		{
			remainTime=2;
		}
	}

}
