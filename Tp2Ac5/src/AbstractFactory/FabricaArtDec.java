package AbstractFactory;

public class FabricaArtDec implements FabricaAbstracta{
    public FabricaArtDec() {}

    @Override
    public Silla crearSilla() {
        return new SillaArtDec();
    }

    @Override
    public Sillon crearSofa() {
        return new SillonArtDec();
    }

    @Override
    public Mesilla crearMesilla() {
        return new MesillaArtDec();
    }
}
