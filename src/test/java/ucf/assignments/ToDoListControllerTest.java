package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListControllerTest {

    @Test
    void addEventButtonClicked() {
        // get size of current listview and set as variable size
        // addItem to example listview/arraylist/hashmap
        // check if listview size is one greater than variable size
        // if so boolean actual equal true
        // assertTrue check
    }

    @Test
    void deleteEventButtonClicked() {
        // get size of current listview and set as variable size
        // addItem to example listview/arraylist/hashmap
        // check if listview size is one less than variable size
        // if so boolean actual equal true
        // assertTrue check
    }

    @Test
    void showCompletedButtonClicked() {
        // search listview for all hashmap items with "true" value
        // get total amount and set as variable size
        // display only "completed" items
        // check the size of the displayed listview and compare with variable size
        // assertTrue check
    }

    @Test
    void showIncompleteButtonClicked() {
        // search listview for all hashmap items with "false" value
        // get total amount and set as variable size
        // display only "completed" items
        // check the size of the displayed listview and compare with variable size
        // assertTrue check
    }

    @Test
    void importButtonClicked() {
        // check if import button is clicked
        // boolean if new window is opened set true
        // assertTrue
    }

    @Test
    void exportButtonClicked() {
        // check if import button is clicked
        // boolean if new window is opened set true
        // assertTrue
    }

    @Test
    void editToDoListNameButtonPressed() {
        // check if import button is clicked
        // get the current String of label
        // change label to another value
        // compare the String values
        // assertFalse to make sure the name can be changed
    }

    @Test
    void showAllButtonClicked() {
        // no need for this as default listview will show all
        // button can be removed
    }
}