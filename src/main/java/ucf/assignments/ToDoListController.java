package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {
    @FXML
    private Label ItemName;

    @FXML
    private DatePicker EventDate;

    @FXML
    private TextField EventDescription;

    @FXML
    private Button DeleteEventButton;

    @FXML
    private ListView<HashMap<String, Object>> myToDoList;

    @FXML
    public void AddEventButtonClicked(ActionEvent actionEvent) {
        if (CheckEmptyTextField()){
            // do nothing
        }
        else addEventToList();
    }

    @FXML
    public void DeleteEventButtonClicked(ActionEvent actionEvent) {
        // gets index of selected item
        // deletes index entry from listview
    }

    @FXML
    public void ShowCompletedButtonClicked(ActionEvent actionEvent) {
        // displays hashmap entries with value of = "true"
    }

    @FXML
    public void ShowIncompleteButtonClicked(ActionEvent actionEvent) {
        // displays hashmap entry with false value
    }

    @FXML
    public void ImportButtonClicked(ActionEvent actionEvent) {
        // read in a .txt file for single to do list
    }

    @FXML
    public void ExportButtonClicked(ActionEvent actionEvent) {
        // prompts user for save location
        // write entire hashmap to a file
    }

    @FXML
    public void EditToDoListNameButtonPressed(ActionEvent actionEvent) {
        // when button is clicked a window will pop up
        // or will become editable text field
    }

    @FXML
    public void ShowAllButtonClicked(ActionEvent actionEvent) {
        // display all items in listMap
    }

    @FXML
    public void MarkCompleteButtonClicked(ActionEvent actionEvent) {
        // make sure an item is selected
            // else do nothing
        // get item value
        // change item value to true if value was false
        // change item value to false if value was true
    }

    @FXML
    public void EditButtonClicked(ActionEvent actionEvent) {
        // an item must be selected
            // else do nothing
        // opens up a new window
        // prompts user for item description and/or event date
        // modifies selected item data
    }

    private ObservableMap<String, Object> items = FXCollections.observableMap(TestHash.hash);

    // runs on program start
    public void initialize(URL location, ResourceBundle resources){
        // set label to previously set name
        ItemName.setText(TestData.text);
        // set ToDoListView to innerHash
        ObservableList<HashMap<String, Object>> hashlist = FXCollections.observableArrayList();
        //HashMap<String, Object> InnerHash = TestHash.hash;
        myToDoList.getItems().addAll(TestHash.hash);

    }

    public void addEventToList(){
        HashMap<String, Object> InnerHash = new HashMap<>();
        // get text in TextField
        String Description = EventDescription.getText();
        // gte date in DatePicker
        String Date = EventDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // add to hashmap and set value to false
        InnerHash.put(Date + ": " + Description, false);
        // update hashmap
        myToDoList.getItems().add(InnerHash);
        TestHash.hash.put(Date + ": " + Description, false);
        ClearTextField();
        ClearDatePicker();
    }

    // checks if textfield is empty
    private boolean CheckEmptyTextField(){
        if (EventDescription.getText() == null){
            return true;
        }
        return false;
    }

    // clears the TextField and sets to null
    private void ClearTextField(){
        EventDescription.clear();
        EventDescription.setText(null);
    }

    // clears the date
    private void ClearDatePicker(){
        EventDate.getEditor().clear();
    }

    // creates new HashMap
    private HashMap<String, Object> createHashMap(){
        // returns new hashmap
        return new HashMap<>();
    }


}
