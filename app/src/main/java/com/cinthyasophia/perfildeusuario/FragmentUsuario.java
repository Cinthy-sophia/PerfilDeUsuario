package com.cinthyasophia.perfildeusuario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentUsuario extends Fragment {
    private TextView tvNombre;
    private TextView tvApellido;
    private TextView tvFechaNac;
    private TextView tvDireccionUser;
    private TextView tvNif;
    private Usuario user;

    public FragmentUsuario(Usuario user) {
        this.user= user;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_usuario, container, false);

        tvNombre= layout.findViewById(R.id.tvNombre);
        tvApellido= layout.findViewById(R.id.tvApellido);
        tvFechaNac= layout.findViewById(R.id.tvFechaNac);
        tvDireccionUser= layout.findViewById(R.id.tvDireccionUser);
        tvNif= layout.findViewById(R.id.tvNif);

        tvNombre.setText(user.getNombre());
        tvApellido.setText(user.getApellido());
        tvFechaNac.setText(user.getFechaNac());
        tvDireccionUser.setText(user.getDireccion());
        tvNif.setText(String.valueOf(user.getNif()));

        return layout;
    }
}
