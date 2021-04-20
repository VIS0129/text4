package text4;
class Card{
   private String suit;
    private  int rank;
       @Override
    public String toString() {
        return "";
    }
    public void Setsuit(String suit){
    this.suit=suit;
}
      public void Setrank(int rank){
    this.rank=rank;
}
        public String getsuit(String suit){
   return suit;
}
         public String getrank(String rank){
   return rank;
}
    public Card(String suit,int rank){
      this.rank=rank;
      this.suit=suit;
  
      switch(rank){
          case 11:
              rank='J';
              break;
          case 12:
              rank='Q';
              break;
          case 13:
              rank='K';
              break;
          case 14:
              rank='A';
              break;      
      }
  
      if(rank>11)
   System.out.print(suit+""+(char)rank);
      else
          System.out.print(suit+""+rank); 
    }
    }
public class  NewClass{
    public static void main(String[] atgs){
        Card c1=new Card("红桃",13);
        System.out.println(c1);
        Card c2=new Card("草花",1);
         System.out.println(c2);
    }
}
