package runes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Inspiration {

	Glacial_Augment, Unsealed_Spellbook, Omnistone,
	Hextech_Flashtraption, Magical_Footwear, Perfect_Timing,
	Future__s_Market, Minion_Dematerializer, Biscuit_Delivery,
	Cosmic_Insight, Approach_Velocity, Time_Warp_Tonic;

	private static final List<Inspiration> KEYSTONES = 
			Collections.unmodifiableList(Arrays.asList(new Inspiration[] {Glacial_Augment, Unsealed_Spellbook, Omnistone}));
	private static final int KEYSTONES_SIZE = KEYSTONES.size();
	
	private static final List<Inspiration> L1 = 
			Collections.unmodifiableList(Arrays.asList(new Inspiration[] {Hextech_Flashtraption, Magical_Footwear, 
					Perfect_Timing}));
	private static final int L1_SIZE = L1.size();
	
	private static final List<Inspiration> L2 = 
			Collections.unmodifiableList(Arrays.asList(new Inspiration[] {Future__s_Market, Minion_Dematerializer, 
					Biscuit_Delivery}));
	private static final int L2_SIZE = L2.size();
	
	private static final List<Inspiration> L3 = 
			Collections.unmodifiableList(Arrays.asList(new Inspiration[] {Cosmic_Insight, Approach_Velocity, 
					Time_Warp_Tonic}));
	private static final int L3_SIZE = L3.size();
	
	private static final Random RANDOM = new Random();
	private static final String LOC = "res/runes/Inspiration/";
	
	public static String[] getKeystone(String champion) {
		switch(KEYSTONES.get(RANDOM.nextInt(KEYSTONES_SIZE))) {
		
		case Glacial_Augment:
			return new String[] {"Glacial Augment", LOC + "100px-Rune_Glacial_Augment.png"};
			
		case Unsealed_Spellbook:
			return new String[] {"Unsealed Spellbook", LOC + "100px-Rune_Unsealed_Spellbook.png"};
		
		default:
			return new String[] {"Omnistone", LOC + "100px-Rune_Prototype_-_Omnistone.png"};
		}
	}
	
	public static String[] getL1(String champion) {
		if (resources.ChampionHelper.isNoBoots(champion)) {
			List<Inspiration> l1 = Arrays.asList(new Inspiration[] {Hextech_Flashtraption, Perfect_Timing});
			switch (l1.get(RANDOM.nextInt(l1.size()))) {
			
			case Hextech_Flashtraption:
				return new String[] {"Hextech Flashtraption", LOC + "100px-Rune_Hextech_Flashtraption.png"};
				
			default:
				return new String[] {"Perfect Timing", LOC + "100px-Rune_Perfect_Timing.png"};
			}
		}
		switch(L1.get(RANDOM.nextInt(L1_SIZE))){
		
		case Hextech_Flashtraption:
			return new String[] {"Hextech Flashtraption", LOC + "100px-Rune_Hextech_Flashtraption.png"};
			
		case Magical_Footwear:
			return new String[] {"Magical Footwear", LOC + "100px-Rune_Magical_Footwear.png"};
			
		default:
			return new String[] {"Perfect Timing", LOC + "100px-Rune_Perfect_Timing.png"};
			
		}
	}
	
	public static String[] getL2(String champion) {
		switch(L2.get(RANDOM.nextInt(L2_SIZE))) {
		
		case Future__s_Market:
			return new String[] {"Future's Market", LOC + "100px-Rune_Future's_Market.png"};
		
		case Minion_Dematerializer:
			return new String[] {"Minion Dematerializer", LOC + "100px-Rune_Minion_Dematerializer.png"};
			
		default:
			return new String[] {"Biscuit Delivery", LOC + "100px-Rune_Biscuit_Delivery.png"};
		}
	}
	
	public static String[] getL3(String champion) {
		switch(L3.get(RANDOM.nextInt(L3_SIZE))) {
		
		case Cosmic_Insight:
			return new String[] {"Cosmic Insight", LOC + "100px-Rune_Cosmic_Insight.png"};
		
		case Approach_Velocity:
			return new String[] {"Approach Velocity", LOC + "100px-Rune_Approach_Velocity.png"};
			
		default:
			return new String[] {"Time Warp Tonic", LOC + "100px-Rune_Time_Warp_Tonic.png"};
		}
	}
}
