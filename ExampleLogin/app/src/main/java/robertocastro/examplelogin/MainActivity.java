package robertocastro.examplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.etName);
        etPass = (EditText)findViewById(R.id.etPass);

    }

    public void verificar(View v){
        String usuario = etName.getText().toString();
        String clave = etPass.getText().toString();
        String mensaje = "Login Correcto";

        if(usuario.length() == 0){
            mensaje = "Favor de ngresar su usuario";
            //Toast notif = Toast.makeText(this,"Favor de Ingresar un usuario",Toast);
            //notif.show();
        } else if(clave.length() == 0){
            mensaje = "Favor de ingresar su password";
        }
        Toast notif = Toast.makeText(this,mensaje,Toast.LENGTH_LONG);
        notif.show();
    }
}
