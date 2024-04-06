public class Bank {
    void savingBalance() {
        System.out.println("100000");
    }
}
class BOC extends Bank {
    @Override
    void savingBalance() {
        System.out.println("50000");
    }
}
class peoplesBank extends Bank {
    @Override
    void savingBalance() {
        System.out.println("40000");
    }
}
class NSB extends Bank {
    @Override
    void savingBalance() {
        System.out.println("30000");
    }
}
class Test {
    public static void main(String[] args) {
        Bank b;
        b = new BOC();         b.savingBalance();
        b = new peoplesBank(); b.savingBalance();
        b = new NSB();         b.savingBalance();
    }
}




