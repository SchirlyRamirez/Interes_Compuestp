public class Interes_Compuesto {


    public static void main(String[] args) {
        double inversion = 1000;
        double tasa_anual= 0.05;
        double cantidad = 0;

        for( int año = 1; año <= 10; año ++){
            cantidad = inversion  * Math.pow( 1 + tasa_anual, año);
            System.out.println("La cantidad acumulada al finalizar el año " + año + " es de: $" + Math.round(cantidad));
        }

    }


}

