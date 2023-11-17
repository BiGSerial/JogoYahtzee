
public class Dado {

       private int ValorFace;
       public void rolar(){
    	   int r = (int)(Math.random()*6);
    	   r = r + 1;
    	   ValorFace = r;
	
}
       public int getValor(){
    	   return ValorFace;
       }

}
