
package controllers;
import views.View;
import views.ViewHiragana;
import views.ViewInfoHi;
import views.ViewInfoKa;
import views.ViewKatakana;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import silabario.IViewEventListener;
import silabario.Silabas;


public class Controller implements IViewEventListener {
    private int nivel;
    private int cantPreguntas;
    private int numSilabaSelect;
    private boolean hayJuego;
    private int contadorPregunta;
    private int puntajeBien;
    private int puntajeMal;
    private String silabaSelect;
    private View myView;
    private ViewHiragana myViewHiragana;
    private ViewKatakana myViewKatakana;
    private ViewInfoHi myViewInfoHiragana;
    private ViewInfoKa myViewInfoKatakana;
    private String botonAction;
    private String vistaActual;
    private Silabas silaba;
    private int valorParaPedir;
    
    
    public Controller(){
       
        silaba =new Silabas();
        myView = new View();
        myView.setVisible(true); 
        myViewHiragana = new ViewHiragana();
        myViewKatakana = new ViewKatakana();
        myViewInfoHiragana = new ViewInfoHi();
        myViewInfoKatakana = new ViewInfoKa();
        
    }
    
    public void Run(){
        myView.addEventListener(this);
        myViewHiragana.addEventListener(this);
        myViewKatakana.addEventListener(this);
        myViewInfoHiragana.addEventListener(this);
        myViewInfoKatakana.addEventListener(this);
        
       
    }
   
    public void listen(Event event) {
        ActionEvent unaAccion = (ActionEvent) event.target;
       botonAction = unaAccion.getActionCommand();
          
        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {
            System.out.println("Se pulso el boton: " + botonAction);
        }
        //Escucha cuando hay que regresar al menú
        if(botonAction.equalsIgnoreCase("Volver al Menú")){
            System.out.println("Vista anterior es igual a: "+vistaActual);
            if(vistaActual.equals("Vista Hiragana")||vistaActual.equals("Vista Katakana")||vistaActual.equals("Vista Info Hiragana")||vistaActual.equals("Vista Info Katakana")){
                vistaActual ="vista";
                myViewHiragana.setVisible(false);
                myViewKatakana.setVisible(false);
                myViewInfoHiragana.setVisible(false);
                myViewInfoKatakana.setVisible(false);
                myView.setVisible(true);
            }else if (vistaActual.equalsIgnoreCase("Jugar")){
                
                vistaActual ="vista";
                //myViewPlay.setVisible(false);
                myView.setVisible(true);
            }
            System.out.println("Vista Actual es igual a: "+vistaActual);
        }
        
        // Escucha cuando se quiere acceder a la informacion de Hiragana y Katakana
         if (botonAction.equalsIgnoreCase("Info Hiragana")){
            vistaActual = "Vista Info Hiragana";
            PrepararPractica();
            myView.setVisible(false);
            myViewInfoHiragana.setVisible(true);
            }
         
         if (botonAction.equalsIgnoreCase("Info Katakana")){
            vistaActual = "Vista Info Hiragana";
            PrepararPractica();
            myView.setVisible(false);
            myViewInfoKatakana.setVisible(true);
            }
        
        //Escucha la orden de empezar el entrenamiento de hiragana
        if (botonAction.equalsIgnoreCase("practicar hiragana")){
            vistaActual = "Vista Hiragana";
            PrepararPractica();
            myView.setVisible(false);
            myViewHiragana.setVisible(true);
            myViewHiragana.getjLabelNombre().setVisible(true);
        }
        if(botonAction.equalsIgnoreCase("practicar katakana")){
            vistaActual = "Vista Katakana";
            PrepararPractica();
            myView.setVisible(false);
            myViewKatakana.setVisible(true);
            myViewKatakana.getjLabelNombre().setVisible(true);
        }

        //Escucha cuando se solicita la siguiente sílaba en entrenamiento
        if (botonAction.equalsIgnoreCase("Next")){
            if (vistaActual.equalsIgnoreCase("vista Hiragana")) {
                myViewHiragana.BorrarSilaba(valorParaPedir);
                valorParaPedir = valorParaPedir+1;
                myViewHiragana.getjLabelNombre().setText(silaba.DameLaSilabaQuePIdo(valorParaPedir));
                myViewHiragana.MostrarSimboloSilaba(valorParaPedir);
                System.out.println("Entre a next y el valor de la llamada es: "+valorParaPedir);
                if(valorParaPedir > 0 && valorParaPedir < 103){//Cuando se termina de mostrar la ultima sílaba elimina el boton Next
                    myViewHiragana.getjButtonOp3().setText("Next");
                    myViewHiragana.getjButtonOp3().setVisible(true);
                    myViewHiragana.getjButtonOp1().setText("back");
                    myViewHiragana.getjButtonOp1().setVisible(true);
                }else{
                    myViewHiragana.getjButtonOp3().setText("Next");
                    myViewHiragana.getjButtonOp3().setVisible(false);
                    myViewHiragana.getjButtonOp1().setText("back");
                    myViewHiragana.getjButtonOp1().setVisible(true);
                }
            }
            if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
                myViewKatakana.BorrarSilaba(valorParaPedir);
                valorParaPedir = valorParaPedir+1;
                myViewKatakana.getjLabelNombre().setText(silaba.DameLaSilabaQuePIdo(valorParaPedir));
                myViewKatakana.MostrarSimboloSilaba(valorParaPedir);
                System.out.println("Entre a next y el valor de la llamada es: "+valorParaPedir);
                if(valorParaPedir > 0 && valorParaPedir < 103){//Condicional que se asegura que al regresar a la primera sílaba elimine el boton Back o Next al final.
                    myViewKatakana.getjButtonOp3().setText("Next");
                    myViewKatakana.getjButtonOp3().setVisible(true);
                    myViewKatakana.getjButtonOp1().setText("back");
                    myViewKatakana.getjButtonOp1().setVisible(true);
                }else{
                    myViewKatakana.getjButtonOp3().setText("Next");
                    myViewKatakana.getjButtonOp3().setVisible(false);
                    myViewKatakana.getjButtonOp1().setText("back");
                    myViewKatakana.getjButtonOp1().setVisible(true);
                }
            }
                
        }
      
