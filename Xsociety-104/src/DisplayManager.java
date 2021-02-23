
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
    
    public void init(UserManager UM,NotesManager NM,StoreManager SM,TransactionManager TM){
        UM.init();
        NM.init();
        SM.init();
        this.loginScreen=new LoginUI(this,UM);
        this.registerScreen=new RegisterUI(this,UM);
        this.dashboardScreen = new DashboardUI(this);
        this.searchScreen=new SearchUI(this,NM);
        this.estoreScreen=new EStoreUI(this,SM,UM,current_user,TM);
        this.uploadScreen=new uploadUI(this,NM);
        this.sellbookScreen=new SellBookUI(this,SM);
        this.selleqpScreen=new SellEquipmentUI(this,SM);
        this.settingScreen = new SettingsUI(this);
    }
    public void startApp(){
        //this.dispLoginUI();        
        SplashUI splash = new SplashUI();
        splash.setVisible(true);
        if(splash.disp()==1){
            this.dispLoginUI();
        }
    }
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
}
