package com.example.simplecalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String BUNDLE_RESULT = "bundle_result";
    public static final String BUNDLE_MEMORY = "bundle_memory";
    public static final String BUNDLE_SHOW_PROCESS = "bundle_show_process";
    public static final String BUNDLE_SHOW_RESULT = "bundle_show_result";
    private Button mDeleteBtn;
    private Button mButtonAdd;
    private Button mButtonSub;
    private Button mButtonDiv;
    private Button mButtonMul;
    private Button mButtonEqual;
    private Button mNumber0;
    private Button mNumber1;
    private Button mNumber2;
    private Button mNumber3;
    private Button mNumber4;
    private Button mNumber5;
    private Button mNumber6;
    private Button mNumber7;
    private Button mNumber8;
    private Button mNumber9;
    private Button mPoint;
    private TextView mTxtViewShowResult;
    private TextView mTxtViewShowProcess;
    private float mOperand1;
    private float mOperand2;
    private float mResult;
    private float mMemory = 0;
    private  int mPointCounter=0;
    private  int mSymbolCounter=0;
    private boolean mAdd;
    private boolean mSubtract;
    private boolean mMultiply;
    private boolean mDivide;
    private boolean mEqual;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListener();
        if (savedInstanceState != null) {
            mMemory = savedInstanceState.getFloat(BUNDLE_MEMORY);
            mResult = savedInstanceState.getFloat(BUNDLE_RESULT);
            if (savedInstanceState.getString(BUNDLE_SHOW_RESULT) != null)
                mTxtViewShowResult.setText(savedInstanceState.getString(BUNDLE_SHOW_RESULT) + "");
            if (savedInstanceState.getString(BUNDLE_SHOW_PROCESS) != null)
                mTxtViewShowProcess.setText(savedInstanceState.getString(BUNDLE_SHOW_PROCESS) + "");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(BUNDLE_RESULT, mResult);
        outState.putFloat(BUNDLE_MEMORY, mMemory);
        outState.putString(BUNDLE_SHOW_PROCESS, mTxtViewShowProcess.getText().toString());
        outState.putString(BUNDLE_SHOW_RESULT, mTxtViewShowResult.getText().toString());

    }

    private void findViews() {
        mDeleteBtn = findViewById(R.id.delete);
        mButtonDiv = findViewById(R.id.div);
        mButtonMul = findViewById(R.id.mul);
        mButtonSub = findViewById(R.id.sub);
        mButtonAdd = findViewById(R.id.adding);
        mButtonEqual = findViewById(R.id.equal);
        mPoint = findViewById(R.id.point);
        mNumber0 = findViewById(R.id.num_0);
        mNumber1 = findViewById(R.id.num_1);
        mNumber2 = findViewById(R.id.num_2);
        mNumber3 = findViewById(R.id.num_3);
        mNumber4 = findViewById(R.id.num_4);
        mNumber5 = findViewById(R.id.num_5);
        mNumber6 = findViewById(R.id.num_6);
        mNumber7 = findViewById(R.id.num_7);
        mNumber8 = findViewById(R.id.num_8);
        mNumber9 = findViewById(R.id.num_9);
        mTxtViewShowResult = findViewById(R.id.textView);
        mTxtViewShowProcess = findViewById(R.id.txt_pro);

    }
