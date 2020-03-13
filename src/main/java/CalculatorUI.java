import business.Calculator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorUI extends Application {

    Calculator theCalculator = new Calculator();
    Label mainNum = new Label(theCalculator.getMainNumber());

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Calculator");

        GridPane gridPane = new GridPane();

        mainNum.setFont(new Font(20));
        mainNum.setPadding(new Insets(20));
        mainNum.setPrefSize(200,100);
        gridPane.add(mainNum, 0,0,5,1);

        Button button0 = new Button("0");
        button0.setPrefSize(100,100);
        button0.setOnAction(value -> {
            theCalculator.appendToMainNumber("0");
            mainNum.setText(theCalculator.getMainNumber());
        });
        gridPane.add(button0, 0,4,1,1);

        Button button1 = new Button("1");
        button1.setPrefSize(100,100);
        gridPane.add(button1, 2,3,1,1);
        button1.setOnAction(value -> {
            theCalculator.appendToMainNumber("1");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button2 = new Button("2");
        button2.setPrefSize(100,100);
        gridPane.add(button2, 1,3,1,1);
        button2.setOnAction(value -> {
            theCalculator.appendToMainNumber("2");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button3 = new Button("3");
        button3.setPrefSize(100,100);
        gridPane.add(button3, 0,3,1,1);
        button3.setOnAction(value -> {
            theCalculator.appendToMainNumber("3");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button4 = new Button("4");
        button4.setPrefSize(100,100);
        gridPane.add(button4, 2,2,1,1);
        button4.setOnAction(value -> {
            theCalculator.appendToMainNumber("4");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button5 = new Button("5");
        button5.setPrefSize(100,100);
        gridPane.add(button5, 1,2,1,1);
        button5.setOnAction(value -> {
            theCalculator.appendToMainNumber("5");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button6 = new Button("6");
        button6.setPrefSize(100,100);
        gridPane.add(button6, 0,2,1,1);
        button6.setOnAction(value -> {
            theCalculator.appendToMainNumber("6");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button7 = new Button("7");
        button7.setPrefSize(100,100);
        gridPane.add(button7, 2,1,1,1);
        button7.setOnAction(value -> {
            theCalculator.appendToMainNumber("7");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button8 = new Button("8");
        button8.setPrefSize(100,100);
        gridPane.add(button8, 1,1,1,1);
        button8.setOnAction(value -> {
            theCalculator.appendToMainNumber("8");
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button button9 = new Button("9");
        button9.setPrefSize(100,100);
        gridPane.add(button9, 0,1,1,1);
        button9.setOnAction(value -> {
            theCalculator.appendToMainNumber("9");
            mainNum.setText(theCalculator.getMainNumber());
        });


        Button plusButton = new Button("+");
        plusButton.setPrefSize(100,100);
        gridPane.add(plusButton, 3,1,1,1);
        plusButton.setOnAction(value -> {
            theCalculator.storeAndResetMainNumber();
            theCalculator.setMathType('+');
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button minusButton = new Button("-");
        minusButton.setPrefSize(100,100);
        gridPane.add(minusButton, 3,2,1,1);
        minusButton.setOnAction(value -> {
            theCalculator.storeAndResetMainNumber();
            theCalculator.setMathType('-');
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button multiplyButton = new Button("*");
        multiplyButton.setPrefSize(100,100);
        gridPane.add(multiplyButton, 3,3,1,1);
        multiplyButton.setOnAction(value -> {
            theCalculator.storeAndResetMainNumber();
            theCalculator.setMathType('*');
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button divideButton = new Button("/");
        divideButton.setPrefSize(100,100);
        gridPane.add(divideButton, 3,4,1,1);
        divideButton.setOnAction(value -> {
            theCalculator.storeAndResetMainNumber();
            theCalculator.setMathType('/');
            mainNum.setText(theCalculator.getMainNumber());
        });

        Button equalsButton = new Button("=");
        equalsButton.setPrefSize(100,100);
        gridPane.add(equalsButton, 1,4,1,1);
        equalsButton.setOnAction(value -> {
            if (theCalculator.getMathType() == '+') {
                theCalculator.add(mainNum.getText());
                mainNum.setText(theCalculator.getMainNumber());
            } else if (theCalculator.getMathType() == '-') {
                theCalculator.subtract(mainNum.getText());
                mainNum.setText(theCalculator.getMainNumber());
            } else if (theCalculator.getMathType() == '*') {
                theCalculator.multiply(mainNum.getText());
                mainNum.setText(theCalculator.getMainNumber());
            } else {
                theCalculator.divide(mainNum.getText());
                mainNum.setText(theCalculator.getMainNumber());
            }
        });

        Button clearButton = new Button("C");
        clearButton.setPrefSize(100,100);
        gridPane.add(clearButton,2,4,1,1);
        clearButton.setOnAction(value -> {
            theCalculator.resetMainNumber();
            mainNum.setText(theCalculator.getMainNumber());
        });

        Scene mainScene = new Scene(gridPane);
        stage.setScene(mainScene);
        stage.show();
    }
}
