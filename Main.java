package inventaris;
import java.util.Scanner;


public class main {

 
  public static void main(String[] args) {
      
  String [] Number= new String[100];
  String [] Name= new String [100] ;
  int [] Stock = new int[100];
  double [] Price = new double[100];
  
  //status bolean hanya bisa di isi JIKA TRUE=ADA JIKA FALSE=KOSONG
  boolean [] Status= new boolean [100];
  
  int maxSize = -1;
  
  
  
      try (Scanner in = new Scanner(System.in)) {
          do{
              try{
                  System.out.println("Masukkan jumlah produk yang ingin Anda tambahkan:");
                  maxSize=in.nextInt();
                  
                  if(maxSize < 0) throw new Exception ("nilai yang salah dimasukkan") ;
                  
              }
              catch(Exception E){
                  System.out.println("tipe data yang dimasukkan salah");
                  in.nextLine();
                  
              };
              
              
          }while(maxSize < 0);
          in.nextLine();
          if(maxSize == 0){
              System.out.println("Tidak ada produk yang ditambahkan");
              
          }
          else{
              
              
              for(int i=0; i<maxSize; i++){
                  
                  System.out.println("Masukan nomor ID:");
                  Number[i] = in.nextLine();
                  
                  System.out.println("Masukan nama produk:");
                  Name[i] = in.nextLine();
                  
                  System.out.println("Masukan stock:");
                  Stock[i] = in.nextInt();
                  
                  System.out.println("Masukan harga:");
                  Price[i] = in.nextDouble();
                  
                  System.out.println("\nMasukan status produk:");
                  Status[i] = in.nextBoolean();
                  
                  System.out.println("\nNomor ID:"+Number[i]+"\nStock:"+Stock[i]+"\nHarga:"+Price[i]+"\nStatus:"+Status[i]);
                  
                  
                  
                 
              }
              in.close();
              
          } 
      }
  }
}
