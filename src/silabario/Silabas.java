package silabario;
import java.util.ArrayList;
import java.util.List;

public class Silabas {
    private List<String> listaHiraganaSelect;
    private List<String> listaSeñuelo;
    private List<String> listaSeñueloUsado;
    private String[] silabarioHiragana;
    private String hiraSelect="";
    private int nivel;
    
    
    public Silabas(){
        listaSeñuelo = new ArrayList<>(6);
        listaSeñueloUsado = new ArrayList<>();
        
        silabarioHiragana = new String[]{"a","i","u","e","o","ka","ki","ku","ke","ko","sa","shi","su","se","so","ta","chi","tsu","te","to",
            "na","ni","nu","ne","no","ha","hi","fu","he","ho","ma","mi","mu","me","mo","ya","yu","yo","ra","ri","ru","re","ro","wa","wo","n",
            "ga","gi","gu","ge","go","za","ji","zu","ze","zo","da","dji","dzu","de","do","ba","bi","bu","be","bo","pa","pi","pu","pe","po",
            "kya","kyu","kyo","sha","shu","sho","cha","chu","cho","nya","nyu","nyo","hya","hyu","hyo","mya","myu","myo","rya","ryu","ryo",
            "gya","gyu","gyo","ja","ju","jo","bya","byu","byo","pya","pyu","pyo"
        };
        listaHiraganaSelect = new ArrayList<>();
    }
    
    public String DameSilaba(int unNivel){
        String laSilaba="";
       
        switch(unNivel){
            case(0):nivel=10;break;
            case(1):nivel=25;break;
            case(2):nivel=35;break;
            case(3):nivel=46;break;
            case(4):nivel=71;break;
            case(5):nivel=104;break;
        }
        
        for (int i = 0; i < nivel; i++) {
            listaHiraganaSelect.add(silabarioHiragana[i]);
        }
        laSilaba = listaHiraganaSelect.get(RandomPalabra());//pedimos un  numero al azar
        hiraSelect = laSilaba; //Lo guardo en una variable para poder preguntar despues en que parte del array esta la silaba seleccionada por azar
       
        return hiraSelect;
    }
    
      public int RandomPalabra(){
        int d = 1;
        int h = listaHiraganaSelect.size();//Uso directamente el tamaño de mi lista recien cargada para calcular un numero al azar
        return (int) (Math.random()* (h-1)+d);
        
    }
      
      public int Random2(){
        int d = 1;
        int h = 7;
        return (int) (Math.random()* (h-1)+d);
        
    }
      
      public String DameLaSilabaQuePIdo(int elvalor){
          String laSilaba;
          laSilaba = silabarioHiragana[elvalor];
          return laSilaba;
      }
      
      //Metodo para ubicar la pocicion de la palagra seleccionada al azar
      public int DondeEsta(){
          int numArray=0;
          System.out.println("Estoy preguntando donde esta: "+hiraSelect);
          for (int i = 0; i < silabarioHiragana.length; i++) {
              if (hiraSelect.equalsIgnoreCase(silabarioHiragana[i])) {
                  numArray=i;
              }
          }
             
          return numArray;
      }
      
     public String DameSeñuelos(String enPantalla){
         String unSeñuelo;
         int falso=0;
         listaSeñueloUsado.add(enPantalla);
         do{
             unSeñuelo = listaHiraganaSelect.get(RandomPalabra());
             System.out.println("Un señuelo: "+unSeñuelo);
             if (listaSeñueloUsado.size()==0) {
                 System.out.println("Primer señuelo seleccionado: "+unSeñuelo);
                 
                 
                 falso++;
             }else if(listaSeñueloUsado.size() >=1){
                 int existe=0;
                 for (int i = 0; i < listaSeñueloUsado.size(); i++) {
                     System.out.println("comparando "+unSeñuelo +" con "+listaSeñueloUsado.get(i));
                     if (unSeñuelo.equals(listaSeñueloUsado.get(i))) {
                         existe = existe +1;
                         System.out.println("El señuelo: "+unSeñuelo+" - es igual a: "+listaSeñueloUsado.get(i));
                     }
                 }
                 if (existe >=1) {
                     System.out.println("Señuelo Usado");
                     
                 }else{
                     System.out.println("El señuelo"+unSeñuelo+" - esta limpio");
                     listaSeñueloUsado.add(unSeñuelo);
                     falso++;
                 }
             }
             System.out.println("falso es:"+falso);
         }while(falso<1);
         
         System.out.println("Se mando el señuelo: "+unSeñuelo);
         System.out.println("Tamaños de lista: "+listaSeñueloUsado.size());
       
         return unSeñuelo;
     }
     
     public void BorrarListaSeñuelos(){
             listaSeñueloUsado.clear();
     }
     
     public void BorrarListaHiraSelect(){
         listaHiraganaSelect.clear();
     }
     
     public String BuscandoSilaba(String unaSilaba){
         String hay="";
         for (int i = 0; i < silabarioHiragana.length; i++) {
             if(unaSilaba.equals(silabarioHiragana[i])){
                 hay = silabarioHiragana[i];
             System.out.println("Si esta la silaba, felicidades: "+hay);
             }
         }
         return hay;
     }
     
 
      
}
