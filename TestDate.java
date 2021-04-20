
package text4;
// 如果已知一个日期为2007/3/8，求10天后是哪一天，367天后呢？
public class TestDate {
    public static void main(String[] args){
    MyDate  d1 = new MyDate(2007,33,58);
		MyDate d2;
          d2 = d1.next(1300);
		d2.display();
                System.out.println("两个日期之间的相差的天数:"+d1.daysBetweenTowDate(d2));
}
}
    class MyDate
{  //数据成员（字段）
private int day;
private int month;
 private int year;
      //方法成员
public MyDate(int y,int m,int d){ 
     this.year=y;
    this.day=d;
    this.month=m;
       this.CheckDate();
}   //构造方法，构造一个日期
private void CheckDate(){
    if(this.year<1900)
        this.year=1900;
    if(this.month<1||this.month>12)
        this.month=1;
    int days=0;
    switch(this.month){
    case 1:
    case 3:
     case 5:
    case 7:
     case 8:
     case 10:
     case 12:
     days=31;
     break;
     case 2:
         if(this.year%4==0&&this.year%100!=0||this.year%400==0)
     days=29;
         else
             days=28;
     break;
        default:
        days=30;
        break;
	}
if(this.day>31||(days==30&&this.day>30)||(days==28&&this.day>28)||(days==29&&this.day>29))
    this.day=1;
}
public MyDate next(){ 
    int days=0; int y=this.year;
    int m=this.month;int d=this.day;
    d++;
 
switch(m){
    case 1:
    case 3:
     case 5:
    case 7:
     case 8:
     case 10:
     case 12:
     days=31;
     break;
     case 2:
         if(y%4==0&&y%100!=0||y%400==0)
     days=29;
         else
             days=28;
     break;
        default:
        days=30;
        break;
	}
if(days==31&&d>31||days==30&&d>30||days==28&&d>28||days==29&&d>29)
{
    m++;
   d=1;
}
 if(m>12)
 {
     y++;
    m=1;
 }
 MyDate mydate1=new MyDate(y,m,d);
  return mydate1;
}
public MyDate next(int x){
 MyDate mydate=new MyDate(this.year,this.month,this.day);
for(int i=0;i<x;i++){
   mydate=mydate.next();
}
System.out.print(x+"天后");
return mydate;
} //返回x天后的日期，可调用next()方法实现
public void  display (){ 
    System.out.println("时间："+this.year+"/"+this.month+"/"+this.day);
}
public int daysBetweenTowDate(MyDate otherDate){
   int a=0;int b=0;int c=0;int count=0;
   int flag=-1;
   a=otherDate.year-this.year;
     b=otherDate.month-this.month;
       c=otherDate.day-this.day;
        int d=b;
      while(d>=0){
          if(d%2!=0)
              count++;
          d--;
      }
      int days=a*365+count*31+(b-count)*30+c+flag;
       return days;
}
}