
import java.util.Scanner;

import java.util.LinkedList;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("help..............." + "\n" + "1  :creat a new account" + "\n" + "2  :informaition " + "\n" + "3  :massage..."+ "\n" +"4  :show payam ");
        LinkedList ebi = new LinkedList();

        person person1 = new person();
        person person2 = new person();
        person person3 = new person();
        person person4 = new person();
        person person5 = new person();
        person person6 = new person();
        person person7 = new person();
        person person8 = new person();
        person person9 = new person();
        person person10 = new person();
        Scanner input = new Scanner(System.in);

        String b, a,payam;
        int c, d, q,u, x = 1, num,oo,p,ll,qw=1,ff=1,pq=1,pp,ii,yy;
        int pass,yo=1;
        while (true) {
            int s = input.nextInt();

            switch (s) {
                

                case 1:
                    x=1;
                    while (x == 1) {
                        System.out.println(" pleas enter 1-10 number"
                                +"\n"+ "person1  :  1"
                                +"\n"+ "person2  :  2"
                                +"\n"+ "person3  :  3"
                                +"\n"+ "person4  :  4"
                                +"\n"+ "person5  :  5"
                                +"\n"+ "person6  :  6"
                                +"\n"+ "person7  :  7"
                                +"\n"+ "person8  :  8"
                                +"\n"+ "person9  :  9"
                                +"\n"+ "person10 :  10"
                                );
                        u=input.nextInt();
                                    switch (u) {
                                        case 1:
  System.out.println(" person 1 =");//*********************************************************************
                                            System.out.println("pleas enter firstname :");
                                                a = input.next();
                                         person1.setfirstname(a);
                                            System.out.println("hello" + "\t" + a);
                                            System.out.println("pleas enter lastname :");
                                                b = input.next();
                                                person1.setlastname(b);
                                                            System.out.println("pleas enter your ID :");
                                                             c = input.nextInt();
                                                        person1.setnum(c);
                                                                           System.out.println(" plesa enter  a password :");
                                                                           d = input.nextInt();
                                                                person1.setpass(d);
                                                                                      System.out.println(person1.getfirstname() + " welcom to EBI  ");
                                                                                       System.out.println("finish");
                                            ebi.addLast(person1);
                                    
System.out.println("if continu pleas enter : ..1.." + "\n\t" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break;
        
            }
                                        case 2:
                        
 System.out.println(" person 2 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person2.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person2.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person2.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person2.setpass(d);
                                                                  System.out.println(person2.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person2);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break;}
                                     case 3:
 System.out.println(" person 3 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person3.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person3.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person3.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person3.setpass(d);
                                                                  System.out.println(person3.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person3);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
            break;}
                                     case 4:    
 System.out.println(" person 4 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person4.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person4.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person4.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person4.setpass(d);
                                                                  System.out.println(person4.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person4);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break;
//**********************************************************************************************************/
            }
                                     case 5:
         System.out.println(" person 5 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person5.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person5.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person5.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person5.setpass(d);
                                                                  System.out.println(person5.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person5);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break;}

                                     case 6:
System.out.println(" person 6 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person6.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person6.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person6.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person6.setpass(d);
                                                                  System.out.println(person6.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person6);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break; }
                                     case 7:
System.out.println(" person 7 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person7.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person7.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person7.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person7.setpass(d);
                                                                  System.out.println(person7.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person7);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break; }
                                     case 8:
System.out.println(" person 8 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person8.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person8.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person8.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person8.setpass(d);
                                                                  System.out.println(person8.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person8);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break; }
                                     case 9:
        System.out.println(" person 9 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person9.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person9.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person9.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person9.setpass(d);
                                                                  System.out.println(person9.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person9);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break; }
                                     case 10:
                System.out.println(" person 10 =");//*********************************************************************  
                         System.out.println("pleas enter firstname :");
                            a = input.next();
                     person10.setfirstname(a);
                        System.out.println("hello" + "\t" + a);
                        System.out.println("pleas enter lastname :");
                            b = input.next();
                            person10.setlastname(b);
                                        System.out.println("pleas enter your ID :");
                                         c = input.nextInt();
                                    person10.setnum(c);
                                                       System.out.println(" plesa enter  a password :");
                                                       d = input.nextInt();
                                            person10.setpass(d);
                                                                  System.out.println(person10.getfirstname() + " welcom to EBI  ");
                                                                   System.out.println("finish");
                        ebi.addLast(person10);
System.out.println("if continu pleas enter : ..1.." + "\n" + "if End pleas enter :..2..");
        x = input.nextInt();
        if (x == 2) {
        break; }
        break;
}}
                    break;
                case 2:
                    System.out.println(
                            "person1:  " + "\t" + person1.getfirstname() + "\t      " + person1.getlastname()+ "\t          " +person1.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person2:  " + "\t" + person2.getfirstname() + "\t      " + person2.getlastname()+ "\t          " +person2.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person3:  " + "\t" + person3.getfirstname() + "\t      " + person3.getlastname()+ "\t          " +person3.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person4:  " + "\t" + person4.getfirstname() + "\t      " + person4.getlastname()+ "\t          " +person4.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person5:  " + "\t" + person5.getfirstname() + "\t      " + person5.getlastname()+ "\t          " +person5.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person6:  " + "\t" + person6.getfirstname() + "\t      " + person6.getlastname()+ "\t          " +person6.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person7:  " + "\t" + person7.getfirstname() + "\t      " + person7.getlastname()+ "\t          " +person7.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person8:  " + "\t" + person8.getfirstname() + "\t      " + person8.getlastname()+ "\t          " +person8.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person9:  " + "\t" + person9.getfirstname() + "\t      " + person9.getlastname()+ "\t          " +person9.getnum()+ "\t" +"pass :****"
                            + "\t\n" + "person10:  " + "\t" + person10.getfirstname() + "\t      " + person10.getlastname()+ "\t          " +person10.getnum()+ "\t" +"pass :****"
                    );

                    break;
                    //***************************************************************************************************************************
                case 3:

                     System.out.println(" which on are you ???"
                                +"\n"+ "person1  :  1"
                                +"\n"+ "person2  :  2"
                                +"\n"+ "person3  :  3"
                                +"\n"+ "person4  :  4"
                                +"\n"+ "person5  :  5"
                                +"\n"+ "person6  :  6"
                                +"\n"+ "person7  :  7"
                                +"\n"+ "person8  :  8"
                                +"\n"+ "person9  :  9"
                                +"\n"+ "person10 :  10"
                                );
                     while(qw==1){
                         pq=1;
                         ff=1;
                     oo=input.nextInt();
                             switch(oo){
      //**********************************************************************************************
                                 case 1:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person1.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter number :  2"
                                                        + "\n"+" if-continu enter  number:     0");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if- go to home enter number :      2"
                                                         + "\n"+" if -select person  enter number:   0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
         //******************************************************************************************************************
                                case 2:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person2.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter number :  2"
                                                        + "\n"+" if-continu enter  number:     0");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if-go to home enter number :      2"
                                                         + "\n"+" if-select person  enter number:   0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
         //******************************************************************************************************************/******************************************************************************************************************************************************/                                    
                                case 3:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person3.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter number :  2"
                                                        + "\n"+" if-continu enter  number:     0");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if- go to home enter number :     2"
                                                         + "\n"+" if -select person  enter number:  0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
  //***********************************************************************************************************************************************************                                   
                                  case 4:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person4.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter number:    2"
                                                        + "\n"+" if-continu enter  number:      0");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if-go to home enter number :     2"
                                                         + "\n"+" if-select person  enter number:  0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
