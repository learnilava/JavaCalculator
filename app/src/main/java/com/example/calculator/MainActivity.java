package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static boolean shiftPressed = false;
    static boolean quadr = false;
    String equation = "";


    @Override
    public void onClick(View view) {
        System.out.println(2321);
        TextView result = findViewById(R.id.result);
        boolean equal = false;
        switch (view.getId()) {
            case R.id.add:
                equation += "+";
                break;
            case R.id.sub:
                equation += "-";
                break;

            case R.id.mul:
                equation += "*";
                break;

            case R.id.div:
                equation += "/";
                break;

            case R.id.clear:
                equation = "";
                break;

            case R.id.X:
                equation += "x";
                quadr = true;
                break;

            case R.id.ZZ:
                equation += "00";
                break;

            case R.id.Z:
                equation += "0";
                break;

            case R.id.one:
                equation += "1";
                break;

            case R.id.two:
                equation += "2";
                break;

            case R.id.thr:
                equation += "3";
                break;

            case R.id.fou:
                equation += "4";
                break;

            case R.id.fiv:
                equation += "5";
                break;

            case R.id.six:
                equation += "6";
                break;

            case R.id.sev:
                equation += "7";
                break;

            case R.id.eig:
                equation += "8";
                break;

            case R.id.nin:
                equation += "9";
                break;

            case R.id.squ:
                equation += "^2";
                break;

            case R.id.eq:
                equal = true;
                break;

            case R.id.del:
                equation = equation.substring(0, equation.length()-1);
                break;

            default:
                Toast.makeText(this, "Comming Soon", Toast.LENGTH_SHORT).show();
                break;
        }
        if (equal){
            if (quadr){
                result.setText(Quadratics.solve(equation));
            } else {
                result.setText(String.valueOf(calc(equation)));
            }
        } else {
            result.setText(equation);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignButtonTarget();

    }

    public double calc(String eq){
        for (int i=0;i < eq.length();i++) {
            try {
                Integer.parseInt(eq.substring(i));
            } catch (NumberFormatException e) {
                System.out.println((122));
            }
        }

        return 0;
    }


    public void assignButtonTarget(){

        Button add = findViewById(R.id.add);
        add.setOnClickListener(this);

        Button sub = findViewById(R.id.sub);
        sub.setOnClickListener(this);

        Button mul = findViewById(R.id.mul);
        mul.setOnClickListener(this);

        Button div = findViewById(R.id.div);
        div.setOnClickListener(this);

        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(this);

        Button sft = findViewById(R.id.sft);
        sft.setOnClickListener(this);

        Button X = findViewById(R.id.X);
        X.setOnClickListener(this);

        Button ZZ = findViewById(R.id.ZZ);
        ZZ.setOnClickListener(this);

        Button Z = findViewById(R.id.Z);
        Z.setOnClickListener(this);

        Button one = findViewById(R.id.one);
        one.setOnClickListener(this);

        Button two = findViewById(R.id.two);
        two.setOnClickListener(this);

        Button thr = findViewById(R.id.thr);
        thr.setOnClickListener(this);

        Button fou = findViewById(R.id.fou);
        fou.setOnClickListener(this);

        Button fiv = findViewById(R.id.fiv);
        fiv.setOnClickListener(this);

        Button six = findViewById(R.id.six);
        six.setOnClickListener(this);

        Button sev = findViewById(R.id.sev);
        sev.setOnClickListener(this);

        Button eig = findViewById(R.id.eig);
        eig.setOnClickListener(this);

        Button nin = findViewById(R.id.nin);
        nin.setOnClickListener(this);

        Button dot = findViewById(R.id.dot);
        dot.setOnClickListener(this);

        Button sin = findViewById(R.id.sin);
        sin.setOnClickListener(this);

        Button cos = findViewById(R.id.cos);
        cos.setOnClickListener(this);

        Button tan = findViewById(R.id.tan);
        tan.setOnClickListener(this);

        Button log = findViewById(R.id.log);
        log.setOnClickListener(this);

        Button e = findViewById(R.id.e);
        e.setOnClickListener(this);

        Button squ = findViewById(R.id.squ);
        squ.setOnClickListener(this);

        Button pow = findViewById(R.id.pow);
        pow.setOnClickListener(this);

        Button BR = findViewById(R.id.BR);
        BR.setOnClickListener(this);

        Button BL = findViewById(R.id.BL);
        BL.setOnClickListener(this);

        Button eq = findViewById(R.id.eq);
        eq.setOnClickListener(this);

        Button del = findViewById(R.id.del);
        del.setOnClickListener(this);
    }
}