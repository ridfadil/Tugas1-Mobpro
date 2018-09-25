package subduapartdua.dicoding.farid.tugasmobro.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

import subduapartdua.dicoding.farid.tugasmobro.R;
import subduapartdua.dicoding.farid.tugasmobro.activity.DetailActivity;
import subduapartdua.dicoding.farid.tugasmobro.model.Item;

public class RecyclerRestoAdapter extends RecyclerView.Adapter<RecyclerRestoAdapter.ListRestoViewHolder> {

    //deklarasi global variabel
    private Context context;
    private final LinkedList<Item> listResto;

    //konstruktor untuk menerima data adapter
    public RecyclerRestoAdapter(Context context, LinkedList<Item> listResto) {
        this.context = context;
        this.listResto = listResto;
    }

    //view holder berfungsi untuk setting list item yang digunakan
    @Override
    public ListRestoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_rest, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ListRestoViewHolder(mItemView, this);
    }

    //bind view holder berfungsi untuk set data ke view yang ditampilkan pada list item
    @Override
    public void onBindViewHolder(ListRestoViewHolder holder, int position) {
        final Item mCurrent = listResto.get(position);
        holder.nameResto.setText(mCurrent.getNamaResto());
        holder.ivResto.setImageResource(mCurrent.getGambar());

        holder.openOrder.setText("Open Order");

    }

    //untuk menghitung jumlah data yang ada pada list
    @Override
    public int getItemCount() {
        return listResto.size();
    }

    public class ListRestoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView nameResto, openOrder;
        private ImageView ivResto;
        private CardView cdView;

        final RecyclerRestoAdapter mAdapter;

        //untuk casting view yang digunakan pada list item
        public ListRestoViewHolder(View itemView, RecyclerRestoAdapter adapter) {
            super(itemView);
            nameResto = itemView.findViewById(R.id.tv_nama_list_resto);
            openOrder = itemView.findViewById(R.id.tv_open_order);
            cdView = itemView.findViewById(R.id.cv_detail);
            ivResto = itemView.findViewById(R.id.iv_list_gambar);
            this.mAdapter = adapter;
            cdView.setOnClickListener(this);
        }

        //untuk menambah action click pada list item
        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            Item element = listResto.get(mPosition);

            //intent ke main activity dengan passing data
            Intent i = new Intent(context, DetailActivity.class);
            i.putExtra("alamat", element.getAlamatResto());
            i.putExtra("gambar", element.getGambar());
            i.putExtra("nomor", element.getNoTelepon());
            i.putExtra("nama", element.getNamaResto());
            i.putExtra("lokasikordinat",element.getLokasiResto());
            context.startActivity(i);
            mAdapter.notifyDataSetChanged();
        }
    }
}
