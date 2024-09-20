package org.fatec;

public class Register {
    private String nameStudent;
    private int numberRegister;
    private String birthDate;
    private boolean scholarship;
    private int yearRegister;

    public String getNameStudent() {
        return nameStudent;
    }

    public int getNumberRegister() {
        return numberRegister;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public int getYearRegister() {
        return yearRegister;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setNumberRegister(int numberRegister) {
        this.numberRegister = numberRegister;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public void setYearRegister(int yearRegister) {
        this.yearRegister = yearRegister;
    }


    public Register(String nameStudent, int numberRegister, String birthDate, boolean scholarship, int yearRegister) {
        setNameStudent(nameStudent);
        setNumberRegister(numberRegister);
        setBirthDate(birthDate);
        setScholarship(scholarship);
        setYearRegister(yearRegister);
    }

    public int calculateMonthlyFee() {
        if (isScholarship()) {
            return 300 / 2;
        }
        return 300;
    }

    public void getRegister() {
        System.out.println("Name: " + getNameStudent());
        System.out.println("Number Register: " + getNumberRegister());
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Scholarship: " + (isScholarship() ? "Yes" : "No"));
        System.out.println("Year Register: " + getYearRegister());
    }

    public static void main(String[] args) {
        Register registerStudent = new Register("John Doe", 1234567890, "01/01/2000", true, 2021);
        int monthlyFee = registerStudent.calculateMonthlyFee();
        System.out.println("Monthly Fee: " + monthlyFee);
        registerStudent.getRegister();

        System.out.println("\n");

        Register registerStudent2 = new Register("Maria", 123457, "01/01/2000", false, 2021);
        int monthlyFee2 = registerStudent2.calculateMonthlyFee();
        System.out.println("Monthly Fee: " + monthlyFee2);
        registerStudent2.getRegister();
    }
}
