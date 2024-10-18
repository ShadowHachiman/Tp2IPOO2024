package Unnoba.Tp2.Ac3;

public class PanIntegralBuilder implements PanBuilder{
    private PanIntegral panIntegral;

    public PanIntegralBuilder() {
        this.reset();
    }

    public void reset() {
        this.panIntegral = new PanIntegral();
    }

    @Override
    public void comprobarTemp() {
        System.out.println("Checkeando temperatura");
    }

    @Override
    public void prepararSalConAgua() {
        System.out.println("Preparando AGUA y Sal");
    }

    @Override
    public void prepararElevadura() {
        System.out.println("Preparando LEVADURA");
    }

    @Override
    public void addAguaYMesclar() {
        System.out.println("Adicionando agua y batiendo");
    }

    @Override
    public void addHarinaYRemover() {
        System.out.println("Adicionando harina con solo parte central del grano y removiendo");
    }

    @Override
    public void amazar() {
        System.out.println("Amasando");
    }

    @Override
    public void reposar() {
        System.out.println("Amasando");
    }

    @Override
    public void cortarLaMaza() {
        System.out.println("Cotando la masa");
    }

    @Override
    public void llevarAlHorno() {
        System.out.println("Llevando al horno");
    }

    public PanIntegral getPanIntegral() {
        return this.panIntegral;
    }

    public PanIntegral getProducto() {
        PanIntegral product = getPanIntegral();
        reset();
        return product;
    }
}
