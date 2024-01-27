package controller;

import dao.BankDAO;

import javax.swing.plaf.PanelUI;

public class BankController {
    private BankDAO dao;

    public BankController(BankDAO dao) {
        this.dao = dao;
    }

    public void insert() {
        System.out.println("controller : insert");
        dao.insert("1234", 500300);
    }

    public void delete() {
        System.out.println("controller : delete");
    }

    public void update() {
        System.out.println("controller : update");
    }

    public void selectOne() {
        System.out.println("controller : selectOne");
    }

    public void selectAll() {
        System.out.println("controller : selectAll");
    }

    public void withdraw() {
        dao.updateByNumber(1000, 5);
        dao.updateByNumber(-1000, 10);
    }
}
