package main;
import java.util.TreeMap;
import SPT.*;
import Tie.*;
import WPNS.*;

public class Setup {

	public static void main(String[] args){
        TreeMap<String, TieFighter> tfs = new TreeMap<>();
        TreeMap<String, TieWeapon> tfs2 = new TreeMap<>();
        tfs.put("TFS-1", new TieFighter_S("TFS-1", new TiePilot("TP-001", "Captain", "Veteran")));
        tfs.put("TFH-21", new TieFighter_H("TFS-21", new TiePilot("TP-011", "Major", "Elite")));
        
        TieFighter_H b = (TieFighter_H) tfs.get("TFH-21");
        
        tfs.get("TFS-1").displayFighterData1();
        b.FiresCannons();
        tfs.get("TFS-1").FiresCannon();
        tfs.get("TFH-21").displayFighterData1();
	}
}
