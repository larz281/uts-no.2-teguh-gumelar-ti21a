package PersegiPanjang;

import BangunDatar.BangunDatar;

public class PersegiPanjang implements BangunDatar {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang * lebar;
    }
}
