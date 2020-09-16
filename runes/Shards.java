package runes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Shards {

	Adaptive_Force, Armour, Attack_Speed, Cooldown_Reduction, Health, Magic_Resistance;
	
	public static final List<Shards> L1 = Arrays.asList(new Shards[] {Adaptive_Force, 
			Attack_Speed, Cooldown_Reduction});
	public static final List<Shards> L2 = Arrays.asList(new Shards[] {Adaptive_Force, 
			Armour, Magic_Resistance});
	public static final List<Shards> L3 = Arrays.asList(new Shards[] {Health, Armour,
			Magic_Resistance});
	
	public static final Random RANDOM = new Random();
	public static final String LOC = "res/runes/Shards/Rune_shard_";
	
	public static String[] getShards() {
		return new String[] {getL1(), getL2(), getL3()};
	}
	
	private static String getL1(){
		switch(L1.get(RANDOM.nextInt(L1.size()))) {
		
		case Adaptive_Force:
			return LOC + "Adaptive_Force.png";
			
		case Attack_Speed:
			return LOC + "Attack_Speed.png";
			
		default:
			return LOC + "Cooldown_Reduction.png";
		}
	}
	
	private static String getL2() {
		switch(L2.get(RANDOM.nextInt(L2.size()))) {
		
		case Adaptive_Force:
			return LOC + "Adaptive_Force.png";
			
		case Armour:
			return LOC + "Armor.png";
			
		default:
			return LOC + "Magic_Resistance.png";
		}
	}
	
	private static String getL3() {
		switch(L3.get(RANDOM.nextInt(L3.size()))) {
		
		case Health:
			return LOC + "Health.png";
			
		case Armour:
			return LOC + "Armor.png";
			
		default:
			return LOC + "Magic_Resistance.png";
		}
	}
}
