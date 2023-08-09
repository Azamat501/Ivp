import java.io.FileWriter;
import java.util.Scanner;

public class DataRequest {
    private String firstName;
    private String lastName;
    private String middleName;
    private String year;
    private long phoneNumber;
    private char gender;
    private final Scanner Scan = new Scanner(System.in);
    private void EnterFirstName() {
        System.out.println("Enter first name:");
        firstName = scan.nextLine();
        if(firstName.equals(" ")) {
            throw new RuntimeException("no !:");

        }
    } 
    private void EnterLastName() {
        System.out.println("EnterLastName:");
        lastName = scan.nextLine();
        if (lastName.equals("")) {
            throw new RuntimeException("no !");
    }

}   
    private void EnterMiddleName() {
        System.out.println("Enter middle name");
        middleName = scan.nextLine();
        if (middleName.equals("")) {
              throw new RuntimeException(" No !");

    }
}
    private void EnterYearOfBirth() {
        System.out.println("Enter year of birth:");
        year = scan.nextLine();
        if (year.equals("")) {
              throw new RuntimeException("No !");
    }
}
    private void EnterNumberPhone() {
       try {
        System.out.println("Enter number phone:");
        String number = scan.nextLine();
        if (number.equals("")) {
            throw new RuntimeException("No !");
        }
        phoneNumber = Long.parseLong(number);
    }  catch (NumberFormatException e) {
        System.out.println("No !");
    }
}
    private void EnterGender() {
        System.out.println("Enter gender (f, m):");
        String gen;
        String f = "f";
        String m = "m";
        gen = scan.nextLine();
        if (gen.length() > 1) {
             throw new RuntimeException("No !");
    }
        if (gen.equals(f) || gen.equals(m)) {
             gender = gen.charAt(0);
    }   else {
             throw new RuntimeException("Вы ввели не тот символ!");
    }

}


    private void OutPutData() {
        System.out.println("\nFirst name \t- \t" + firstName + "\n" + "Last name \t- \t" + lastName + "\n" + "Middle name \t- \t" + middleName + "\n" + "Year of birth \t- \t" + year + "\n" + "Number phone \t- \t" + numberPhone + "\n" + "Gender   \t- \t" + gender);
}


    private void DataEnter() {
        EnterFirstName();
        EnterLastName();
        EnterMiddleName();
        EnterYearOfBirth();
        EnterNumberPhone();
        EnterGender();
        OutPutData();
}

    public void SaveDataEnter() {

        DataEnter();
        String file = "data/" + lastName + ".txt";
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("<" + firstName + "> " + "<" + lastName + "> " + "<" + middleName + "> " + "<" + year + "> " + "<" + phoneNumber + "> " + "<" + gender + ">\n");
    }   catch (Exception e) {
             System.out.println("Чтото пошло не так!");
    }
}
    public String getFirstName() {
          return firstName;
}

    public String getLastName() {
         return lastName;
}

    public String getMiddleName() {
         return middleName;
}

    public String getYearOfBirth() {
       return year;
}

    public long getNumberPhone() {
       return phoneNumber;
}

    public char getGender() {
       return gender;
}
}

