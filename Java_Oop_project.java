package java_oop_project;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ifham Ahmed Khan
 */
public class Java_Oop_project  {
    File f = new File("ListOfUsers.txt"); 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String val1;
        System.out.println("\t\t\t\t\t\t\tWelcome to Ifterious store");
        System.out.println("Create a profile");
        System.out.println("Type Enter to create your profile");
        String con1=obj.nextLine();
        String con2="Enter",con3="enter";
        if (con1.compareTo(con2)==0 || con1.compareTo(con3)==0) {
            Info obj1 = new Info();
            System.out.println("Enter your Name:");
            val1=obj.nextLine();
            obj1.setName(val1);
            System.out.println("Enter your age:");
            int age= obj.nextInt();
            obj1.setAge(age);
            System.out.println("Enter email:");
            String email=obj.next();
            obj1.setEmail(email);
            System.out.println("Enter password:");
            String password=obj.next();
            obj1.setPassword(password);
            System.out.println("Enter bank account number:");
            int account=obj.nextInt();
            obj1.setAccount(account);
            System.out.println("----------------------------------------------");
            System.out.println("Email: ");
            String condition1=obj.next();
            System.out.println("Password: ");
            String condition2=obj.next();
            if (condition1.compareTo(obj1.getEmail())==0 && condition2.compareTo(obj1.getPassword())==0) {
                System.out.println("Welcome "+obj1.getName()+" to ifterious store");
                System.out.println("|------------------|    |--------------|");
                System.out.println("|1 for user details|    |2 for shopping|");
                System.out.println("|------------------|    |--------------|");
                System.out.println("Enter here:");
                int val2= obj.nextInt();
                    if(val2==1){
                        Details detail = new Details() {
                        @Override
                        void details() {
                            System.out.println("-----------------------------");
                            System.out.println("Username: "+val1);
                            System.out.println("Age: "+age);
                            System.out.println("Email: "+email);
                            System.out.println("Bank Account: "+account);
                            System.out.println("Country: Pakistan");
                            System.out.println("-----------------------------");
                        }
                        };
                        detail.details();
                        System.out.println("Do you want to do shopping(enter 2):");
                        int val3=obj.nextInt();
                        if (val3==2) {
                            Smart_watches value1 = new Smart_watches();
                            Mobile_phones value2 = new Mobile_phones();
                            PC_Laptops value3 = new PC_Laptops();
                            System.out.println("Select category:");
                            System.out.println("|-------------------|    |-------------------|    |--------------------|");
                            System.out.println("|1 for Smart watches|    |2 for mobile phones|    |3 for PC and Laptops|");
                            System.out.println("|-------------------|    |-------------------|    |--------------------|");
                            System.out.println("Enter here: ");
                            int val=obj.nextInt();
                            switch (val) {
                                case 1:
                                value1.smart_watch();
                                break;
                                case 2:
                                value2.Mobile();
                                break;
                                case 3:
                                value3.pc();
                                break;
                                default:
                                System.out.println("Wrong input!");
                                break;
                            }
                        }
                        else{
                            System.out.println("Thanks for using our program!");
                        }
                    }
                    else if(val2==2){
                        Smart_watches value1 = new Smart_watches();
                            Mobile_phones value2 = new Mobile_phones();
                            PC_Laptops value3 = new PC_Laptops();
                            System.out.println("Select category:");
                            System.out.println("|-------------------|    |-------------------|    |--------------------|");
                            System.out.println("|1 for Smart watches|    |2 for mobile phones|    |3 for PC and Laptops|");
                            System.out.println("|-------------------|    |-------------------|    |--------------------|");
                            System.out.println("Enter here: ");
                            int val=obj.nextInt();
                            switch (val) {
                                case 1:
                                value1.smart_watch();
                                break;
                                case 2:
                                value2.Mobile();
                                break;
                                case 3:
                                value3.pc();
                                break;
                                default:
                                System.out.println("Wrong input!");
                                break;
                            }
                    }
                    else{
                        System.out.println("Wrong input!");
                       
                    }
            }
            else{
                System.out.println("Wrong email or password");
            }
            }
        
        else{
            System.out.println("You cannot use our application without creating profile");
        }
        Java_Oop_project fl = new Java_Oop_project();
       fl.createFile();
       
