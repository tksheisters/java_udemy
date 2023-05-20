package application;

import java.io.File;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for (File file : folders) {
			System.out.println(file);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\sub").mkdir();
		System.out.println(success);

		sc.close();
	}

}
