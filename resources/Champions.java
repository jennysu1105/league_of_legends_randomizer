package resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Enum of champions
 * "_" = " "
 * "__" = "'"
 * "___" = "."
 *
 * @author Jenny Su
 * @version 10.1 - January 10 2020
 */

public enum Champions {
	Aatrox, Ahri, Akali, Alistar, Amumu, Anivia, Annie, Aphelios, Ashe, Aurelion_Sol, Azir,
	Bard, Blitzcrank, Brand, Braum, 
	Caitlyn, Camille, Cassiopeia, Cho__Gath, Corki,
	Darius, Diana, Dr___Mundo, Draven,
	Ekko, Elise, Evelynn, Ezreal, 
	Fiddlesticks, Fiora, Fizz,
	Galio, Gangplank, Garen, Gnar, Gragas, Graves,
	Hecarim, Heimerdinger, 
	Illaoi, Irelia, Ivern,
	Janna, Jarvan_IV, Jax, Jayce, Jhin, Jinx,
	Kai__Sa, Kalista, Karma, Karthus, Kassadin, Katarina, Kayle, Kayn, Kennen, Kha__Zix, Kindred, Kled, Kog__Maw,
	LeBlanc, Lee_Sin, Leona, Lissandra, Lucian, Lulu, Lux,
	Malphite, Malzahar, Maokai, Master_Yi, Miss_Fortune, Mordekaiser, Morgana,
	Nami, Nasus, Nautilus, Neeko, Nidalee, Nocturne, Nunu_and_Willump, 
	Olaf, Orianna, Ornn, 
	Pantheon, Poppy, Pyke,
	Qiyana, Quinn,
	Rakan, Rammus, Rek__Sai, Renekton, Rengar, Riven, Rumble, Ryze,
	Sejuani, Senna, Sett, Shaco, Shen, Shyvana, Singed, Sion, Sivir, Skarner, Sona, Soraka, Swain, Sylas, Syndra,
	Tahm_Kench, Taliyah, Talon, Taric, Teemo, Thresh, Tristana, Trundle, Tryndamere, Twisted_Fate, Twitch,
	Udyr, Urgot,
	Varus, Vayne, Veigar, Vel__Koz, Vi, Viktor, Vladimir, Volibear, 
	Warwick, Wukong, 
	Xayah, Xerath, Xin_Zhao, 
	Yasuo, Yorick, Yuumi,
	Zac, Zed, Ziggs, Zilean, Zoe, Zyra;
	
