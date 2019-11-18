package com.cinthyasophia.perfildeusuario;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentPageAdapter extends FragmentPagerAdapter {
    private final int N_PAGES = 3;

    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        Empresa empresa = new Empresa("John Doe S.A.",123456,"C/ Mayor,25 03002 Alacant","http://johndoe.com","juanpalomo@johndoe.com");
        Usuario user = new Usuario(12346,"Juan","Palomo",empresa,"04-08-1995","C/ Mayor,35 03730 Xabia","juanP","holaJuan");

        switch (position){
            case 0:
                fragment= new FragmentUsuario(user);
                break;
            case 1:
                fragment = new FragmentEmpresa(empresa);
                break;
            case 2:
                break;
            default:
                fragment = new Fragment();
                break;
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return N_PAGES;
    }
}
