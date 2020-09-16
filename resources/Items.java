package resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Enum of items
 * "_" = " "
 * "__" = "'"
 * "___" = "."
 * "____" = "-"
 *
 * @author Jenny Su
 * @version 10.1 - January 10 2020
 */

public enum Items {

	Abyssal_Mask, Adaptive_Helm, Ardent_Censer, Athene__s_Unholy_Grail, 
	Banshee__s_Veil, Black_Cleaver, Black_Mist_Scythe, Blade_of_the_Ruined_King, Bloodthirster, 
	Bulwark_of_the_Mountain,
	Dead_Man__s_Plate, Death__s_Dance, Duskblade_of_Draktharr, 
	Edge_of_Night, Essence_Reaver, 
	Frozen_Heart, Frozen_Mallet, 
	Gargoyle_Stoneplate, Guardian_Angel, Guinsoo__s_Rageblade, 
	Hextech_GLP____800, Hextech_Gunblade, Hextech_Protobelt, 
	Iceborn_Gauntlent, Infinity_Edge, 
	Knight__s_Vow, 
	Liandry__s_Torment, Lich_Bane, Locket_of_the_Iron_Solari, Lord_Dominik__s_Regards, Luden__s_Echo, 
	Maw_of_Malmortius, Mejai__s_Soulstealer, Mercurial_Scimitar, Mikael__s_Crucible, Morellonomicon, 
	Mortal_Reminder, Muramana, 
	Nasher__s_Tooth, 
	Pauldrons_of_Whiterock, Phantom_Dancer, 
	Rabadon__s_Deathcap, Randuin__s_Omen, Rapid_Firecannon, Ravenous_Hydra, Redemption, Rod_of_Ages, 
	Runaan__s_Hurricane, Rylai__s_Crystal_Scepter, 
	Sanguine_Blade, Seraph__s_Embrace, Shard_of_True_Ice, Shurelya__s_Reverie, Spellbinder, Spirit_Visage, 
	Statikk_Shiv, Sterak__s_Gage, Stormrazor, Sunfire_Cape, 
	Thornmail, Titanic_Hydra, Trinity_Force, Twin_Shadows, 
	Umbral_Glaive, 
	Void_Staff, 
	Wormog__s_Armor, Wit__s_End,
	Youmuu__s_Ghostblade, 
	Zeke__s_Convergence, Zhonya__s_Hourglass;
	
	public static final List<Items> VALUES = 
			Collections.unmodifiableList(Arrays.asList(values()));
	
	public static final int SIZE = VALUES.size();
	public static final Random RANDOM = new Random();
	
