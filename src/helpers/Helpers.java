package helpers;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Helpers {
	public static void refreshQueue(Queue<String> queue, List<String> templates) {
		queue = new LinkedList<>();
		List<String> tmp = templates.subList(0, templates.size());
		Collections.shuffle(tmp);
		for(String s : tmp) {
			queue.add(s);
		}
	}
}
