package runes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Precision {
	
	Press_the_Attack, Lethal_Tempo, Fleet_Footwork, Conquerer,
	Overheal, Triumph, Presence_of_Mind, 
	Legend_____Alacrity, Legend_____Tenacity, Legend_____Bloodline,
	Coup_de_Grace, Cut_Down, Last_Stand;

	private static final List<Precision> KEYSTONES = 
			Collections.unmodifiableList(Arrays.asList(new Precision[] {Press_the_Attack, Lethal_Tempo, Fleet_Footwork, 
					Conquerer}));
	private static final int KEYSTONES_SIZE = KEYSTONES.size();
	
	private static final List<Precision> L1 = 
			Collections.unmodifiableList(Arrays.asList(new Precision[] {Overheal, Triumph, Presence_of_Mind}));
	private static final int L1_SIZE = L1.size();
	
	private static final List<Precision> L2 = 
			Collections.unmodifiableList(Arrays.asList(new Precision[] {Legend_____Alacrity, Legend_____Tenacity, 
					Legend_____Bloodline}));
	private static final int L2_SIZE = L2.size();
	
	private static final List<Precision> L3 = 
			Collections.unmodifiableList(Arrays.asList(new Precision[] {Coup_de_Grace, Cut_Down, Last_Stand}));
	private static final int L3_SIZE = L3.size();
	
	private static final Random RANDOM = new Random();
	private static final String LOC = "res/runes/Precision/";
	
	public static String[] getKeystone(String champion) {
		switch(KEYSTONES.get(RANDOM.nextInt(KEYSTONES_SIZE))) {
		
		case Press_the_Attack:
			return new String[] {"Press the Attack", LOC + "100px-Rune_Press_the_Attack.png"};
			
		case Lethal_Tempo:
			return new String[] {"Lethal Tempo", LOC + "100px-Rune_Lethal_Tempo.png"};
		
		case Fleet_Footwork:
			return new String[] {"Fleet Footwork", LOC + "100px-Rune_Fleet_Footwork.png"};
			
		default:
			return new String[] {"Conquerer", LOC + "100px-Rune_Conqueror.png"};
		}
	}
	
	public static String[] getL1(String champion) {
		if(resources.ChampionHelper.isNoMana(champion)) {
			List<Precision> l1 = Arrays.asList(new Precision[] {Overheal, Triumph});
			switch(l1.get(RANDOM.nextInt(l1.size()))) {
			
			case Overheal:
				return new String[] {"Overheal", LOC + "100px-Rune_Overheal.png"};
			
			default:
				return new String[] {"Triumph", LOC + "100px-Rune_Triumph.png"};
			}
		}
		switch(L1.get(RANDOM.nextInt(L1_SIZE))) {
		case Overheal:
			return new String[] {"Overheal", LOC + "100px-Rune_Overheal.png"};
			
		case Triumph:
			return new String[] {"Triumph", LOC + "100px-Rune_Triumph.png"};
			
		default:
			return new String[] {"Presence of Mind", LOC + "100px-Rune_Presence_of_Mind.png"};
		}
	}
	
	public static String[] getL2(String champion) {
		switch(L2.get(RANDOM.nextInt(L2_SIZE))) {
		case Legend_____Alacrity:
			return new String[] {"Legend: Alacrity", LOC + "100px-Rune_Legend_-_Alacrity.png"};
			
		case Legend_____Tenacity:
			return new String[] {"Legend: Tenacity", LOC + "100px-Rune_Legend_-_Tenacity.png"};
			
		default:
			return new String[] {"Legend: Bloodline", LOC + "100px-Rune_Legend_-_Bloodline.png"};
		}
	}
	
	public static String[] getL3(String champion) {
		switch(L3.get(RANDOM.nextInt(L3_SIZE))) {
		case Coup_de_Grace:
			return new String[] {"Coup de Grace", LOC + "100px-Rune_Coup_de_Grace.png"};
			
		case Cut_Down:
			return new String[] {"Cut Down", LOC + "100px-Rune_Cut_Down.png"};
			
		default:
			return new String[] {"Last Stand", LOC + "100px-Rune_Last_Stand.png"};
		}
	}
}
