package com.ct0292477.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class IncomeRecord extends AppCompatActivity {

    // total income
    public double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10,
            num11, num12, num13, num14, num15, num16, num17, num18, num19, num20,
            num21, num22, num23, num24, num25, num26, num27, num28, num29, num30,
            num31, num32, num33, num34, num35, sum, sumA, subIncome;
    public EditText ftNum, scNum, trNum, frNum, fifNum, sixNum, sevNum, eigNum, ninNum, tenNum, eleNum, twelNum, thhNum, forNum, fitNum, sitNum, setNum, eitNum, nitNum, twyNum,
            twoNum, twtNum, twrNum, twfNum, twiNum, twsNum, twvNum, tweNum, twnNum, thiNum,
            thoNum, thtNum, thrNum, thfNum, thvNum;
    public Button buttonIn;

    private CheckBox hide, hide1, hide2;
    private EditText editText1, editText2, editText3;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_record);
        //total income
        final TextView income, incomeA, SubIncome;

        ftNum = (EditText) findViewById(R.id.getpiDay1);
        scNum = (EditText) findViewById(R.id.getpiDay2);
        trNum = (EditText) findViewById(R.id.getpiDay3);
        frNum = (EditText) findViewById(R.id.getiDay1);
        fifNum = (EditText) findViewById(R.id.getiDay2);
        sixNum = (EditText) findViewById(R.id.getiDay3);
        sevNum = (EditText) findViewById(R.id.getiDay4);
        eigNum = (EditText) findViewById(R.id.getiDay5);
        ninNum = (EditText) findViewById(R.id.getiDay6);
        tenNum = (EditText) findViewById(R.id.getiDay7);
        eleNum = (EditText) findViewById(R.id.getiDay8);
        twelNum = (EditText) findViewById(R.id.getiDay9);
        thhNum = (EditText) findViewById(R.id.getiDay10);
        forNum = (EditText) findViewById(R.id.getiDay11);
        fitNum = (EditText) findViewById(R.id.getiDay12);
        sitNum = (EditText) findViewById(R.id.getiDay13);
        setNum = (EditText) findViewById(R.id.getiDay14);
        eitNum = (EditText) findViewById(R.id.getiDay15);
        nitNum = (EditText) findViewById(R.id.getiDay16);
        twyNum = (EditText) findViewById(R.id.getiDay17);
        twoNum = (EditText) findViewById(R.id.getiDay18);
        twtNum = (EditText) findViewById(R.id.getiDay19);
        twrNum = (EditText) findViewById(R.id.getiDay20);
        twfNum = (EditText) findViewById(R.id.getiDay21);
        twiNum = (EditText) findViewById(R.id.getiDay22);
        twsNum = (EditText) findViewById(R.id.getiDay23);
        twvNum = (EditText) findViewById(R.id.getiDay24);
        tweNum = (EditText) findViewById(R.id.getiDay25);
        twnNum = (EditText) findViewById(R.id.getiDay26);
        thiNum = (EditText) findViewById(R.id.getiDay27);
        thoNum = (EditText) findViewById(R.id.getiDay28);
        thtNum = (EditText) findViewById(R.id.getiDay29);
        thrNum = (EditText) findViewById(R.id.getiDay30);
        thfNum = (EditText) findViewById(R.id.getifDay1);
        thvNum = (EditText) findViewById(R.id.getifDay2);

        income = (TextView) findViewById(R.id.InOct);
        incomeA = (TextView) findViewById(R.id.ExNov);
        SubIncome = (TextView) findViewById(R.id.Totalin);

        Button buttonIn = (Button) findViewById(R.id.sum);
        buttonIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = Double.parseDouble(ftNum.getText().toString());
                num2 = Double.parseDouble(scNum.getText().toString());
                num3 = Double.parseDouble(trNum.getText().toString());
                num4 = Double.parseDouble(frNum.getText().toString());
                num5 = Double.parseDouble(fifNum.getText().toString());
                num6 = Double.parseDouble(sixNum.getText().toString());
                num7 = Double.parseDouble(sevNum.getText().toString());
                num8 = Double.parseDouble(eigNum.getText().toString());
                num9 = Double.parseDouble(ninNum.getText().toString());
                num10 = Double.parseDouble(tenNum.getText().toString());
                num11 = Double.parseDouble(eleNum.getText().toString());
                num12 = Double.parseDouble(twelNum.getText().toString());
                num13 = Double.parseDouble(thhNum.getText().toString());
                num14 = Double.parseDouble(forNum.getText().toString());
                num15 = Double.parseDouble(fitNum.getText().toString());
                num16 = Double.parseDouble(sitNum.getText().toString());
                num17 = Double.parseDouble(setNum.getText().toString());
                num18 = Double.parseDouble(eitNum.getText().toString());
                num19 = Double.parseDouble(nitNum.getText().toString());
                num20 = Double.parseDouble(twyNum.getText().toString());
                num21 = Double.parseDouble(twoNum.getText().toString());
                num22 = Double.parseDouble(twtNum.getText().toString());
                num23 = Double.parseDouble(twrNum.getText().toString());
                num24 = Double.parseDouble(twfNum.getText().toString());
                num25 = Double.parseDouble(twiNum.getText().toString());
                num26 = Double.parseDouble(twsNum.getText().toString());
                num27 = Double.parseDouble(twvNum.getText().toString());
                num28 = Double.parseDouble(tweNum.getText().toString());
                num29 = Double.parseDouble(twnNum.getText().toString());
                num30 = Double.parseDouble(thiNum.getText().toString());
                num31 = Double.parseDouble(thoNum.getText().toString());
                num32 = Double.parseDouble(thtNum.getText().toString());
                num33 = Double.parseDouble(thrNum.getText().toString());
                num34 = Double.parseDouble(thfNum.getText().toString());
                num35 = Double.parseDouble(thvNum.getText().toString());

                sum = num1 + num2 + num3;
                income.setText(Double.toString(sum));

                sumA = num4 + num5 + num6 + num7 + num8 + num9 + num10 +
                        num11 + num12 + num13 + num14 + num15 + num16 + num17 + num18 + num19 + num20 +
                        num21 + num22 + num23 + num24 + num25 + num26 + num27 + num28 + num29 + num30 +
                        num31 + num32 + num33;
                incomeA.setText(Double.toString(sumA));

                subIncome = sum + sumA;
                SubIncome.setText(Double.toString(subIncome));


                Button ok = (Button) findViewById(R.id.btnNext);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(IncomeRecord.this, DailyUsage.class);
                        startActivity(intent);
                    }
                });

                final CheckBox hide = (CheckBox) findViewById(R.id.checkBox8);
                final CheckBox hide1 = (CheckBox) findViewById(R.id.checkBox9);
                final CheckBox hide2 = (CheckBox) findViewById(R.id.checkBox10);
                final TextView editText1 = (TextView) findViewById(R.id.InOct);
                final TextView editText2 = (TextView) findViewById(R.id.ExNov);
                final TextView editText3 = (TextView) findViewById(R.id.Totalin);

                Button buttonHide = (Button) findViewById(R.id.Hide);
                buttonHide.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        if (hide.isChecked()) {
                            editText1.setVisibility(View.GONE);
                            hide.setChecked(true);
                            if (hide1.isChecked()) {
                                editText2.setVisibility(View.GONE);
                                hide1.setChecked(true);
                                if (hide2.isChecked()) {
                                    editText3.setVisibility(View.GONE);
                                    hide2.setChecked(true);
                                }
                            }
                        }

                        if (hide1.isChecked()) {
                            editText2.setVisibility(View.GONE);
                            hide1.setChecked(true);
                            if (hide2.isChecked()) {
                                editText3.setVisibility(View.GONE);
                                hide2.setChecked(true);
                                if (hide.isChecked()) {
                                    editText1.setVisibility(View.GONE);
                                    hide.setChecked(true);
                                }
                            }
                        }

                        if(hide2.isChecked()) {
                            editText3.setVisibility(View.GONE);
                            hide2.setChecked(true);
                            if (hide.isChecked()) {
                                editText1.setVisibility(View.GONE);
                                hide.setChecked(true);
                                if (hide1.isChecked()) {
                                    editText2.setVisibility(View.GONE);
                                    hide1.setChecked(true);
                                }
                            }
                        }

                        else {
                            if (!hide.isChecked()) {
                                editText1.setVisibility(View.VISIBLE);
                                hide.setChecked(true);
                                if (!hide1.isChecked()) {
                                    editText2.setVisibility(View.VISIBLE);
                                    hide1.setChecked(true);
                                    if (!hide2.isChecked()) {
                                        editText3.setVisibility(View.VISIBLE);
                                        hide2.setChecked(true);
                                    }
                                }
                            }

                        }
                    }
                });
            }
        });
    }
}
