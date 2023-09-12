package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class JSONObject {
	public static void main(String[] args) {
	
		Map<String, Object> datamap = new HashMap<String, Object>();
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		Map<String, String> info = new HashMap<String, String>();
		Map<String, String> info2 = new HashMap<String, String>();
		Map<String, String> info3 = new HashMap<String, String>();
		
		datamap.put("count", 1118);
		datamap.put("next", "https://pokeapi");
		datamap.put("previous", null);
		
		info.put("name", "bulbasaur");
		info.put("url", "pokemon/1");
		
		info2.put("name", "ivysaur");
		info2.put("url", "pokemon/2");

		info3.put("name", "venusaur");
		info3.put("url", "pokemon/3");
		
		list.add(info);
		list.add(info2);
		list.add(info3);
		
		datamap.put("result", list);
		
		System.out.println(datamap);
	}
}
