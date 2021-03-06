package com.cput;

public class dispay_impl implements  display{

    //call the toString method
    @Override
    public void showdata() {
        data d = new data();
        d.setName("Master");
        d.setSurname("Saki");
        d.setAge(23);
//        d.toString();
    }
}
