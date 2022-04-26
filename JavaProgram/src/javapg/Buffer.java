package javapg;
import java.io.*;
public class Buffer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name: ");
		String str = br.readLine();
		System.out.println("Your name is   "+ str);


}
}