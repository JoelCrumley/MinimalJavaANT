package joel.minimaljava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import joel.lib.helloworld.HelloWorld;

public class MinimalJava {
	public static void main(String[] args) {
		
		HelloWorld.helloWorld();
		
		System.out.println("args.length=" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
		
		System.out.println("\ntest_file.txt");
		try {
			InputStream in = MinimalJava.class.getResourceAsStream("/test_file.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
