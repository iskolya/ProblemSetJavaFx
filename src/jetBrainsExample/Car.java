package jetBrainsExample;
class Car {
    public static void main(String[] args) {
        int a = Integer.parseInt("5");
        System.out.println(a);
    }

    int yearModel;
    String make;
    int speed;
    public void accelerate(){
        this.speed +=5;
    }
    public void brake(){
        if(this.speed>=5){
            this.speed -=5;
        }
    }
}
