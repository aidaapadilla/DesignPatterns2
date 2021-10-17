import java.util.ResourceBundle;
import java.util.Scanner;
public class I18NConsole {
    public static void main(String[] args) {
        ResourceBundle rb_ca = ResourceBundle.getBundle("ca.properties");
        Scanner lector = new Scanner(System.in);
        System.out.printf("%s: ",rb_ca.getString("K1"));
        String res1=lector.nextLine(); //Si es un integer posem get int
        System.out.printf("%s: ",rb_ca.getString("K2"));
        String res2=lector.nextLine(); //Si es un integer posem get int

        ResourceBundle rb_en = ResourceBundle.getBundle("en.properties");
        Scanner lector2 = new Scanner(System.in);
        System.out.printf("%s: ",rb_en.getString("K1"));
        String res3=lector2.nextLine(); //Si es un integer posem get int
        System.out.printf("%s: ",rb_en.getString("K2"));
        String res4=lector2.nextLine(); //Si es un integer posem get int

        ResourceBundle rb_es = ResourceBundle.getBundle("es.properties");
        Scanner lector3 = new Scanner(System.in);
        System.out.printf("%s: ",rb_en.getString("K1"));
        String res5=lector2.nextLine(); //Si es un integer posem get int
        System.out.printf("%s: ",rb_en.getString("K2"));
        String res6=lector2.nextLine(); //Si es un integer posem get int
    }
}
