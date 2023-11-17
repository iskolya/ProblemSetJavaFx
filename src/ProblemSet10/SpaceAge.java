package ProblemSet10;
import java.util.Scanner;
public class SpaceAge {
    long age;
    final long year = 31536600;
    public SpaceAge(long age) {
        this.age = age;
    }
    public float onEarth() {
        return (float) age/year;
    }
    public float onVenus(){
        return (float) ((float) age/0.61519726/year);
    }
    public float onMars() {
        return (float)( (float) age/1.8808158/year);
    }
    public float onMercury() {
        return (float)((float) age/0.2408467/year);
    }
    public float onJupiter(){
        return (float)((float)age/11.862615/year);
    }
    public float onSaturn(){
        return(float)((float)age/29.447498/year);
    }
    public float onUranus(){
        return(float)((float)age/84.016846/year);
    }
    public float onNeptune(){
        return (float)((float)age/164.79132/year);
    }


}
