
package text4;
class Fraction{
    int up;
    int down;  
    @Override
    public String toString() {
        return up+"/"+down;
    }
    public Fraction(int up,int down){
            if(down==0){
    System.out.println("数据无效");}
     else{
         if((up>0&&down<0)||(up<0&&down>0))  
         { this.up=-up;
     this.down=down;
         }
         else{
             this.up=up;
     this.down=down;
         }
     int fz=this.up;int t=0;
     int fm=this.down;
     if(fz<fm){
         t=fz;
     fz=fm;
     fm=t;
     }
     t=fz%fm;
     while(t!=0){
         fz=fm;
         fm=t;
         t=fz%fm;
     }
     this.down=this.down/fm;
     this.up=this.up/fm;
 }
    }
 void  setFraction(int up,int down){
     this.down=down;
     this.up=up;
 }
 
     void  setFraction(Fraction f){
         this.down=f.down;
         this.up=f.up;
}
   int getUp(){
       return this.up;
   }
           int getDown(){
              return this.down;
           }  
            double getValue(){
    return (double)this.up/this.down;
}
      Fraction  add(Fraction other){
        int up=0,dowm=0;
          if(this.down==other.down)
          {
              up=this.up+other.up;
              dowm=this.down;
          }
        Fraction s=new Fraction(up,dowm);
        return s;
      }  
      Fraction  minus(Fraction other){
          int up=0,dowm=0;
          if(this.down==other.down)
          {
              up=this.up-other.up;
              dowm=this.down;
          }
        Fraction s=new Fraction(up,dowm);
        return s;
      }
      Fraction  multiply(Fraction other){
          int up=0,dowm=0;    
              up=this.up*other.up;
              dowm=this.down*other.down;
        Fraction s=new Fraction(up,dowm);
        return s;
      }
      
     Fraction  devide(Fraction other){
         int up=0,dowm=0;
          if(this.down==other.down)
          {
              up=this.up;
              dowm=other.up;
          }
        Fraction s=new Fraction(up,dowm);
        return s;
      }
}
class FractionTest {
    public static void main(String[] args){
             Fraction a=new Fraction(7,32);
         Fraction b=new Fraction(13,32);
      Fraction r1=a.add(b);
     Fraction r2=a.minus(b);
       Fraction r3=a.multiply(b);
        Fraction r4=a.devide(b);
       System.out.println(a+" + "+b+" = "+r1+" = "+r1.getValue());
        System.out.println(a+" - "+b+" = "+r2+" = "+r2.getValue());
        System.out.println(a+" * "+b+" = "+r3+" = "+r3.getValue());
        System.out.println(a+" / "+b+" = "+r4+" = "+r4.getValue());
    }
}
