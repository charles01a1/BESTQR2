package com.example.bestqr;

import com.example.bestqr.models.Profile;
import com.example.bestqr.models.QRCODE;

import java.io.Serializable;
import java.util.ArrayList;

public class Owner implements Serializable {
    public ArrayList<Profile> allPlayers;
    public ArrayList<QRCODE> allStoredQrCodes;

    /**
     * This method removes a QRCODE of the owners choice
     * @param qrCode - the QRCODE to be removed from the game
     */
    public void removeQrCode(QRCODE qrCode){
        allStoredQrCodes.remove(qrCode);
    }

    /**
     * This method removes a player of the owners choice
     * @param player - the player to be removed from the game
     */
    public void removePlayer(Profile player){
        allPlayers.remove(player);
    }


}
