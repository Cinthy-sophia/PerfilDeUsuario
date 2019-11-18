package com.cinthyasophia.perfildeusuario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentEmpresa extends Fragment {
    private TextView tvNombreEmpresa;
    private TextView tvCif;
    private TextView tvEmail;
    private TextView tvPagWeb;
    private TextView tvDireccionEmpresa;
    private Empresa empresa;

    public FragmentEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_empresa,container,false);

        tvNombreEmpresa= layout.findViewById(R.id.tvNombreEmpresa);
        tvCif= layout.findViewById(R.id.tvCif);
        tvPagWeb= layout.findViewById(R.id.tvPagWeb);
        tvEmail = layout.findViewById(R.id.tvEmail);
        tvDireccionEmpresa= layout.findViewById(R.id.tvDireccionEmpresa);

        tvNombreEmpresa.setText(empresa.getRazonSocial());
        tvCif.setText(String.valueOf(empresa.getCif()));
        tvPagWeb.setText(empresa.getPaginaWeb());
        tvEmail.setText(empresa.getCorreoE());
        tvDireccionEmpresa.setText(empresa.getDireccion());

        return layout;
    }
}
