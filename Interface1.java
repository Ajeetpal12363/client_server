/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author ajeet
 */
 interface Interface1 {
    void print();
    
}
interface B
{
    void show();
}
class c implements Interface1,B
{
  public  void print()
   {
       System.out.println("Hello word");
   }
  public void show()
  {
      System.exit(0);
      System.out.println("Bye");
  }
  public static void main(String arg[])
  {
      c obj=new c();
      obj.print();
      obj.show();
  }
}