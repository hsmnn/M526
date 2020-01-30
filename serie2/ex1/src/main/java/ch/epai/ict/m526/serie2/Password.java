package ch.epai.ict.m526.serie2;

public class Password {
    private String password;

    Password (String password) {
        this.password = password;
    }

    public boolean checkCaracterNumber() {
        boolean result = false;
        if (this.password.length() < 7) {
            result = false;
        }else{
            result = true;
        }
        return result;
    }

    public boolean checkLowerCase() {
        boolean result = false;
        String lowerPassword = this.password.toLowerCase();
        if (lowerPassword == this.password){
            result = false;
        }else{
            result = true;
        }
        return result;
    }

    public boolean checkNumber() {
        boolean result = false;
        String number = "0123456789";
        int numberOfNumber = 0;
        for (int i = 0; i < number.length(); i += 1){
            for (int j = 0; j < this.password.length(); j += 1) {
                if (number.charAt(i) == this.password.charAt(j)){
                    numberOfNumber += 1;
                }
            }
        }
        if (numberOfNumber > 0) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public boolean isValid() {
        boolean response = false;
        if ((checkCaracterNumber() == true) && (checkLowerCase() == true) && (checkNumber() == true)) {
            response = true;
        }else{
            response = false;
        }
        return response;
    }
}