	public static String[] getItem() {
		switch (VALUES.get(RANDOM.nextInt(SIZE))) {
		// A
		case Abyssal_Mask:
			return new String[] {"Abyssal Mask", "", "res/items/3001.png"};
			
		case Adaptive_Helm:
			return new String[] {"Adaptive Helm", "", "res/items/3194.png"};
			
		case Ardent_Censer:
			return new String[] {"Ardent Censer", "", "res/items/3504.png"};
			
		case Athene__s_Unholy_Grail:
			return new String[] {"Athene's Unholy Grail", "", "res/items/3174.png"};
			
		// B
		case Banshee__s_Veil:
			return new String[] {"Banshee's Veil", "", "res/items/3102.png"};
		
		case Black_Cleaver:
			return new String[] {"Black Cleaver", "", "res/items/3071.png"}; 
			
		case Black_Mist_Scythe:
			return new String[] {"Black Mist Scythe", "", "res/items/3864.png"};
		
		case Blade_of_the_Ruined_King:
			return new String[] {"Blade of the Ruined King", "", "res/items/3153.png"};
			
		case Bloodthirster:
			return new String[] {"Bloodthirster", "", "res/items/3072.png"};
			
		case Bulwark_of_the_Mountain:
			return new String[] {"Bulwark of the Mountain", "", "res/items/3860.png"};
			
		// D
		case Dead_Man__s_Plate:
			return new String[] {"Dead Man's Plate", "", "res/items/3742.png"};
			
		case Death__s_Dance:
			return new String[] {"Death's Dance", "", "res/items/3812.png"};
			
		case Duskblade_of_Draktharr:
			return new String[] {"Duskblade of Draktharr", "", "res/items/3147.png"};
			
		// E
		case Edge_of_Night:
			return new String[] {"Edge of Night", "", "res/items/3814.png"};
			
		case Essence_Reaver:
			return new String[] {"Essence Reaver", "", "res/items/3508.png"};
			
		// F	
		case Frozen_Heart:
			return new String[] {"Frozen Heart", "", "res/items/3110.png"};
			
		case Frozen_Mallet:
			return new String[] {"Frozen Mallet", "", "res/items/3022.png"};
			
		// G
		case Gargoyle_Stoneplate:
			return new String[] {"Gargoyle Stoneplate", "", "res/items/3193.png"};
			
		case Guardian_Angel:
			return new String[] {"Guardian Angel", "", "res/items/3026.png"};
			
		case Guinsoo__s_Rageblade:
			return new String[] {"Guinsoo's Rageblade", "", "res/items/3124.png"};
			
		// H
		case Hextech_GLP____800:
			return new String[] {"Hextech GLP-800", "", "res/items/3030.png"};
			
		case Hextech_Gunblade:
			return new String[] {"Hextech Gunblade", "", "res/items/3146.png"};
			
		case Hextech_Protobelt:
			return new String[] {"Hextech Protobelt", "", "res/items/3152.png"};
			
		// I
		case Iceborn_Gauntlent:
			return new String[] {"Iceborn Gauntlent", "", "res/items/3025.png"};
			
		case Infinity_Edge:
			return new String[] {"Infinity_Edge", "", "res/items/3031.png"};	
			
		// K
		case Knight__s_Vow:
			return new String[] {"Knight's Vow", "", "res/items/3109.png"};
			
		// L
		case Liandry__s_Torment:
			return new String[] {"Liandry's Torment", "", "res/items/3151.png"};
		
		case Lich_Bane:
			return new String[] {"Lich Bane", "", "res/items/3100.png"}; 
			
		case Locket_of_the_Iron_Solari:
			return new String[] {"Locket of the Iron Solari", "", "res/items/3190.png"};
		
		case Lord_Dominik__s_Regards:
			return new String[] {"Lord Dominik's Regards", "", "res/items/3036.png"};
			
		case Luden__s_Echo:
			return new String[] {"Luden's Echo", "", "res/items/3285.png"};
			
		// M
		case Maw_of_Malmortius:
			return new String[] {"Maw of Malmortius", "", "res/items/3156.png"};
		
		case Mejai__s_Soulstealer:
			return new String[] {"Mejai's Soulstealer", "", "res/items/3041.png"}; 
			
		case Mercurial_Scimitar:
			return new String[] {"Mercurial Scimitar", "", "res/items/3139.png"};
		
		case Mikael__s_Crucible:
			return new String[] {"Mikael's Crucible", "", "res/items/3222.png"};
			
		case Morellonomicon:
			return new String[] {"Morellonomicon", "", "res/items/3165.png"};
			
		case Mortal_Reminder:
			return new String[] {"Mortal Reminder", "", "res/items/3033.png"};
			
		case Muramana:
			return new String[] {"Muramana", "", "res/items/3042.png"};
			
		// N
		case Nasher__s_Tooth:
			return new String[] {"Nasher's Tooth", "", "res/items/3115.png"};
			
		// P
		case Pauldrons_of_Whiterock:
			return new String[] {"Pauldrons of Whiterock", "", "res/items/3857.png"};
			
		case Phantom_Dancer:
			return new String[] {"Phantom Dancer", "", "res/items/3046.png"};
			
		// R
		case Rabadon__s_Deathcap:
			return new String[] {"Rabadon's Deathcap", "", "res/items/3089.png"};
		
		case Randuin__s_Omen:
			return new String[] {"Randuin's Omen", "", "res/items/3143.png"}; 
			
		case Rapid_Firecannon:
			return new String[] {"Rapid Firecannon", "", "res/items/3094.png"};
		
		case Ravenous_Hydra:
			return new String[] {"Ravenous Hydra", "", "res/items/3074.png"};
			
		case Redemption:
			return new String[] {"Redemption", "", "res/items/3107.png"};
			
		case Rod_of_Ages:
			return new String[] {"Rod of Ages", "", "res/items/3027.png"};
			
		case Runaan__s_Hurricane:
			return new String[] {"Runaan's Hurricane", "", "res/items/3085.png"};
			
		case Rylai__s_Crystal_Scepter:
			return new String[] {"Rylai's Crystal Scepter", "", "res/items/3116.png"};
			
		// S
		case Sanguine_Blade:
			return new String[] {"Sanguine Blade", "", "res/items/3181.png"};
		
		case Seraph__s_Embrace:
			return new String[] {"Seraph's Embrace", "", "res/items/3040.png"}; 
			
		case Shard_of_True_Ice:
			return new String[] {"Shard of True Ice", "", "res/items/3853.png"};
		
		case Shurelya__s_Reverie:
			return new String[] {"Shurelya's Reverie", "", "res/items/2065.png"};
			
		case Spellbinder:
			return new String[] {"Spellbinder", "", "res/items/3907.png"};
			
		case Spirit_Visage:
			return new String[] {"Spirit Visage", "", "res/items/3065.png"};
			
		case Statikk_Shiv:
			return new String[] {"Statikk Shiv", "", "res/items/3087.png"};
			
		case Sterak__s_Gage:
			return new String[] {"Sterak's Gage", "", "res/items/3053.png"};
			
		case Stormrazor:
			return new String[] {"Stormrazor", "", "res/items/3095.png"};
			
		case Sunfire_Cape:
			return new String[] {"Sunfire Cape", "", "res/items/3068.png"};
			
		// T
		case Thornmail:
			return new String[] {"Thornmail", "", "res/items/3075.png"};
		
		case Titanic_Hydra:
			return new String[] {"Titanic Hydra", "", "res/items/3748.png"}; 
			
		case Trinity_Force:
			return new String[] {"Trinity Force", "", "res/items/3078.png"};
		
		case Twin_Shadows:
			return new String[] {"Twin_Shadows", "", "res/items/3905.png"};
			
		// U
		case Umbral_Glaive:
			return new String[] {"Umbral Glaive", "", "res/items/3179.png"};
			
		// V
		case Void_Staff:
			return new String[] {"Void Staff", "", "res/items/3135.png"};
			
		// W
		case Wormog__s_Armor:
			return new String[] {"Wormog's Armor", "", "res/items/3083.png"};
			
		case Wit__s_End:
			return new String[] {"Wit's End", "", "res/items/3091.png"};
			
		// Y
		case Youmuu__s_Ghostblade:
			return new String[] {"Youmuu's Ghostblade", "", "res/items/3142.png"};
			
		// Z
		case Zeke__s_Convergence:
			return new String[] {"Zeke's Convergence", "", "res/items/3050.png"};
			
		default:
			return new String[] {"Zhonya's Hourglass", "", "res/items/3157.png"};
		}
	}
	
	public static String[][] getItems(String champion) {
		String[][] items = new String[6][2];
		int neededItems = 5;
		if (champion.equals("Viktor")) {
			items[4][0] = "Perfect Hex Core";
			items[4][1] = "res/items/3198.png";
			neededItems = 4;
		}
		else if(ChampionHelper.isNoBoots(champion)) {
			neededItems = 6;
		}
		
		for (int totalItems = 0; totalItems < neededItems;) {
			String[] item = getItem();
			for (int i = 0; i < totalItems; i++) {
				if (items[i][0].equals(item[1])) {
					continue;
				}
			}
			if (!item[1].equals("")) {
				String[] valid = item[1].split(",");
				for (int i = 0; i < valid.length; i++) {
					if (item[1].equals(valid[i])){
						items[totalItems][0] = item[0];
						items[totalItems][1] = item[2];
						totalItems++;
					}
				}
				continue;
			}
			
			items[totalItems][0] = item[0];
			items[totalItems][1] = item[2];
			totalItems++;
			
			Arrays.toString(items);
		}
		
		if (neededItems == 5) {
			String [] boots = Boots.getBoots();
			items[5][0] = boots[0];
			items[5][1] = boots[1];
		}
		return items;
	}
}
