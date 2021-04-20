
package text4;


public class TestVehicle1 {
    public static void main(String[] args){
        Vehicle1 vehicle=new Vehicle1(10000.0);//初始化最大载货量
        System.out.println("Add box#1(500kg)");
        vehicle.load=vehicle.load+500.0;
        System.out.println("Add box#2(250kg)");
        vehicle.load=vehicle.load+250.0;
        System.out.println("Add box#3(5000kg)");
        vehicle.load=vehicle.load+5000.0;
        System.out.println("Add box#4(4000kg)");
        vehicle.load=vehicle.load+4000.0;
        System.out.println("Add box#5(300kg)");
      vehicle.load=vehicle.load+300.0;
        System.out.println("Vehicleload is "+vehicle.getLoad()+"kg\n");  
    }
}
class Vehicle1{
    public double load;
    public double maxLoad;
    public Vehicle1(double maxLoad){
        this.maxLoad=maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
}

