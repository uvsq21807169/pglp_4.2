package uvsq.pglp_4_2;

/*the Command interface*/
public interface Command {
	
	public abstract void execute(); 
	public abstract void undo (CommandFactory cf);
	
}
