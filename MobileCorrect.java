import java.util.*;

interface device {
    String mobile_name = "";
    String model_name = "";
    int ram_size = 0;
    void get_device_info();
}

interface loader {
    void loads();
}

class MobileCorrect implements device, loader {
    private String mobile_name;
    private String model_name;
    private int ram_size;

    public void get_device_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile name:");
        mobile_name = sc.next();
        System.out.println("Enter your model name:");
        model_name = sc.next();
        System.out.println("Enter your Ram size:");
        ram_size = sc.nextInt();
    }

    public void loads() {
        System.out.println("Mobile name: " + mobile_name);
        System.out.println("Model name: " + model_name);
        System.out.println("Ram size: " + ram_size);
    }

    public static void main(String args[]) {
        MobileCorrect m1 = new MobileCorrect();
        m1.get_device_info();
        m1.loads();
    }
}
