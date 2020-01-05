package dp;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder {
	Element document;

	@Override
	public void buildPart() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			HashMap<String, Object> map = mapper.readValue(new File("book.json"), HashMap.class);
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("cheie: " + entry.getKey() + " " + " valoare " + entry.getValue().toString() + " "
						+ entry.getValue().getClass());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Element getResult() {
		return document;
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Section section = new Section((String) map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection) map.get("children");
		children.forEach((childMap) -> {

			Element e = this.processMap(childMap);
			if (e != null) {
				try {
					section.add(e);
				} catch (Exception var5) {
					var5.printStackTrace();
				}
			}
		});
		return section;
	}

	private Element processMap(HashMap<String, Object> childMap) {
		String className = childMap.get("class").toString();
		Element element = null;
		if (className.equals("Section")) {
			element = buildSection(childMap);
		} else if (className.equals("Paragraph")) {
			element = buildParagraph(childMap);
		}

		else if (className.equals("Image")) {
			element = buildImage(childMap);
		} else if (className.equals("Table")) {
			element = buildTable(childMap);
		}

		else if (className.equals("ImageProxy")) {
			element = buildImageProxy(childMap);
		}

		return element;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Image image = new Image((String) map.get("url"));
		return image;
	}

	@Override
	public void build() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> map = mapper.readValue(new File("book.json"), HashMap.class);
			document = processMap(map);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		ImageProxy imageProxy = new ImageProxy((String) map.get("url"));
		return imageProxy;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Table table = new Table((String) map.get("title"));
		return table;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		Paragraph paragraph = new Paragraph((String) map.get("text"));
		return paragraph;
	}

}
