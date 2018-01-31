package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
  public static void main(String[] args) throws Exception{
	  File f1=new File("D:/abcd/homework.txt");
	  
	 InputStream du=new FileInputStream(f1);
	 byte[] a=new byte[(int) f1.length()];
	 du.read(a);
	 File f2=new File("D:/work/homework1.txt");
	 OutputStream xie=new FileOutputStream(f2);
	 xie.write(a);
	 xie.close();
	 System.out.println("–¥»ÎÕÍ≥…");
  }
}
