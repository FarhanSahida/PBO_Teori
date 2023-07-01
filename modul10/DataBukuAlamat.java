/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

/**
 *
 * @author LENOVO
 */
public class DataBukuAlamat {
    private BukuAlamat[] data = new BukuAlamat[100];
    private int index;
    
    public void insert(BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    
    public void update(int index, BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
    }
    
    public BukuAlamat[] getAll(){
        BukuAlamat[] temp = new BukuAlamat[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNotelp("");
        data[index].setEmail("");
    }
    
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat temp = new BukuAlamat();
        temp.setNama("Dini");
        temp.setAlamat("Padang");
        temp.setNotelp("1111");
        temp.setEmail("dini@pnp.ac.id");
        data.insert(temp);
        BukuAlamat temp1 = new BukuAlamat();
        temp1.setNama("Ani");
        temp1.setAlamat("Padang");
        temp1.setNotelp("1111");
        temp1.setEmail("dini1@pnp.ac.id");
        data.insert(temp1); 
        //tampilkan
        BukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("Buku Alamat ke--->"+(i+1));
            System.out.println("Nama    :"+list[i].getNama());
            System.out.println("Alamat  :"+list[i].getAlamat());
            System.out.println("No Telp :"+list[i].getNotelp());
            System.out.println("Email   :"+list[i].getEmail());
        }
    }
}
