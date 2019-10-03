package br.com.kleberjunio.projetosandroid.appcriptografia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        show = findViewById(R.id.show);
    }

    public void btnCriptografar(View botao) {
        String alfabeto = " <abcdefghijklmnopqrstuvwxyzçéáíúóãõABCDEFGHIJKLMNOPQRSTUVWXYZÇÁÉÓÍÚÃÕ1234567890.;:?,º]}§[{ª!@#$%&*()_+-=\\/|\'\">";

        char[] t = input.getText().toString().toCharArray();

        String palavra = "";

        for (int i = 0; i < t.length; i++) {
            int posicao = alfabeto.indexOf(t[i]) + 2;
            if (alfabeto.length() <= posicao) {
                posicao = posicao - alfabeto.length();
            }
            palavra = palavra + alfabeto.charAt(posicao);
        }

        show.setText(palavra);
    }

    public void btnDescriptografar(View botao) {
        String alfabeto = " <abcdefghijklmnopqrstuvwxyzçéáíúóãõABCDEFGHIJKLMNOPQRSTUVWXYZÇÁÉÓÍÚÃÕ1234567890.;:?,º]}§[{ª!@#$%&*()_+-=\\/|\'\">";

        char[] t = input.getText().toString().toCharArray();

        String palavra = "";

        for (int i = 0; i < t.length; i++) {
            int posicao = alfabeto.indexOf(t[i]) - 2;
            if (alfabeto.length() <= posicao) {
                posicao = posicao - alfabeto.length();
            }
            palavra = palavra + alfabeto.charAt(posicao);
        }

        show.setText(palavra);
    }

}
