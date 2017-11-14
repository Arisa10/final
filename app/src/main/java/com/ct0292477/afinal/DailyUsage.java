package com.ct0292477.afinal;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class DailyUsage extends AppCompatActivity {

    public Button Vday1;
    public int year1;
    public int month1;
    public int day1;
    public int a;
    private Button income;
    private static final int dialog = 0;
    private DatePickerDialog.OnDateSetListener calendarSet;


    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual;
    private EditText Screen;
    private float fValue, secValue;
    private boolean Addition, Subtract, Multiply, Divide;

    private Button Button24;

    public static final int REQUEST_CODE1 = 123;

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_CODE1 && resultCode ==RESULT_OK);
        String reply = data.getExtras().getString("reply");
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_usage);

        // pass the total calculation from calculator to the specific date.
        final EditText questionText = (EditText) findViewById(R.id.txtScreen);

        Button p29 = (Button) findViewById(R.id.pd29);
        p29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question", question);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button p30 = (Button) findViewById(R.id.pd30);
        p30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question2 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question2", question2);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button p31 = (Button) findViewById(R.id.pd31);
        p31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question3 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question3", question3);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D1 = (Button) findViewById(R.id.d1);
        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question4 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question4", question4);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D2 = (Button) findViewById(R.id.d2);
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question5 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question5", question5);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D3 = (Button) findViewById(R.id.d3);
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question6 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question6", question6);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D4 = (Button) findViewById(R.id.d4);
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question7 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question7", question7);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D5 = (Button) findViewById(R.id.d5);
        D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question8 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question8", question8);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D6 = (Button) findViewById(R.id.d6);
        D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question9 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question9", question9);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D7 = (Button) findViewById(R.id.d7);
        D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question10 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question10", question10);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D8 = (Button) findViewById(R.id.d8);
        D8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question11 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question11", question11);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D9 = (Button) findViewById(R.id.d9);
        D9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question12 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question12", question12);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D10 = (Button) findViewById(R.id.d10);
        D10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question13 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question13", question13);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D11 = (Button) findViewById(R.id.d11);
        D11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question14 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question14", question14);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D12 = (Button) findViewById(R.id.d12);
        D12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question15 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question15", question15);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D13 = (Button) findViewById(R.id.d13);
        D13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question16 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question16", question16);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D14 = (Button) findViewById(R.id.d14);
        D14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question17 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question17", question17);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D15 = (Button) findViewById(R.id.d15);
        D15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question18 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question18", question18);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D16 = (Button) findViewById(R.id.d16);
        D16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question19 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question19", question19);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D17 = (Button) findViewById(R.id.d17);
        D17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question20 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question20", question20);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D18 = (Button) findViewById(R.id.d18);
        D18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question21 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question21", question21);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D19 = (Button) findViewById(R.id.d19);
        D19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question22 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question22", question22);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D20 = (Button) findViewById(R.id.d20);
        D20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question23 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question23", question23);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D21 = (Button) findViewById(R.id.d21);
        D21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question24 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question24", question24);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D22 = (Button) findViewById(R.id.d22);
        D22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question25 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question25", question25);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D23 = (Button) findViewById(R.id.d23);
        D23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question26 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question26", question26);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D24 = (Button) findViewById(R.id.d24);
        D24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question27 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question27", question27);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D25 = (Button) findViewById(R.id.d25);
        D25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question28 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question28", question28);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D26 = (Button) findViewById(R.id.d26);
        D26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question29 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question29", question29);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D27 = (Button) findViewById(R.id.d27);
        D27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question30 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question30", question30);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D28 = (Button) findViewById(R.id.d28);
        D28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question31 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question31", question31);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D29 = (Button) findViewById(R.id.d29);
        D29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question32 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question32", question32);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button D30 = (Button) findViewById(R.id.d30);
        D30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question33 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question33", question33);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button FD1 = (Button) findViewById(R.id.fd1);
        FD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question34 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question34", question34);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });

        Button FD2 = (Button) findViewById(R.id.fd2);
        FD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String question35 = questionText.getText().toString();
                Intent i = new Intent(DailyUsage.this, ExpensesRecord.class);
                i.putExtra("question35", question35);
                startActivityForResult(i, REQUEST_CODE1);
            }
        });


        // calculator
        Button button0 = (Button) findViewById(R.id.button19);
        Button button1 = (Button) findViewById(R.id.button8);
        Button button2 = (Button) findViewById(R.id.button9);
        Button button3 = (Button) findViewById(R.id.button10);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button12);
        Button button8 = (Button) findViewById(R.id.button13);
        Button button9 = (Button) findViewById(R.id.button14);
        Button button10 = (Button) findViewById(R.id.button18);
        Button buttonAdd = (Button) findViewById(R.id.button11);
        Button buttonSub = (Button) findViewById(R.id.button7);
        Button buttonMul = (Button) findViewById(R.id.button22);
        Button buttonDivision = (Button) findViewById(R.id.button21);
        Button buttonC = (Button) findViewById(R.id.button20);
        Button buttonEqual = (Button) findViewById(R.id.button24);
        Screen = (EditText) findViewById(R.id.txtScreen);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Screen == null) {
                    Screen.setText("");
                } else {
                    fValue = Float.parseFloat(Screen.getText() + "");
                    Addition = true;
                    Screen.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fValue = Float.parseFloat(Screen.getText() + "");
                Subtract = true;
                Screen.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fValue = Float.parseFloat(Screen.getText() + "");
                Multiply = true;
                Screen.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fValue = Float.parseFloat(Screen.getText() + "");
                Divide = true;
                Screen.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secValue = Float.parseFloat(Screen.getText() + "");

                if (Addition == true) {
                    Screen.setText(fValue + secValue + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    Screen.setText(fValue - secValue + "");
                    Subtract = false;
                }

                if (Multiply == true) {
                    Screen.setText(fValue * secValue + "");
                    Multiply = false;
                }

                if (Divide == true) {
                    Screen.setText(fValue / secValue + "");
                    Divide = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText("");
            }
        });



        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + ".");

            }
        });


        // intent to add in income
        Button addIn = (Button) findViewById(R.id.btnAdd);
        addIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DailyUsage.this, IncomeRecord.class);
                startActivity(intent);
            }
        });



        // intent to record expenses
        Button deduct = (Button) findViewById(R.id.btnDeduct);
        deduct.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DailyUsage.this, ExpensesRecord.class);
                startActivity(intent);
            }
        });



        // intent to setting page
        ImageButton IBSetting = (ImageButton) findViewById(R.id.imageButton3);
        IBSetting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DailyUsage.this, Setting.class);
                startActivity(intent);
            }
        });



    }



}