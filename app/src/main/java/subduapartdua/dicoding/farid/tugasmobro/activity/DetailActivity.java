package subduapartdua.dicoding.farid.tugasmobro.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import subduapartdua.dicoding.farid.tugasmobro.R;

public class DetailActivity extends AppCompatActivity {
    TextView namaResto,alamatResto,noTelepon;
    ImageView gambar,maps,telepon;
    String lokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initialized();
        namaResto.setText(getIntent().getStringExtra("nama"));
        gambar.setImageResource(getIntent().getIntExtra("gambar",0));
        alamatResto.setText(getIntent().getStringExtra("alamat"));
        noTelepon.setText(getIntent().getStringExtra("nomor"));

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lokasi = getIntent().getStringExtra("lokasikordinat");
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll="+lokasi);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        telepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone;
                phone = noTelepon.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

    }
    public void initialized (){
        maps = findViewById(R.id.iv_maps);
        telepon = findViewById(R.id.iv_telepon);
        namaResto = findViewById(R.id.tv_nama_resto);
        alamatResto = findViewById(R.id.tv_Alamat_resto);
        noTelepon = findViewById(R.id.tv_notelp_resto);
        gambar =  findViewById(R.id.iv_gambar_resto);
    }
}
