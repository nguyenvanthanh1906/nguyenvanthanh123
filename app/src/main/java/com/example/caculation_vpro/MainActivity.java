package com.example.caculation_vpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, enter, cong, tru, nhan, chia, clear, clearall, cham, lichsu, sin, cos, tan, log, ln;
    boolean i = false;
    TextView ed1, ed2, ed3, ed4;
    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnOne);
        b2 = findViewById(R.id.btnTwo);
        b3 = findViewById(R.id.btnThree);
        b4 = findViewById(R.id.btnFour);
        b5 = findViewById(R.id.btnFive);
        b6 = findViewById(R.id.btnSix);
        b7 = findViewById(R.id.btnSeven);
        b8 = findViewById(R.id.btnEight);
        b9 = findViewById(R.id.btnNine);
        b0 = findViewById(R.id.btnZero);
        cong = findViewById(R.id.btnCong);
        tru = findViewById(R.id.btnTru);
        nhan = findViewById(R.id.btnNhan);
        chia = findViewById(R.id.btnChia);
        sin = findViewById(R.id.btnSin);
        cos = findViewById(R.id.btnCos);
        tan = findViewById(R.id.btnTan);
        log = findViewById(R.id.btnLog);
        ln = findViewById(R.id.btnLn);
        enter = findViewById(R.id.btnEnter);
        clear = findViewById(R.id.btnClear);
        ed1 = findViewById(R.id.edit1);
        ed2 = findViewById(R.id.edit2);
        ed3 = findViewById(R.id.edit3);
        ed4 = findViewById(R.id.edit4);
        clearall = findViewById(R.id.btnClearAll);
        cham = findViewById(R.id.btnPoint);
        lichsu = findViewById(R.id.btnLichsu);
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!ed1.getText().toString().equals("")) {
                    if ((ed1.getText().toString().length() > 4)) {
                        if (!(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("cos(")) && !(ed1.getText().toString().substring(0, 4).equals("tan(")) && !(ed1.getText().toString().substring(0, 3).equals("ln("))) {
                            if (ed2.getText().toString().equals("")) {
                                if (!i) {
                                    ed2.setText(ed2.getText() + "+");
                                    i = true;
                                }
                            } else if (!(ed4.getText().toString().equals(""))) {
                                ed1.setText(ed4.getText().toString());
                                ed2.setText("");
                                ed2.setText(ed2.getText() + "+");
                                ed3.setText("");
                                ed4.setText("");
                            }
                        }
                    } else {
                        if (ed2.getText().toString().equals("")) {
                            if (!i) {
                                ed2.setText(ed2.getText() + "+");
                                i = true;
                            }
                        } else if (!(ed4.getText().toString().equals(""))) {
                            ed1.setText(ed4.getText().toString());
                            ed2.setText("");
                            ed2.setText(ed2.getText() + "+");
                            ed3.setText("");
                            ed4.setText("");
                        }
                    }
                }
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!ed1.getText().toString().equals("")) {
                    if ((ed1.getText().toString().length() > 4)) {
                        if (!(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("cos(")) && !(ed1.getText().toString().substring(0, 4).equals("tan(")) && !(ed1.getText().toString().substring(0, 3).equals("ln("))) {
                            if (ed2.getText().toString().equals("")) {
                                if (!i) {
                                    ed2.setText(ed2.getText() + "-");
                                    i = true;
                                }
                            } else if (!(ed4.getText().toString().equals(""))) {
                                ed1.setText(ed4.getText().toString());
                                ed2.setText("");
                                ed2.setText(ed2.getText() + "-");
                                ed3.setText("");
                                ed4.setText("");
                            }
                        }
                    } else {
                        if (ed2.getText().toString().equals("")) {
                            if (!i) {
                                ed2.setText(ed2.getText() + "-");
                                i = true;
                            }
                        } else if (!(ed4.getText().toString().equals(""))) {
                            ed1.setText(ed4.getText().toString());
                            ed2.setText("");
                            ed2.setText(ed2.getText() + "-");
                            ed3.setText("");
                            ed4.setText("");
                        }
                    }
                }
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!ed1.getText().toString().equals("")) {
                    if ((ed1.getText().toString().length() > 4)) {
                        if (!(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("cos(")) && !(ed1.getText().toString().substring(0, 4).equals("tan(")) && !(ed1.getText().toString().substring(0, 3).equals("ln("))) {
                            if (ed2.getText().toString().equals("")) {
                                if (!i) {
                                    ed2.setText(ed2.getText() + "x");
                                    i = true;
                                }
                            } else if (!(ed4.getText().toString().equals(""))) {
                                ed1.setText(ed4.getText().toString());
                                ed2.setText("");
                                ed2.setText(ed2.getText() + "x");
                                ed3.setText("");
                                ed4.setText("");
                            }
                        }
                    } else {
                        if (ed2.getText().toString().equals("")) {
                            if (!i) {
                                ed2.setText(ed2.getText() + "x");
                                i = true;
                            }
                        } else if (!(ed4.getText().toString().equals(""))) {
                            ed1.setText(ed4.getText().toString());
                            ed2.setText("");
                            ed2.setText(ed2.getText() + "x");
                            ed3.setText("");
                            ed4.setText("");
                        }
                    }
                }
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!ed1.getText().toString().equals("")) {
                    if ((ed1.getText().toString().length() > 4)) {
                        if (!(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("sin(")) && !(ed1.getText().toString().substring(0, 4).equals("cos(")) && !(ed1.getText().toString().substring(0, 4).equals("tan(")) && !(ed1.getText().toString().substring(0, 3).equals("ln("))) {
                            if (ed2.getText().toString().equals("")) {
                                if (!i) {
                                    ed2.setText(ed2.getText() + ":");
                                    i = true;
                                }
                            } else if (!(ed4.getText().toString().equals(""))) {
                                ed1.setText(ed4.getText().toString());
                                ed2.setText("");
                                ed2.setText(ed2.getText() + ":");
                                ed3.setText("");
                                ed4.setText("");
                            }
                        }
                    } else {
                        if (ed2.getText().toString().equals("")) {
                            if (!i) {
                                ed2.setText(ed2.getText() + ":");
                                i = true;
                            }
                        } else if (!(ed4.getText().toString().equals(""))) {
                            ed1.setText(ed4.getText().toString());
                            ed2.setText("");
                            ed2.setText(ed2.getText() + ":");
                            ed3.setText("");
                            ed4.setText("");
                        }
                    }
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "1");
                    } else {
                        ed1.setText(ed1.getText() + "1");
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "2");
                    } else {
                        ed1.setText(ed1.getText() + "2");
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "3");
                    } else {
                        ed1.setText(ed1.getText() + "3");
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "4");
                    } else {
                        ed1.setText(ed1.getText() + "4");
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "5");
                    } else {
                        ed1.setText(ed1.getText() + "5");
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "6");
                    } else {
                        ed1.setText(ed1.getText() + "6");
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "7");
                    } else {
                        ed1.setText(ed1.getText() + "7");
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "8");
                    } else {
                        ed1.setText(ed1.getText() + "8");
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "9");
                    } else {
                        ed1.setText(ed1.getText() + "9");
                    }
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + "0");
                    } else {
                        ed1.setText(ed1.getText() + "0");
                    }
                }
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    ed1.setText("sin(");
                    ed2.setText("");
                    ed3.setText("");
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    ed1.setText("cos(");
                    ed2.setText("");
                    ed3.setText("");
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    ed1.setText("tan(");
                    ed2.setText("");
                    ed3.setText("");
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    ed1.setText("log(");
                    ed2.setText("");
                    ed3.setText("");
                }
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    ed1.setText("ln(");
                    ed2.setText("");
                    ed3.setText("");
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((!(ed3.getText().toString().equals(""))) && ((ed4.getText().toString().equals("")))) {

                    String dau = ed2.getText().toString();
                    switch (dau) {
                        case "+":
                            caculation(1);
                            break;
                        case "-":
                            caculation(2);
                            break;
                        case "x":
                            caculation(3);
                            break;
                        case ":":
                            caculation(4);
                            break;

                    }
                    float a = Float.parseFloat(ed1.getText().toString());
                    String mdau = ed2.getText().toString();
                    float b = Float.parseFloat(ed3.getText().toString());
                    float c = Float.parseFloat(ed4.getText().toString());

                    arrayList.add(a + mdau + b + "=" + c);
                }
                if (ed2.getText().toString().equals("")) {
                    caculation(5);
                    String a=ed1.getText().toString();
                    Float b=Float.parseFloat(ed4.getText().toString());
                    arrayList.add(a+")"+"="+b);
                }


            }
        });
        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    if (i) {
                        ed3.setText(ed3.getText() + ".");
                    } else {
                        ed1.setText(ed1.getText() + ".");
                    }
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed4.getText().toString().equals("")) {
                    String text1 = ed1.getText().toString();
                    String text2 = ed2.getText().toString();
                    String text3 = ed3.getText().toString();
                    if ((text2.equals("")) && (text3.equals(""))) {
                        if ((ed1.getText().toString().length()) != 0) {
                            if (text1.length() == 4) {
                                if ((ed1.getText().toString().substring(0, 4).equals("sin(")) && (text1.length() == 4)) {
                                    ed1.setText("");
                                } else if ((ed1.getText().toString().substring(0, 4).equals("cos(")) && (text1.length() == 4)) {
                                    ed1.setText("");
                                } else if ((ed1.getText().toString().substring(0, 4).equals("tan(")) && (text1.length() == 4)) {
                                    ed1.setText("");
                                } else if ((ed1.getText().toString().substring(0, 4).equals("log(")) && (text1.length() == 4)) {
                                    ed1.setText("");
                                } else  {
                                    ed1.setText((ed1.getText().toString()).substring(0, (ed1.getText().toString()).length() - 1));
                                }
                            }
                            if (text1.length() == 3) {
                                if ((ed1.getText().toString().substring(0, 3).equals("ln(")) && (text1.length() == 3)) {
                                    ed1.setText("");
                                } else {
                                    ed1.setText((ed1.getText().toString()).substring(0, (ed1.getText().toString()).length() - 1));
                                }
                            }
                            if (text1.length() != 4 && text1.length() != 3) {
                                ed1.setText((ed1.getText().toString()).substring(0, (ed1.getText().toString()).length() - 1));
                            }


                        }
                    }
                    if (text3.equals("") && (!(text1.equals("")))) {
                        if ((ed2.getText().toString().length()) != 0) {
                            ed2.setText("");
                            i = false;
                        }
                    }
                    if (!(text2.equals(""))) {
                        if ((ed3.getText().toString().length()) != 0) {
                            ed3.setText((ed3.getText().toString()).substring(0, (ed3.getText().toString()).length() - 1));
                            if (text2.equals("")) {
                                i = false;
                            }
                        }
                    }
                }
            }
        });
        clearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                i = false;
            }
        });

        lichsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, History.class);

                Bundle bundle = new Bundle();
                bundle.putStringArrayList("arraylist", arrayList);
                intent.putExtra("package", bundle);
                startActivity(intent);
            }
        });

    }

    float add(float a, float b) {
        return a + b;
    }

    float slib(float a, float b) {
        return a - b;
    }

    float muv(float a, float b) {
        return a * b;
    }

    float div(float a, float b) {
        return a / b;
    }

    public void caculation(int k) {
        if (ed1.getText().toString().length() > 4) {

            if (ed1.getText().toString().substring(0, 4).equals("sin(") || ed1.getText().toString().substring(0, 4).equals("cos(") || ed1.getText().toString().substring(0, 4).equals("tan(") || ed1.getText().toString().substring(0, 4).equals("log(") ) {
                if (ed1.getText().toString().substring(0, 4).equals("sin(")) {
                    float a = Float.parseFloat(ed1.getText().toString().substring(4));
                    ed4.setText(String.valueOf(Math.sin(a)));
                }
                if (ed1.getText().toString().substring(0, 4).equals("cos(")) {
                    float a = Float.parseFloat(ed1.getText().toString().substring(4));
                    ed4.setText(String.valueOf(Math.cos(a)));
                }
                if (ed1.getText().toString().substring(0, 4).equals("tan(")) {
                    float a = Float.parseFloat(ed1.getText().toString().substring(4));
                    ed4.setText(String.valueOf(Math.tan(a)));
                }
                if (ed1.getText().toString().substring(0, 4).equals("log(")) {
                    float a = Float.parseFloat(ed1.getText().toString().substring(4));
                    ed4.setText(String.valueOf(Math.log10(a)));
                }


            } else {
                float a = Float.parseFloat(ed1.getText().toString());
                float b = Float.parseFloat(ed3.getText().toString());
                String kq_cong = String.valueOf(add(a, b));
                String kq_tru = String.valueOf(slib(a, b));
                String kq_nhan = String.valueOf(muv(a, b));
                String kq_chia = String.valueOf(div(a, b));
                if (k == 1) {
                    ed4.setText(kq_cong);

                }
                if (k == 2) {
                    ed4.setText(kq_tru);

                }
                if (k == 3) {
                    ed4.setText(kq_nhan);

                }
                if (k == 4) {
                    ed4.setText(kq_chia);

                }
            }


        } else if (ed1.getText().toString().length() > 3) {
            if (ed1.getText().toString().substring(0, 3).equals("ln(")) {
                float a = Float.parseFloat(ed1.getText().toString().substring(3));
                ed4.setText(String.valueOf((Math.log(a))/(Math.log(2.718281828))));
            }
        }else {
            float a = Float.parseFloat(ed1.getText().toString());
            float b = Float.parseFloat(ed3.getText().toString());
            String kq_cong = String.valueOf(add(a, b));
            String kq_tru = String.valueOf(slib(a, b));
            String kq_nhan = String.valueOf(muv(a, b));
            String kq_chia = String.valueOf(div(a, b));
            if (k == 1) {
                ed4.setText(kq_cong);

            }
            if (k == 2) {
                ed4.setText(kq_tru);

            }
            if (k == 3) {
                ed4.setText(kq_nhan);

            }
            if (k == 4) {
                ed4.setText(kq_chia);

            }
        }


    }
}