import javafx.scene.image.ImageView;

public class Pais {

    String pais;
    String capital;
    int fundacion;
    double superficie;
    ImageView imageView;

    public Pais(String pais, String capital, int fundacion, double superficie, ImageView imageView) {
        this.pais = pais;
        this.capital = capital;
        this.fundacion = fundacion;
        this.superficie = superficie;
        this.imageView = imageView;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                ", capital='" + capital + '\'' +
                ", fundacion=" + fundacion +
                ", superficie=" + superficie +
                '}';
    }
}
