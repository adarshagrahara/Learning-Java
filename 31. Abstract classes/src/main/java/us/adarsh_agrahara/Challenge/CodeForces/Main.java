package us.adarsh_agrahara.Challenge.CodeForces;

class Solution {
      public int myAtoi(String s) {
            
            
            s.replace('-', ' ');
            s.replace('+', ' ');
            s.replaceAll("[a-zA-Z]", " ");
            s.replaceAll("\\s", " ");
            return Integer.parseInt(s);
            
           
      }
      
      
}

class test {
      public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.myAtoi("   -42"));
      }
}