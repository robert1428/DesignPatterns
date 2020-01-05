package dp;

public class RedoCommand implements Command {

	@Override
	public void execute() {
		Command command = DocumentManager.getInstance().getLastCommand();
		command.execute();

	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub

	}

}
