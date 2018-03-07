package com.example.juanesteban.calculadorderesistencia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    Spinner Banda_1, Banda_2, Multiplicador, Tolerancia;
    String Color_1, Color_2, Color_3, Color_4, valor_1, valor_2, valor_4,Aux,Aux_1,Aux_2;
    TextView Resistencia,Color1,Color2,Color3,Color4;
    Double valor_3, x1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resistencia = findViewById(R.id.Resistencia);
        Color1 =findViewById(R.id.Color1);
        Color2 =findViewById(R.id.Color2);
        Color3 =findViewById(R.id.Color3);
        Color4 =findViewById(R.id.Color4);


        Banda_1 = findViewById(R.id.Banda_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_1 = ArrayAdapter.createFromResource(this, R.array.Banda_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        Banda_1.setAdapter(adapter_1);
        Banda_1.setOnItemSelectedListener(this);

        Banda_2 = findViewById(R.id.Banda_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_2 = ArrayAdapter.createFromResource(this,
                R.array.Banda_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        Banda_2.setAdapter(adapter_2);
        Banda_2.setOnItemSelectedListener(this);

        Multiplicador = findViewById(R.id.Multiplicador);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_3 = ArrayAdapter.createFromResource(this,
                R.array.Multiplicador, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        Multiplicador.setAdapter(adapter_3);
        Multiplicador.setOnItemSelectedListener(this);

        Tolerancia = findViewById(R.id.Tolerancia);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_4 = ArrayAdapter.createFromResource(this,
                R.array.Tolerancia, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        Tolerancia.setAdapter(adapter_4);
        Tolerancia.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        Color_1 = parent.getItemAtPosition(i).toString();
        Color_2 = parent.getItemAtPosition(i).toString();
        Color_3 = parent.getItemAtPosition(i).toString();
        Color_4 = parent.getItemAtPosition(i).toString();

        switch (parent.getId()) {

            case R.id.Banda_1:

                if (Color_1.equals("Marron")) {
                    valor_1 = "1";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Marron));

                }
                if (Color_1.equals("Rojo")) {
                    valor_1 = "2";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Rojo));
                }
                if (Color_1.equals("Naranja")) {
                    valor_1 = "3";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Naranja));
                }
                if (Color_1.equals("Amarillo")) {
                    valor_1 = "4";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                }
                if (Color_1.equals("Verde")) {
                    valor_1 = "5";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Verde));
                }
                if (Color_1.equals("Azul")) {
                    valor_1 = "6";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Azul));
                }
                if (Color_1.equals("Violeta")) {
                    valor_1 = "7";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Violeta));
                }
                if (Color_1.equals("Gris")) {
                    valor_1 = "8";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Gris));
                }
                if (Color_1.equals("Blanco")) {
                    valor_1 = "9";
                    Color1.setBackgroundColor(getResources().getColor(R.color.Blanco));
                }


                break;


            case R.id.Banda_2:
                if (Color_2.equals("Negro")) {
                    valor_2 = "0";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Negro));
                }
                if (Color_2.equals("Marron")) {
                    valor_2 = "1";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Marron));
                }
                if (Color_2.equals("Rojo")) {
                    valor_2 = "2";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Rojo));
                }
                if (Color_2.equals("Naranja")) {
                    valor_2 = "3";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Naranja));
                }
                if (Color_2.equals("Amarillo")) {
                    valor_2 = "4";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                }
                if (Color_2.equals("Verde")) {
                    valor_2 = "5";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Verde));
                }
                if (Color_2.equals("Azul")) {
                    valor_2 = "6";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Azul));
                }
                if (Color_2.equals("Violeta")) {
                    valor_2 = "7";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Violeta));
                }
                if (Color_2.equals("Gris")) {
                    valor_2 = "8";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Gris));
                }
                if (Color_2.equals("Blanco")) {
                    valor_2 = "9";
                    Color2.setBackgroundColor(getResources().getColor(R.color.Blanco));
                }

                break;

            case R.id.Multiplicador:
                if (Color_3.equals("Negro")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2));
                    Aux="Ω";
                    Aux_1="";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Negro));
                }

                if (Color_3.equals("Marron")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2)*10);
                    Aux="0 Ω";
                    Aux_1="";
                    Aux_2="Ω";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Marron));
                }

                if (Color_3.equals("Rojo")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2)/10);
                    Aux="kΩ";
                    Aux_1=".";
                    Aux_2="kΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Rojo));
                }

                if (Color_3.equals("Naranja")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2));
                    Aux="kΩ";
                    Aux_1="";
                    Aux_2="kΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Naranja));
                }
                if (Color_3.equals("Amarillo")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2)*10);
                    Aux="0kΩ";
                    Aux_1="";
                    Aux_2="kΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                }
                if (Color_3.equals("Verde")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2)/10);
                    Aux="MΩ";
                    Aux_1=".";
                    Aux_2="MΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Verde));
                }
                if (Color_3.equals("Azul")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2));
                    Aux="MΩ";
                    Aux_1="";
                    Aux_2="MΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Azul));
                }
                if (Color_3.equals("Violeta")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2)*10);
                    Aux="0MΩ";
                    Aux_1="";
                    Aux_2="MΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Violeta));
                }
                if (Color_3.equals("Gris")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2)/10);
                    Aux="GΩ";
                    Aux_1=".";
                    Aux_2="GΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Gris));
                }
                if (Color_3.equals("Blanco")) {
                    valor_3 = (Double.valueOf(valor_1 + valor_2));
                    Aux="GΩ";
                    Aux_1="";
                    Aux_2="GΩ";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Blanco));
                }
                if (Color_3.equals("Dorado")) {
                    valor_3= (Double.valueOf((valor_1 + valor_2)) / 10);
                    Aux="1";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Dorado));
                }
                if (Color_3.equals("Plateado")) {
                    valor_3 = (Double.valueOf((valor_1 + valor_2)) / 100);
                    Aux="2";
                    Color3.setBackgroundColor(getResources().getColor(R.color.Plateado));
                }
                break;

            case R.id.Tolerancia:

                if (Color_4.equals("Marron")) {
                    valor_4 = "±1%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Marron));
                }

                if (Color_4.equals("Rojo")) {
                    valor_4 = "±2%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Rojo));
                }
                if (Color_4.equals("Verde")) {
                    valor_4 = "±0.5%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Verde));
                }

                if (Color_4.equals("Azul")) {
                    valor_4 = "±0.25%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Azul));
                }
                if (Color_4.equals("Violeta")) {
                    valor_4 = "±0.1%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Violeta));
                }
                if (Color_4.equals("Gris")) {
                    valor_4 = "±0.05%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Gris));
                }
                if (Color_4.equals("Dorado")) {
                    valor_4 = "±5%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Dorado));
                }
                if (Color_4.equals("Plateado")) {
                    valor_4 = "±10%";
                    Color4.setBackgroundColor(getResources().getColor(R.color.Plateado));
                }
                break;

            default:
                break;

        }


        if (parent.getId()!=R.id.Multiplicador && Aux!="1"&& Aux!="2" ) {
            Resistencia.setText(String.valueOf(valor_1 +Aux_1+ valor_2 )+ Aux + valor_4);
        }
        else if(Aux=="1") {
            Resistencia.setText(String.valueOf(valor_1+"."+valor_2)+"Ω" + valor_4);
        }else  if(Aux=="2") {
            x1 = Double.valueOf(valor_1+valor_2)/100;
            Resistencia.setText(String.valueOf(x1)+ "Ω" + valor_4);

        }else {
            Resistencia.setText(String.valueOf(valor_3) + Aux_2 + valor_4);
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}