public class A142_MethodOverridingANDOverloading {
}

class main21345y453423{
      public static void main(String[] args) {
            parentMethodOverriding ok = new parentMethodOverriding();
            childMethodOverriding ok1 = new childMethodOverriding();
            ok1.parentMethodOverriding1();
      }
}
class parentMethodOverriding{
      protected void parentMethodOverriding1(){
            System.out.println("test1");
      }
}

class childMethodOverriding extends parentMethodOverriding{
      
      @Override
      protected void parentMethodOverriding1(){
            System.out.println("hi");
            super.parentMethodOverriding1();
      }
}

class methodOverloading{
      public void test(int ab, double bc){
      
      }
      
      public void test(String ok, long hah, int KJH){
      
      }
}
