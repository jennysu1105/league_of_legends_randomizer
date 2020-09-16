package runes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Domination {

	Electrocute, Predator, Dark_Harvest, Hail_of_Blades,
	Cheap_Shot, Taste_of_Blood, Sudden_Impact,
	Zombie_Ward, Ghost_Poro, Eyeball_Collection,
	Ravenous_Hunter, Ingenious_Hunter, Relentless_Hunter, Ultimate_Hunter;
	
	private static final List<Domination> KEYSTONES = 
			Collections.unmodifiableList(Arrays.asList(new Domination[] {Electrocute, Predator, Dark_Harvest, Hail_of_Blades}));
	private static final int KEYSTONES_SIZE = KEYSTONES.size();
	
	private static final List<Domination> L1 = 
			Collections.unmodifiableList(Arrays.asList(new Domination[] {Cheap_Shot, Taste_of_Blood, Sudden_Impact}));
	private static final int L1_SIZE = L1.size();
	
	private static final List<Domination> L2 = 
			Collections.unmodifiableList(Arrays.asList(new Domination[] {Zombie_Ward, Ghost_Poro, Eyeball_Collection}));
	private static final int L2_SIZE = L2.size();
	
	private static final List<Domination> L3 = 
			Collections.unmodifiableList(Arrays.asList(new Domination[] {Ravenous_Hunter, Ingenious_Hunter, 
					Relentless_Hunter, Ultimate_Hunter}));
	private static final int L3_SIZE = L3.size();
	
	private static final Random RANDOM = new Random();
	private static final String LOC = "res/runes/Domination/";
	
	public static String[] getKeystone(String champion) {
		switch(KEYSTONES.get(RANDOM.nextInt(KEYSTONES_SIZE))) {
		
		case Electrocute:
			return new String[] {"Electrocute", LOC + "100px-Rune_Electrocute.png"};
			
		case Predator:
			return new String[] {"Predator", LOC + "00px-Rune_Predator.png"};
			
		case Dark_Harvest:
			return new String[] {"Dark Harvest", LOC + "100px-Rune_Dark_Harvest.png"};
			
		default:
			return new String[] {"Hail of Blades", LOC + "100px-Rune_Hail_of_Blades.png"};
		}
	}
	
	public static String[] getL1(String champion) {
		switch(L1.get(RANDOM.nextInt(L1_SIZE))) {
		
		case Cheap_Shot:
			return new String[] {"Cheap Shot", LOC + "100px-Rune_Cheap_Shot.png"};
			
		case Taste_of_Blood:
			return new String[] {"Taste of Blood", LOC + "100px-Rune_Taste_of_Blood.png"};
			
		default:
			return new String[] {"Sudden Impact", LOC + "100px-Rune_Sudden_Impact.png"};
		}
	}
	
	public static String[] getL2(String champion) {
		switch(L2.get(RANDOM.nextInt(L2_SIZE))){
			
		case Zombie_Ward:
			return new String[] {"Zombie Ward", LOC + "100px-Rune_Zombie_Ward.png"};
			
		case Ghost_Poro:
			return new String[] {"Ghost Poro", LOC + "100px-Rune_Ghost_Poro.png"};
			
		default:
			return new String[] {"Eyeball Collection", LOC + "100px-Rune_Eyeball_Collection.png"};
		}
	}
	
	public static String[] getL3(String champion) {
		switch(L3.get(RANDOM.nextInt(L3_SIZE))){
		
		case Ravenous_Hunter:
			return new String[] {"Ravenous Hunter", LOC + "100px-Rune_Ravenous_Hunter.png"};
			
		case Ingenious_Hunter:
			return new String[] {"Ingenious Hunter", LOC + "100px-Rune_Ingenious_Hunter.png"};
			
		case Relentless_Hunter:
			return new String[] {"Relentless Hunter", LOC + "100px-Rune_Relentless_Hunter.png"};
			
		default:
			return new String[] {"Ultimate Hunter", LOC + "Rune_Ultimate_Hunter.png"};
		}
	}
}
