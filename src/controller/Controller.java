package controller;

import javafx.event.ActionEvent;
import model.Model;

public class Controller {
	Model mod = new Model();
	public void processclick(ActionEvent event){
		mod.print();
	}

}
