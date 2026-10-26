package Ejercicio1;

public class Operation {
    double [] listaNotas;
    public Operation (){
        listaNotas = new double[5];
    }
    double CalcularPromedio(){
        double suma = 0;
        for (int i=1; i < listaNotas.length; i++){
            suma = suma + listaNotas[i];
        }return (suma/listaNotas.length);
    }
    double calcularDesviacion(){
        double prom = CalcularPromedio();
        double suma = 0;
        for(int i=0;i<listaNotas.length;i++){
            suma += Math.pow(listaNotas[i]-prom, 2);
        }return Math.sqrt(suma/listaNotas.length);
    }
    double CalcularMenor(){
        double Menor = listaNotas[0];
        for(int i=0;i< listaNotas.length; i++){
            if(listaNotas[i]<Menor){
                Menor = listaNotas[i];
            }
        }
        return Menor;
    }
    double CalcularMayor(){
        double Mayor = listaNotas[0];
        for(int i=0;i< listaNotas.length; i++){
            if(listaNotas[i]>Mayor){
                Mayor = listaNotas[i];
            }
        }
        return Mayor;
    }

}
