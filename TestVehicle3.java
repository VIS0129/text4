
package text4;

public class TestVehicle3 {
     public static void main(String[] args){
        Vehicle3 vehicle=new Vehicle3(10000.0);//初始化最大载货量
        System.out.println("Add box#1(500kg):"+vehicle.addBox(500.0));
        System.out.println("Add box#2(250kg)"+vehicle.addBox(250.0));
        System.out.println("Add box#3(5000kg)"+vehicle.addBox(5000.0));   
        System.out.println("Add box#4(4000kg)"+vehicle.addBox(4000.0));   
        System.out.println("Add box#5(300kg)"+vehicle.addBox(300.0));
        System.out.println("Vehicleload is "+vehicle.getLoad()+"kg\n");  
    }
}
//修改构造方法，getLoad(), getMaxLoad()和addBox() 方法，使它们使用一个从千克到牛顿的相互转换。
class Vehicle3{
    private double load;
    private double maxLoad;
     public Vehicle3(double maxLoad){
        this.maxLoad=this.kiloToNewts(maxLoad);
    }
     public double getLoad(){
        return this.newtsToKilo(load);
    }
    public double getMaxLoad(){
        return this.newtsToKilo(maxLoad);
    }
    private double kiloToNewts(double weight) { 
        return weight*9.8;
    } 
private double newtsToKilo(double weight) { 
      return weight/9.8;
} 

    public boolean addBox(double weight){
        double t=0;
        t=this.load;
        this.load+=this.kiloToNewts(weight);
        if(this.load>this.maxLoad)
        {     this.load=t;
            return false;
        }else
            return true;
    }
}