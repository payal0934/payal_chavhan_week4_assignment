package com.xenosis.week4;

import java.util.Scanner;
import CollectionFrameworkArrayList.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

class Student {
    private String name;
    private int id;

   public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

  public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}


