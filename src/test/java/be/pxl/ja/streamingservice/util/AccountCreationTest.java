package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountCreationTest {
    private String email = "test@test.com";
    private String password = "password";
    private Account account;

    @BeforeEach
    public void AccountCreation(){
        account = new Account(email, password);
    }

    @Test
    public void EmailMatchAfterAccountCreation(){
        assertEquals(email, account.getEmail());
    }
}
