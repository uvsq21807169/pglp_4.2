package uvsq.pglp_4_2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Interpreteur interpert = new Interpreteur();
        Command quit=new QuitCommand(interpert);
        Command undo=new UndoCommand(interpert);

        CommandFactory cf = CommandFactory.init();
        
        cf.addCommand(CommandEnum.QUIT, quit);
        cf.addCommand(CommandEnum.UNDO, undo);

        cf.executeCommand(CommandEnum.QUIT);
        cf.executeCommand(CommandEnum.UNDO);
      
    }
}
