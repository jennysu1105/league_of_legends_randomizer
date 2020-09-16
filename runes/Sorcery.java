package runes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Sorcery {

	Summon_Aery, Arcane_Comet, Phase_Rush,
	Nullifying_Orb, Manaflow_Band, Nimbus_Cloak,
	Transcendence, Celerity, Absolute_Force,
	Scorch, Waterwalking, Gathering_Storm;

	private static final List<Sorcery> KEYSTONES = 
			Collections.unmodifiableList(Arrays.asList(new Sorcery[] {Summon_Aery, Arcane_Comet, Phase_Rush}));
	private static final int KEYSTONES_SIZE = KEYSTONES.size();
	
	private static final List<Sorcery> L1 = 
			Collections.unmodifiableList(Arrays.asList(new Sorcery[] {Nullifying_Orb, Manaflow_Band, Nimbus_Cloak}));
	private static final int L1_SIZE = L1.size();
	
	private static final List<Sorcery> L2 = 
			Collections.unmodifiableList(Arrays.asList(new Sorcery[] {Transcendence, Celerity, Absolute_Force}));
	private static final int L2_SIZE = L2.size();
	
	private static final List<Sorcery> L3 = 
			Collections.unmodifiableList(Arrays.asList(new Sorcery[] {Scorch, Waterwalking, Gathering_Storm}));
	private static final int L3_SIZE = L3.size();
	
	private static final Random RANDOM = new Random();
	private static final String LOC = "res/runes/Sorcery/";
	
	public static String[] getKeystone(String champion) {
		
		switch(KEYSTONES.get(RANDOM.nextInt(KEYSTONES_SIZE))) {
		
		case Summon_Aery:
			return new String[] {"Summon Aery", LOC + "100px-Rune_Summon_Aery.png"};
			
		case Arcane_Comet:
			return new String[] {"Arcane Comet", LOC + "100px-Rune_Arcane_Comet.png"};
		
		default:
			return new String[] {"Phase Rush", LOC + "100px-Rune_Phase_Rush.png"};
		}
	}
	
	public static String[] getL1(String champion) {
		if (resources.ChampionHelper.isNoMana(champion)) {
			List<Sorcery> l1 = Arrays.asList(new Sorcery[] {Nullifying_Orb, Nimbus_Cloak});
			switch(l1.get(RANDOM.nextInt(l1.size()))) {
			
			case Nullifying_Orb:
				return new String[] {"Nullifying Orb", LOC + "100px-Rune_Nullifying_Orb.png"};
				
			default:
				return new String[] {"Nimbus Cloak", LOC + "Rune_Nimbus_Cloak.png"};
			}
		}
		switch(L1.get(RANDOM.nextInt(L1_SIZE))) {
		
		case Nullifying_Orb:
			return new String[] {"Nullifying Orb", LOC + "100px-Rune_Nullifying_Orb.png"};
			
		case Manaflow_Band:
			return new String[] {"Manaflow Band", LOC + "100px-Rune_Manaflow_Band.png"};
		
		default:
			return new String[] {"Nimbus Cloak", LOC + "Rune_Nimbus_Cloak.png"};
		}
	}
	
	public static String[] getL2(String champion) {
		switch(L2.get(RANDOM.nextInt(L2_SIZE))) {
		
		case Transcendence:
			return new String[] {"Transcendence", LOC + "100px-Rune_Transcendence.png"};
			
		case Celerity:
			return new String[] {"Celerity", LOC + "100px-Rune_Celerity.png"};
		
		default:
			return new String[] {"Absolute Force", LOC + "100px-Rune_Absolute_Force.png"};
		}
	}
	
	public static String[] getL3(String champion) {
		switch(KEYSTONES.get(RANDOM.nextInt(KEYSTONES_SIZE))) {
		
		case Scorch:
			return new String[] {"Scorch", LOC + "100px-Rune_Scorch.png"};
			
		case Waterwalking:
			return new String[] {"Waterwalking", LOC + "100px-Rune_Waterwalking.png"};
		
		default:
			return new String[] {"Gathering Storm", LOC + "100px-Rune_Gathering_Storm.png"};
		}
	}
}
