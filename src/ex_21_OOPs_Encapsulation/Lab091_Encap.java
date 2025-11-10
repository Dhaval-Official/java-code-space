package ex_21_OOPs_Encapsulation;

public class Lab091_Encap {

    public static void main(String[] args) {

        //bad design
        VWOLogin vmologin = new VWOLogin("admin","12345");
        System.out.println(vmologin.pwd);

        //Good design
        GoodVWOLogin vmologin2 = new GoodVWOLogin("admin2","123452  ");
        System.out.println(vmologin2.getPwd());

    }



}

class VWOLogin {
    public String uname;
    public String pwd;

    public VWOLogin(String name, String pwd) {
        this.uname = name;
        this.pwd = pwd;
    }
}

class GoodVWOLogin {
    private String uname;
    private String pwd;

    public String getUname() {
        return uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public GoodVWOLogin(String name, String pwd) {
        this.uname = name;
        this.pwd = pwd;
    }
}