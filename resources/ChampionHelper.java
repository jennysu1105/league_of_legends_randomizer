package resources;

import java.util.Arrays;
import java.util.List;

public class ChampionHelper {

	public static final List<String> NO_BOOTS = Arrays.asList(new String[] {"Casseopeia"});
	public static final List<String> NO_MANA = Arrays.asList(new String[] {"Dr. Mundo", "Riven", "Vladimir", "Zed"});
	
	public static boolean isNoBoots(String champion) {
		return NO_BOOTS.contains(champion);
	}
	
	public static boolean isNoMana(String champion) {
		return NO_MANA.contains(champion);
	}
}
