abstract class Bank {
    abstract int getInterestRate();
}

class SBI extends Bank {
    int getInterestRate() {
        return 6;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 7;
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}
