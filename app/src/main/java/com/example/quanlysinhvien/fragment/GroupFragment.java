package com.example.quanlysinhvien.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlysinhvien.R;
import com.example.quanlysinhvien.SignInActivity;
import com.example.quanlysinhvien.SignUpActivity;
import com.example.quanlysinhvien.User;
import com.example.quanlysinhvien.UserAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

public class GroupFragment extends Fragment {
    private LinearLayout layoutGroup1;
    private LinearLayout layoutGroup2;
    private LinearLayout layoutGroup3;
    private LinearLayout layoutGroup4;
    private LinearLayout layoutGroup5;
    private LinearLayout layoutGroup6;
    private LinearLayout layoutGroup7;
    private LinearLayout layoutGroup8;
    private LinearLayout layoutGroup9;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_group, container, false);
        List<Integer> listKey = new ArrayList<>();
        listKey.add(R.id.layout_group_1);
        listKey.add(R.id.layout_group_2);
        listKey.add(R.id.layout_group_3);
        listKey.add(R.id.layout_group_4);
        listKey.add(R.id.layout_group_5);
        listKey.add(R.id.layout_group_6);
        listKey.add(R.id.layout_group_7);
        listKey.add(R.id.layout_group_8);
        listKey.add(R.id.layout_group_9);
        for (Integer id: listKey) {
            LinearLayout l = findViewById()
        }

        layoutGroup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
