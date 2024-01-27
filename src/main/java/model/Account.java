package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@ToString
@AllArgsConstructor
public class Account {
    private int number;
    private String password;
    private int balance;
    private Timestamp createAt;

}
