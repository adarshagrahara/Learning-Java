public class A137_Person {
      
      private String firstName;
      private String lastName;
      private int age;
      
      public void setFirstName(String firstName){
            this.firstName = firstName;
      }
      public void setLastName(String lastName){
            this.lastName = lastName;
      }
      public void setAge(int age){
            if(age>= 0 && age<=100){
                  this.age = age;
            } else{
                  this.age = 0;
            }
            
      }
      
      public String getFirstName(){
            return this.firstName;
      }
      public String getLastName(){
            return this.lastName;
      }
      public int getAge(){
            return this.age;
      }
      
      public boolean isTeen(){
            return this.age > 12 && this.age < 20;
      }
      public String getFullName() {
          boolean fName = this.firstName.isEmpty();
          boolean lName = this.lastName.isEmpty();
          if(fName){
                return this.lastName;
          }else if(lName){
                return this.firstName;
          }else{
                return this.firstName+" "+this.lastName;
                
          }
      }
      
      
      
}

