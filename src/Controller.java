import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.awt.*;
import java.net.URL;
import java.util.*;
import java.util.List;

public class Controller<T> implements Initializable {

    @FXML
    private ToolBar box;

    List<Pais> paises = new ArrayList<>();

    @FXML
    void showInfo(MouseEvent event) {
        System.out.println("ok");
    }

    void update() {
        box.getItems().clear();
        for (Pais pais: paises) {
            box.getItems().add(pais.getImageView());
        }
    }

    @FXML
    void shuffle(ActionEvent event) {
        Collections.shuffle(paises);
        update();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Pais argentina = new Pais("Agentina", "Buenos Aires", 1916, 2.78,
                new ImageView("img/argentina_adobespark.png"));
        Pais bolivia = new Pais("Bolivia", "La Paz", 1825, 1.099,
                new ImageView("img/bolivia_adobespark.png"));
        Pais brasil = new Pais("Brasil", "Brasilia", 1822, 8.516,
                new ImageView("img/brasil_adobespark.png"));
        Pais canada = new Pais("Canada", "Ottawa", 1867, 9.985,
                new ImageView("img/canada_adobespark.png"));
        Pais chile = new Pais("Chile", "Santiago de Chile", 1818, 0.756950,
                new ImageView("img/chile_adobespark.png"));
        Pais colombia = new Pais("Colombia", "Bogota", 1810, 1.143,
                new ImageView("img/colombia_adobespark.png"));
        Pais costarica = new Pais("Costa Rica", "San José", 1821, 0.051180,
                new ImageView("img/costarica_adobespark.png"));
        Pais cuba = new Pais("Cuba", "La Habana", 1868, 0.109884,
                new ImageView("img/cuba_adobespark.png"));
        Pais estadosunidos = new Pais("Estados Unidos", "Washington", 1776, 9.834,
                new ImageView("img/estadosunidos_adobespark.png"));
        Pais mexico = new Pais("Mexico", "Ciudad de Mexico", 1810, 1.973,
                new ImageView("img/mexico_adobespark.png"));
        Pais venezuela = new Pais("Venezuela", "Caracas", 1811, 0.916445,
                new ImageView("img/venezuela_adobespark.png"));

        paises.add(argentina);
        paises.add(bolivia);
        paises.add(brasil);
        paises.add(canada);
        paises.add(chile);
        paises.add(colombia);
        paises.add(costarica);
        paises.add(cuba);
        paises.add(estadosunidos);
        paises.add(mexico);
        paises.add(venezuela);

        update();
    }
}
