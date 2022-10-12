package Architecture.ModelElements;

public class PoligonalModel{
    
    String name;
    Poligon poligon;
    Texture texture;

    public PoligonalModel(String name) {
        this.name = name;
        this.poligon = new Poligon(0, 0, 0);
        this.texture = new Texture("special");
    }

    public void setPoligonalModelTexture(Texture texture) {
        this.texture = texture;
    }

    public void setPoligonalModelPoligon(Poligon poligon) {
        this.poligon = poligon;
    }

    public void setPoligonalModelName(String name) {
        this.name = name;
    }
    
}
