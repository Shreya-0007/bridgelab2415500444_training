import java.util.Random;
import java.util.HashSet;
public class Q8_OTPGenerator {
    public static int generateOTP(){
        Random r = new Random();
        return 100000 + r.nextInt(900000);
    }
    public static boolean uniqueOTPs(int[] otps){
        HashSet<Integer> s = new HashSet<>();
        for (int v:otps) s.add(v);
        return s.size() == otps.length;
    }
    public static void main(String[] args){
        int[] otps = new int[10];
        for (int i=0;i<10;i++) otps[i]=generateOTP();
        System.out.print("OTPs: ");
        for (int v:otps) System.out.print(v+" ");
        System.out.println();
        System.out.println("Unique? "+uniqueOTPs(otps));
    }
}