       try
       {
           fl.writeToFile();
           
       }
       catch(IOException io)
       {
           
           System.out.println(io.toString());
       }
            }
    void createFile()
    {
        try
        {
            if (f.createNewFile()==true) 
            {
                System.out.println("File has been created " +f.getName());
            }
           else
            {
                
                System.out.println("File already exists..");
            }
        }
        catch(IOException io )
        {
            System.out.println(io.toString());
            
        }
    }
    
    void writeToFile() throws IOException
    {
        FileWriter fw;
        fw = new FileWriter("ListOfUsers.txt");
        try
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your username once before logout: ");
            String val=obj.nextLine();
             fw.write("User: "+val);
             System.out.println("Record added successfully.");
           
        }
        
        catch(IOException io)
        {
            System.out.println(io.toString());
            
        }
        
        finally
        {
               fw.close();         
        }
        
    }
            
    }


class Info{
    
private String name;
private int age;
private String email;
private String password;
private int account;

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(int account) {
        this.account = account;
    }

}

abstract class Details extends Info{
abstract void details();
}


class Smart_watches {
    Rating obj10 = new Rating();
    Scanner obj = new Scanner(System.in);
    void smart_watch(){
        
        System.out.println("Smart watches");
        System.out.println("-----------------------------------------");
        System.out.println("1) DT88pro DT NO.1 Smart Watch For Android Phones With Heart Rate Monitoring Female Menstrual Cycle Smartwatch Waterproof");
        System.out.println("Price: 24$");
        System.out.println("\n");
        System.out.println("2) CE FCC ROHS REACH certificate Original factory IP68 waterproof OEM electronics smart fitness watch");
        System.out.println("Price: 19$");
        System.out.println("\n");
        System.out.println("3) E1 01 New Electronic Product smart watches E1 watches wholesale Popular chiridren Sports smart watch");
        System.out.println("Price: 79$");
        System.out.println("\n");
        System.out.println("4) Hot Q50 Children SOS Calling Watch Electronic Digital Q50 Baby Kids GPS Tracker Smart Watch with SIM Card");
        System.out.println("Price: 10$");
        System.out.println("\n");
        System.out.println("5) H20 Smart Watch Display Full Touch Screen Smart Electronics With Blood Pressure And Heart Rate For wearable Devices Women");
        System.out.println("Price: 15$");
        System.out.println("\n");
        System.out.println("6) Magnetic Wristband 2019 New Arrival Hot Selling Watch Electronics Led Bracelet Wear Os Sports Soft Pvc Wristband M4 Smart Watch");
        System.out.println("Price: 3$");
        System.out.println("\n");
        System.out.println("7) Esportes Pulseira inteligente duas alcas relgiorelg digital gratis other consumer electronics P80S smartwatch");
        System.out.println("Price: 17$");
        System.out.println("\n");
        System.out.println("8) 2021 New Arrival Best Selling Ts12 Bt Calling Used App Waterproof Ip68 Smart Electronics Android Watch");
        System.out.println("Price: 21$");
        System.out.println("-----------------------------------------");
        System.out.println("\n");
        System.out.println("Enter the number of which watch do you want to buy:");
        int num=obj.nextInt();
        if (num==1) {
            System.out.println("Your bill is 24$");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==2) {
            System.out.println("Your bill is 19$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==3) {
            System.out.println("Your bill is 79$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==4) {
            System.out.println("Your bill is 10$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==5) {
            System.out.println("Your bill is 15$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==6) {
            System.out.println("Your bill is 3$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==7) {
            System.out.println("Your bill is 17$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==8) {
            System.out.println("Your bill is 21$");
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else{
            System.out.println("Wrong input!");
        }
    }
}

class Mobile_phones {
    Scanner obj = new Scanner(System.in);
    Rating obj10 = new Rating();
    void Mobile(){
        System.out.println("Mobiles");
        System.out.println("-----------------------------------------");
        System.out.println("1) Name: Realme xt\nColor: Gray\nStorage: 32GB\nRam: 4GB");
        System.out.println("Price: 90$");
        System.out.println("\n");
        System.out.println("2) Name: Realme 8 pro\nColor: Blue\nStorage: 128GB\nRam: 12GB");
        System.out.println("Price: 150$");
        System.out.println("\n");
        System.out.println("3) Name: Realme 7\nColor: Green\nStorage: 128GB\nRam: 8GB");
        System.out.println("Price: 120$");
        System.out.println("\n");
        System.out.println("4) Name: Realme 5i\nColor: Red\nStorage: 64GB\nRam: 8GB");
        System.out.println("Price: 125$");
        System.out.println("\n");
        System.out.println("5) Name: Red magic 3\nColor: Blue\nStorage: 512GB\nRam: 16GB");
        System.out.println("Price: 300$");
        System.out.println("\n");
        System.out.println("6) Name: Samsung note 7\nColor: White\nStorage: 218GB\nRam: 2GB");
        System.out.println("Price: 200$");
        System.out.println("\n");
        System.out.println("7) Name: Red magic 1\nColor: Pink\nStorage: 64GB\nRam: 6GB");
        System.out.println("Price: 175$");
        System.out.println("\n");
        System.out.println("8) Name: Realme 7 pro\nColor: Black\nStorage: 128GB\nRam: 8GB");
        System.out.println("Price: 160$");
        System.out.println("-----------------------------------------");
        System.out.println("\n");
        System.out.println("Enter the number of which watch do you want to buy:");
        int num=obj.nextInt();
        if (num==1) {
            System.out.println("Your bill is 90$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==2) {
            System.out.println("Your bill is 150$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==3) {
            System.out.println("Your bill is 120$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==4) {
            System.out.println("Your bill is 125$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==5) {
            System.out.println("Your bill is 300$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==6) {
            System.out.println("Your bill is 200$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==7) {
            System.out.println("Your bill is 175$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==8) {
            System.out.println("Your bill is 160$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else{
            System.out.println("Wrong input!");
        }
    }
}

class PC_Laptops{
    Scanner obj = new Scanner(System.in);
    Rating obj10 = new Rating();
    void pc(){
        System.out.println("pc and laptop");
        System.out.println("-----------------------------------------");
        System.out.println("1) Intel Core i7 4500U Slim Laptop Win10 System 8GB RAM Metal Cover Computer With Backlight Keyboard");
        System.out.println("Price: 311$");
        System.out.println("\n");
        System.out.println("2) Super slim 15.6 inch big screen i5 notebook laptop with 8GB Ram 1TB SSD and digital touch pad laptop computer");
        System.out.println("Price: 330$");
        System.out.println("\n");
        System.out.println("3) Quad core small and light laptop 10.1 inch laptop 4GB Ram mini laptop with high quality");
        System.out.println("Price: 155$");
        System.out.println("\n");
        System.out.println("4) Android Tablet 11.6 Inch Touchscreen Tablet PC 4G Phone Call With Keyboard");
        System.out.println("Price: 100$");
        System.out.println("\n");
        System.out.println("5) 11.6 inch 1920*1200 Android 7.1 and 8.0 Multi touch Capacitive screen tablet");
        System.out.println("Price: 180$");
        System.out.println("\n");
        System.out.println("6) Wholesale bulk 15.6inch i7 10th generation laptop With backlit keyboard and Fingerprint unlock notebook support booting logo");
        System.out.println("Price: 508$");
        System.out.println("\n");
        System.out.println("7) Portable 15.6 inch Computer Core i5 1035G1 Quad Core Win 10 15.6inch Business Gaming Laptop Computer With Fingerprint unlock");
        System.out.println("Price: 510$");
        System.out.println("\n");
        System.out.println("8) 15.6 inch i5 6200U With 2g Discrete Graphics Card Win10 Laptop Gaming Laptop");
        System.out.println("Price: 175$");
        System.out.println("-----------------------------------------");
        System.out.println("\n");
        System.out.println("Enter the number of which watch do you want to buy:");
        int num=obj.nextInt();
        if (num==1) {
            System.out.println("Your bill is 311$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==2) {
            System.out.println("Your bill is 330$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==3) {
            System.out.println("Your bill is 155$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==4) {
            System.out.println("Your bill is 100$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==5) {
            System.out.println("Your bill is 180$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==6) {
            System.out.println("Your bill is 508$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==7) {
            System.out.println("Your bill is 510$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else if (num==8) {
            System.out.println("Your bill is 175$");
            System.out.println("Enter your bank account number:");
            String account=obj.nextLine();
            System.out.println("Enter your pin code: ");
            int code=obj.nextInt();
            System.out.println("Your product is in process of delivery thanks for buying product from us.");
            obj10.raiting();
        }
        else{
            System.out.println("Wrong input!");
        }
    }
}

class Rating extends Info{
void raiting(){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter comment:");
    String comment=obj.nextLine();
    System.out.println("Enter your star rating (1/2/3/4/5):");
    int rating=obj.nextInt();
    if(rating==1){System.out.println("We will try to do better next time");}
    else if(rating==2){System.out.println("we will update our app work better next time");}
    else if(rating==3){System.out.println("We will work on making our customer more satisfied");}
    else if(rating==4){System.out.println("Thanks");}
    else if(rating==5){System.out.println("Thank you very much!");}
    else {System.out.println("Wrong input!");}
}
}
