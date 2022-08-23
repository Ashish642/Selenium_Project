package SSS_CQA.SSS_CQA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExampleTest {

      @Test(priority=1)
 
       public void createUser(){
 
       System.out.println("createUser...user created successufuly");
 
        Assert.fail();
 
      }

       @Test(priority=3, dependsOnMethods="createUser")  //createuser method will be failed and deleteUser method will be skipped
 
       public void deleteUser(){
 
       System.out.println("deleteUser...");
 
      }
//       When two test methods are dependent on each other, it results in to Testng Exception.

         @Test(priority=1, dependsOnMethods="deleteUser")
 
         public void createUser1(){
 
         System.out.println("createUser...user created successufuly");
 
     }
 
 
        @Test(priority=3, dependsOnMethods="createUser")
 
        public void deleteUser1(){
 
        System.out.println("deleteUser...");
 
    }
 }
       


   
