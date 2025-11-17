package ex_27_Exceptions;

public class Lab103_CustomException {
    public static void main(String[] args) throws CustomException {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);

        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);

        Bank JPMorgan = new Bank("USD",101);

        Integer total_bal2 = sbi.add(JPMorgan);
        System.out.println(total_bal2);
    }
}

class Bank{

    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public Bank(String currency, int amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Integer add(Bank bankName) throws CustomException {
        if(bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatch, can't add");
            } catch (CustomException ce) {
                throw new RuntimeException();
            }
        }

    }


}

class  CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}