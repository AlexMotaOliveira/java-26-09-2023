package projeto.com.impacta.cadastro.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import projeto.com.impacta.cadastro.model.Pessoa;
import projeto.com.impacta.cadastro.service.PessoaService;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaController implements Initializable {

  @FXML
  private Button buttonAtualizar;

  @FXML
  private Button buttonExcluir;

  @FXML
  private Button buttonSalvar;

  @FXML
  private TextField inputCpf;

  @FXML
  private TextField inputNome;

  @FXML
  private TableView<Pessoa> table;

  @FXML
  private TableColumn<Pessoa, String> idColumn;


  @FXML
  private TableColumn<Pessoa, String> nomeColumn;

  @FXML
  private TableColumn<Pessoa, String> cpfColumn;


  PessoaService pessoaService = new PessoaService();
  int myIndex;
  int id;


  @FXML
  void atualizar(ActionEvent event) {

  }

  @FXML
  void excluir(ActionEvent event) {

  }

  @FXML
  void salvar(ActionEvent event) {
    Alert alert;
    try {
      String nome = inputNome.getText();
      String cpf = inputCpf.getText();

      Pessoa pessoa = new Pessoa(nome, cpf);
      Pessoa pessoaEntity = pessoaService.salvar(pessoa);

      if (pessoaEntity != null) {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro");
        alert.setHeaderText("Cadastro ok");
        alert.setContentText("Cadastro com  sucesso");
        alert.showAndWait();
      }
    } catch (RuntimeException e) {
      Logger.getLogger(e.getMessage());
      alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Cadastro");
      alert.setHeaderText("Cadastro nok");
      alert.setContentText("Cadastro não relizado");
      alert.showAndWait();
    }

  }

  public void atualizaTabela() {
    ObservableList<Pessoa> pessoas = FXCollections.observableArrayList();

    pessoas.addAll(pessoaService.buscarTodos());

    table.setItems(pessoas);
    idColumn.setCellValueFactory(pessoa ->
      new SimpleStringProperty(String.valueOf(pessoa.getValue().getIdPessoa())));

    nomeColumn.setCellValueFactory(pessoa -> new SimpleStringProperty(pessoa.getValue().getNome()));
    cpfColumn.setCellValueFactory(pessoa -> new SimpleStringProperty(pessoa.getValue().getCpf()));

  }


  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    atualizaTabela();
    table();
  }

  public void table() {
    ObservableList<Pessoa> students = FXCollections.observableArrayList();
    try {

      table.setItems(students);
      idColumn.setCellValueFactory(f -> {
        String idPessoa = String.valueOf(f.getValue().getIdPessoa());
        return new SimpleStringProperty(idPessoa);
      });
      nomeColumn.setCellValueFactory(f -> {
        return new SimpleStringProperty(f.getValue().getNome());
      });
      cpfColumn.setCellValueFactory(f -> {
        return new SimpleStringProperty(f.getValue().getCpf());
      });


    } catch (RuntimeException ex) {
      Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
    }
    table.setRowFactory(tv -> {
      TableRow<Pessoa> myRow = new TableRow<>();
      myRow.setOnMouseClicked(event ->
      {
        if (event.getClickCount() == 1 && (!myRow.isEmpty())) {
          myIndex = table.getSelectionModel().getSelectedIndex();

          id = Integer.parseInt(String.valueOf(table.getItems().get(myIndex).getIdPessoa()));
          inputNome.setText(table.getItems().get(myIndex).getNome());
          inputCpf.setText(table.getItems().get(myIndex).getCpf());
        }
      });
      return myRow;
    });

  }
}

