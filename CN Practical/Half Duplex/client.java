import java.io.*;
import java.net.*;
public class client{ 
    public static void main(String[] args){ 
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
            dout.writeUTF("HelloServer");
            dout.flush();
            dout.close(); 
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}


/* run code command below
step 1 : javac client.java
step 2 : java server
*/