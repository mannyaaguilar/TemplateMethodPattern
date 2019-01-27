package com.manny;

public class TestTemplateMethod {

    public static void main(String[] args) {

        ExcelFile obj = new ExcelFile();
        obj.readProcessAndSave();
//        obj.readData();
//        obj.processData();
//        obj.saveData();

        TextFile obj2 = new TextFile();
        obj2.readProcessAndSave();
//        obj2.readData();
//        obj2.processData();
//        obj2.saveData();

    }
}
