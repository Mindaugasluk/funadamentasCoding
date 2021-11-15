package example4;

import java.util.Scanner;

public class Account {

    private String assignDepartment;
    private String firstname;
    private String lastname;
    private String password;
    private String deparment;
    private String email;
    private int mailBoxCapacity = 500;
    private String domainName = "imone.lt";

    public Account(String firstname, String lastname, String password, String deparment, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.deparment = deparment;
        this.email = email;
    }

    public Account(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

        this.deparment = assignDepartment(); //this.department = "sales"
        this.password = generatePassword();
    }

    private String generatePassword() {
        String passwordSymbolSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        char[] password = new char[8];
        for (int i = 0; i < 8; i++) {
            int randmNumber = (int) (Math.random() * passwordSymbolSet.length());
            password[i] = passwordSymbolSet.charAt(randmNumber);
        }

        return new String(password);
    }

    private String assignDepartment() {
        System.out.println("enter the department \n for sales \n 2 for accounting \n 3 for development");
        Scanner scanner = new Scanner(System.in);
        int departmentSelection = scanner.nextInt();

        if (departmentSelection == 1) {
            return "Sales";
        }else if(departmentSelection == 2){
            return "Accounting";
        }else if (departmentSelection == 3){
            return "Development";
        }else {
            return null;
        }


    }

    @Override
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", deparment='" + deparment + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
