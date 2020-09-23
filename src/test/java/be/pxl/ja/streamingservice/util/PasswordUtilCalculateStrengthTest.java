package be.pxl.ja.streamingservice.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordUtilCalculateStrengthTest {
    @Test
    public void PasswordShorterThan6CharactersShouldAlwaysReturn0(){
        assertEquals(0, PasswordUtil.calculateStrength("1234"));
        assertEquals(0, PasswordUtil.calculateStrength("abcd"));
        assertEquals(0, PasswordUtil.calculateStrength("ABCD"));
        assertEquals(0, PasswordUtil.calculateStrength("&|@#"));
        assertEquals(0, PasswordUtil.calculateStrength("1bC#"));

    }
    @Test
    public void PasswordLongerThan6CharactersShouldReturn3(){
        assertEquals(3, PasswordUtil.calculateStrength("1234567"));
    }

    @Test
    public void PasswordLongerThan10CharactersShouldReturn4(){
        assertEquals(4, PasswordUtil.calculateStrength("01234567891011"));
    }

    @Test
    public void PasswordLongerThan10CharactersWithSpecialCharactersShouldReturn6(){
        assertEquals(6, PasswordUtil.calculateStrength("01234567891011%"));
    }

}
