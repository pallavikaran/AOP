
package action;

import com.opensymphony.xwork2.ActionSupport;


public class CustomerAction extends ActionSupport{
   private String name;
   private Integer age;
   private String email;
   private String telephone;

   public String addCustomer()
   {
       return "success";
   }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
   
}
