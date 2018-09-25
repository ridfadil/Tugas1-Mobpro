package subduapartdua.dicoding.farid.tugasmobro.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.LinkedList;

import subduapartdua.dicoding.farid.tugasmobro.R;
import subduapartdua.dicoding.farid.tugasmobro.adapter.RecyclerRestoAdapter;
import subduapartdua.dicoding.farid.tugasmobro.model.Item;

public class Main2Activity extends AppCompatActivity {
    CardView cdAction;
    private final LinkedList<Item> listResto = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private RecyclerRestoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initialized();
        //onClick();

        listResto.addLast(new Item(R.drawable.resto1, " Golden Resto", "09564565767","Bandung Blok B 15", "-6.922492,107.715390"));
        listResto.addLast(new Item(R.drawable.resto2, " Japanese Food", "0956756756","Manisi Gang Bhakti 3", "-6.956455,107.854432"));
        listResto.addLast(new Item(R.drawable.resto3, " Italian Food", "09123476774","Cipadung no 45 blok B", "-6.774545,107.342354"));
        listResto.addLast(new Item(R.drawable.resto4, " Restoran Hivi", "0434654776","Ujung Berung 15a", "-6.322353,107.897894"));
        listResto.addLast(new Item(R.drawable.resto5, " Restoran Loryi", "06573465435","A. Nasution No 19", "-6.121234,107.675322"));
        listResto.addLast(new Item(R.drawable.resto6, " Silver Shink", "05675788788","Ahmad Yani blok c", "-6.534233,107.768745"));
        listResto.addLast(new Item(R.drawable.resto7, " Lalaland Resto", "0565745645","Vijaya Kusuma Blk B", "-6.896785,107.546343"));
        listResto.addLast(new Item(R.drawable.resto8, " Kidzsaru Resto", "0787568267","Permai 5 Cipadung", "-6.768674,107.2378344"));

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list_restoran);

        mAdapter = new RecyclerRestoAdapter(Main2Activity.this, listResto);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void initialized() {
        cdAction = findViewById(R.id.cv_detail);
    }
/*    public void onClick(){
        cdAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(Main2Activity.this,DetailActivity.class);
                startActivity(i);
            }
        });*/
}