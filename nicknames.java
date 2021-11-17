package zad5;

import java.util.HashMap;

public class nicknames {
public static void main (String [] args) {
	HashMap<String,String > nickname = new HashMap <String, String >();
	nickname.put("matti" , "mage");
	nickname.put("mikael" , "mixu");
	nickname.put("arto" , "arppa");
	
	String mikaelsNickname = nickname.get("mikael");
	System.out.println(mikaelsNickname);
}
} 
