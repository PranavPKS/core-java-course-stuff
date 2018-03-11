import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
 
class Calculator extends JFrame {
    private final Font FONT = new Font("Times New Roman",Font.PLAIN, 20);
    private JTextField textfield;
    private boolean number = true;
    private String equal = "=";
    private Result res = new Result();
    private double a=0;
    private int y=0,x=0;
    
    public Calculator() {
        textfield = new JTextField("", 12);
        textfield.setHorizontalAlignment(JTextField.RIGHT);
        textfield.setFont(FONT);
        ActionListener number = new NumberListener();
        String buttonOrder = "123456789 "+"0";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));
        for (int i = 0; i < buttonOrder.length(); i++) {
            String key = buttonOrder.substring(i, i+1);
            if (key.equals(" ")) {
                buttonPanel.add(new JLabel(""));
            } else {
                JButton button = new JButton(key);
                button.addActionListener(number);
                button.setFont(FONT);
                buttonPanel.add(button);
            }
        }
        ActionListener operator = new OperatorListener();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 4, 4));
        String[] opOrder = {"+", "-", "*", "/","=","sin","cos","tan","log","C","asin","acos","atan","x^2","x^3","1/x","e","+/-","sqrt","."};
        for (int i = 0; i < opOrder.length; i++) {
            JButton button = new JButton(opOrder[i]);
            button.addActionListener(operator);
            button.setFont(FONT);
            panel.add(button);
        }
        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout(4, 4));
        pan.add(textfield, BorderLayout.NORTH );
        pan.add(buttonPanel , BorderLayout.CENTER);
        pan.add(panel , BorderLayout.WEST);
        this.setContentPane(pan);
        this.pack();
        this.setTitle("Calculator");
        this.setResizable(false);
    }
    private void action() {
        number = true;
        textfield.setText("");
        equal = "=";
        res.setTotal("");
    }
    class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent act) {
            String displayText = textfield.getText();
            if (act.getActionCommand().equals("sin"))
            {
                float txt_rad= (float) Math.toRadians(Float.parseFloat(displayText));
                double txt= Math.sin(Double.valueOf(txt_rad).doubleValue());
                double value = Math.round( txt * 100.0 ) / 100.0;
                textfield.setText("" + value);
                
            }else
            if (act.getActionCommand().equals("cos"))
            {
                float txt_rad= (float) Math.toRadians(Float.parseFloat(displayText));
                double txt= Math.cos(Double.valueOf(txt_rad).doubleValue());
                double value = Math.round( txt * 100.0 ) / 100.0;
                textfield.setText("" + value);
                
            }else
            if (act.getActionCommand().equals("tan"))
            {
                float txt_rad= (float) Math.toRadians(Float.parseFloat(displayText));
                double txt= Math.tan(Double.valueOf(txt_rad).doubleValue());
                double value = Math.round( txt * 100.0 ) / 100.0;
                textfield.setText("" + value);
                
            }
            else
            if (act.getActionCommand().equals("asin"))
            {
                float txt_rad= (float) Math.toRadians(Float.parseFloat(displayText));
                double txt= Math.asin(Double.valueOf(txt_rad).doubleValue());
                double value = Math.round( txt * 100.0 ) / 100.0;
                textfield.setText("" + value);
                
            }
            else
            if (act.getActionCommand().equals("acos"))
            {
                float txt_rad= (float) Math.toRadians(Float.parseFloat(displayText));
                double txt= Math.acos(Double.valueOf(txt_rad).doubleValue());
                double value = Math.round( txt * 100.0 ) / 100.0;
                textfield.setText("" + value);
                
            }
            else
            if (act.getActionCommand().equals("atan"))
            {
                float txt_rad= (float) Math.toRadians(Float.parseFloat(displayText));
                double txt= Math.atan(Double.valueOf(txt_rad).doubleValue());
                double value = Math.round( txt * 100.0 ) / 100.0;
                textfield.setText("" + value);
                
            }
            else
            if (act.getActionCommand().equals("log"))
            {
                textfield.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));
                
            }
            else
            if(act.getActionCommand().equals("e"))
            {
                if(textfield.getText().equals(""))
                {
                textfield.setText("");
                }
                else
                {
                a=Math.exp(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
                }
            }
            else
            if(act.getActionCommand().equals("x^2"))
            {
                if(textfield.getText().equals(""))
                {
                    textfield.setText("");
                }
                else
                {
                    a=Math.pow(Double.parseDouble(textfield.getText()),2);
                    textfield.setText("");
                    textfield.setText(textfield.getText() + a);
                }
            }
            else
            if(act.getActionCommand().equals("x^3"))
            {
                if(textfield.getText().equals(""))
                {
                    textfield.setText("");
                }
            else
            {
                a=Math.pow(Double.parseDouble(textfield.getText()),3);
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
            }
            else
            if(act.getActionCommand().equals("sqrt"))
            {
                if(textfield.getText().equals(""))
                {
                    textfield.setText("");
                }
                else
                {
                    a=Math.sqrt(Double.parseDouble(textfield.getText()));
                    textfield.setText("");
                    textfield.setText(textfield.getText() + a);
                }
            }
            else 
            if(act.getActionCommand().equals("+/-"))
            {
                if(x==0)
                {
                    textfield.setText("-"+textfield.getText());
                    x=1;
                }
                else
                {
                    textfield.setText(textfield.getText());
                }
            }
            else
            if(act.getActionCommand().equals("1/x"))
            {
                if(textfield.getText().equals(""))
                {
                    textfield.setText("");
                }
                else
                {
                    a=1/Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    textfield.setText(textfield.getText() + a);
                }
            }
            
            else
            if(act.getActionCommand().equals("."))
            {
                if(y==0)
                {
                    textfield.setText(textfield.getText()+".");
                }
                else
                {
                    textfield.setText(textfield.getText());
                }
            }
            else
            if (act.getActionCommand().equals("C"))
            {
                textfield.setText("");
            }
 
            else
            {
                if (number)
                {
                    
                    action();
                    textfield.setText("");
                    
                }
                else
                {
                    number = true;
                    if (equal.equals("="))
                    {
                        res.setTotal(displayText);
                    }else
                    if (equal.equals("+"))
                    {
                        res.add(displayText);
                    }
                    else if (equal.equals("-"))
                    {
                        res.subtract(displayText);
                    }
                    else if (equal.equals("*"))
                    {
                        res.multiply(displayText);
                    }
                    else if (equal.equals("/"))
                    {
                        res.divide(displayText);
                    }
                    
                    textfield.setText("" + res.getTotal());
                    equal = act.getActionCommand();
                }
            }
        }
    }
    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String digit = event.getActionCommand();
            if (number) {
                textfield.setText(digit);
                number = false;
            } else {
                textfield.setText(textfield.getText() + digit);
            }
        }
    }
    public class Result {
        private double total;
        public Result() {
            total = 0;
        }
        public String getTotal() {
            return ""+total;
        }
        public void setTotal(String n) {
            total = convertToNumber(n);
        }
        public void add(String n) {
            total += convertToNumber(n);
        }
        public void subtract(String n) {
            total -= convertToNumber(n);
        }
        public void multiply(String n) {
            total *= convertToNumber(n);
        }
        public void divide(String n) {
            total /= convertToNumber(n);
        }
        private double convertToNumber(String n) {
            return Double.parseDouble(n);
        }
    }
}
class Calc {
    public static void main(String[] args) {
        JFrame frame = new Calculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}