package id.sch.smktelkom_mlg.tugas01.xirpl5031.tugasformpendaftaranpmr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText user;
    Spinner kelas;
    CheckBox bndhr, waka, sekret, agt;
    TextView tvhsl;
    Button out;
    RadioButton lk, pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.editTextuser);
        kelas = (Spinner) findViewById(R.id.spinnerkls);
        bndhr = (CheckBox) findViewById(R.id.checkBoxbndhr);
        waka = (CheckBox) findViewById(R.id.checkBoxwk);
        lk = (RadioButton) findViewById(R.id.radioButtonlki);
        pr = (RadioButton) findViewById(R.id.radioButtonprmpn);
        sekret = (CheckBox) findViewById(R.id.checkBoxsek);
        agt = (CheckBox) findViewById(R.id.checkBoxangg);
        tvhsl = (TextView) findViewById(R.id.textViewhasil);
        out = (Button) findViewById(R.id.button);
        out.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       String userid = user.getText().toString();
                                       String kelasusr = kelas.getSelectedItem().toString();
                                       String keluar = "Jabatan yang anda minati : \n";
                                       int start = keluar.length();
                                       if (bndhr.isChecked()) keluar += bndhr.getText() + "\n";
                                       if (waka.isChecked()) keluar += waka.getText() + "\n";
                                       if (sekret.isChecked()) keluar += sekret.getText() + "\n";
                                       if (agt.isChecked()) keluar += agt.getText() + "\n";
                                       if (keluar.length() == start) keluar += "tidak ada";

                                       String keluar2 = null;
                                       if (lk.isChecked()) {
                                           keluar2 = lk.getText().toString();
                                       } else if (pr.isChecked()) {
                                           keluar2 = pr.getText().toString();
                                       } else {
                                           keluar2 = "belum diisi";
                                       }
                                       tvhsl.setText("------------Data Pendaftar------------" + "\n\n\nNama Pendaftar : \n" + userid + "\n\nKelas : \n" + kelasusr + "\n\nJenis Kelamin : \n" + keluar2 + "\n\n" + keluar);
                                   }
                               }
        );

    }
}
