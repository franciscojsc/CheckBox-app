package br.com.franciscochaves.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox mCheckBoxCao;
    private CheckBox mCheckBoxGato;
    private CheckBox mCheckBoxPapagaio;

    private Button mBotaoMostar;
    private TextView mTextoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheckBoxCao = findViewById(R.id.checkBox_cao);
        mCheckBoxGato = findViewById(R.id.checkBox_gato);
        mCheckBoxPapagaio = findViewById(R.id.checkBox_papagaio);

        mBotaoMostar = findViewById(R.id.button_mostrar);
        mTextoExibicao = findViewById(R.id.text_mostar);

        mBotaoMostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder itensSelecionados = new StringBuilder();

                itensSelecionados.append("Item: ");
                itensSelecionados.append(mCheckBoxCao.getText().toString());
                itensSelecionados.append(" - Status: ");
                itensSelecionados.append(mCheckBoxCao.isChecked());
                itensSelecionados.append("\n");

                itensSelecionados.append("Item: ");
                itensSelecionados.append(mCheckBoxGato.getText().toString());
                itensSelecionados.append(" -  Status: ");
                itensSelecionados.append(mCheckBoxGato.isChecked());
                itensSelecionados.append("\n");

                itensSelecionados.append("Item: ");
                itensSelecionados.append(mCheckBoxPapagaio.getText().toString());
                itensSelecionados.append(" - Status: ");
                itensSelecionados.append(mCheckBoxPapagaio.isChecked());
                itensSelecionados.append("\n");

                mTextoExibicao.setText(itensSelecionados.toString());
            }
        });
    }
}
