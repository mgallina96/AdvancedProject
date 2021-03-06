package application;

/**
 * @author Michele Franceschetti
 */

public abstract class Core 
{
	public abstract void awake();
	
	public abstract void update(double deltaTime);
	
	public abstract void terminate();
}
