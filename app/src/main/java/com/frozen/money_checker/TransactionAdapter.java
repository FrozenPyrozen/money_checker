package com.frozen.money_checker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends ArrayAdapter<Transaction> {
    TransactionAdapter(@NonNull Context context, List<Transaction> transactions) {
        super(context, 0, transactions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Transaction transaction = getItem(position);

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        TextView title = convertView.findViewById(R.id.title);
        TextView sum = convertView.findViewById(R.id.sum);

        assert transaction != null;
        title.setText(transaction.getTitle());
        sum.setText(String.valueOf(transaction.getSum()));

        return convertView;
    }
}
