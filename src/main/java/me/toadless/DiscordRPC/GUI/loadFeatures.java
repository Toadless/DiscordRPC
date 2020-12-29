package me.toadless.DiscordRPC.GUI;

import me.toadless.DiscordRPC.GUI.Features.*;

public class loadFeatures {
    public loadFeatures() {
        //Presence details field
        new Details();

        //Presence state field
        new State();

        //largeImageKey
        new largeImageKey();

        //large image text
        new largeImageText();

        //Small image key
        new smallImageKey();

        //Small image text
        new smallImageText();

        //Client Id Field
        new ClientId();

    }
}
