package resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Boots {

	Beserker__s_Greaves, Boots_of_Mobility, Boots_of_Swiftness, Ionian_Boots_of_Lucidity, Mercury__s_Treads, 
	Ninja_Tabi, Sorcerer__s_Shoes;
	
	public static final List<Boots> VALUES = 
			Collections.unmodifiableList(Arrays.asList(values()));
	public static final int SIZE = VALUES.size();
	public static final Random RANDOM = new Random();
	
	public static String[] getBoots() {
		switch(VALUES.get(RANDOM.nextInt(SIZE))) {
		
		case Beserker__s_Greaves:
			return new String[] {"Beserker's Greaves", "res/boots/3006.png"};
			
		case Boots_of_Mobility:
			return new String[] {"Boots_of_Mobility", "res/boots/3117.png"};
			
		case Boots_of_Swiftness:
			return new String[] {"Boots of Swiftness", "res/boots/3009.png"};
			
		case Ionian_Boots_of_Lucidity:
			return new String[] {"Ionian Boots of Lucidity", "res/boots/3158.png"};
			
		case Mercury__s_Treads:
			return new String[] {"Mercury's Treads", "res/boots/3111.png"};
			
		case Ninja_Tabi:
			return new String[] {"Ninja Tabi", "res/boots/3047.png"};
			
		default:
			return new String[] {"Sorcerer's Shoes", "res/boots/3020.png"};
		}
	}
}