//*******************************************************************************************************************************************************
                                  case 5:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person5.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter number :    2"
                                                        + "\n"+" if-continu enter  number:       0");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if-go to home enter number :     2"
                                                          +"\n"+" if-select person  enter number:  0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
//***********************************************************************************************************************************************************************
                                case 6:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person6.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                     
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter number :   2"
                                                        + "\n"+" if-continu enter  number:      0");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if-go to home enter number :        2"
                                                         + "\n"+" if-select person  enter number:     0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
   //*******************************************************************************************************************************************                                  
                                 case 7:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person7.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter:  2"
                                                        + "\n"+" if-continu enter:     0 ");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if- go to home enter:     2"
                                                         + "\n"+" if-select person  enter;  0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
 //*********************************************************************************************************
                                 case 8:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person8.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if-go to home enter:      2"
                                                        + "\n"+" if-continu enter :        0 ");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if- go to home enter:           2"
                                                         + "\n"+" if-select person  enter :       0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
 //************************************************************************************************************************************************
                                  case 9:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person9.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if- go to home enter number :  2"
                                           + "\n"+" if -continu enter  number 0 ");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if- go to home enter:                 2"
                                                         + "\n"+" if-select person  enter number :      0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
//******************************************************************************************************************************************                                     
                                 case 10:
                                     System.out.println("enter password :");
                                     p=input.nextInt();
                                     if( p==person10.getpass()){
                                                System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );
                                                while (ff==1) {
                                                    
                                                    
                                         
                                               ll=input.nextInt();
                                              switch (ll) {
                                                  case 1: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person1.saving(payam); 
                                                    break;
                                                    
                                                  case 2: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person2.saving(payam); 
                                                    break; 
                                                    
                                                  case 3: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person3.saving(payam); 
                                                    break; 
                                                    
                                                  case 4: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person4.saving(payam); 
                                                    break;
                                                    
                                                   case 5: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person5.saving(payam); 
                                                    break;
                                                    
                                                   case 6: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person6.saving(payam); 
                                                    break;
                                                    
                                                   case 7: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person7.saving(payam); 
                                                    break; 
                                                    
                                                   case 8: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person8.saving(payam); 
                                                    break;  
                                                    
                                                    case 9: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person9.saving(payam); 
                                                    break;
                                                    
                                                   case 10: 
                                                      System.out.println("enter massage :");
                                                      payam=input.next();
                                                      person10.saving(payam); 
                                                    break; 
                                                    default: System.out.println("eror");
                                             break; }
                                            System.out.println(" if- go to home enter number :  2"
                                           + "\n"+" if -continu enter  number 0 ");
                                              yo=input.nextInt();
                                              if(yo==2){
                                                  ff=yo;}
                                              else{
                       System.out.println(" who do you send a massage ..pleas select :"
                                                                               +"\n"+ "person1  :  1"
                                                                               +"\n"+ "person2  :  2"
                                                                               +"\n"+ "person3  :  3"
                                                                               +"\n"+ "person4  :  4"
                                                                               +"\n"+ "person5  :  5"
                                                                               +"\n"+ "person6  :  6"
                                                                               +"\n"+ "person7  :  7"
                                                                               +"\n"+ "person8  :  8"
                                                                               +"\n"+ "person9  :  9"
                                                                               +"\n"+ "person10 :  10"
                                                                               );}
                       
                                              
               
        
                                                }
                                     }else
                                         System.out.println("eror");
                                     
                                             System.out.println(" if- go to home enter :              2"
                                                         + "\n"+" if-select person  enter number      0");                                    
                                                 pq= input.nextInt();
                                                 if(pq==2){
                                                     qw=pq;
                                                 }
                                                 
                                                 break;
                                     
                             }
                                                  System.out.println(" which on are you ???"
                                +"\n"+ "person1  :  1"
                                +"\n"+ "person2  :  2"
                                +"\n"+ "person3  :  3"
                                +"\n"+ "person4  :  4"
                                +"\n"+ "person5  :  5"
                                +"\n"+ "person6  :  6"
                                +"\n"+ "person7  :  7"
                                +"\n"+ "person8  :  8"
                                +"\n"+ "person9  :  9"
                                +"\n"+ "person10 :  10"
                                );
                             
                     } break;
              case 4:
                                System.out.println(" pleas enter 1-10 number"
                               +"\n"+ "person1  :  1"
                                +"\n"+ "person2  :  2"
                                +"\n"+ "person3  :  3"
                                +"\n"+ "person4  :  4"
                                +"\n"+ "person5  :  5"
                                +"\n"+ "person6  :  6"
                                +"\n"+ "person7  :  7"
                                +"\n"+ "person8  :  8"
                                +"\n"+ "person9  :  9"
                                +"\n"+ "person10 :  10"
                                );
                    pp=input.nextInt();
                    switch(pp){
                        
                        case 1:case 2:case 3:case 4: case 5:case 6:case 7: case 8:case 9:case 10:
                            System.out.println("your massage is to :"+person1.getfirstname());
                            System.out.println(person1.payam);
                            
                            
                               System.out.println("your massage is to :"+person2.getfirstname());
                                 System.out.println(person2.payam);
                                
                                    System.out.println("your massage is to :"+person3.getfirstname());
                                     System.out.println(person3.payam);
                                    
                                       System.out.println("your massage is to :"+person4.getfirstname());
                                         System.out.println(person4.payam);
                                       
                                            System.out.println("your massage is to :"+person5.getfirstname());
                                             System.out.println(person5.payam);
                                            
                                                System.out.println("your massage is to :"+person6.getfirstname());
                                                 System.out.println(person6.payam);
                                                
                                                    System.out.println("your massage is to :"+person7.getfirstname());
                                                     System.out.println(person7.payam);
                                                   
                                                       System.out.println("your massage is to :"+person8.getfirstname());
                                                         System.out.println(person8.payam);
                                                        
                                                           System.out.println("your massage is to :"+person9.getfirstname());
                                                            System.out.println(person9.payam);
                                                            
                                                               System.out.println("your massage is to :"+person10.getfirstname());
                                                                 System.out.println(person10.payam);
                    }
                                
                                
                               
                                 
                    
                    break;
                    
    //qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq   
        //qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq   
                     //qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq   
                   
                    //********************************************************************************************************************************************
                    default:
                        System.out.println("error");
            }
System.out.println("help..............." + "\n" + "1  :creat a new account" + "\n" + "2  :informaition " + "\n" + "3  :massage..."+ "\n" +"4  :show payam ");
         

        }


        /*for (Iterator iterator = list.iterator();

    iterator.hasNext ();
        ) {
String fruit = (String) iterator.next();
        System.out.println(fruit);}}*/
    }
}
