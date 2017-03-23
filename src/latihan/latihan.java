package latihan;
public class latihan {
    int angka; String huruf;
    public String [] nama = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    public latihan (int angka){
        this.angka = angka;
    }
    public latihan (String huruf){
        this.huruf = huruf;
    }
    public String getRibuan(){
        if (angka>1000)
            return "Angka Melebihi Batas";
        else if (angka<1000)
            return getRibuan(1000);
        else
            return "Seribu";
    }
    public String getSatuan(int a){
        switch (a){
            case 1000:
                return "Ratus ";
            case 100:
                return "Puluh ";
            default:
                return "";
        }
    }
    public String getRibuan(int pembagi){
        if (pembagi==1)
            return "";
        else if ((angka%pembagi/10)==1&&angka%10!=0)
            return getRibuan(10)+"Belas";
        if ((angka%pembagi)/(pembagi/10)==1){
            if(pembagi>=100||angka==11)
                return "Se"+getSatuan(pembagi)+getRibuan(pembagi/10);
            else
                return "Satu ";
        } else if ((angka%pembagi)/(pembagi/10)==2){
            return "Dua "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==3){
            return "Tiga "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==4){
            return "Empat "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==5){
            return "Lima "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==6){
            return "Enam "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==7){
            return "Tujuh "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==8){
            return "Delapan "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else if ((angka%pembagi)/(pembagi/10)==9){
            return "Sembilan "+getSatuan(pembagi)+getRibuan(pembagi/10);
        } else return getRibuan(pembagi/10);
    }
    public void getRibuan(String huruf){
        int hasil = 0;
        if (huruf.contains("Seribu")){
            hasil = 1000;
        }
        if (huruf.contains ("Sebelas")){
            String angka [] = huruf.split("(Sebelas)");
            for (int i=0; i<nama.length;i++){
                if (angka[0].contains(nama[i])){
                    hasil = hasil + (i+11);
                }
            }
        }
        if (huruf.contains ("Ratus") && huruf.contains ("Puluh")){
            String angka [] = huruf.split("(Ratus) | (Puluh) ");
            for (int i=0; i<nama.length;i++){
                if (angka[0].contains(nama[i])){
                    hasil = hasil + (i*100);
                }
                if (angka[1].contains(nama[i])){
                    hasil = hasil + (i*10);
                }
                if (angka[2].contains(nama[i])){
                    hasil = hasil + i;
                }
            }
        }
        if (huruf.contains ("Ratus") && huruf.contains ("")){
            String angka [] = huruf.split("(Ratus) ");
            for (int i=0; i<nama.length;i++){
                if (angka[0].contains(nama[i])){
                    hasil = hasil + (i*100);
                }
                if (angka[1].contains(nama[i])){
                    hasil = hasil + (i*10);
                }
                if (angka[2].contains(nama[i])){
                    hasil = hasil + i;
                }
            }
        }
        if (huruf.contains ("Seratus") && huruf.contains ("Puluh")){
            String angka [] = huruf.split("(Seratus) | (Puluh) ");
            for (int i=0; i<nama.length;i++){
                if (angka[0].contains(nama[i])){
                    hasil = hasil + (i*100);
                }
                if (angka[1].contains(nama[i])){
                    hasil = hasil + (i*10);
                }
                if (angka[2].contains(nama[i])){
                    hasil = hasil + i;
                }
            }
        }
        if (huruf.contains ("Seratus") && huruf.contains ("Belas")){
            String angka [] = huruf.split("(Seratus) | (Belas) ");
            for (int i=0; i<nama.length;i++){
                if (angka[0].contains(nama[i])){
                    hasil = hasil + (i*100);
                }
                if (angka[1].contains(nama[i])){
                    hasil = hasil + (i+5);
                }
            }
        }
        
        System.out.println(hasil);
    }
}