package fr.iutvalence.info.dut.m3105.preamble;

public class TrafficSignal extends Thread implements TrafficSignalInterface
{
	private StateSignal stateSignal;
	
	public TrafficSignal()
	{
		super();
		this.switchToState(new Green());
	}

	public void pressButton()
	{
		this.stateSignal.pressButton(this);
//		System.out.println("Button pressed!");
//		System.out.flush();
//		switch (this.stateSignal)
//		{
//			case ORANGE: 
//			case RED: return;
//			case GREEN:
//			{
//				if (this.stateSecondsRemaining > BUTTON_THRESHOLD_IN_SECONDS)
//					this.stateSecondsRemaining = BUTTON_THRESHOLD_IN_SECONDS;					
//			}
//		}
	}
	
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}

	public void secondEllapsed()
	{
		this.stateSignal.secondEllapsed(this);
//		this.stateSecondsRemaining--;
//		System.out.println(this.stateSecondsRemaining);
//		System.out.flush();
//		if (this.stateSecondsRemaining == 0)
//		{
//			switch(this.state)
//			{
//				case GREEN: 
//					this.switchToState(TrafficSignalState.ORANGE);
//					break;
//				case ORANGE: 
//					this.switchToState(TrafficSignalState.RED);
//					break;
//				case RED: 
//					this.switchToState(TrafficSignalState.GREEN);
//					break;
//			}
//		}	
	}

	private void switchToState(StateSignal state)
	{
		System.out.println("Traffic signal turns "+state);
		System.out.flush();
		this.stateSignal = state;		
	}
}
