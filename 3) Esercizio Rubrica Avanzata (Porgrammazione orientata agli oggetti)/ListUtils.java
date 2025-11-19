import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class ListUtils {
	
	private static List<String> list = new ArrayList<>();
	
	public static List<String> setToList(Set<String> set) {
		for (String key : set) {
			list.add(key);
		}
		
		return list;
	}

}
