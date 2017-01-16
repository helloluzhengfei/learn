/*首先创建文件test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。 
以上代码由于是二进制写入，可能存在乱码，
*/
package Stream;
import java.io.*;
public class fileStreamTest {
	 public static void main(String args[]){
		   
		   try{
		      byte bWrite [] = {11,21,3,40,5};
		      OutputStream os = new FileOutputStream("d:/test.txt");//文件会自动新建
		      for(int x=0; x < bWrite.length ; x++){
		         os.write( bWrite[x] ); // writes the bytes
		      }
		      os.close();
		     
		      InputStream is = new FileInputStream("d:/test.txt");
		      int size = is.available();

		      for(int i=0; i< size; i++){
		         System.out.print((char)is.read() + "  ");
		      }
		      is.close();
		   }catch(IOException e){
		      System.out.print("Exception");
		   }	
		   }

}
