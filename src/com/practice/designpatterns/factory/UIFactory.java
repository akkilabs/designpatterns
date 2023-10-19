package com.practice.designpatterns.factory;

import com.practice.designpatterns.factory.components.button.Button;
import com.practice.designpatterns.factory.components.dropdown.DropDown;
import com.practice.designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
