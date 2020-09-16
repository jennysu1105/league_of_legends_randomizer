package league_of_legends_randomizer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import resources.Champions;
import resources.Items;
import resources.RunesClasses;
import runes.Shards;

public class Application extends JPanel{

	private JFrame window;
	
	private JPanel championInfo;
	private String[] champion;
	private JLabel champImage;
	private JPanel champNameInfo;
	private JLabel champName;
	private JLabel champTitle;
	
	private JPanel itemInfo;
	private String[][] items;
	private JLabel[] itemNames;
	private JLabel[] itemIcons;
	
	private JPanel runeInfo;
	private String[][] runesM;
	private String[][] runesS;
	private RunesClasses[] runeClass;
	private JLabel[] runeNames;
	private JLabel[] runeIcons;
	private final int RUNE_DIMENSION = 60;
	
	private JPanel shardInfo;
	private String[] shards;
	private JLabel[] shardIcons;
	
	public Application(JFrame window){
		this.window = window;
		
		setOpaque(true);
		setBackground(new Color(66, 173, 245));
		
		loadChampInfo();
		loadItemInfo();
		loadRuneInfo();
		
	}
	
	private JPanel generateFiller(String colour) {
		JPanel filler = new JPanel();
		switch (colour) {
		case "Black" :
			filler.setOpaque(true);
			filler.setBackground(new Color(0,0,0));
			return filler;
		
		default:
			return filler;
		}
	}
	
	private void loadChampInfo() {
		champion = Champions.choose();
		championInfo = new JPanel();
		championInfo.setOpaque(true);
		championInfo.setBackground(new Color(0,0,0));
		championInfo.setLayout(new GridLayout(1, 5, 20, 0));
		
		try {
			BufferedImage image = ImageIO.read(new File(champion[2]));
			champImage = new JLabel();
			champImage.setIcon(new ImageIcon(image));
		} catch(IOException e) {
			System.err.print("Cannot find Image");
		}
				
		championInfo.add(champImage);
		
		champNameInfo = new JPanel();
		champNameInfo.setLayout(new GridLayout(4,1));
		champName = new JLabel(champion[0]);
		champName.setOpaque(true);
		champName.setForeground(new Color(255, 255, 255));
		champName.setBackground(new Color(0,0,0));
		champTitle = new JLabel(champion[1]);
		champTitle.setOpaque(true);
		champTitle.setForeground(new Color(255, 255, 255));
		champTitle.setBackground(new Color(0,0,0));
		
		champNameInfo.add(generateFiller("Black"));
		champNameInfo.add(champName);
		champNameInfo.add(champTitle);
		champNameInfo.add(generateFiller("Black"));
		
		championInfo.add(champNameInfo);
		
		championInfo.add(generateFiller("Black"));
		
		championInfo.add(generateFiller("Black"));
		
		window.add(championInfo);
	}
	
	private void loadItemInfo() {
		itemInfo = new JPanel();
		itemInfo.setLayout(new GridLayout(2, 8, 5, 0));
		
		items = Items.getItems(champion[0]);
		itemNames = new JLabel[6];
		itemIcons = new JLabel[6];
		
		itemInfo.add(generateFiller(""));
		for (int i = 0; i < items.length; i++) {
			itemNames[i] = new JLabel(items[i][0]);
			try {
				itemIcons[i] = new JLabel();
				itemIcons[i].setIcon(new ImageIcon(ImageIO.read(new File(items[i][1]))));
			} catch (IOException e) {
				System.err.print("Cannot find image");
			}
		}
		
		for (int i = 0; i < 6; i++) {
			itemInfo.add(itemNames[i]);
		}
		itemInfo.add(generateFiller(""));
		itemInfo.add(generateFiller(""));
		
		for (int i = 0; i < 6; i++) {
			itemInfo.add(itemIcons[i]);
		}
		
		itemInfo.add(generateFiller(""));
		window.add(itemInfo);
	}
	
	private void loadRuneInfo() {
		runeInfo = new JPanel();
		runeInfo.setOpaque(true);
		runeInfo.setBackground(new Color(0,0,0));
		runeInfo.setLayout(new GridLayout(2,9));
		runeClass = RunesClasses.getRuneClasses();
		runesM = RunesClasses.getMainClass(runeClass[0], champion[0]);
		runesS = RunesClasses.getSubClass(runeClass[1], champion[0]);
		
		runeNames = new JLabel[6];
		runeIcons = new JLabel[6];
		
		for (int i = 0; i < runesM.length; i++) {
			runeNames[i] = new JLabel(runesM[i][0]);
			runeNames[i].setForeground(new Color(255,255,255));
			try {
				runeIcons[i] = new JLabel();
				runeIcons[i].setIcon(new ImageIcon(ImageIO.read(new File(runesM[i][1])).getScaledInstance(RUNE_DIMENSION, RUNE_DIMENSION, java.awt.Image.SCALE_SMOOTH)));
			} catch (IOException e) {
				System.err.print(runesM[i][0] + ": Cannot find image");
			}
		}
		
		for (int i = 0; i < runesS.length; i++) {
			runeNames[i+4] = new JLabel(runesS[i][0]);
			runeNames[i + 4].setForeground(new Color(255,255,255));
			try {
				runeIcons[i + 4] = new JLabel();
				runeIcons[i + 4].setIcon(new ImageIcon(ImageIO.read(new File(runesS[i][1])).getScaledInstance(RUNE_DIMENSION, RUNE_DIMENSION, java.awt.Image.SCALE_SMOOTH)));
			} catch (IOException e) {
				System.err.print(runesS[i][0] + ": Cannot find image");
			}
		}
		runeInfo.add(generateFiller("Black"));
		for (int i= 0; i < 6; i++) {
			if (i == 4) {
				runeInfo.add(generateFiller("Black"));
			}
			runeInfo.add(runeIcons[i]);
		}
		runeInfo.add(generateFiller("Black"));
		runeInfo.add(generateFiller("Black"));
		for (int i= 0; i < 6; i++) {
			if (i == 4) {
				runeInfo.add(generateFiller("Black"));
			}
			runeInfo.add(runeNames[i]);
		}
		runeInfo.add(generateFiller("Black"));
		window.add(runeInfo);
	}
	
	public void loadRuneShards() {
		shardInfo = new JPanel();
		shards = Shards.getShards();
		shardIcons = new JLabel[3];
		for (int i = 0; i < shards.length; i++) {
			try {
				shardIcons[i] = new JLabel();
				shardIcons[i].setIcon(new ImageIcon(ImageIO.read(new File(shards[i]))));
			} catch (IOException e) {
				System.err.print("Cannot find image");
			}
		}
		for (JLabel i : shardIcons) {
			shardInfo.add(i);
		}
		
		window.add(shardInfo);
	}
}
