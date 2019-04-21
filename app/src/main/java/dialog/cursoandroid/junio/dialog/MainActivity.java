package dialog.cursoandroid.junio.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criar o alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //deixando modal
                dialog.setCancelable(false);

                //icone
                dialog.setIcon(android.R.drawable.ic_dialog_info);

                //configurar o titulo
                dialog.setTitle("Atenção");

                //configurando a mensagem
                dialog.setMessage("Deseja realmente excluir o item?");

                //configurar o botao negativo
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Foi clicado no botão NAO", Toast.LENGTH_SHORT).show();
                            }
                        });

                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Foi clicado no botão SIM", Toast.LENGTH_LONG).show();
                            }
                        });

                dialog.create();
                dialog.show();






            }
        });


    }
}
