package dp;

public class Memento {
	private Section state;

	public void setState(Section state) {
		Section section = new Section(state.getTitle());
		for (Element element : state.getElements()) {
			section.add(element);
		}

		this.state = section;

	}

	public Element getState() {
		return state;
	}

}
