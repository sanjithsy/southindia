package org.kerala;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.andrapradesh.SouthIndia;

public class Kerala {
	
public static void main(String[]args) {
	Map<Character,SouthIndia>k=new HashMap<Character,SouthIndia>();
	SouthIndia k1=new SouthIndia();
	k1.setEmpId(12343456);
	k1.setName("finn");
	k1.setAddress("balor");
	k1.setPhone(234556777777777l);
	
	SouthIndia k2=new SouthIndia();
	k2.setEmpId(12343456);
	k2.setName("finn");
	k2.setAddress("balor");
	k2.setPhone(234556777777777l);
	k.put('w',k1);
	k.put('s',k2);
	Set<Entry<Character, SouthIndia>> entrySet = k.entrySet();
	for (Entry<Character,SouthIndia>x : entrySet) {
		System.out.println(x.getKey());
		System.out.println(x.getValue().getEmpId());
		System.out.println(x.getValue().getName());
		System.out.println(x.getValue().getAddress());
		System.out.println(x.getValue().getPhone());
		
	}
}
}

