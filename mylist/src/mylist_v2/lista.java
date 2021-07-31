/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist_v2;

/**
 *
 * @author carlo
 */
public class lista {
    
    private Nodo header;
    private Nodo aux;
    
    public void insertar(int numero, int llave)
    {
        if(header==null)
        {
        header= new Nodo(numero, llave);
        
        }
        else
        {
        insertar_siguiente(numero,llave);
        }
    }
    private void insertar_siguiente(int numero, int llave)
    {
        System.out.println("metodo insertar ");
        if(this.header.get_siguiente()==null)
        {
         //   Nodo temp= new Nodo(numero,llave);
         //   this.header.set_siguiente(temp);
            this.header.set_siguiente(new Nodo(numero,llave));
            
        }
        else
        {
            aux=this.header;//.get_siguiente();
            while(aux.get_siguiente()!=null)
            {
            aux=aux.get_siguiente();
            }
            aux.set_siguiente(new Nodo(numero,llave));
        }
    }
 public   void imprimir()
    {
        Nodo a=this.header;
        System.out.println("imprimiendo");
    while(a!=null)
    {
        System.out.println("numero:"+a.get_numero());
        System.out.println("llave:"+a.get_llave());
    a=a.get_siguiente();
    }
    }
 
 public void buscar(int numero)
 {
    Nodo a=this.header;
        System.out.println("Bucando...");
    boolean encuentraResultado = false;
        while(a!=null)
        {   
            if(a.get_numero()==numero){
                System.out.println("Se encontró nodo...");                                
                System.out.println("    numero : "+a.get_numero());
                System.out.println("    llave : "+a.get_llave());
                encuentraResultado=true;
                break;                
            }
            a=a.get_siguiente();
        } 
        if(!encuentraResultado){
            System.out.println("No se encontró resultado de la búsqueda..");
        }
 }
 
 public void eliminar(int numero)
 {
    Nodo a=this.header;   
    Nodo auxiliar=a;
    System.out.println("Empezando a eliminar...");
    boolean encuentraResultado = false;
        while(a!=null)
        {   
            if(a.get_numero()==numero){
                if(a==this.header)
                {
                    this.header=a.get_siguiente();
                }
                System.out.println("\\n\\nSe encontró nodo a eliminar...");
                System.out.println("\\n\\n  Se eliminó nodo numero : "+a.get_numero());
                auxiliar.set_siguiente(a.get_siguiente());
                encuentraResultado=true;
                break;                
            }
            auxiliar=a;
            a=a.get_siguiente();
        } 
        if(!encuentraResultado){
            System.out.println("No se encontró resultado de la búsqueda..");
        }
 }
 
    
}
