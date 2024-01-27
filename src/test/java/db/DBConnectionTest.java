package db;

import dao.BankDAO;
import model.Account;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DBConnectionTest {

    @Test
    public void getInstance_test() {
        //givin
        int number = 2;

        //when
        BankDAO dao = new BankDAO();
        int result = dao.deleteByNumber(number);

        //then
        if (result == 1) {
            System.out.println("삭제 성공");
        } else if (result == 0) {
            System.out.println(number + "번호를 찾을 수 없음");
        } else {
            System.out.println("삭제 실패");
        }

    }

    @Test
    public void updateByNumber_test() {
        //given
        int balance = 100000;
        int number = 3;

        //when
        BankDAO dao = new BankDAO();
        int result = dao.updateByNumber(balance, number);

        //then
        if (result == 1) {
            System.out.println("업뎃 성공");
        } else if (result == 0) {
            System.out.println(number + "번호를 찾을 수 없음");

        } else {
            System.out.println("업뎃 실패");
        }

    }

    @Test
    public void insert_test() {
        //given
        String password = "5556";
        int balance = 6500;
        
        //when
        BankDAO dao = new BankDAO();
        int result = dao.insert(password, balance);
        
        //then
        if (result == 1) {
            System.out.println("insert 성공");
        } else if (result == 0) {
            System.out.println("다시 시도하세요");
        } else {
            System.out.println("insert 실패");
        }

    }

    @Test
    public void selectByNumber_test() {
        int number = 5;

        BankDAO dao = new BankDAO();
        Account account = dao.selectByNumber(number);

        if (account == null) {
            System.out.println(number + "조회된 값이 없다");
        } else {
            System.out.println(account);
        }

    }

    @Test
    public void selectAll() {
        BankDAO dao = new BankDAO();
        List<Account> result = dao.selectAll();

        if (result == null) {
            System.out.println("조회된 값이 없다");
        } else {
            System.out.println(result);
        }

    }

}
