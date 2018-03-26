//lib import 
import java.net.*; //.net for internet access where connection between clint and server's 
import java.io.*;  //.io file read or write
class MyServer //class name
{  
public static void main(String args[]) throws Exception 
{  
ServerSocket ss=new ServerSocket(3333);  //socket is always on server side!!
Socket s=ss.accept();  //incoming strings
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String a=" ",b=" ";  
while(!b.equals("stop")){  
a=din.readUTF();  
System.out.println("client says: "+a);  
b=br.readLine();  
dout.writeUTF(b);  
dout.flush();  
}  
din.close();  
s.close();  //socket close connection distroy
ss.close();  
}
}