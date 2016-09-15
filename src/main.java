
public class main {
    
    public static void main(String[] args) {
        llantas ld1 = new llantas("mic",10);
        llantas ld2 = new llantas("mic",10);
        llantas[] front =(ld1,ld2);
        llantas lt1 = new llantas("mic",10);
        llantas lt2 = new llantas("mic",10);
        llantas[] rear = (lt1,lt2);
        car carro new car("ferra",front,rear);
        System.out.print(carro);
                
        
    }

  
    
}
