
import javax.swing.JOptionPane;

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
    private UserManager UM;//object of control class handling Users
    private NotesManager NM;//object of control class handling Notes/Resources
    private StoreManager SM;//object of control class handling buying-selling of books/equipments
    private LoginUI loginScreen;
    private RegisterUI registerScreen;
    private DashboardUI dashboardScreen;
    private SearchUI searchScreen;
    private uploadUI uploadScreen;
    private EStoreUI estoreScreen;
    private SellBookUI sellbookScreen;
    private SellEquipmentUI selleqpScreen;
    private SettingsUI settingScreen;
    
    private User current_user; //store details of currently logged in User
    
    DisplayManager(){
        UM = new UserManager();
        NM = new NotesManager();
        SM = new StoreManager();
        UM.init();
        NM.init();
        SM.init();
    }
    /**
    public void hideAll(){
        loginScreen.setVisible(false);
        registerScreen.setVisible(false);
        dashboardScreen.setVisible(false);
        searchScreen.setVisible(false);
        uploadScreen.setVisible(false);
        estoreScreen.setVisible(false);
        sellbookScreen.setVisible(false);
        selleqpScreen.setVisible(false);
        settingScreen.setVisible(false);
    }
    */
    public void setUser(User X){//X is currently logged in User extracted from Log In page
        this.current_user = X;
    }
    public User getUser(){//return details of currently logged-in User
        return this.current_user;
    }
    public void dispLoginUI(){
        loginScreen.setVisible(true);
    }
    public void dispRegisterUI(){
        registerScreen.setVisible(true);
    }
    public void dispDashboardUI(){
        dashboardScreen.setVisible(true);
        dashboardScreen.setUID();
    }
    public void dispSearchUI(){
        searchScreen.setVisible(true);
    }
    public void dispEStoreUI(){
        estoreScreen.setVisible(true);
        estoreScreen.setUID();
    }
    public void dispUploadUI(){
        uploadScreen.setVisible(true);
    }
    public void dispSellBookUI(){
        sellbookScreen.setVisible(true);
    }
    public void dispSellEquipmentUI(){
        selleqpScreen.setVisible(true);
    }
    public void dispSettingsUI(){
        settingScreen.setVisible(true);
    }
    public void ExitApp(){
        int input = JOptionPane.showConfirmDialog(null, "Do you want to exit?");
        if(input==0){
            System.exit(0);
        }
    }
    
    public static void main(String args[]){
        DisplayManager startMG = new DisplayManager();
        startMG.loginScreen=new LoginUI(startMG,startMG.UM);
        startMG.registerScreen=new RegisterUI(startMG,startMG.UM);
        startMG.dashboardScreen = new DashboardUI(startMG);
        startMG.searchScreen=new SearchUI(startMG,startMG.NM);
        startMG.estoreScreen=new EStoreUI(startMG,startMG.SM,startMG.UM,startMG.current_user);
        startMG.uploadScreen=new uploadUI(startMG,startMG.NM);
        startMG.sellbookScreen=new SellBookUI(startMG,startMG.SM);
        startMG.selleqpScreen=new SellEquipmentUI(startMG,startMG.SM);
        startMG.settingScreen = new SettingsUI(startMG);
        //startMG.dispLoginUI();
        
        SplashUI splash = new SplashUI();
        splash.setVisible(true);
        if(splash.disp()==1){
            startMG.dispLoginUI();
        }
        
    }
    //Testing Account : UID - 8888 , pwd - 88888888
}
