package exam02;

// java FileCopy a.txt b.txt

import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		String from = args[0]; // a.txt
		String to = args[1];   // b.txt
		
		try {
			FileReader fr = new FileReader(from);
			FileWriter fw = new FileWriter(to);
			
			int ch;
			String str = "";
			while((ch = fr.read()) != -1) {
				str += (char)ch;
			}
			fw.write(str);
			fr.close();
			fw.close();
			
			System.out.println("파일 복사를 완료하였습니다");
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}
