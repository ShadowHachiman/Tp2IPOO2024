package AbstractFactory;

public class FabricaModerna implements FabricaAbstracta {
    public FabricaModerna() {}

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Sillon crearSofa() {
        return new SillonModerna();
    }

    @Override
    public Mesilla crearMesilla() {
        return new MesillaModerna();
    }
}
