import java.util.LinkedList;
public class person {
    LinkedList payam =new LinkedList();

    protected String firstname;
    protected String lastname;
     //public  String psyam;
    protected int num;  //sh daneshjooyi
    protected int password;
   
    
    //**************************************SET****************************

    void setfirstname(String a) {
        firstname = a;
    }

    //*****************************************
    void setlastname(String b) {
        lastname = b;
    }
    //******************************

    void setnum(int b) {
        num = b;
    }

    //***************************
    void setpass(int b) {
        password = b;
    }
    //************************************GET********************

    String getfirstname() {
        String a = firstname;
        return a;
    }

    //****************************************************
    String getlastname() {
        String a = lastname;
        return a;
    }
    //**********************************************

    int getnum() {
        int a = num;
        return a;
    }
    //*****************************************

    int getpass() {
        int a = password;
        return a;
    }
    void saving(String p){
        payam.addFirst(p);
    }
    
   
       
    }

