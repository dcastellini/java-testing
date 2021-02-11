package com.platzi.javatests.player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low(){

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice,1);

        Assert.assertFalse(player.play());

    }

    @Test
    public void wins_when_dice_number_is_big(){

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice,3);

        Assert.assertTrue(player.play());

    }



}