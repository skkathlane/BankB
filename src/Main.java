import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        User user=new User("7974430504", BigDecimal.valueOf(5000.0));
            try {
                Socket socket = new Socket("localhost", 7000);
                System.out.println("Bank A and B are connected now");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while(true) {
                    BigDecimal bigDecimal = new BigDecimal( bufferedReader.readLine());
                    user.setBalance(user.getBalance().add(bigDecimal));
                    System.out.println("Receive from Bank A : " + bigDecimal + "  New updated balance : "+user.getBalance());
                }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}