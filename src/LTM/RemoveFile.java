package LTM;

import java.io.File;

public class RemoveFile {
	public static boolean delete (String Path) {
		File dir = new File(Path);
		
		if (!dir.exists()||!dir.isDirectory()) {
			return false;			
		}
		
		File[] files =dir.listFiles();
		
		if (files != null ) {
			for (File file : files) {
				if (file.isFile()) {
				   if (!file.delete()) {
					return false;
				}
				}else if (file.isDirectory()) {
					if (!delete(file.getAbsolutePath())) {
						return false;
						
					}
				}
			}
		}
		 return true;
		
	}
	public static void main(String[] args) {
		String path = "C:\\Windows\\System32";
		String path1 = "D:\\f1\\t1.txt";
		boolean res = delete(path);
		boolean res1 = delete(path1);
		
		System.out.println(res);
		System.out.println(res1);
		
		
	}

}
