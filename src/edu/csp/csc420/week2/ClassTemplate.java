package edu.csp.csc420.week2;

public class ClassTemplate {
    private String classLevelString = "";

    //Constructors
    public ClassTemplate () {
        classLevelString = "WHY AM I DEFAULTING THIS STRING TO THIS?";
    }

    //Public Methods
    public static void main(String[] args) {
        ClassTemplate ct = new ClassTemplate();
        ct.runMe();
        System.out.println(ct);
    }


    public void doSomethingPublic(String newString) {
        if (newString != null && (newString.compareTo("Hello World") == 0)) {
            doSomethingPrivate();
        } else {
            setClassLevelString(newString);
        }
    }



    //Private Methods
    private void runMe() {
        doSomethingPublic("Hello Everyone");
    }

    private void doSomethingPrivate() {
        classLevelString = "HELLO PLUTO";
    }

    //Public Override methods (or place below getters/setters)
    @Override
    public String toString() {
        return classLevelString;
    }

    //Getters and Setters
    public String getClassLevelString() {
        return classLevelString;
    }

    public void setClassLevelString(String classLevelString) {
        this.classLevelString = classLevelString;
    }
}
