package com.ct0292477.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ExpensesRecord extends AppCompatActivity {

    //total expense
    public double nume1, nume2, nume3, nume4, nume5, nume6, nume7, nume8, nume9, nume10,
            nume11, nume12, nume13, nume14, nume15, nume16, nume17, nume18, nume19, nume20,
            nume21, nume22, nume23, nume24, nume25, nume26, nume27, nume28, nume29, nume30,
            nume31, nume32, nume33, nume34, nume35, sume, sumeA, subExp;
    public EditText fteNum, sceNum, treNum, freNum, fifeNum, sixeNum, seveNum, eigeNum, nineNum, teneNum,
            eleeNum, tweleNum, thheNum, foreNum, fiteNum, siteNum, seteNum, eiteNum, niteNum, twyeNum,
            twoeNum, twteNum, twreNum, twfeNum, twieNum, twseNum, twveNum, tweeNum, twneNum, thieNum,
            thoeNum, thteNum, threNum, thfeNum, thveNum;
    public Button buttonEx;

    private CheckBox hide3, hide4, hide5;
    private EditText editText3, editText4, editText5;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses_record);

        // total expense
        final TextView expenses, expensesA, Subexpenses;

        fteNum = (EditText) findViewById(R.id.getpDay1);
        sceNum = (EditText) findViewById(R.id.getpDay2);
        treNum = (EditText) findViewById(R.id.getpDay3);
        freNum = (EditText) findViewById(R.id.getDay1);
        fifeNum = (EditText) findViewById(R.id.getDay2);
        sixeNum = (EditText) findViewById(R.id.getDay3);
        seveNum = (EditText) findViewById(R.id.getDay4);
        eigeNum = (EditText) findViewById(R.id.getDay5);
        nineNum = (EditText) findViewById(R.id.getDay6);
        teneNum = (EditText) findViewById(R.id.getDay7);
        eleeNum = (EditText) findViewById(R.id.getDay8);
        tweleNum = (EditText) findViewById(R.id.getDay9);
        thheNum = (EditText) findViewById(R.id.getDay10);
        foreNum = (EditText) findViewById(R.id.getDay11);
        fiteNum = (EditText) findViewById(R.id.getDay12);
        siteNum = (EditText) findViewById(R.id.getDay13);
        seteNum = (EditText) findViewById(R.id.getDay14);
        eiteNum = (EditText) findViewById(R.id.getDay15);
        niteNum = (EditText) findViewById(R.id.getDay16);
        twyeNum = (EditText) findViewById(R.id.getDay17);
        twoeNum = (EditText) findViewById(R.id.getDay18);
        twteNum = (EditText) findViewById(R.id.getDay19);
        twreNum = (EditText) findViewById(R.id.getDay20);
        twfeNum = (EditText) findViewById(R.id.getDay21);
        twieNum = (EditText) findViewById(R.id.getDay22);
        twseNum = (EditText) findViewById(R.id.getDay23);
        twveNum = (EditText) findViewById(R.id.getDay24);
        tweeNum = (EditText) findViewById(R.id.getDay25);
        twneNum = (EditText) findViewById(R.id.getDay26);
        thieNum = (EditText) findViewById(R.id.getDay27);
        thoeNum = (EditText) findViewById(R.id.getDay28);
        thteNum = (EditText) findViewById(R.id.getDay29);
        threNum = (EditText) findViewById(R.id.getDay30);
        thfeNum = (EditText) findViewById(R.id.getfDay1);
        thveNum = (EditText) findViewById(R.id.getfDay2);


        expenses = (TextView) findViewById(R.id.ExOct);
        expensesA = (TextView) findViewById(R.id.ExNov);
        Subexpenses = (TextView) findViewById(R.id.TotalEx);

        Button buttonEx = (Button) findViewById(R.id.sumEx);
        buttonEx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                nume1 = Double.parseDouble(fteNum.getText().toString());
                nume2 = Double.parseDouble(sceNum.getText().toString());
                nume3 = Double.parseDouble(treNum.getText().toString());
                nume4 = Double.parseDouble(freNum.getText().toString());
                nume5 = Double.parseDouble(fifeNum.getText().toString());
                nume6 = Double.parseDouble(sixeNum.getText().toString());
                nume7 = Double.parseDouble(seveNum.getText().toString());
                nume8 = Double.parseDouble(eigeNum.getText().toString());
                nume9 = Double.parseDouble(nineNum.getText().toString());
                nume10 = Double.parseDouble(teneNum.getText().toString());
                nume11 = Double.parseDouble(eleeNum.getText().toString());
                nume12 = Double.parseDouble(tweleNum.getText().toString());
                nume13 = Double.parseDouble(thheNum.getText().toString());
                nume14 = Double.parseDouble(foreNum.getText().toString());
                nume15 = Double.parseDouble(fiteNum.getText().toString());
                nume16 = Double.parseDouble(siteNum.getText().toString());
                nume17 = Double.parseDouble(seteNum.getText().toString());
                nume18 = Double.parseDouble(eiteNum.getText().toString());
                nume19 = Double.parseDouble(niteNum.getText().toString());
                nume20 = Double.parseDouble(twyeNum.getText().toString());
                nume21 = Double.parseDouble(twoeNum.getText().toString());
                nume22 = Double.parseDouble(twteNum.getText().toString());
                nume23 = Double.parseDouble(twreNum.getText().toString());
                nume24 = Double.parseDouble(twfeNum.getText().toString());
                nume25 = Double.parseDouble(twieNum.getText().toString());
                nume26 = Double.parseDouble(twseNum.getText().toString());
                nume27 = Double.parseDouble(twveNum.getText().toString());
                nume28 = Double.parseDouble(tweeNum.getText().toString());
                nume29 = Double.parseDouble(twneNum.getText().toString());
                nume30 = Double.parseDouble(thieNum.getText().toString());
                nume31 = Double.parseDouble(thoeNum.getText().toString());
                nume32 = Double.parseDouble(thteNum.getText().toString());
                nume33 = Double.parseDouble(threNum.getText().toString());
                nume34 = Double.parseDouble(thfeNum.getText().toString());
                nume35 = Double.parseDouble(thveNum.getText().toString());

                sume = nume1 + nume2 + nume3;
                expenses.setText(Double.toString(sume));

                sumeA = nume4 + nume5 + nume6 + nume7 + nume8 + nume9 + nume10 +
                        nume11 + nume12 + nume13 + nume14 + nume15 + nume16 + nume17 + nume18 + nume19 + nume20 +
                        nume21 + nume22 + nume23 + nume24 + nume25 + nume26 + nume27 + nume28 + nume29 + nume30 +
                        nume31 + nume32 + nume33;
                expensesA.setText(Double.toString(sumeA));

                subExp = sume + sumeA;
                Subexpenses.setText(Double.toString(subExp));
            }
        });


        Button ok = (Button) findViewById(R.id.btnNextp);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ExpensesRecord.this, DailyUsage.class);
                startActivity(intent);
            }
        });

        final CheckBox hide3 = (CheckBox) findViewById(R.id.checkBox11);
        final CheckBox hide4 = (CheckBox) findViewById(R.id.checkBox12);
        final CheckBox hide5 = (CheckBox) findViewById(R.id.checkBox13);
        final TextView editText3 = (TextView) findViewById(R.id.ExOct);
        final TextView editText4 = (TextView) findViewById(R.id.ExNov);
        final TextView editText5 = (TextView) findViewById(R.id.TotalEx);

        Button buttonHide = (Button) findViewById(R.id.HideEx);
        buttonHide.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (hide3.isChecked()) {
                    editText3.setVisibility(View.GONE);
                    hide3.setChecked(true);
                    if (hide4.isChecked()) {
                        editText4.setVisibility(View.GONE);
                        hide4.setChecked(true);
                        if (hide5.isChecked()) {
                            editText5.setVisibility(View.GONE);
                            hide5.setChecked(true);
                        }
                    }
                }

                if (hide4.isChecked()) {
                    editText4.setVisibility(View.GONE);
                    hide4.setChecked(true);
                    if (hide5.isChecked()) {
                        editText5.setVisibility(View.GONE);
                        hide5.setChecked(true);
                        if (hide3.isChecked()) {
                            editText3.setVisibility(View.GONE);
                            hide3.setChecked(true);
                        }
                    }
                }

                if (hide5.isChecked()) {
                    editText5.setVisibility(View.GONE);
                    hide5.setChecked(true);
                    if (hide3.isChecked()) {
                        editText3.setVisibility(View.GONE);
                        hide3.setChecked(true);
                        if (hide4.isChecked()) {
                            editText4.setVisibility(View.GONE);
                            hide4.setChecked(true);
                        }
                    }
                } else {
                    if (!hide3.isChecked()) {
                        editText3.setVisibility(View.VISIBLE);
                        hide3.setChecked(true);
                        if (!hide4.isChecked()) {
                            editText4.setVisibility(View.VISIBLE);
                            hide4.setChecked(true);
                            if (!hide5.isChecked()) {
                                editText5.setVisibility(View.VISIBLE);
                                hide5.setChecked(true);
                            }
                        }
                    }

                }
            }
        });
    }
}