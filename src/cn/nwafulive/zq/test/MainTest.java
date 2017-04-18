package cn.nwafulive.zq.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cn.nwafulive.zq.parser.Parser;
import cn.nwafulive.zq.parser.ParserTokenManager;
import cn.nwafulive.zq.parser.SimpleCharStream;
import cn.nwafulive.zq.parser.SimpleNode;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根
		File file = new File(".\\programme\\whilecode.txt");
		FileInputStream in = new FileInputStream(file);
		SimpleCharStream scstream = new SimpleCharStream(in);
		ParserTokenManager tm = new ParserTokenManager(scstream);
		Parser parser = new Parser(tm);
		try {

			SimpleNode n = parser.Start();
			n.dump("");
			parser.qtTable.printQTTable();
			System.out.println("Thank you.");
		} catch (Exception e) {
			System.out.println("Oops.");
			System.out.println(e.getMessage());
		}

	}

}
