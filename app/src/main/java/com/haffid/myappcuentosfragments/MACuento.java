package com.haffid.myappcuentosfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MACuento extends AppCompatActivity {
    private Fragment fragment1, fragment2, fragment3, fragment4, fragment5;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macuento);

        fragment1 = new FragUno();
        fragment2 = new FragDos();
        fragment3 = new FragTres();
        fragment4 = new FragCuatro();
        fragment5 = new FragCinco();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID, fragment1).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID, fragment2).hide(fragment2).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID, fragment3).hide(fragment3).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID, fragment4).hide(fragment4).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID, fragment5).hide(fragment5).commit();

    }

    public void onClink(View view) {
        transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btnFrag1:
                if (fragment1.isAdded()) {
                    transaction.hide(fragment2).hide(fragment3).hide(fragment4).hide(fragment5).show(fragment1);
                } else {
                    transaction.hide(fragment2).hide(fragment3).hide(fragment4).hide(fragment5).add(R.id.contenedorID, fragment1);
                    transaction.addToBackStack(null);
                }
                break;
            case R.id.btnFrag2:
                if (fragment2.isAdded()) {
                    transaction.hide(fragment1).hide(fragment3).hide(fragment4).hide(fragment5).show(fragment2);
                } else {
                    transaction.hide(fragment1).hide(fragment3).hide(fragment4).hide(fragment5).add(R.id.contenedorID, fragment2);
                    transaction.addToBackStack(null);
                }
                break;
            case R.id.btnFrag3:
                if (fragment3.isAdded()) {
                    transaction.hide(fragment1).hide(fragment2).hide(fragment4).hide(fragment5).show(fragment3);
                } else {
                    transaction.hide(fragment1).hide(fragment2).hide(fragment4).hide(fragment5).add(R.id.contenedorID, fragment3);
                    transaction.addToBackStack(null);
                }
                break;
            case R.id.btnFrag4:
                if (fragment4.isAdded()) {
                    transaction.hide(fragment1).hide(fragment2).hide(fragment3).hide(fragment5).show(fragment4);
                } else {
                    transaction.hide(fragment1).hide(fragment2).hide(fragment3).hide(fragment5).add(R.id.contenedorID, fragment4);
                    transaction.addToBackStack(null);
                }
                break;
            case R.id.btnFrag5:
                if (fragment5.isAdded()) {
                    transaction.hide(fragment1).hide(fragment2).hide(fragment3).hide(fragment4).show(fragment5);
                } else {
                    transaction.hide(fragment1).hide(fragment2).hide(fragment3).hide(fragment4).add(R.id.contenedorID, fragment5);
                    transaction.addToBackStack(null);
                }
                break;
        }
        transaction.commit();
    }
}