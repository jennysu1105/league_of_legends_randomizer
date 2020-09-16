package runes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Resolve {

	Grasp_of_the_Undying, Aftershock, Guardian,
	Demolish, Font_of_Life, Shield_Bash,
	Conditioning, Second_Wind, Bone_Plating,
	Overgrowth, Revitalize, Unflinching;

	private static final List<Resolve> KEYSTONES = 
			Collections.unmodifiableList(Arrays.asList(new Resolve[] {Grasp_of_the_Undying, Aftershock, Guardian}));
	private static final int KEYSTONES_SIZE = KEYSTONES.size();
	
	private static final List<Resolve> L1 = 
			Collections.unmodifiableList(Arrays.asList(new Resolve[] {Demolish, Font_of_Life, Shield_Bash}));
	private static final int L1_SIZE = L1.size();
	
	private static final List<Resolve> L2 = 
			Collections.unmodifiableList(Arrays.asList(new Resolve[] {Conditioning, Second_Wind, Bone_Plating}));
	private static final int L2_SIZE = L2.size();
	
	private static final List<Resolve> L3 = 
			Collections.unmodifiableList(Arrays.asList(new Resolve[] {Overgrowth, Revitalize, Unflinching}));
	private static final int L3_SIZE = L3.size();
	
	private static final Random RANDOM = new Random();
	private static final String LOC = "res/runes/Resolve/";
	
	public static String[] getKeystone(String champion) {
		switch(KEYSTONES.get(RANDOM.nextInt(KEYSTONES_SIZE))) {
		
		case Grasp_of_the_Undying:
			return new String[] {"Grasp of the Undying", LOC + "100px-Rune_Grasp_of_the_Undying.png"};
			
		case Aftershock:
			return new String[] {"Aftershock", LOC + "100px-Rune_Aftershock.png"};
		
		default:
			return new String[] {"Guardian", LOC + "100px-Rune_Guardian.png"};
		}
	}
	
	public static String[] getL1(String champion) {
		switch(L1.get(RANDOM.nextInt(L1_SIZE))) {
		
		case Demolish:
			return new String[] {"Demolish", LOC + "100px-Rune_Demolish.png"};
			
		case Font_of_Life:
			return new String[] {"Font of Life", LOC + "100px-Rune_Font_of_Life.png"};
		
		default:
			return new String[] {"Shield Bash", LOC + "100px-Rune_Shield_Bash.png"};
		}
	}
	
	public static String[] getL2(String champion) {
		switch(L2.get(RANDOM.nextInt(L2_SIZE))) {
		
		case Conditioning:
			return new String[] {"Conditioning", LOC + "100px-Rune_Conditioning.png"};
			
		case Second_Wind:
			return new String[] {"Second Wind", LOC + "100px-Rune_Second_Wind.png"};
		
		default:
			return new String[] {"Bone Plating", LOC + "100px-Rune_Bone_Plating.png"};
		}
	}
	
	public static String[] getL3(String champion) {
		switch(L3.get(RANDOM.nextInt(L3_SIZE))) {
		
		case Demolish:
			return new String[] {"Overgrowth", LOC + "100px-Rune_Demolish.png"};
			
		case Revitalize:
			return new String[] {"Revitalize", LOC + "100px-Rune_Revitalize.png"};
		
		default:
			return new String[] {"Unflinching", LOC + "100px-Rune_Unflinching.png"};
		}
	}
}
