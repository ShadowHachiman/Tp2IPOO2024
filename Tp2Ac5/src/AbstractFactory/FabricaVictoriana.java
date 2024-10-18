package AbstractFactory;

public class FabricaVictoriana implements FabricaAbstracta {
    public FabricaVictoriana() {}

    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sillon crearSofa() {
        return new SillonVictoriana();
    }

    @Override
    public Mesilla crearMesilla() {
        return new MesillaVictoriana();
    }
}