	private static final List<Champions> VALUES = 
		Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static String[] choose() {
		String[] championInfo = new String[3];
		Champions champion = VALUES.get(RANDOM.nextInt(SIZE));
		
		switch (champion) {
		// A
		case Aatrox:
			championInfo = new String[] {"Aatrox", "The Darkin Blade", "res/champs/Aatrox.png"}; break;
			
		case Ahri:
			championInfo = new String[] {"Ahri", "The Nine-Tailed Fox", "res/champs/Ahri.png"}; break;
			
		case Akali:
			championInfo = new String[] {"Akali", "The Rogue Assassin", "res/champs/Akali.png"}; break;
			
		case Alistar:
			championInfo = new String[] {"Alistar", "Txhe Minotaur", "res/champs/Alistar.png"}; break;
			
		case Amumu:
			championInfo = new String[] {"Amumu", "The Sad Mummy", "res/champs/Amumu.png"}; break;
			
		case Anivia:
			championInfo = new String[] {"Anivia", "The Cryophoenix", "res/champs/Anivia.png"}; break;
		
		case Annie:
			championInfo = new String[] {"Annie", "The Dark Child", "res/champs/Annie.png"}; break;
		
		case Aphelios:
			championInfo = new String[] {"Aphelios", "The Weapon of the Faithful", "res/champs/Aphelios.png"}; break;
		
		case Ashe:
			championInfo = new String[] {"Ashe", "The Frost Archer", "res/champs/Ashe.png"}; break;
		
		case Aurelion_Sol:
			championInfo = new String[] {"Aurelion Sol", "The Star Forger", "res/champs/AurelionSol.png"}; break;
		
		case Azir:
			championInfo = new String[] {"Azir", "The Emperor of the Sands", "res/champs/Azir.png"}; break;
			
		// B
		case Bard:
			championInfo = new String[] {"Bard", "The Wandering Caretaker", "res/champs/Bard.png"}; break;
		
		case Blitzcrank:
			championInfo = new String[] {"Blitzcrank", "The Great Steam Golem", "res/champs/Blitzcrank.png"}; break;
		
		case Brand:
			championInfo = new String[] {"Brand", "The Burning Vengeance", "res/champs/Brand.png"}; break;
		
		case Braum:
			championInfo = new String[] {"Braum", "The Heart of the Freljord", "res/champs/Braum.png"}; break;
		
		// C
		case Caitlyn:
			championInfo = new String[] {"Caitlyn", "The Sheriff of Piltover", "res/champs/Caitlyn.png"}; break;
		
		case Camille:
			championInfo = new String[] {"Camille", "The Steel Shadow", "res/champs/Camille.png"}; break;
		
		case Cassiopeia:
			championInfo = new String[] {"Cassiopeia", "The Serpent's Embrace", "res/champs/Cassiopeia.png"}; break;
			
		case Cho__Gath:
			championInfo = new String[] {"Cho'Gath", "The Terror of the Void", "res/champs/Chogath.png"}; break;
		
		case Corki:
			championInfo = new String[] {"Corki", "The Daring Bombardier", "res/champs/Corki.png"}; break;
		
		// D
		case Darius:
			championInfo = new String[] {"Darius", "The Hand of Noxus", "res/champs/Darius.png"}; break;
			
		case Diana:
			championInfo = new String[] {"Diana", "Scorn of the Moon", "res/champs/Diana.png"}; break;
		
		case Dr___Mundo:
			championInfo = new String[] {"Dr. Mundo", "The Madman of Zaun", "res/champs/DrMundo.png"}; break;
		
		case Draven:
			championInfo = new String[] {"Draven", "The Glorious Executioner", "res/champs/Draven.png"}; break;
		
		// E
		case Ekko:
			championInfo = new String[] {"Ekko", "The Boy Who Shattered Time", "res/champs/Ekko.png"}; break;
			
		case Elise:
			championInfo = new String[] {"Elise", "The Spider Queen", "res/champs/Elise.png"}; break;
		
		case Evelynn:
			championInfo = new String[] {"Evelynn", "Agony's Embrace", "res/champs/Evelynn.png"}; break;
		
		case Ezreal:
			championInfo = new String[] {"Ezreal", "The Prodigal Explorer", "res/champs/Ezreal.png"}; break;
		
		// F
		case Fiddlesticks:
			championInfo = new String[] {"Fiddlesticks", "The Harbinger of Doom", "res/champs/Fiddlesticks.png"}; break;
		
		case Fiora:
			championInfo = new String[] {"Fiora", "The Grand Duelist", "res/champs/Fiora.png"}; break;
		
		case Fizz:
			championInfo = new String[] {"Fizz", "The Tidal Trickster", "res/champs/Fizz.png"}; break;
		
		// G
		case Galio:
			championInfo = new String[] {"Galio", "The Colossus", "res/champs/Galio.png"}; break;
			
		case Gangplank:
			championInfo = new String[] {"Gangplank", "The Saltwater Scourge", "res/champs/Gangplank.png"}; break;
		
		case Garen:
			championInfo = new String[] {"Garen", "The Might of Demacia", "res/champs/Garen.png"}; break;
			
		case Gnar:
			championInfo = new String[] {"Gnar", "The Missing Link", "res/champs/Gnar.png"}; break;
		
		case Gragas:
			championInfo = new String[] {"Gragas", "The Rabble Rouser", "res/champs/Gragas.png"}; break;
		
		case Graves:
			championInfo = new String[] {"Graves", "The Outlaw", "res/champs/Graves.png"}; break;
			
		// H
		case Hecarim:
			championInfo = new String[] {"Hecarim", "The Shadow of War", "res/champs/Hecarim.png"}; break;
			
		case Heimerdinger:
			championInfo = new String[] {"Heimerdinger", "The Revered Inventor", "res/champs/Heimerdinger.png"}; break;
			
		// I
		case Illaoi:
			championInfo = new String[] {"Illaoi", "The Kraken Priestess", "res/champs/Illaoi.png"}; break;
		
		case Irelia:
			championInfo = new String[] {"Irelia", "The Blade Dancer", "res/champs/Irelia.png"}; break;
		
		case Ivern:
			championInfo = new String[] {"Ivern", "The Green Father", "res/champs/Ivern.png"}; break;
		
		// J
		case Janna:
			championInfo = new String[] {"Janna", "The Storm's Fury", "res/champs/Janna.png"}; break;
		
		case Jarvan_IV:
			championInfo = new String[] {"Jarvan IV", "The Exemplar of Demacia", "res/champs/JarvanIV.png"}; break;
		
		case Jax:
			championInfo = new String[] {"Jax", "Grandmaster at Arms", "res/champs/Jax.png"}; break;
		
		case Jayce:
			championInfo = new String[] {"Jayce", "The Defender of Tomorrow", "res/champs/Jayce.png"}; break;
		
		case Jhin:
			championInfo = new String[] {"Jhin", "The Virtuoso", "res/champs/Jhin.png"}; break;
		
		case Jinx:
			championInfo = new String[] {"Jinx", "The Loose Cannon", "res/champs/Jinx.png"}; break;
		
		// K
		case Kai__Sa:
			championInfo = new String[] {"Kai'Sa", "Daughter of the Void", "res/champs/Kaisa.png"}; break;
		
		case Kalista:
			championInfo = new String[] {"Kalista", "The Spear of Vengeance", "res/champs/Kalista.png"}; break;
			
		case Karma:
			championInfo = new String[] {"Karma", "The Enlightened One", "res/champs/Karma.png"}; break;
		
		case Karthus:
			championInfo = new String[] {"Karthus", "The Deathsinger", "res/champs/Karthus.png"}; break;
			
		case Kassadin:
			championInfo = new String[] {"Kassadin", "The Void Walker", "res/champs/Kassadin.png"}; break;
		
		case Katarina:
			championInfo = new String[] {"Katarina", "The Sinister Blade", "res/champs/Katarina.png"}; break;
		
		case Kayle:
			championInfo = new String[] {"Kayle", "The Righteous", "res/champs/Kayle.png"}; break;
		
		case Kayn:
			championInfo = new String[] {"Kayn", "The Shadow Reaper", "res/champs/Kayn.png"}; break;
		
		case Kennen:
			championInfo = new String[] {"Kennen", "The Heart of the Tempest", "res/champs/Kennen.png"}; break;
		
		case Kha__Zix:
			championInfo = new String[] {"Kha'Zix", "The Voidreaver", "res/champs/Khazix.png"}; break;
		
		case Kindred:
			championInfo = new String[] {"Kindred", "The Eternal Hunters", "res/champs/Kindred.png"}; break;
		
		case Kled:
			championInfo = new String[] {"Kled", "The Cantankerous Cavalier", "res/champs/Kled.png"}; break;
			
		case Kog__Maw:
			championInfo = new String[] {"Kog'Maw", "The Mouth of the Abyss", "res/champs/KogMaw.png"}; break;
		
		// L
		case LeBlanc:
			championInfo = new String[] {"LeBlanc", "The Deceiver", "res/champs/Leblanc.png"}; break;
		
		case Lee_Sin:
			championInfo = new String[] {"Lee Sin", "The Blind Monk", "res/champs/LeeSin.png"}; break;
			
		case Leona:
			championInfo = new String[] {"Leona", "The Radiant Dawn", "res/champs/Leona.png"}; break;
		
		case Lissandra:
			championInfo = new String[] {"Lissandra", "The Ice Witch", "res/champs/Lissandra.png"}; break;
		
		case Lucian:
			championInfo = new String[] {"Lucian", "The Purifier", "res/champs/Lucian.png"}; break;
			
		case Lulu:
			championInfo = new String[] {"Lulu", "The Fae Sorceress", "res/champs/Lulu.png"}; break;
		
		case Lux:
			championInfo = new String[] {"Lux", "The Lady of Luminosity", "res/champs/Lux.png"}; break;
			
		// M
		case Malphite:
			championInfo = new String[] {"Malphite", "Shard of the Monolith", "res/champs/Malphite.png"}; break;
		
		case Malzahar:
			championInfo = new String[] {"Malzahar", "The Prophet of the Void", "res/champs/Malzahar.png"}; break;
			
		case Maokai:
			championInfo = new String[] {"Maokai", "The Twisted Treant", "res/champs/Maokai.png"}; break;
		
		case Master_Yi:
			championInfo = new String[] {"Master Yi", "The Wuju Bladesman", "res/champs/MasterYi.png"}; break;
			
		case Miss_Fortune:
			championInfo = new String[] {"Miss Fortune", "The Bounty Hunter", "res/champs/MissFortune.png"}; break;
			
		case Mordekaiser:
			championInfo = new String[] {"Mordekaiser", "The Iron Revenant", "res/champs/Mordekaiser.png"}; break;
			
		case Morgana:
			championInfo = new String[] {"Morgana", "The Fallen", "res/champs/Morgana.png"}; break;
			
		// N
		case Nami:
			championInfo = new String[] {"Nami", "The Tidecaller", "res/champs/Nami.png"}; break;
			
		case Nasus:
			championInfo = new String[] {"Nasus", "The Curator of the Sands", "res/champs/Nasus.png"}; break;
			
		case Nautilus:
			championInfo = new String[] {"Nautilus", "The Titan of the Depths", "res/champs/Nautilus.png"}; break;
			
		case Neeko:
			championInfo = new String[] {"Neeko", "The Curious Chameleon", "res/champs/Neeko.png"}; break;
			
		case Nidalee:
			championInfo = new String[] {"Nidalee", "The Bestial Huntress", "res/champs/Nidalee.png"}; break;
		
		case Nocturne:
			championInfo = new String[] {"Nocturne", "The Eternal Nightmare", "res/champs/Nocturne.png"}; break;
			
		case Nunu_and_Willump:
			championInfo = new String[] {"Nunu & Willump", "The Boy and His Yeti", "res/champs/Nunu.png"}; break;
			
		// O
		case Olaf:
			championInfo = new String[] {"Olaf", "The Berserker", "res/champs/Olaf.png"}; break;
		
		case Orianna:
			championInfo = new String[] {"Orianna", "The Lady of Clockwork", "res/champs/Orianna.png"}; break;
			
		case Ornn:
			championInfo = new String[] {"Ornn", "The Fire below the Mountain", "res/champs/Ornn.png"}; break;
			
		// P
		case Pantheon:
			championInfo = new String[] {"Pantheon", "The Unbreakable Spear", "res/champs/Pantheon.png"}; break;
			
		case Poppy:
			championInfo = new String[] {"Poppy", "Keeper of the Hammer", "res/champs/Poppy.png"}; break;
			
		case Pyke:
			championInfo = new String[] {"Pyke", "The Bloodharbor Ripper", "res/champs/Pyke.png"}; break;
			
		// Q
		case Qiyana:
			championInfo = new String[] {"Qiyana", "Empress of the Elements", "res/champs/Qiyana.png"}; break;
			
		case Quinn:
			championInfo = new String[] {"Quinn", "Demacia's Wings", "res/champs/Quinn.png"}; break;
			
		// R
		case Rakan:
			championInfo = new String[] {"Rakan", "The Charmer", "res/champs/Rakan.png"}; break;
			
		case Rammus:
			championInfo = new String[] {"Rammus", "The Armordillo", "res/champs/Rammus.png"}; break;
			
		case Rek__Sai:
			championInfo = new String[] {"Rek'Sai", "The Void Burrower", "res/champs/RekSai.png"}; break;
			
		case Renekton:
			championInfo = new String[] {"Renekton", "The Butcher of the Sands", "res/champs/Renekton.png"}; break;
			
		case Rengar:
			championInfo = new String[] {"Rengar", "The Pridestalker", "res/champs/Rengar.png"}; break;
			
		case Riven:
			championInfo = new String[] {"Riven", "The Exile", "res/champs/Riven.png"}; break;
			
		case Rumble:
			championInfo = new String[] {"Rumble", "The Mechanized Menace", "res/champs/Rumble.png"}; break;
			
		case Ryze:
			championInfo = new String[] {"Ryze", "The Rune Mage", "res/champs/Ryze.png"}; break;
			
		// S
		case Sejuani:
			championInfo = new String[] {"Sejuani", "Fury of the North", "res/champs/Sejuani.png"}; break;
			
		case Senna:
			championInfo = new String[] {"Senna", "The Redeemer", "res/champs/Senna.png"}; break;
			
		case Sett:
			championInfo = new String[] {"Sett", "The Boss", "res/champs/Sett.png"}; break;
			
		case Shaco:
			championInfo = new String[] {"Shaco", "The Demon Jester", "res/champs/Shaco.png"}; break;
			
		case Shen:
			championInfo = new String[] {"Shen", "The Eye of Twilight", "res/champs/Shen.png"}; break;
			
		case Shyvana:
			championInfo = new String[] {"Shyvana", "The Half-Dragon", "res/champs/Shyvana.png"}; break;
			
		case Singed:
			championInfo = new String[] {"Singed", "The Mad Chemist", "res/champs/Singed.png"}; break;
			
		case Sion:
			championInfo = new String[] {"Sion", "The Undead Juggernaut", "res/champs/Sion.png"}; break;
			
		case Sivir:
			championInfo = new String[] {"Sivir", "The Battle Mistress", "res/champs/Sivir.png"}; break;
			
		case Skarner:
			championInfo = new String[] {"Skarner", "The Crystal Vanguard", "res/champs/Skarner.png"}; break;
			
		case Sona:
			championInfo = new String[] {"Sona", "Maven of the Strings", "res/champs/Sona.png"}; break;
			
		case Soraka:
			championInfo = new String[] {"Soraka", "The Starchild", "res/champs/Soraka.png"}; break;
			
		case Swain:
			championInfo = new String[] {"Swain", "The Noxian Grand General", "res/champs/Swain.png"}; break;
			
		case Sylas:
			championInfo = new String[] {"Sylas", "The Unshackled", "res/champs/Sylas.png"}; break;
			
		case Syndra:
			championInfo = new String[] {"Syndra", "The Dark Sovereign", "res/champs/Syndra.png"}; break;
			
		// T
		case Tahm_Kench:
			championInfo = new String[] {"Tahm Kench", "The River King", "res/champs/TahmKench.png"}; break;
			
		case Taliyah:
			championInfo = new String[] {"Taliyah", "The Stoneweaver", "res/champs/Taliyah.png"}; break;
			
		case Talon:
			championInfo = new String[] {"Talon", "The Blade's Shadow", "res/champs/Talon.png"}; break;
			
		case Taric:
			championInfo = new String[] {"Taric", "The Shield of Valoran", "res/champs/Taric.png"}; break;
			
		case Teemo:
			championInfo = new String[] {"Teemo", "The Swift Scout", "res/champs/Teemo.png"}; break;
			
		case Thresh:
			championInfo = new String[] {"Thresh", "The Chain Warden", "res/champs/Thresh.png"}; break;
			
		case Tristana:
			championInfo = new String[] {"Tristana", "The Yordle Gunner", "res/champs/Tristana.png"}; break;
			
		case Trundle:
			championInfo = new String[] {"Trundle", "The Troll King", "res/champs/Trundle.png"}; break;
			
		case Tryndamere:
			championInfo = new String[] {"Tryndamere", "The Barbarian King", "res/champs/Tryndamere.png"}; break;
			
		case Twisted_Fate:
			championInfo = new String[] {"Twisted Fate", "The Card Master", "res/champs/TwistedFate.png"}; break;
			
		case Twitch:
			championInfo = new String[] {"Twitch", "The Plague Rat", "res/champs/Twitch.png"}; break;
			
		// U
		case Udyr:
			championInfo = new String[] {"Udyr", "The Spirit Walker", "res/champs/Udyr.png"}; break;
			
		case Urgot:
			championInfo = new String[] {"Urgot", "The Dreadnought", "res/champs/Urgot.png"}; break;
			
		// V
		case Varus:
			championInfo = new String[] {"Varus", "The Arrow of Retribution", "res/champs/Varus.png"}; break;
			
		case Vayne:
			championInfo = new String[] {"Vayne", "The Night Hunter", "res/champs/Vayne.png"}; break;
			
		case Veigar:
			championInfo = new String[] {"Veigar", "The Tiny Master of Evil", "res/champs/Veigar.png"}; break;
			
		case Vel__Koz:
			championInfo = new String[] {"Vel'Koz", "The Eye of the Void", "res/champs/Velkoz.png"}; break;
			
		case Vi:
			championInfo = new String[] {"Vi", "The Piltover Enforcer", "res/champs/Vi.png"}; break;
			
		case Viktor:
			championInfo = new String[] {"Viktor", "The Machine Herald", "res/champs/Viktor.png"}; break;
			
		case Vladimir:
			championInfo = new String[] {"Vladimir", "The Crimson Reaper", "res/champs/Vladimir.png"}; break;
			
		case Volibear:
			championInfo = new String[] {"Volibear", "The Thunder's Roar", "res/champs/Volibear.png"}; break;
			
		// W
		case Warwick:
			championInfo = new String[] {"Warwick", "The Uncaged Wrath of Zaun", "res/champs/Warwick.png"}; break;
			
		case Wukong:
			championInfo = new String[] {"Wukong", "The Monkey King", "res/champs/MonkeyKing.png"}; break;
			
		// X
		case Xayah:
			championInfo = new String[] {"Xayah", "The Rebel", "res/champs/Xayah.png"}; break;
			
		case Xerath:
			championInfo = new String[] {"Xerath", "The Magus Ascendant", "res/champs/Xerath.png"}; break;
			
		case Xin_Zhao:
			championInfo = new String[] {"Xin Zhao", "The Seneschal of Demacia", "res/champs/XinZhao.png"}; break;
			
		// Y
		case Yasuo:
			championInfo = new String[] {"Yasuo", "The Unforgiven", "res/champs/Yasuo.png"}; break;
			
		case Yorick:
			championInfo = new String[] {"Yorick", "Shepherd of Souls", "res/champs/Yorick.png"}; break;
			
		case Yuumi:
			championInfo = new String[] {"Yuumi", "The Magical Cat", "res/champs/Yuumi.png"}; break;
			
		// Z
		case Zac:
			championInfo = new String[] {"Zac", "The Secret Weapon", "res/champs/Zac.png"}; break;
			
		case Zed:
			championInfo = new String[] {"Zed", "The Master of Shadows", "res/champs/Zed.png"}; break;
			
		case Ziggs:
			championInfo = new String[] {"Ziggs", "The Hexplosives Expert", "res/champs/Ziggs.png"}; break;
			
		case Zilean:
			championInfo = new String[] {"Zilean", "The Chronokeeper", "res/champs/Zilean.png"}; break;
			
		case Zoe:
			championInfo = new String[] {"Zoe", "The Aspect of Twilight", "res/champs/Zoe.png"}; break;
			
		default:
			championInfo = new String[] {"Zyra", "Rise of the Thorns", "res/champs/Zyra.png"};
		}
		
		return championInfo;
			
	}
}
