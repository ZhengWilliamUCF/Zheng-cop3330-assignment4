package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class ListOfToDoListsController implements Initializable {
    @FXML
    private Button DeleteItemButton;

    @FXML
    private Button AddItemButton;

    @FXML
    private Button EditItemButton;

    @FXML
    private TextField ItemName;

    @FXML
    private ListView<HashMap<String, Object>> myListView;

    @FXML
    // ItemName must be filled in, otherwise AddItemButton will be Disabled
    public void AddItemButtonClicked(ActionEvent actionEvent) {
        // format is ListView<OuterHash<ToDoListName, InnerHash<Information, Boolean>>>
        // first check if TextField is empty
            // opens a window telling user that a name is needed
            // or instead do nothing
    }

    @FXML
    public void DeleteItemButtonClicked(ActionEvent actionEvent) {
        // gets the index of selected item on ListView
        // Removes said index from listview
    }

    @FXML
    public void ImportButtonClicked(ActionEvent actionEvent) {
        // opens up new window
        // imports .txt file
    }

    @FXML
    public void ExportButtonClicked(ActionEvent actionEvent) {
        // prompts user for save location
        // writes to a .txt file
    }

    @FXML
    public void EditItemButtonClicked(ActionEvent actionEvent) {
        // checks to make sure an item is selected in listview
            // gets the selected lists name
            // gets the selected InnerHash
            // opens up new window with the information about the specific to do list
            // pass information about hashmap selected to ToDoListController
    }

    // runs on program start
    public void initialize(URL location, ResourceBundle resources){
        ClearTextField();
    }

    // clears the TextField and sets to null
    private void ClearTextField(){
    }

    // creates new HashMap
    private HashMap<String, Object> createHashMap(){
        // returns new hashmap
        return new HashMap<>();
    }

    private boolean CheckEmptyTextField(){
        if (ItemName.getText() == null){
            return true;
        }
        return false;
    }

    private void AddItemToListOfToDoLists(){
        // creates OuterHash first
        // gets the name input from TextField
        // creates InnerHash
        // put InnerHash inside outer
        // updates myListView by adding OuterHash
        // clears the TextField
    }

    private void OpenSecondScene(HashMap<String, Object> InnerHash){
    // loads second scene and open it
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDoList.fxml"));
            Stage secondaryStage = new Stage();
            Scene scene = new Scene(root);

            secondaryStage.setScene(scene);
            secondaryStage.setTitle("Program Name");
            secondaryStage.setUserData(InnerHash);
            secondaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // checks if item is selected
    private boolean isListSelected(){
       if(myListView.getSelectionModel().getSelectedItem() == null){
           return false;
       }
       else return true;
    }

    // gets name of the item
    private String getItemName(){
        HashMap<String, Object> variable = myListView.getSelectionModel().getSelectedItem();
        for (Map.Entry<String, Object> test : variable.entrySet()){
            return test.getKey();
        }
        return null;
    }

    // returns the Inner HashMap.
    public HashMap<String, Object> getInnerHash(String listName){
        HashMap<String, Object> variable = myListView.getSelectionModel().getSelectedItem();
        return (HashMap<String, Object>) variable.get(listName);
    }
}
