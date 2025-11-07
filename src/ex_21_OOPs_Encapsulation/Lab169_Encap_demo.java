package ex_21_OOPs_Encapsulation;

public class Lab169_Encap_demo {
    static void main(String[] args) {
        VMOLogin vmoLogin = new VMOLogin("admin", "pass123");
        System.out.println(vmoLogin.password);
        vmoLogin.password = "345";
        System.out.println(vmoLogin.password);

        GoodVMOLogin vmoLogin1 = new GoodVMOLogin("admin", "pwd123");
        //System.out.println(vmoLogin1.password);
        String pass = vmoLogin1.getPassword();
        System.out.println(pass);
        vmoLogin1.setPassword("Abhichild@123", false);
    }
}

     class VMOLogin {
        public String username;
        public String password;


        public VMOLogin(String username, String password) {
            this.password = password;
            this.username = username;
        }
    }
     class GoodVMOLogin{

        //Instance Variable| Data variabe | Attribute | Fields | properties | member variables
        private String username;
        private String password;



        public GoodVMOLogin(String username, String password) {
            this.password = password;
            this.username = username;
        }
        public String getUsername()
        {
            return username;
        }

        public String setUsername(){
            return username;
        }
        public String getPassword()
        {
            return password;
        }
        public void setPassword(String password, boolean isGoodAuntyAdmin)
        {
            if(isGoodAuntyAdmin)
            {
                this.password =password;
            }
            else {
                System.out.println("No Allowed!");
            }
        }

}