         //Escucha cuando se solicita la anterior sílaba en entrenamiento.
         if (botonAction.equalsIgnoreCase("Back")){
             if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
                myViewHiragana.BorrarSilaba(valorParaPedir);
                valorParaPedir = valorParaPedir-1;
                myViewHiragana.getjLabelNombre().setText(silaba.DameLaSilabaQuePIdo(valorParaPedir));
                myViewHiragana.MostrarSimboloSilaba(valorParaPedir);
                System.out.println("Entre a next y el valor de la llamada es: "+valorParaPedir);
                if(valorParaPedir > 0 && valorParaPedir < 103){//Condicional que se asegura que al regresar a la primera sílaba elimine el boton Back o Next al final.
                    myViewHiragana.getjButtonOp3().setText("Next");
                    myViewHiragana.getjButtonOp3().setVisible(true);
                    myViewHiragana.getjButtonOp1().setText("back");
                    myViewHiragana.getjButtonOp1().setVisible(true);
                }else{
                    myViewHiragana.getjButtonOp3().setText("Next");
                    myViewHiragana.getjButtonOp3().setVisible(true);
                    myViewHiragana.getjButtonOp1().setText("back");
                    myViewHiragana.getjButtonOp1().setVisible(false);
                }
             }
            if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
                myViewKatakana.BorrarSilaba(valorParaPedir);
                valorParaPedir = valorParaPedir-1;
                myViewKatakana.getjLabelNombre().setText(silaba.DameLaSilabaQuePIdo(valorParaPedir));
                myViewKatakana.MostrarSimboloSilaba(valorParaPedir);
                System.out.println("Entre a next y el valor de la llamada es: "+valorParaPedir);
                if(valorParaPedir > 0 && valorParaPedir < 103){//Se asegura que al regresar a la primera sílaba elimine el boton Back.
                    myViewKatakana.getjButtonOp3().setText("Next");
                    myViewKatakana.getjButtonOp3().setVisible(true);
                    myViewKatakana.getjButtonOp1().setText("back");
                    myViewKatakana.getjButtonOp1().setVisible(true);
                }else{
                    myViewKatakana.getjButtonOp3().setText("Next");
                    myViewKatakana.getjButtonOp3().setVisible(true);
                    myViewKatakana.getjButtonOp1().setText("back");
                    myViewKatakana.getjButtonOp1().setVisible(false);
                }
             }
                
        }
         
         //Escucha cuando se solicita Jugar hiragana. Solo se mostrará las opciones para iniciar el juego.
         if (botonAction.equalsIgnoreCase("Jugar Hiragana")){
            vistaActual = "Vista Hiragana";
            myViewHiragana.getjButtonPlay().setText("JUGAR");
            PrepararJuego();
            myView.setVisible(false);
            myViewHiragana.setVisible(true);
            myViewHiragana.getjLabelBienMal().setText("");
        }
           if ((botonAction.equalsIgnoreCase("REINICIAR"))) {
              if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
                vistaActual = "Vista Hiragana";
                myViewHiragana.getjButtonPlay().setText("JUGAR");
                PrepararJuego();
                myView.setVisible(false);
                myViewHiragana.setVisible(true);
                myViewHiragana.getjLabelBienMal().setText("");                 
              }
           
        }     
           
          if (botonAction.equalsIgnoreCase("Jugar Katakana")  ){
            vistaActual = "Vista Katakana";
            myViewKatakana.getjButtonPlay().setText("JUGAR");
            PrepararJuego();
            myView.setVisible(false);
            myViewKatakana.setVisible(true);
            myViewKatakana.getjLabelBienMal().setText("");
        }
          if ((botonAction.equalsIgnoreCase("REINICIAR"))) {
              if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
                    vistaActual = "Vista Katakana";
                    myViewKatakana.getjButtonPlay().setText("JUGAR");
                    PrepararJuego();
                    myView.setVisible(false);
                    myViewKatakana.setVisible(true);
                    myViewKatakana.getjLabelBienMal().setText("");                   
              }
           
        }
         
          
          
         //Escucha cuando deceamos iniciar el juego
         if(botonAction.equalsIgnoreCase("JUGAR") || botonAction.equals("-->")){
             if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
                 if (botonAction.equalsIgnoreCase("JUGAR")) {
                    contadorPregunta= Integer.parseInt(myViewHiragana.getjLabelBien().getText());
                }
                switch(myViewHiragana.getjComboBoxCantidad().getSelectedIndex()){
                    case(0):cantPreguntas=10;break;
                    case(1):cantPreguntas=30;break;
                    case(2):cantPreguntas=50;break;
                    case(3):cantPreguntas=80;break;
                    case(4):cantPreguntas=100;break;
                }
                myViewHiragana.getjLabelBienMal().setText("");
                 Jugando();                
             }
             if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
                 if (botonAction.equalsIgnoreCase("JUGAR")) {
                    contadorPregunta= Integer.parseInt(myViewKatakana.getjLabelBien().getText());
                }
                switch(myViewKatakana.getjComboBoxCantidad().getSelectedIndex()){
                    case(0):cantPreguntas=10;break;
                    case(1):cantPreguntas=30;break;
                    case(2):cantPreguntas=50;break;
                    case(3):cantPreguntas=80;break;
                    case(4):cantPreguntas=100;break;
                }
                myViewKatakana.getjLabelBienMal().setText("");
                 Jugando();                
             }
             
         }
         
         
         //Entramos a reconocer los botones pulsados en pleno juego, tanto para HIragana como para Katakana y vemos si son correctos o no.
         if (botonAction.equals(silaba.BuscandoSilaba(botonAction))) {
             if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
                    if (botonAction.equals(silabaSelect)) {
                        myViewHiragana.getjLabelBienMal().setText("¡BIEN! La silaba es: "+silabaSelect);
                        puntajeBien= Integer.parseInt(myViewHiragana.getjLabelBien().getText());
                        puntajeBien++;
                        myViewHiragana.getjLabelBien().setText(Integer.toString(puntajeBien));
                        myViewHiragana.getjLabelNombre().setVisible(true);
                        myViewHiragana.getjLabelNombre().setText(silabaSelect);
                        myViewHiragana.getjButtonOp1().setVisible(false);
                        myViewHiragana.getjButtonOp2().setVisible(false);
                        myViewHiragana.getjButtonOp3().setVisible(false);
                        myViewHiragana.getjButtonOp4().setVisible(false);
                        myViewHiragana.getjButtonOp6().setVisible(false);
                        if (contadorPregunta <= cantPreguntas-2) {
                           myViewHiragana.getjButtonOp5().setText("-->"); 
                           contadorPregunta++;
                        }else{
                            myViewHiragana.getjButtonOp5().setVisible(false);
                            myViewHiragana.getjLabelBienMal().setText("¡BIEN! La silaba es: "+silabaSelect);
                        }

                    }else{
                        myViewHiragana.getjLabelBienMal().setText("¡MAL! La silaba es: "+silabaSelect);
                        puntajeMal= Integer.parseInt(myViewHiragana.getjLabelMal().getText());
                        puntajeMal++;
                        myViewHiragana.getjLabelMal().setText(Integer.toString(puntajeMal));
                        myViewHiragana.getjLabelNombre().setVisible(true);
                        myViewHiragana.getjLabelNombre().setText(silabaSelect);
                        myViewHiragana.getjButtonOp1().setVisible(false);
                        myViewHiragana.getjButtonOp2().setVisible(false);
                        myViewHiragana.getjButtonOp3().setVisible(false);
                        myViewHiragana.getjButtonOp4().setVisible(false);
                        myViewHiragana.getjButtonOp6().setVisible(false);
                        if (contadorPregunta <= cantPreguntas-2) {
                           myViewHiragana.getjButtonOp5().setText("-->"); 
                           contadorPregunta++;
                        }else{
                            myViewHiragana.getjButtonOp5().setVisible(false);
                            myViewHiragana.getjLabelBienMal().setText("MAL! La silaba es: "+silabaSelect);
                        }

                    }

                    System.out.println("La cantidad de preguntas es: "+cantPreguntas+ " y el contador: "+contadorPregunta);                 
             }
              if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
                    if (botonAction.equals(silabaSelect)) {
                        myViewKatakana.getjLabelBienMal().setText("¡BIEN! La silaba es: "+silabaSelect);
                        puntajeBien= Integer.parseInt(myViewKatakana.getjLabelBien().getText());
                        puntajeBien++;
                        myViewKatakana.getjLabelBien().setText(Integer.toString(puntajeBien));
                        myViewKatakana.getjLabelNombre().setVisible(true);
                        myViewKatakana.getjLabelNombre().setText(silabaSelect);
                        myViewKatakana.getjButtonOp1().setVisible(false);
                        myViewKatakana.getjButtonOp2().setVisible(false);
                        myViewKatakana.getjButtonOp3().setVisible(false);
                        myViewKatakana.getjButtonOp4().setVisible(false);
                        myViewKatakana.getjButtonOp6().setVisible(false);
                        if (contadorPregunta <= cantPreguntas-2) {
                           myViewKatakana.getjButtonOp5().setText("-->"); 
                           contadorPregunta++;
                        }else{
                            myViewKatakana.getjButtonOp5().setVisible(false);
                            myViewKatakana.getjLabelBienMal().setText("¡BIEN! La silaba es: "+silabaSelect);
                        }

                    }else{
                        myViewKatakana.getjLabelBienMal().setText("¡MAL! La silaba es: "+silabaSelect);
                        puntajeMal= Integer.parseInt(myViewKatakana.getjLabelMal().getText());
                        puntajeMal++;
                        myViewKatakana.getjLabelMal().setText(Integer.toString(puntajeMal));
                        myViewKatakana.getjLabelNombre().setVisible(true);
                        myViewKatakana.getjLabelNombre().setText(silabaSelect);
                        myViewKatakana.getjButtonOp1().setVisible(false);
                        myViewKatakana.getjButtonOp2().setVisible(false);
                        myViewKatakana.getjButtonOp3().setVisible(false);
                        myViewKatakana.getjButtonOp4().setVisible(false);
                        myViewKatakana.getjButtonOp6().setVisible(false);
                        if (contadorPregunta <= cantPreguntas-2) {
                           myViewKatakana.getjButtonOp5().setText("-->"); 
                           contadorPregunta++;
                        }else{
                            myViewKatakana.getjButtonOp5().setVisible(false);
                            myViewKatakana.getjLabelBienMal().setText("MAL! La silaba es: "+silabaSelect);
                        }

                    }

                    System.out.println("La cantidad de preguntas es: "+cantPreguntas+ " y el contador: "+contadorPregunta);                 
             }            

        }
    }
    
    
    //METODOS METODOS METODOS METODOS METODOS METODOS MEDOTOS METOTOS MEDODOS JAJAJA
    
    
    public void PrepararPractica(){
        if(vistaActual.equalsIgnoreCase("Vista Hiragana")){
            valorParaPedir = 0;
            myViewHiragana.OcultarSilabas();
            myViewHiragana.getjLabelPracticaTitulo().setText("Práctica de Hiragana");
            myViewHiragana.getjButtonPlay().setVisible(false);
            if(valorParaPedir ==0){
            myViewHiragana.getjButtonOp3().setText("Next");
            myViewHiragana.getjButtonOp3().setVisible(true);
            }
        
            myViewHiragana.getjLabelNombre().setText(silaba.DameLaSilabaQuePIdo(valorParaPedir));
            myViewHiragana.MostrarSimboloSilaba(valorParaPedir); 
        }
        if(vistaActual.equalsIgnoreCase("Vista Katakana")){
            valorParaPedir = 0;
            myViewKatakana.OcultarSilabas();
            myViewKatakana.getjLabelPracticaTitulo().setText("Práctica de Katakana");
            myViewKatakana.getjButtonPlay().setVisible(false);
            if(valorParaPedir ==0){
            myViewKatakana.getjButtonOp3().setText("Next");
            myViewKatakana.getjButtonOp3().setVisible(true);
            }
        
            myViewKatakana.getjLabelNombre().setText(silaba.DameLaSilabaQuePIdo(valorParaPedir));
            myViewKatakana.MostrarSimboloSilaba(valorParaPedir); 
        }
         
    }
    
    public void PrepararJuego(){
        if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
            myViewHiragana.OcultarSilabas();
            myViewHiragana.getaHira().setVisible(true);
            myViewHiragana.getjLabelNombre().setVisible(true);
            myViewHiragana.getjLabelNombre().setText("a");
            myViewHiragana.getjLabelPracticaTitulo().setText("Juego Hiragana");
            myViewHiragana.getjLabelPreguntas().setVisible(true);
            myViewHiragana.getjLabelNivelTex().setVisible(true);
            myViewHiragana.getjComboBoxCantidad().setVisible(true);
            myViewHiragana.getjComboBoxNivel().setVisible(true);
            myViewHiragana.getjLabelBienMal().setVisible(true);
            myViewHiragana.getjLabelBien().setVisible(true);
            myViewHiragana.getjLabelBien().setText("0");
            myViewHiragana.getjLabelMal().setVisible(true);
            myViewHiragana.getjLabelMal().setText("0");
            myViewHiragana.getjLabelPuntaje().setVisible(true);
            myViewHiragana.getjLabelPuntaje().setText("Puntaje");
            myViewHiragana.getjButtonPlay().setVisible(true);  
        }
        if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
            myViewKatakana.OcultarSilabas();
            myViewKatakana.getaKata().setVisible(true);
            myViewKatakana.getjLabelNombre().setVisible(true);
            myViewKatakana.getjLabelNombre().setText("a");
            myViewKatakana.getjLabelPracticaTitulo().setText("Juego Hiragana");
            myViewKatakana.getjLabelPreguntas().setVisible(true);
            myViewKatakana.getjLabelNivelTex().setVisible(true);
            myViewKatakana.getjComboBoxCantidad().setVisible(true);
            myViewKatakana.getjComboBoxNivel().setVisible(true);
            myViewKatakana.getjLabelBienMal().setVisible(true);
            myViewKatakana.getjLabelBien().setVisible(true);
            myViewKatakana.getjLabelBien().setText("0");
            myViewKatakana.getjLabelMal().setVisible(true);
            myViewKatakana.getjLabelMal().setText("0");
            myViewKatakana.getjLabelPuntaje().setVisible(true);
            myViewKatakana.getjLabelPuntaje().setText("Puntaje");
            myViewKatakana.getjButtonPlay().setVisible(true);  
        }
}
    
    public void Jugando(){
        if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
             nivel = myViewHiragana.getjComboBoxNivel().getSelectedIndex(); //Reconoce el nivel es decir la cantidad de sílaba que seleccionó el jugador.
             //cantPreguntas = myViewPractice.getjComboBoxCantidad().getSelectedIndex();
             myViewHiragana.getjLabelPracticaTitulo().setText("¿Que sílaba es?");
             myViewHiragana.getjButtonPlay().setText("REINICIAR");
             myViewHiragana.OcultarSilabas();
             myViewHiragana.getjLabelPuntaje().setText("Puntaje de: "+cantPreguntas);
             silaba.BorrarListaHiraSelect();//Reseteamos la lista de nivel de silabas
             silabaSelect = silaba.DameSilaba(nivel);//pedimos una sílaba al azar
             numSilabaSelect = silaba.DondeEsta();//Preguntamos en que parte del arreglo esta la silaba seleccionada para poder pedir a la vista el simbolo adecuado
             System.out.println("Se seleccion nivel: "+nivel+" y "+cantPreguntas+" Y la silaba seleccionada es: "+silabaSelect+" osea la numero: "+numSilabaSelect);
             myViewHiragana.MostrarSimboloSilaba(numSilabaSelect);
             CargandoOpcionesEnBotones(silabaSelect);//BOTONES: Preparamos los botones con las silabas al azar
             myViewHiragana.getjLabelPuntaje().setVisible(true);
             myViewHiragana.getjLabelBienMal().setVisible(true);
             myViewHiragana.getjLabelBien().setVisible(true);
             myViewHiragana.getjLabelMal().setVisible(true);            
        }
        if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
             nivel = myViewKatakana.getjComboBoxNivel().getSelectedIndex(); //Reconoce el nivel es decir la cantidad de sílaba que seleccionó el jugador.
             //cantPreguntas = myViewPractice.getjComboBoxCantidad().getSelectedIndex();
             myViewKatakana.getjLabelPracticaTitulo().setText("¿Que sílaba es?");
             myViewKatakana.getjButtonPlay().setText("REINICIAR");
             myViewKatakana.OcultarSilabas();
             myViewKatakana.getjLabelPuntaje().setText("Puntaje de: "+cantPreguntas);
             silaba.BorrarListaHiraSelect();//Reseteamos la lista de nivel de silabas
             silabaSelect = silaba.DameSilaba(nivel);//pedimos una sílaba al azar
             numSilabaSelect = silaba.DondeEsta();//Preguntamos en que parte del arreglo esta la silaba seleccionada para poder pedir a la vista el simbolo adecuado
             System.out.println("Se seleccion nivel: "+nivel+" y "+cantPreguntas+" Y la silaba seleccionada es: "+silabaSelect+" osea la numero: "+numSilabaSelect);
             myViewKatakana.MostrarSimboloSilaba(numSilabaSelect);
             CargandoOpcionesEnBotones(silabaSelect);//BOTONES: Preparamos los botones con las silabas al azar
             myViewKatakana.getjLabelPuntaje().setVisible(true);
             myViewKatakana.getjLabelBienMal().setVisible(true);
             myViewKatakana.getjLabelBien().setVisible(true);
             myViewKatakana.getjLabelMal().setVisible(true);            
        }
             
    }
    
    public boolean CantidadPreguntas(int valorCantidadPreguntas){
        boolean retur=true;
        return retur;
    }
    
    public void CargandoOpcionesEnBotones(String laSilabaQueTenemos){
        if (vistaActual.equalsIgnoreCase("Vista Hiragana")) {
            silaba.BorrarListaSeñuelos();
            for (int i = 0; i < myViewHiragana.getBotones().length; i++) {

                myViewHiragana.MostrarBoton(i, silaba.DameSeñuelos(laSilabaQueTenemos));

            }
            int unRandom = RandomOpcionesBoton();
            myViewHiragana.MostrarBoton(unRandom, laSilabaQueTenemos);
            System.out.println("Mande la silaba que tenemos "+laSilabaQueTenemos+ " al boton "+unRandom);            
        }
        if (vistaActual.equalsIgnoreCase("Vista Katakana")) {
            silaba.BorrarListaSeñuelos();
            for (int i = 0; i < myViewHiragana.getBotones().length; i++) {

                myViewKatakana.MostrarBoton(i, silaba.DameSeñuelos(laSilabaQueTenemos));

            }
            int unRandom = RandomOpcionesBoton();
            myViewKatakana.MostrarBoton(unRandom, laSilabaQueTenemos);
            System.out.println("Mande la silaba que tenemos "+laSilabaQueTenemos+ " al boton "+unRandom);            
        }

       
    }
    
      public int RandomOpcionesBoton(){
        int d = 0;
        int h = 6;
        return (int) (Math.random()* (h-1)+d);
        
    }
    
}
