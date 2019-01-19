package pl.mavenproject2;

/**
 *
 * @author plewandowski
 */
public abstract class Student {
    
    public void printName(){
        System.out.println(getName());
    }
    
    public abstract String getName();
}
