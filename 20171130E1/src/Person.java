
public class Person {
	public String sex;
    public double height;
    public double weight;
    
    public Person(String sex,double height,double weight){
        this.sex=sex;
        this.height=height;
        this.weight=weight;
    }
    
    public void output(){
        System.out.println("Sex: "+sex+" height: "+height+" weight: "+weight);
    }
}
