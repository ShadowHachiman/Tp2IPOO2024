package Unnoba.Tp2.Ac3;

public class HornoPan {
    public HornoPan() {}

    public void makePan(PanBuilder builder){
        builder.comprobarTemp();
        builder.prepararSalConAgua();
        builder.prepararElevadura();
        builder.addAguaYMesclar();
        builder.addHarinaYRemover();
        builder.amazar();
        builder.reposar();
        builder.cortarLaMaza();
        builder.llevarAlHorno();
    }
}
