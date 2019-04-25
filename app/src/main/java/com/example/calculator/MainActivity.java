package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button plus;
    Button minus;
    Button mul;
    Button div;
    Button mod;
    Button sin;
    Button cos;
    Button tan;
    Button pow;
    Button log;
    Button ln;
    Button sqrt;
    Button dot;
    Button c;
    Button equal;
    EditText input;
    TextView output;
    Double n1, n2, n;
    int x=0;
    boolean b_sin, b_cos, b_tan, b_mod, b_plus, b_minus, b_div, b_mul, b_pow, b_log, b_ln, b_sqrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num0 =(Button)findViewById(R.id.num0);
        num1 =(Button)findViewById(R.id.num1);
        num2 =(Button)findViewById(R.id.num2);
        num3 =(Button)findViewById(R.id.num3);
        num4 =(Button)findViewById(R.id.num4);
        num5 =(Button)findViewById(R.id.num5);
        num6 =(Button)findViewById(R.id.num6);
        num7 =(Button)findViewById(R.id.num7);
        num8 =(Button)findViewById(R.id.num8);
        num9 =(Button)findViewById(R.id.num9);
        input = (EditText)findViewById(R.id.input);
        sin = (Button)findViewById(R.id.sin);
        cos = (Button)findViewById(R.id.cos);
        tan = (Button)findViewById(R.id.tan);
        pow = (Button)findViewById(R.id.pow);
        log = (Button)findViewById(R.id.log);
        ln = (Button)findViewById(R.id.ln);
        sqrt = (Button)findViewById(R.id.sqrt);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        dot = (Button)findViewById(R.id.dot);
        c = (Button)findViewById(R.id.c);
        mod = (Button)findViewById(R.id.mod);
        output = (TextView)findViewById(R.id.output);
        equal =(Button)findViewById(R.id.equal);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"9");
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText("log("+n1+")");
                }
                else
                {
                    x = 1;
                    output.setText("log("+n+")");
                }
                input.setText(null);
                b_log = true;
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText("ln("+n1+")");
                }
                else
                {
                    x = 1;
                    output.setText("ln("+n+")");
                }
                input.setText(null);
                b_ln = true;
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText(n1 + "+");
                }
                else
                {
                    x = 1;
                    output.setText(n+"+");
                }
                input.setText(null);
                b_plus = true;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText(n1 + "-");
                }
                else
                {
                    x = 1;
                    output.setText(n+"-");
                }
                input.setText(null);
                b_minus = true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText(n1 + "*");
                }
                else
                {
                    x = 1;
                    output.setText(n+"*");
                }
                input.setText(null);
                b_mul = true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText(n1 + "/");
                }
                else
                {
                    x = 1;
                    output.setText(n+"/");
                }
                input.setText(null);
                b_div = true;
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText("sin("+n1+")");
                }
                else
                {
                    x = 1;
                    output.setText("sin("+n+")");
                }
                input.setText(null);
                b_sin = true;
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText("cos("+n1+")");
                }
                else
                {
                    x = 1;
                    output.setText("cos("+n+")");
                }
                input.setText(null);
                b_cos = true;
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText("tan("+n1+")");
                }
                else
                {
                    x = 1;
                    output.setText("tan("+n+")");
                }
                input.setText(null);
                b_tan = true;
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText(n1 + "^");
                }
                else
                {
                    x = 1;
                    output.setText(n+"^");
                }
                input.setText(null);
                b_pow = true;
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText(n1 + "%");
                }
                else
                {
                    x = 1;
                    output.setText(n+"%");
                }
                input.setText(null);
                b_mod = true;
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("")&&output.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter some number",
                            Toast.LENGTH_SHORT).show();
                }
                if(x==0) {
                    n1 = Double.parseDouble(input.getText().toString());
                    output.setText("sqrt("+n1+")");
                }
                else
                {
                    x = 1;
                    output.setText("sqrt("+n+")");
                }
                input.setText(null);
                b_sqrt = true;
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(input.getText().toString());
                input.setText(input.getText()+".");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
                output.setText(null);
                x=0;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* String x = input.getText().toString();

                if(x.substring(0,1)=="0"||x.substring(0,1)=="1"||x.substring(0,1)=="2"||
                x.substring(0,1)=="3"||x.substring(0,1)=="4"||x.substring(0,1)=="5"||
                        x.substring(0,1)=="6"||x.substring(0,1)=="7"||x.substring(0,1)=="8"||
                        x.substring(0,1)=="9")
                {
                    Toast.makeText(getApplicationContext(), "see first letter is digit", Toast.LENGTH_SHORT).show();
                }
                else if(x.substring(0,1)=="l"||x.substring(0,1)=="s"||x.substring(0,1)=="c"||
                        x.substring(0,1)=="t")
                {
                    Toast.makeText(getApplicationContext(), "see first letter is character", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "ERROR..!!", Toast.LENGTH_SHORT).show();
                }
                */
                //if(input.getText()!=null)
                if(b_sqrt)
                {
                    if(x==1)
                        n = Math.sqrt(n);
                    else
                        n = Math.sqrt(n1);
                    output.setText(output.getText()+" = "+String.format("%.6f", n));
                    b_sqrt = false;
                    x=1;
                }
                else if(b_mod)
                {
                    n2  = Double.parseDouble(input.getText().toString());
                    if(x==1)
                        n = n%n2;
                    else
                        n=n1%n2;
                    output.setText(output.getText()+n2.toString()+" = "+n);
                    b_mod  = false;
                    x=1;
                }
                else if(b_pow)
                {
                    n2  = Double.parseDouble(input.getText().toString());
                    if(x==1)
                        n = Math.pow(n, n2);
                    else
                        n = Math.pow(n1, n2);
                    output.setText(output.getText()+n2.toString()+" = "+n);
                    b_pow = false;
                    x=1;
                }
                else if(b_tan)
                {
                    if(x==1)
                        n = Math.tan(Math.toRadians(n));
                    else
                        n = Math.tan(Math.toRadians(n1));
                    output.setText(output.getText()+" = "+String.format("%.6f", n));
                    b_tan = false;
                    x=1;
                }
                else if(b_cos)
                {
                    if(x==1)
                        n = Math.cos(Math.toRadians(n));
                    else
                        n = Math.cos(Math.toRadians(n1));
                    output.setText(output.getText()+" = "+String.format("%.6f", n));
                    b_cos = false;
                    x=1;
                }
                else if(b_sin)
                {
                    if(x==1)
                        n = Math.sin(Math.toRadians(n));
                    else
                        n = Math.sin(Math.toRadians(n1));
                    output.setText(output.getText()+" = "+String.format("%.6f", n));
                    b_sin = false;
                    x=1;
                }
                else if(b_div)
                {
                    n2  = Double.parseDouble(input.getText().toString());
                    if(x==1)
                        n = n/n2;
                    else
                        n=n1/n2;
                    output.setText(output.getText()+n2.toString()+" = "+n);
                    b_div = false;
                    x=1;
                }
                else if(b_mul)
                {
                    n2  = Double.parseDouble(input.getText().toString());
                    if(x==1)
                        n = n*n2;
                    else
                        n=n1*n2;
                    output.setText(output.getText()+n2.toString()+" = "+n);
                    b_mul = false;
                    x=1;
                }
                else if(b_plus)
                {
                    n2  = Double.parseDouble(input.getText().toString());
                    if(x==1)
                        n = n+n2;
                    else
                        n=n1+n2;
                    output.setText(output.getText()+n2.toString()+" = "+n);
                    b_plus = false;
                    x=1;
                }
                else if(b_minus)
                {
                    n2  = Double.parseDouble(input.getText().toString());
                    if(x==1)
                        n = n-n2;
                    else
                        n=n1-n2;
                    output.setText(output.getText()+n2.toString()+" = "+n);
                    b_minus = false;
                    x=1;
                }
                else if(b_ln)
                {
                    if(x==1)
                        n = Math.log(n);
                    else
                        n = Math.log(n1);
                    output.setText(output.getText()+" = "+String.format("%.6f", n));
                    b_ln = false;
                }
                else if(b_log)
                {
                    n = Math.log10(n1);
                    output.setText(output.getText()+" = "+String.format("%.6f", n));
                    b_log = false;
                    x=1;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Entry", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
