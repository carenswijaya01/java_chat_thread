
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI
 */
public class cli {

    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("127.0.0.1", 3000);
       
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        System.out.println("Start the chitchat, type and press Enter key");

        String receiveMessage, sendMessage;
        while (true) {
            if ((receiveMessage = receiveRead.readLine()) != null) //receive from server
            {
                System.out.println(receiveMessage); // displaying at DOS prompt
            }
            sendMessage = keyRead.readLine();  // keyboard reading
            pwrite.println(sendMessage);       // sending to server
            pwrite.flush();                    // flush the data
        }
    }
}
