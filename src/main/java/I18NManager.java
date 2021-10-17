import java.util.Locale;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private I18NManager(){
    }
    public static I18NManager getInstance(){
        if(instance==null) instance=new I18NManager();
        return instance;
    }

    public static void Changelanguange() {
        String locale = "K1";
        ResourceBundle label = ResourceBundle.getBundle("ca.resources", Locale.forLanguageTag(locale)); //No ho entenc

    }

    //La idea es aconseguir que llegueixi els fitxers del resources si despres li fiques alguna propietat amb el
    //numero de fitx


    //I18NManager: Singleton (cache) + ResourceBundle.   I18NManager.getInstance().getText("ca", "l1");
    //FactoryPattern: Factory + Singleton (cache) + Command + LOG4J
    //      Command c = Factory.getInstance().getCommand("C1"); // Classloader (C1)
    //      c.execute();
    //
    //
    //      c = Factory.getInstance().getCommand("C1");  // Cache (C1)
    //
    //      c.execute();
}
