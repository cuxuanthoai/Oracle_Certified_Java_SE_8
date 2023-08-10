package OCP.P7;

class Question1 {

 public static void main(String[] args) {
    Vehicel v = new Vehicel(100);
    v.increSpeed(12);
    }
}
class  Vehicel {
    int distance ;
    Vehicel(int x){
        this.distance = x;
    }
    public void increSpeed(int time){
        int timeTravel = time;//line 1
        //line 3
        class Car {
            int value = 0 ;
            public void  speed(){
                value = distance/timeTravel;
                System.out.println(value);
            }
        }
        //speed  compiler error line 3
    }
}