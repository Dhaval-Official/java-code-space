package ex_25_ENUM;

public class Lab096_KeyValueENUM {
    public static void main(String[] args) {

        System.out.println(HEX_COLORS.valueOf("RED"));        //key
        System.out.println(HEX_COLORS.RED.getHexCode());            //value

    }
}

enum HEX_COLORS{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    HEX_COLORS(String hexCode) {
        this.hexCode = hexCode;
    }

    String getHexCode() {
        return this.hexCode;
    }
}
