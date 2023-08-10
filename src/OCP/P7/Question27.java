package OCP.P7;

class Question27 {  
 public static void main(String[] args) {
    // USCurrency usCoin =new USCurrency.DIME; new -> compiler error
     USCurrency usCoin =USCurrency.DIME;
     System.out.println(usCoin.getValue());
     System.out.println(usCoin.getValue());
 }
}
enum USCurrency {
    PENNY (1),
    NICKLE(5),
    DIME (10),
    QUARTER(25);
    private int value;
    USCurrency(int value) {
        this.value = value;
    }
    public int getValue() {return value;}
}
