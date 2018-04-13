package com.frozen.money_checker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected ListView listView;
    protected TransactionAdapter transactionAdapter;
    protected List<Transactions> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Transactions> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(this, adapterData);

        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(transactionAdapter);
    }

    private List<Transactions> getDataList() {

        data.add(new Transactions("Telephone", "1000"));
        data.add(new Transactions("House", "30000"));
        data.add(new Transactions("Food", "2000"));
        return data;
    }

}

