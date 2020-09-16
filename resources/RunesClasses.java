package resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RunesClasses {
	
	Domination, Inspiration, Precision, Resolve, Sorcery;
		
	private static final List<RunesClasses> VALUES = 
			Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static RunesClasses[] getRuneClasses() {
		RunesClasses mainClass = VALUES.get(RANDOM.nextInt(SIZE));
		RunesClasses subClass = VALUES.get(RANDOM.nextInt(SIZE));
		while (mainClass.equals(subClass)){
			subClass = VALUES.get(RANDOM.nextInt(SIZE));
		}
		return new RunesClasses[] {mainClass, subClass};
	}
	
	public static String[][] getMainClass(RunesClasses c, String champion) {
		switch(c) {
		
		case Domination:
			return new String[][] {runes.Domination.getKeystone(champion), runes.Domination.getL1(champion),
					runes.Domination.getL2(champion), runes.Domination.getL3(champion)};
			
		case Inspiration:
			return new String[][] {runes.Inspiration.getKeystone(champion), runes.Inspiration.getL1(champion),
					runes.Inspiration.getL2(champion), runes.Inspiration.getL3(champion)};
					
		case Precision:
			return new String[][] {runes.Precision.getKeystone(champion), runes.Precision.getL1(champion),
				runes.Precision.getL2(champion), runes.Precision.getL3(champion)};
				
		case Resolve:
			return new String[][] {runes.Resolve.getKeystone(champion), runes.Resolve.getL1(champion),
				runes.Resolve.getL2(champion), runes.Resolve.getL3(champion)};
		
		default:
			return new String[][] {runes.Sorcery.getKeystone(champion), runes.Sorcery.getL1(champion),
				runes.Sorcery.getL2(champion), runes.Sorcery.getL3(champion)};
		}
	}
	
	public static String[][] getSubClass(RunesClasses c, String champion){
		switch(c) {
		
		case Domination:
			String[][] dlist = {runes.Domination.getL1(champion), 
				runes.Domination.getL2(champion), runes.Domination.getL3(champion)};
			dlist = removeOne(dlist);
			//dlist.remove(RANDOM.nextInt(3));
			//dlist.add(0, new String[] {"Domination", "res/runes/Domination/Rune_Domination.png"});
			return dlist;
			
		case Inspiration:
			String[][] ilist = {runes.Inspiration.getL1(champion), 
				runes.Inspiration.getL2(champion), runes.Inspiration.getL3(champion)};
			ilist = removeOne(ilist);
			//ilist.remove(RANDOM.nextInt(3));
			//ilist.add(0, new String[] {"Inspiration", "res/runes/Inspiration/Rune_Inspiration.png"});
			return ilist;
					
		case Precision:
			String[][] plist = {runes.Precision.getL1(champion), 
				runes.Precision.getL2(champion), runes.Precision.getL3(champion)};
			plist = removeOne(plist);
			//plist.remove(RANDOM.nextInt(3));
			//plist.add(0, new String[] {"Precision", "res/runes/Precision/Rune_Precision.png"});
			return plist;
				
		case Resolve:
			String[][] rlist = {runes.Resolve.getL1(champion), 
				runes.Resolve.getL2(champion), runes.Resolve.getL3(champion)};
			rlist = removeOne(rlist);
			//rlist.remove(RANDOM.nextInt(3));
			//rlist.add(0, new String[] {"Resolve", "res/runes/Resolve/Rune_Resolve.png"});
			return rlist;
			
		
		default:
			String[][] slist = {runes.Sorcery.getL1(champion), 
				runes.Sorcery.getL2(champion), runes.Sorcery.getL3(champion)};
			slist = removeOne(slist);
			//slist.remove(RANDOM.nextInt(3));
			//slist.add(0, new String[] {"Sorcery", "res/runes/Sorcery/Rune_Sorcery.png"});
			return slist;
		}
	}
	private static String[][] removeOne(String[][] list){
		int exclude = RANDOM.nextInt(3);
		String[][] newList = new String[2][2];
		for (int i = 0; i < 3; i++) {
			if (i == exclude) {
				continue;
			}
			int x = 0;
			if (newList[0][0] != null) {
				x = 1;
			}
			newList[x][0] = list[i][0];
			newList[x][1] = list[i][1];
		}
		return newList;
	}
}
