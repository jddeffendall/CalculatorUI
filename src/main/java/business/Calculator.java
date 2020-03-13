package business;

public class Calculator {

    String mainNumber = "0";
    String previousNumber;
    char mathType;

    public Calculator() {
        this("0");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
        return mainNumber;
    }

    public String add(String toAdd) {
        var mainNumberInt = Integer.parseInt(previousNumber);
        var newNumberInt = Integer.parseInt(toAdd);
        var result = mainNumberInt + newNumberInt;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String subtract(String toSubtract) {
        var mainNumberInt = Integer.parseInt(previousNumber);
        var newNumberInt = Integer.parseInt(toSubtract);
        var result = mainNumberInt - newNumberInt;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String multiply(String toMultiply) {
        var mainNumberInt = Integer.parseInt(previousNumber);
        var newNumberInt = Integer.parseInt(toMultiply);
        var result = mainNumberInt * newNumberInt;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String divide(String toDivide) {
        var mainNumberInt = Integer.parseInt(previousNumber);
        var newNumberInt = Integer.parseInt(toDivide);
        var result = mainNumberInt / newNumberInt;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "0";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        mainNumber = "0";
    }

    public char getMathType() {
        return mathType;
    }

    public void setMathType(char operation) {
        mathType = operation;
    }
}
