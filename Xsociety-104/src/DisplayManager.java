/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaustav
 */
public class DisplayManager {
    private UserManager UM;
    private NotesManager NM;
    private StoreManager SM;
    private LoginUI loginScreen;
    private RegisterUI registerScreen;
    private DashboardUI dashboardScreen;
    private SearchUI searchScreen;
    private uploadUI uploadScreen;
    private EStoreUI estoreScreen;
    private SellBookUI sellbookScreen;
    private SellEquipmentUI selleqpScreen;
    
    private User current_user; //store details of currently logged in User
    
    DisplayManager(){
        UM = new UserManager();
        NM = new NotesManager();
        SM = new StoreManager();
        UM.init();
        NM.init();
        SM.init();
    }
    public void hideAll(){
        loginScreen.setVisible(false);
        registerScreen.setVisible(false);
        dashboardScreen.setVisible(false);
        searchScreen.setVisible(false);
        uploadScreen.setVisible(false);
        estoreScreen.setVisible(false);
        sellbookScreen.setVisible(false);
        selleqpScreen.setVisible(false);
    }
    public void setUser(User X){//X is currently logged in User extracted from Log In page
        this.current_user = X;
    }
    public void dispLoginUI(){
        loginScreen.setVisible(true);
    }
    public void dispRegisterUI(){
        registerScreen.setVisible(true);
    }
    public void dispDashboardUI(){
        dashboardScreen.setVisible(true);
    }
    public void dispSearchUI(){
        searchScreen.setVisible(true);
    }
    public void dispEStoreUI(){
        uploadScreen.setVisible(true);
    }
    public void dispUploadUI(){
        estoreScreen.setVisible(true);
    }
    public void dispSellBookUI(){
        sellbookScreen.setVisible(true);
    }
    public void dispSellEquipmentUI(){
        selleqpScreen.setVisible(true);
    }
    public void SettingsUI(){
        
    }
    
    
    public static void main(String args[]){
        DisplayManager startMG = new DisplayManager();
        startMG.loginScreen=new LoginUI(startMG,startMG.UM);
        startMG.registerScreen=new RegisterUI(startMG,startMG.UM);
        startMG.dashboardScreen = new DashboardUI(startMG);
        startMG.searchScreen=new SearchUI(startMG,startMG.NM);
        startMG.uploadScreen=new uploadUI();
        startMG.estoreScreen=new EStoreUI();
        startMG.sellbookScreen=new SellBookUI();
        startMG.selleqpScreen=new SellEquipmentUI();
        startMG.dispLoginUI();
    }
    //Test case : UID - 8888 , pwd - 88888888
}
