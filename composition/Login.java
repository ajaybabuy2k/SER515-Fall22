
import java.util.Scanner;
import java.io.*;

public class Login {
    int userType;

    public int login() throws IOException {

        System.out.println("Enter the Username ");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        System.out.println("Enter thePassword ");
        String password = scan.next();
        userType = validation(username, password);
        return userType;
    }

    public int validation(String username, String password) throws IOException {

        File buyersFile = new File("resources/Buyerinfo.txt");
        BufferedReader br = new BufferedReader(new FileReader(buyersFile));
        String st;
        while ((st = br.readLine()) != null){
            String[] user = st.split(":");
            if (user[0].equalsIgnoreCase(username) & user[1].equalsIgnoreCase(password)){
                userType = 0;
                return userType;
            }
        }

        File sellersFile = new File("resources/Sellerinfo.txt");
        br = new BufferedReader(new FileReader(sellersFile));
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