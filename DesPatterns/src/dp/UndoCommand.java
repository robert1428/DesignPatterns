package dp;

public class UndoCommand implements Command {

	@Override
	public void execute() {
		Command command = DocumentManager.getInstance().getLastCommand();
		command.unexecute();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub

	}

}
