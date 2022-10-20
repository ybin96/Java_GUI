package exam02;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class FileCopy03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("a", "D");
		map.put("b", "E");
		map.put("c", "F");
		map.put("d", "G");
		map.put("e", "H");
		map.put("f", "I");
		map.put("g", "J");
		map.put("h", "K");
		map.put("i", "L");
		map.put("j", "M");
		map.put("k", "N");
		map.put("l", "O");
		map.put("m", "P");
		map.put("n", "Q");
		map.put("o", "R");
		map.put("p", "S");
		map.put("q", "T");
		map.put("r", "U");
		map.put("s", "V");
		map.put("t", "W");
		map.put("u", "X");
		map.put("v", "Y");
		map.put("w", "Z");
		map.put("x", "A");
		map.put("y", "B");
		map.put("z", "C");
		
		int ch;
		String str = "";
		try {
			FileReader fr =new FileReader(args[0]);
			while((ch = fr.read()) != -1) {
				str += map.get((char)ch);
			}
			fr.close();
			FileWriter fw = new FileWriter(args[1]);
			fw.write(str);
			fw.close();
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}





