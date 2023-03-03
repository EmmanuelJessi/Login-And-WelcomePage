package Home;

public class Main {

    public static void main(String[] args) {
        IDandPasswords IDandPasswords = new IDandPasswords();
        LoginPage LoginPage = new LoginPage(IDandPasswords.getLoginInfo());
    }
}