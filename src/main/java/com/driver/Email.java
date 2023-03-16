package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email() {
    }

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current
        // password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character.
        // Any character apart from alphabets and digits is a special character
        if(newPassword.length() < 8){
            System.out.println("Password must be of at least 8 character.");
            return;
        }
        else if(this.password.equals(oldPassword)){
            if(checkDigit(newPassword) && checkLowerCase(newPassword) &&
            checkUpperCase(newPassword) && checkSpecialCharacter(newPassword))
                this.password = newPassword;
        }
    }
    public boolean checkUpperCase(String newPassword){
        boolean flag = false;
        for(int i=0;i<newPassword.length();i++){
            if(newPassword.charAt(i) >='A' && newPassword.charAt(i)<='Z'){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean checkLowerCase(String newPassword){
        boolean flag = false;
        for(int i=0;i<newPassword.length();i++){
            if(newPassword.charAt(i) >='a' && newPassword.charAt(i)<='z'){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean checkDigit(String newPassword){
        boolean flag = false;
        for(int i=0;i<newPassword.length();i++){
            if(newPassword.charAt(i) >='0' && newPassword.charAt(i) <= '9'){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean checkSpecialCharacter(String newPassword){
        boolean flag = false;
        for(int i=0;i<newPassword.length();i++){
            if(!Character.isDigit(newPassword.charAt(i)) &&
                    !Character.isLetter(newPassword.charAt(i))){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
