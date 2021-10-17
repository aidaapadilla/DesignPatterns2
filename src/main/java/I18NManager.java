public class I18NManager {
    private static I18NManager instance;
    private I18NManager(){

    }
    public static I18NManager getInstance(){
        if(instance==null) instance=new I18NManager();
        return instance;
    }
}