private Boolean check(){
    String checkString = mTxtViewShowProcess.getText().toString();
    char checkChar=(checkString.charAt(checkString.length()-1));
   if( checkChar!='+'||checkChar!='-'||checkChar!='*'||checkChar!='/'||checkChar!='.'||checkChar!=' '){
           return true;
   }

       else
           return false;
    }


    private void setListener() {

        mNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "0");
                Toast.makeText(MainActivity.this, "number : 0", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "1");
                Toast.makeText(MainActivity.this, "number : 1", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "2");
                Toast.makeText(MainActivity.this, "number : 2", Toast.LENGTH_SHORT).show();
            }

        });
        mNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "3");
                Toast.makeText(MainActivity.this, "number : 3", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "4");
                Toast.makeText(MainActivity.this, "number : 4", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "5");
                Toast.makeText(MainActivity.this, "number : 5", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "6");
                Toast.makeText(MainActivity.this, "number : 6", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "7");
                Toast.makeText(MainActivity.this, "number : 7", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "8");
                Toast.makeText(MainActivity.this, "number : 8", Toast.LENGTH_SHORT).show();
            }
        });
        mNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + "9");
                Toast.makeText(MainActivity.this, "number : 9", Toast.LENGTH_SHORT).show();
            }
        });
        mPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check()){
                mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + ".");
                Toast.makeText(MainActivity.this, "symbol : .", Toast.LENGTH_SHORT).show();
                mPointCounter++;}
            }
        });
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEqual){
                    if (!mAdd&&mSymbolCounter==0 ) {
                        mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " + ");
                        Toast.makeText(MainActivity.this, "operator : +", Toast.LENGTH_SHORT).show();
                        mAdd = true;
                        mSymbolCounter++;
                        mEqual=false;

                    }
                }
                else if (!mAdd&&check()&&mSymbolCounter==0 ) {
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " + ");
                    Toast.makeText(MainActivity.this, "operator : +", Toast.LENGTH_SHORT).show();
                    mAdd = true;
                    mSymbolCounter++;

                }
                else{
                    calculate();
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " + ");
                    Toast.makeText(MainActivity.this, "operator : +", Toast.LENGTH_SHORT).show();
                    mAdd = true;
                    mSymbolCounter++;
                }
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEqual){
                    if (!mSubtract&&mSymbolCounter==0 ) {
                        mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " - ");
                        Toast.makeText(MainActivity.this, "operator : -", Toast.LENGTH_SHORT).show();
                        mSubtract = true;
                        mSymbolCounter++;
                        mEqual=false;

                    }
                }
              else if (!mSubtract&&check()&&mSymbolCounter==0) {
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " - ");
                    Toast.makeText(MainActivity.this, "operator : -", Toast.LENGTH_SHORT).show();
                    mSubtract = true;
                    mSymbolCounter++;
                }
                else{
                    calculate();
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " - ");
                    Toast.makeText(MainActivity.this, "operator : -", Toast.LENGTH_SHORT).show();
                    mSubtract = true;
                    mSymbolCounter++;
                }
            }
        });
        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEqual){
                    if (!mMultiply&&mSymbolCounter==0 ) {
                        mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " * ");
                        Toast.makeText(MainActivity.this, "operator : * ", Toast.LENGTH_SHORT).show();
                        mMultiply = true;
                        mSymbolCounter++;
                        mEqual=false;

                    }
                }
                else if (!mMultiply&&check()&&mSymbolCounter==0) {
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " * ");
                    Toast.makeText(MainActivity.this, "operator : *", Toast.LENGTH_SHORT).show();
                    mMultiply = true;
                    mSymbolCounter++;
                }
                else{
                    calculate();
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " * ");
                    Toast.makeText(MainActivity.this, "operator : *", Toast.LENGTH_SHORT).show();
                    mMultiply = true;
                    mSymbolCounter++;
                }
            }
        });
        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEqual){
                    if (!mDivide&&mSymbolCounter==0 ) {
                        mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " / ");
                        Toast.makeText(MainActivity.this, "operator : /", Toast.LENGTH_SHORT).show();
                        mDivide = true;
                        mSymbolCounter++;
                        mEqual=false;

                    }
                }
                if (!mDivide&&check()&&mSymbolCounter==0) {

                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " / ");
                    Toast.makeText(MainActivity.this, "operator : /", Toast.LENGTH_SHORT).show();
                    mDivide = true;
                    mSymbolCounter++;
                    mEqual=false;
                }
                else{
                    calculate();
                    mTxtViewShowProcess.setText(mTxtViewShowProcess.getText() + " / ");
                    Toast.makeText(MainActivity.this, "operator : /", Toast.LENGTH_SHORT).show();
                    mDivide = true;
                    mSymbolCounter++;
                }
            }
        });
        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                calculate();
                mEqual=true;
            }
        });
        mDeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowProcess.setText("");
            }
        });
    }

    private void calculate() {
        mSymbolCounter=0;
        String[] strings = extractValueString(mTxtViewShowProcess);
        if (mAdd) {
            if (strings[0].equals("")) {
                mOperand1 = mMemory;
            } else {
                mOperand1 = Float.parseFloat(strings[0]);
            }
            mOperand2 = Float.parseFloat(strings[2]);
            mResult = mOperand1 + mOperand2;
            mMemory = mResult;
            mTxtViewShowResult.setText(mResult + "");
            mAdd = false;
            mResult = 0;
        }
        if (mSubtract) {
            if (strings[0].equals("")) {
                mOperand1 = mMemory;
            } else {
                mOperand1 = Float.parseFloat(strings[0]);
            }
            mOperand2 = Float.parseFloat(strings[2]);
            mResult = mOperand1 - mOperand2;
            mMemory = mResult;
            mTxtViewShowResult.setText(mResult + "");
            mSubtract = false;
            mResult = 0;
        }
        if (mMultiply) {
            if (strings[0].equals("")) {
                mOperand1 = mMemory;
            } else {
                mOperand1 = Float.parseFloat(strings[0]);
            }
            mOperand2 = Float.parseFloat(strings[2]);
            mResult = mOperand1 * mOperand2;
            mMemory = mResult;
            mTxtViewShowResult.setText(mResult + "");
            mMultiply = false;
            mResult = 0;
        }
        if (mDivide) {
            if (strings[0].equals("")) {
                mOperand1 = mMemory;
            } else {
                mOperand1 = Float.parseFloat(strings[0]);
            }
            mOperand2 = Float.parseFloat(strings[2]);
            if (mOperand2 != 0) {
                mResult = mOperand1 / mOperand2;
                mMemory = mResult;
                mTxtViewShowResult.setText(mResult + "");
            } else {
                Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                mTxtViewShowResult.setText("Cannot divide by zero");

            }
            mDivide = false;
            mResult = 0;
        }
        mTxtViewShowProcess.setText("");
    }



    private String[] extractValueString(TextView textView) {
        String str = textView.getText().toString();
        String[] strArray = str.split(" ");
        return strArray;
    }
//
}