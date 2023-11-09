package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView tvmain,tvsec;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get buttons
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners and buttons
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if(val.isEmpty()){
                    tvmain.setText(String.valueOf(""));
                    tvsec.setText("");
                }else {
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });

        // functions
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvmain.getText().toString().isEmpty()){
                    tvmain.setText(tvmain.getText()+"sin");
                }else{
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);
                    if(lastChar != '+' || lastChar != '-' || lastChar != '÷'){
                        tvmain.setText(tvmain.getText()+"×"+"sin");
                    }else{
                        tvmain.setText(tvmain.getText()+"sin");
                    }
                }
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvmain.getText().toString().isEmpty()){
                    tvmain.setText(tvmain.getText()+"cos");
                }else{
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);
                    if(lastChar != '+' || lastChar != '-' || lastChar != '÷'){
                        tvmain.setText(tvmain.getText()+"×"+"cos");
                    }else{
                        tvmain.setText(tvmain.getText()+"cos");
                    }
                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvmain.getText().toString().isEmpty()){
                    tvmain.setText(tvmain.getText()+"tan");
                }else{
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);
                    if(lastChar != '+' || lastChar != '-' || lastChar != '÷'){
                        tvmain.setText(tvmain.getText()+"×"+"tan");
                    }else{
                        tvmain.setText(tvmain.getText()+"tan");
                    }
                }
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else{
                    tvmain.setText(tvmain.getText()+"^"+"(-1)");
                }
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else{
                    int val = Integer.parseInt(tvmain.getText().toString());
                    int fact = factorial(val);
                    tvmain.setText(String.valueOf(fact));
                    tvsec.setText(val+"!");
                }

            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else{
                    double d = Double.parseDouble(tvmain.getText().toString());
                    double square = d*d;
                    tvmain.setText(String.valueOf(square));
                    tvsec.setText(d+"²");
                }
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvmain.getText().toString().isEmpty()){
                    tvmain.setText(tvmain.getText()+"ln");
                }else{
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);
                    if(lastChar != '+' || lastChar != '-' || lastChar != '÷'){
                        tvmain.setText(tvmain.getText()+"×"+"ln");
                    }else{
                        tvmain.setText(tvmain.getText()+"ln");
                    }
                }
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvmain.getText().toString().isEmpty()){
                    tvmain.setText(tvmain.getText()+"log");
                }else{
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);
                    if(lastChar != '+' || lastChar != '-' || lastChar != '÷'){
                        tvmain.setText(tvmain.getText()+"×"+"log");
                    }else{
                        tvmain.setText(tvmain.getText()+"log");
                    }
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else{
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);
                    if (lastChar == '+' || lastChar == '-' || lastChar == '×' || lastChar == '÷'
                            || lastChar == '√' || lastChar == '(' || lastChar == ')' ){
                        Toast.makeText(getApplicationContext() , "invalid format" , Toast.LENGTH_SHORT).show();
                    }else{
                        bequal.callOnClick();
                        String val = tvmain.getText().toString();
                        double r = Math.sqrt(Double.parseDouble(val));
                        tvmain.setText(String.valueOf(r));
                    }
                }
            }
        });

        //Operations
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else {
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);

                    if(lastChar == '+' || lastChar == '-' || lastChar == '×' || lastChar == '÷'){
                        // Replace the last character with the new operator
                        currentText = currentText.substring(0, currentText.length() -1);
                        tvmain.setText(currentText +"+");
                    }else {
                        tvmain.setText(tvmain.getText()+"+");
                    }
                }
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else {
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);

                    if(lastChar == '+' || lastChar == '-' || lastChar == '×' || lastChar == '÷'){
                        // Replace the last character with the new operator
                        currentText = currentText.substring(0, currentText.length() -1);
                        tvmain.setText(currentText +"-");
                    }else {
                        tvmain.setText(tvmain.getText()+"-");
                    }
                }

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else {
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);

                    if(lastChar == '+' || lastChar == '-' || lastChar == '×' || lastChar == '÷'){
                        // Replace the last character with the new operator
                        currentText = currentText.substring(0, currentText.length() -1);
                        tvmain.setText(currentText +"×");
                    }else {
                        tvmain.setText(tvmain.getText()+"×");
                    }
                }

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    // Display a toast message
                    Toast.makeText(getApplicationContext(), "non-valid format", Toast.LENGTH_SHORT).show();
                }else {
                    String currentText = tvmain.getText().toString();
                    char lastChar = currentText.charAt(currentText.length() -1);

                    if(lastChar == '+' || lastChar == '-' || lastChar == '×' || lastChar == '÷'){
                        // Replace the last character with the new operator
                        currentText = currentText.substring(0, currentText.length() -1);
                        tvmain.setText(currentText +"÷");
                    }else {
                        tvmain.setText(tvmain.getText()+"÷");
                    }
                }

            }
        });


        //parentheses
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });

        //equal button
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tvmain.getText().toString().isEmpty() ) {
                    tvmain.setText(String.valueOf(""));
                    tvsec.setText("");
                }

                else{
                    try {
                        String currentText = tvmain.getText().toString();
                        char lastChar = currentText.charAt(currentText.length() - 1);
                        int openParenCount = countOccurrences(currentText, '(');
                        int closeParenCount = countOccurrences(currentText, ')');

                        if (lastChar == '+' || lastChar == '-' || lastChar == '×' || lastChar == '÷' || lastChar == '√') {
                            Toast.makeText(getApplicationContext(), "Invalid format", Toast.LENGTH_SHORT).show();
                        }
                        else if (openParenCount == closeParenCount) {
                            if (!currentText.isEmpty()) {
                                String replacedStr = currentText.replace('÷', '/').replace('×', '*');
                                double result = eval(getApplicationContext(), replacedStr);
                                if (Double.isInfinite(result) || Double.isNaN(result)) {
                                    // Display a toast message for division by zero
                                    Toast.makeText(MainActivity.this, "Cannot divide by 0", Toast.LENGTH_SHORT).show();
                                    tvmain.setText("");
                                    tvsec.setText("");
                                } else {
                                    tvmain.setText(String.valueOf(result));
                                    tvsec.setText(currentText);
                                }
                            }
                            else {
                                // Display a toast message for null input
                                Toast.makeText(MainActivity.this, "null", Toast.LENGTH_SHORT).show();
                                tvmain.setText("");
                                tvsec.setText("");
                            }
                        }
                        else {
                            // Display a toast message for incomplete format
                            Toast.makeText(MainActivity.this, "Format is not completed", Toast.LENGTH_SHORT).show();
                        }
                    } catch (Exception e) {
                        // Display a toast for math format error
                        Toast.makeText(MainActivity.this, "Math Format Error", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

    }

    // CALCULATION

    //1-factorial
    int factorial(int n) {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }
    // Function to count occurrences of a character in a string
    int countOccurrences(String str, char character) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }

    //eval function (PARSING)
    public static double eval(final Context context, final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar(){
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            } //gives the character

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            } //checks if the current character is a specified

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }// checks if there are any unexpected characters

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }// parse addition and subtraction operations.

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }//parse multiplication and division operations.

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;

                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else {
                        Toast.makeText(context , "Unknown function: " + func, Toast.LENGTH_SHORT).show();
                        throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                if (eat('/')) {
                    double divisor = parseFactor();
                    if (divisor == 0) {
                        Toast.makeText(context, "Division by zero is not allowed", Toast.LENGTH_LONG).show();
                    }
                    x /= divisor;
                }

                return x;
            }

        }.parse();
    }

}