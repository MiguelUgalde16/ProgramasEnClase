package ExamenSegundoParcial;

public class PruebasHerencia {
    public static void main(String[]args){
        ProductoCongelado pollo = new ProductoCongelado("15-12-2022","M9172035");
        ProductoFresco rabanos = new ProductoFresco("10-12-2022","N0028317");
        ProductoRefrigerado cocacola = new ProductoRefrigerado("31-12-2023","O9925510");
        pollo.setTemperaturaRecomendada(-10);
        rabanos.setFechaEnvasado("20-07-2022");
        rabanos.setPaisDeOrigen("Mexico");
        cocacola.setCodigoSupervisionAlimentaria("A#6885");
        System.out.println("Producto Congelado: ");
        pollo.imprimirDatos();
        System.out.println("Producto Fresco: ");
        rabanos.imprimirDatos();
        System.out.println("Producto Refrigerado: ");
        cocacola.imprimirDatos();
    }
}

