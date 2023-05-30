package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		//String strPath = sc.nextLine();
		String strPath = "src\\in.txt";
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getAbsolute: " + path.getAbsolutePath());
		System.out.println("getCanonicalPath: " + path.getCanonicalPath());
		System.out.println("getFreeSpace: " + path.getFreeSpace());
		sc.close();

	}

}
