public class CoffeePot implements Observer
{
	private boolean potOn;
	
	@Override
	public void update(Object arg)
	{
		String text = arg.getClass().getSimpleName();
//		String text = (String)arg;
		switch (text)
		{
			case "AlarmOnState":
				this.turnOn();
				break;
			case "AlarmOffState":
				this.turnOff();
				break;
			case "BuzzingState":
				this.brew();
				break;
			case "SnoozingState":
				this.warm();
				break;
			default:
				
				System.out.println(this.getClass().getSimpleName() +": I'm just a coffee pot. I don't understand all your fancy commands.");
				break;
					
					
		}
	}

	public void turnOn()
	{
		this.potOn = true;
		System.out.println("Turning coffee pot on...");
	}
	
	public void turnOff()
	{
		this.potOn = false;
		System.out.println("Turning coffee pot off...");
	}
	
	public void brew()
	{
		if(potOn)
		{
			System.out.println(this.getClass().getSimpleName() + ": brewing...");
		}
	}
	
	public void warm()
	{
		if(potOn)
		{
			System.out.println(this.getClass().getSimpleName() + ": warming coffee...");
		}
	}
}
