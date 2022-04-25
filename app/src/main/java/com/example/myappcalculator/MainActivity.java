package com.example.myappcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    View.OnClickListener buttonOnClickListener;
    RelativeLayout relativeLayout;
    EditText editText;
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,
            btnplus,btnsub,btnmulti,btndivi,btnresult, btnreset;
    Integer lastvalue=0, currenvalue;
    String oparation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        btn1=(Button) findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);
        btn7=(Button) findViewById(R.id.button7);
        btn8=(Button) findViewById(R.id.button8);
        btn9=(Button) findViewById(R.id.button9);
        btn0=(Button) findViewById(R.id.button10);
        btnresult=(Button) findViewById(R.id.button11);
        btnreset=(Button) findViewById(R.id.button12);
        btnplus=(Button) findViewById(R.id.button13);
        btnsub=(Button) findViewById(R.id.button14);
        btnmulti=(Button) findViewById(R.id.button15);
        btndivi=(Button) findViewById(R.id.button16);

        buttonOnClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                switch (btn.getId()) {
                    case R.id.button10:
                        setvalue(editText, "0");
                        break;
                    case R.id.button:
                        setvalue(editText, "1");
                        break;
                    case R.id.button2:
                        setvalue(editText, "2");
                        break;
                    case R.id.button3:
                        setvalue(editText, "3");
                        break;
                    case R.id.button4:
                        setvalue(editText, "4");
                        break;
                    case R.id.button5:
                        setvalue(editText, "5");
                        break;
                    case R.id.button6:
                        setvalue(editText, "6");
                        break;
                    case R.id.button7:
                        setvalue(editText, "7");
                        break;
                    case R.id.button8:
                        setvalue(editText, "8");
                        break;
                    case R.id.button9:
                        setvalue(editText, "9");
                        break;
                    case R.id.button13:
                        oparation = "plus";
                        lastvalue = Integer.parseInt(editText.getText().toString());
                        resetvalue();
                        break;
                    case R.id.button14:
                        oparation = "sub";
                        lastvalue = Integer.parseInt(editText.getText().toString());
                        resetvalue();
                        break;
                    case R.id.button15:
                        oparation = "multi";
                        lastvalue = Integer.parseInt(editText.getText().toString());
                        resetvalue();
                        break;
                    case R.id.button16:
                        oparation = "divi";
                        lastvalue = Integer.parseInt(editText.getText().toString());
                        resetvalue();
                        break;
                }
                btn0.setOnClickListener(buttonOnClickListener);
                btn1.setOnClickListener(buttonOnClickListener);
                btn2.setOnClickListener(buttonOnClickListener);
                btn3.setOnClickListener(buttonOnClickListener);
                btn4.setOnClickListener(buttonOnClickListener);
                btn5.setOnClickListener(buttonOnClickListener);
                btn6.setOnClickListener(buttonOnClickListener);
                btn7.setOnClickListener(buttonOnClickListener);
                btn8.setOnClickListener(buttonOnClickListener);
                btn9.setOnClickListener(buttonOnClickListener);
                btnplus.setOnClickListener(buttonOnClickListener);
                btnsub.setOnClickListener(buttonOnClickListener);
                btnmulti.setOnClickListener(buttonOnClickListener);
                btndivi.setOnClickListener(buttonOnClickListener);
                btnresult.setOnClickListener(buttonOnClickListener);
                btnreset.setOnClickListener(buttonOnClickListener);
            }
        };
        }
            private void setvalue(EditText a, String b) {
                String last=a.getText().toString();
                if(!last.equals("0")){
                    last+=b;
                    b=last;
                }
                a.setText(b);
            }
            public void resetvalue(){
                editText.setText("0");
            }
            public Integer process(Integer a, Integer b){
                Integer presult=0;
                if(oparation=="plus"){
                    presult=a+b;
                    editText.setText(presult.toString());
                }
                if(oparation=="sub"){
                    presult=a-b;
                    editText.setText(presult.toString());
                }
                if(oparation=="multi"){
                    presult=a*b;
                    editText.setText(presult.toString());
                }
                if(oparation=="divi"){
                    presult=a/b;
                    editText.setText(presult.toString());
                }
                return presult;
            }
    }
