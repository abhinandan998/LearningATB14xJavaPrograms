package ex_21_OOPs_Encapsulation;

public class Lab_Encap_demo {
    static void main(String[] args) {
        VMOLogin vmoLogin = new VMOLogin("admin", "pass123");

        GoodVMOLogin goodVMOLogin = new GoodVMOLogin("admin", "pwd123");


    }

    static class VMOLogin {
        public String username;
        public String password;


        public VMOLogin(String username, String password) {
            this.password = password;
            this.username = username;
        }
    }
    static class GoodVMOLogin{
        private String username;
        private String password;



        public GoodVMOLogin(String username, String password) {
            this.password = password;
            this.username = username;
        }

        public String setUsername(){
            return username;
        }
    }
}
