package com.frozen.money_checker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TransactionsFragment extends Fragment {
    protected ListView listView;
    protected TransactionAdapter transactionAdapter;
    protected List<Transaction> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_transactions, container);
        List<Transaction> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(getActivity(), adapterData);

        listView = inflate.findViewById(R.id.listview);
        listView.setAdapter(transactionAdapter);
        return inflate;
    }

    private List<Transaction> getDataList() {

        data.add(new Transaction("Telephone", 1000));
        data.add(new Transaction("House", 30000));
        data.add(new Transaction("Food", 2000));
        return data;
    }
}
