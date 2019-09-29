package com.example.calculatordesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bdot,bsub,bmul,bdiv,bmod,beq,bdel,
            broot,bac;
    TextView ans1,ans2;
    boolean add,sub,mod,mul,div;
    double var1,var2;
    String del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.zero);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        badd=findViewById(R.id.plus);
        bsub=findViewById(R.id.minus);
        bmul=findViewById(R.id.mul);
        bdiv=findViewById(R.id.div);
        beq=findViewById(R.id.equal);
        bmod=findViewById(R.id.par);
        bdel=findViewById(R.id.delete);
        broot=findViewById(R.id.root);
        bac=findViewById(R.id.clear);
        bdot=findViewById(R.id.dot);
        ans1=findViewById(R.id.cnt);
        ans2=findViewById(R.id.cnt1);


        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del=ans1.getText().toString();
                del=del.substring(0,del.length()-1);
                ans1.setText(del+"");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"6");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(ans1.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1= Double.parseDouble(ans1.getText()+"");
                add=true;
                ans1.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1= Double.parseDouble(ans1.getText()+"");
                sub=true;
                ans1.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1= Double.parseDouble(ans1.getText()+"");
                mul=true;
                ans1.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1= Double.parseDouble(ans1.getText()+"");
                div=true;
                ans1.setText(null);
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(null);
                ans2.setText(null);
            }
        });
        broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans1.getText()+"");
                var2=sqrt(var1);
                ans2.setText(var2+"");
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans1==null) {
                    ans1.setText("");
                }
                else{
                    var1= Double.parseDouble(ans1.getText()+"");
                    mod=true;
                    ans1.setText(null);
                }

            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(ans1.getText()+"");
                if(add==true){
                    ans2.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true){
                    ans2.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true){
                    ans2.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true){
                    ans2.setText(var1/var2+"");
                    div=false;
                }
                if(mod==true){
                    if(var2==0){
                        ans2.setText("error");
                    }
                    else{
                        ans2.setText(var1%var2+"");
                        mod=false;
                    }

                }
            }
        });
    }
}
