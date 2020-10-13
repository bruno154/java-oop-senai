package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao1(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "1";
        } else {
            segundoNumero = segundoNumero + "1";
        }
        atualizarDisplay("1");
    }

    public void onClickBotao2(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "2";
        } else {
            segundoNumero = segundoNumero + "2";
        }
        atualizarDisplay("2");
    }

    public void onClickBotao3(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "3";
        } else {
            segundoNumero = segundoNumero + "3";
        }
        atualizarDisplay("3");
    }

    public void onClickBotao4(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "4";
        } else {
            segundoNumero = segundoNumero + "4";
        }
        atualizarDisplay("4");
    }

    public void onClickBotao5(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "5";
        } else {
            segundoNumero = segundoNumero + "5";
        }
        atualizarDisplay("5");
    }

    public void onClickBotao6(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "6";
        } else {
            segundoNumero = segundoNumero + "6";
        }
        atualizarDisplay("6");
    }

    public void onClickBotao7(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "7";
        } else {
            segundoNumero = segundoNumero + "7";
        }
        atualizarDisplay("7");
    }

    public void onClickBotao8(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "8";
        } else {
            segundoNumero = segundoNumero + "8";
        }
        atualizarDisplay("8");
    }

    public void onClickBotao9(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "9";
        } else {
            segundoNumero = segundoNumero + "9";
        }
        atualizarDisplay("9");
    }

    public void onClickBotao0(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "0";
        } else {
            segundoNumero = segundoNumero + "0";
        }
        atualizarDisplay("0");
    }

    public void onClickAdição(View v){
        operacao = "+";
        atualizarDisplay("+");

    }
    public void onClickSubstracao(View v){
        operacao = "-";
        atualizarDisplay("-");

    }
    public void onClickMultiplicacao(View v){
        operacao = "x";
        atualizarDisplay("x");

    }
    public void onClickDivisao(View v){
        operacao = "%";
        atualizarDisplay("%");

    }

    public void onCLickIgual(View v){
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        if (operacao.equals("+")){
            int resultado = numero1 + numero2;
            display.setText(String.valueOf(resultado));
        } else if (operacao.equals("-")){
            int resultado = numero1 - numero2;
            display.setText(String.valueOf(resultado));
        } else if (operacao.equals("x")){
            int resultado = numero1 * numero2;
            display.setText(String.valueOf(resultado));
        } else if (operacao.equals("%") && numero2 != 0 ){
            int resultado = numero1 / numero2;
            display.setText(String.valueOf(resultado));
        } else {display.setText("Divisão por zero não permitida");}

    }

    private void atualizarDisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }



}