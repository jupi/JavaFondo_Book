/*
SOBRECARGA MÉTODOS:
------------------------
Decimos que un método está sobrecargado cuando admite más de una combinación de
tipos y/o cantidades de argumentos. Esto se logra escribiendo el método tantas veces
como tantas combinaciones diferentes queremos que el método pueda admitir

DIFERENCIA ENTRE SOBRECARGA Y SOBRESCRITURA:
------------------------------------------
• Sobrecargamos un método cuando lo programamos más de una vez, pero con diferentes
tipos y/o cantidades de parámetros.
• Sobrescribimos un método cuando el método que estamos programando es el mismo
que heredamos de nuestro padre. En este caso, tenemos que respetar su encabezado
(cantidades y tipos de parámetros y tipo del valor de retorno) ya que de lo
contrario lo estaremos sobrecargando.
 */

package cap02_POO.clases_objetos;
/*
OBJETIVO:
hacer que la clase Fecha permita crear fechas a partir de una cadena
de caracteres con este formato: “dd/mm/aaaa”. Para esto, tendremos que agregar
(sobrecargar) un constructor que reciba un string como argumento.
 */    


public class FechaSobrecarga {


    private int dia, mes, anio;
    
 
    //1)sobrecargamos el constructor pasándole como argumento una cadena
    
    public FechaSobrecarga(String s){
    
            //buscamos primera ocurrencia desde el principio "/"
            
            int pos1 = s.indexOf('/');
            
            //buscamos primera ocurrencia desde el final "/"
            
            int pos2 = s.lastIndexOf('/');
            
            //Tomamos la subcadena ubicada entre 0 y pos1 (no inclusive), la convertimos a int
            //y la asignamos al atributo dia.

            String sdia = s.substring(0, pos1);
            dia = Integer.parseInt(sdia);
            
            //Tomamos la subcadena ubicada entre pos1+1 y pos2 (no inclusive), la convertimos
            //a int y la asignamos en el atributo mes.
            
            String smes = s.substring(pos1+1, pos2);
            mes = Integer.parseInt(smes);
            
            //Tomamos la subcadena ubicada entre pos2+1, la convertimos
            //a int y la asignamos en el atributo mes.
            
            String sanio = s.substring(pos2+1);
            anio = Integer.parseInt(sanio);
    
    }
    
    
    
     @Override
    
     // sobrescribimos el metodo toString (lo heredamos de Object)     
  public String toString(){
  
      //retorna la cadena tal como queremos que vea la fecha
      return dia + "/" + mes + "/" + anio;
  
  }
    
 
 @Override
 // sobrescribimos el metodo equals (lo heredamos de Object) 
  public boolean equals(Object o){
  
        FechaSobrecarga otra = (FechaSobrecarga) o;
        
        
        return  (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
  
  }
  
    
  public FechaSobrecarga(int d, int m, int a){
  
  dia=d;
  mes=m;
  anio=a;
      
  }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    
}
