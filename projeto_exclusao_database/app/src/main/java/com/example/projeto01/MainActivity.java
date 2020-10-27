package com.example.projeto01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.projeto01.database.ProdutoDAO;
import com.example.projeto01.modelo.Produto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listViewProdutos;
    private ArrayAdapter<Produto> adapterProdutos;
    private int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Produtos");

        listViewProdutos = findViewById(R.id.listView_produtos);
//        ArrayList<Produto> produtos = new ArrayList<Produto>();
//
//        adapterProdutos = new ArrayAdapter<Produto>(MainActivity.this,
//                android.R.layout.simple_list_item_1,
//                produtos);
//        listViewProdutos.setAdapter(adapterProdutos);

        definirOnClickListenerListView();
        definirOnLongClickListener();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ProdutoDAO produtoDAO = new ProdutoDAO(getBaseContext());
        adapterProdutos = new ArrayAdapter<Produto>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                produtoDAO.listar());
        listViewProdutos.setAdapter(adapterProdutos);

    }

    private void definirOnClickListenerListView(){
        listViewProdutos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produto produtoClicado = adapterProdutos.getItem(position);
                Intent intent = new Intent(MainActivity.this, CadatroProdutoActivity.class);
                intent.putExtra("produtoEdição", produtoClicado);
                startActivity(intent);
            }
        });
    }


    private void definirOnLongClickListener(){
        listViewProdutos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Produto produtoClicado = adapterProdutos.getItem(position);

                new AlertDialog.Builder(MainActivity.this)
                        .setIcon((android.R.drawable.ic_delete))
                        .setTitle("Deseja Excluir?")
                        .setMessage("Deseja excluir este item?")
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ProdutoDAO produtoDAO = new ProdutoDAO(getBaseContext());
                                produtoDAO.deleteproduto(produtoClicado);
                                adapterProdutos.notifyDataSetChanged();
                                Toast.makeText(MainActivity.this, "Produto Deletado", Toast.LENGTH_LONG).show();

                            }
                        })
                        .setNegativeButton("No", null).show();
                return true;
            }
        });
    }

//    private ArrayList<Produto> criarListaProdutos(){
//        ArrayList<Produto> produtos = new ArrayList<Produto>();
//        produtos.add(new Produto("Notebook", 3500f));
//        produtos.add(new Produto("Mouse",  40f));
//        produtos.add(new Produto("Roteador", 199.90f));
//        return produtos;
//    }

    public void onClickNovoProduto(View v) {
        Intent intent = new Intent(MainActivity.this, CadatroProdutoActivity.class);
        startActivity(intent);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        if (requestCode == REQUEST_CODE_EDITAR_PRODUTO && resultCode == RESULT_CODE_PRODUTO_EDITADO){
//            Produto produtoEditado = (Produto) data.getExtras().getSerializable("produtoEditado");
//            for (int i = 0; i < adapterProdutos.getCount(); i++){
//                Produto produto = adapterProdutos.getItem(i);
//                if(produto.getId() == produtoEditado.getId()){
//                    adapterProdutos.remove(produto);
//                    adapterProdutos.insert(produtoEditado, i);
//                    break;
//                }
//
//            }
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//    }
}