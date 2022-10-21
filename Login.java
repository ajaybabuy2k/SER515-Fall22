
import java.util.Scanner;
import java.io.*;

public class Login {
    int userType;



    public int login() throws IOException {

        System.out.println("Enter Username ");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        System.out.println("Enter Password ");
        String password = scan.next();
        userType = validation(username, password);
        return userType;
    }

    public int validation(String username, String password) throws IOException {

        File buyers = new File("resources/Buyerinfo.txt");
        BufferedReader br
                = new BufferedReader(new FileReader(buyers));
        String st;
        while ((st = br.readLine()) != null){
            String[] user = st.split(":");
            if (user[0].equalsIgnoreCase(username) & user[1].equalsIgnoreCase(password)){
                userType = 0;
                return userType;
            }
        }

        File sellers = new File("resources/Sellerinfo.txt");
        br = new BufferedReader(new FileReader(sellers));
        while ((st = br.readLine()) != null){
            String[] user = st.split(":");
            if (user[0].equalsIgnoreCase(username) & user[1].equalsIgnoreCase(password)){
                userType = 1;
                return userType;
            }
        }

        System.out.println("Invalid User ");
        return -1;
    }

}