/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaustav
 */
public class SRMmanager {

    private UserManager UM;//object of control class handling Users
    private NotesManager NM;//object of control class handling Notes/Resources
    private StoreManager SM;//object of control class handling buying-selling of books/equipments
    private TransactionManager TM;
    public static void main(String[] args) {
        // TODO code application logic here
        SRMmanager HEAD = new SRMmanager();
        HEAD.UM = new UserManager();
        HEAD.NM = new NotesManager();
        HEAD.SM = new StoreManager();
        HEAD.TM = new TransactionManager();
        DisplayManager control = new DisplayManager();
        control.init(HEAD.UM, HEAD.NM, HEAD.SM, HEAD.TM);
        control.startApp();
        //Testing Account : UID - 8888 , pwd - 88888888
    }
    
}
