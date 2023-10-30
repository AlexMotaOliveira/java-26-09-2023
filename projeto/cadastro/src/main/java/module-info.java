module projeto.com.impacta.cadastro {
  requires javafx.controls;
  requires javafx.fxml;

  requires com.dlsc.formsfx;

  requires java.sql;

  requires org.junit.jupiter.api;

  opens projeto.com.impacta.cadastro.controller to javafx.fxml;
  exports projeto.com.impacta.cadastro.controller;

  opens projeto.com.impacta.cadastro to javafx.fxml;
  exports projeto.com.impacta.cadastro;
}
